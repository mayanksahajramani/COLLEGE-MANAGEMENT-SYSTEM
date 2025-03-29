package org.example.service;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.repository.impl.TeacherRepositoryImpl;
import org.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService implements TeacherServiceImpl {
    @Autowired
    TeacherRepositoryImpl repository;

    @Override
    public String register(Student student) {
        return repository.register(student);
    }

    @Override
    public String createMultipleStudent(List<Student> students) {
        String result = null;
        List<String> results = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            results.add(repository.register(students.get(i)));
        }
        if (results.size() > 1) {
            result = "registered successsulyy";
        }
        return result;
    }

    @Override
    public Student readSingleStudent(int rollNo) {
        return repository.readSingleStudent(rollNo);
    }

    @Override
    public List<Student> readMultipleStudent(List<Integer> rollNos) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < rollNos.size(); i++) {
            studentList.add(repository.readSingleStudent(rollNos.get(i)));
        }
        return studentList;
    }

    @Override
    public List<Student> readAllStudent() {
        return repository.readAllStudent();
    }

    @Override
    public String updateSingleStudent(Student students) {
        return repository.updateSingleStudent(students);
    }
    @Override
    public String updateMultipleStudent(List<Student> studentList) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            results.add(repository.updateSingleStudent(studentList.get(i)));
        }
        String result = null;
        if (results.size()>0) {
            result = "you have updated successfully";
        }
        return result;
    }


    @Override
    public String deleteSingleStudent(int rollNo){
        return repository.deleteSingleStudent(rollNo);
    }
    @Override
    public String deleteMultipleStudent(List<Integer> rollNos) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i <rollNos.size(); i++) {
            results.add(repository.deleteSingleStudent(rollNos.get(i)));
        }
        String result = null;
        if (results.size()>0) {
            result = "you have deleted successfully";
        }
        return result;
    }

    @Override
    public String deleteAllStudent() {
        return repository.deleteAllStudent();
    }

    @Override
    public String updateSingleTeacher(Teacher teachers) {
        return "";
    }

    @Override
    public Student readSingleTeacher(int id) {
        return null;
    }

    @Override
    public Student readSingleManagement(int id) {
        return null;
    }
}