package org.example.service;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.repository.impl.ManagementRepositoryImpl;
import org.example.repository.impl.TeacherRepositoryImpl;
import org.example.service.impl.ManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ManagementService implements ManagementServiceImpl {
    @Autowired
    ManagementRepositoryImpl repository;

    @Override
    public String register(Teacher teacher) {
        return repository.register(teacher);
    }

    @Override
    public String createMultipleTeacher(List<Teacher> teachers) {
        String result = null;
        List<String> results = new ArrayList<>();
        for (int i = 0; i < teachers.size(); i++) {
            results.add(repository.register(teachers.get(i)));
        }
        if (results.size() > 1) {
            result = "registered successsulyy";
        }
        return result;
    }

    @Override
    public Teacher readSingleTeacher(int id) {
        return repository.readSingleTeacher(id);
    }

    @Override
    public List<Teacher> readMultipleTeacher(List<Integer> ids) {
        List<Teacher> teacherList = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            teacherList.add(repository.readSingleTeacher(ids.get(i)));
        }
        return teacherList;
    }

    @Override
    public List<Teacher> readAllTeacher() {
        return repository.readAllTeacher();
    }

    @Override
    public String updateSingleTeacher(Teacher teachers) {
        return repository.updateSingleTeacher(teachers);
    }
    @Override
    public String updateMultipleTeacher(List<Teacher> teacherList) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < teacherList.size(); i++) {
            results.add(repository.updateSingleTeacher(teacherList.get(i)));
        }
        String result = null;
        if (results.size()>0) {
            result = "you have updated successfully";
        }
        return result;
    }


    @Override
    public String deleteSingleTeacher(int id){
        return repository.deleteSingleTeacher(id);
    }
    @Override
    public String deleteMultipleTeacher(List<Integer> ids) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i <ids.size(); i++) {
            results.add(repository.deleteSingleTeacher(ids.get(i)));
        }
        String result = null;
        if (results.size()>0) {
            result = "you have deleted successfully";
        }
        return result;
    }

    @Override
    public String deleteAllTeacher() {
        return repository.deleteAllTeacher();
    }

    @Override
    public String updateSingleManagement(Management managements) {
        return "";
    }
}
