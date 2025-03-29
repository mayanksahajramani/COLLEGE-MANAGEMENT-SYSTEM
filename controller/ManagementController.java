package org.example.controller;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.impl.ManagementServiceImpl;
import org.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class ManagementController {
    @Autowired
    TeacherServiceImpl service;

    @RequestMapping("/register")
    @ResponseBody
    String register(@RequestBody Student student) {
        return service.register(student);
    }

    @RequestMapping("/create-multiple-student-m")
    @ResponseBody
    String createMultipleStudent(@RequestBody List<Student> students) {
        return service.createMultipleStudent(students);
    }

    @RequestMapping("/read-single-student-m")
    @ResponseBody
    Student readSingleStudent(@RequestParam int rollNo) {
        return service.readSingleStudent(rollNo);
    }

    @RequestMapping("/read-multiple-student-m")
    @ResponseBody
    List<Student> readMultipleStudent(@RequestParam List<Integer> rollNos) {
        return service.readMultipleStudent(rollNos);
    }

    @RequestMapping("/read-all-student-m")
    @ResponseBody
    List<Student> readAllStudent() {
        return service.readAllStudent();
    }

    @RequestMapping("/update-single-student-m")
    @ResponseBody
    String updateSingleStudent(@RequestBody Student students) {
        return service.updateSingleStudent(students);
    }

    @RequestMapping("/update-multiple-student-m")
    @ResponseBody
    String updateMultipleStudent(@RequestBody List<Student> studentList) {
        return service.updateMultipleStudent(studentList);
    }

    @RequestMapping("/delete-single-student-m")
    @ResponseBody
    String deleteSingleStudent(@RequestParam int rollNo) {
        return service.deleteSingleStudent(rollNo);
    }

    @RequestMapping("/delete-multiple-student-m")
    @ResponseBody
    String deleteMultipleStudent(@RequestParam List<Integer> rollNo) {
        return service.deleteMultipleStudent(rollNo);
    }

    @RequestMapping("/delete-all-student-m")
    @ResponseBody
    String deleteAllStudent() {
        return service.deleteAllStudent();
    }

    @Autowired
    ManagementServiceImpl service1;

    @RequestMapping("/register")
    @ResponseBody
    String register(@RequestBody Teacher teacher) {
        return service1.register(teacher);
    }

    @RequestMapping("/create-multiple-teacher-m")
    @ResponseBody
    String createMultipleTeacher(@RequestBody List<Teacher> teachers) {
        return service1.createMultipleTeacher(teachers);
    }

    @RequestMapping("/read-single-teacher-m")
    @ResponseBody
    Teacher readSingleTeacher(@RequestParam int id) {
        return service1.readSingleTeacher(id);
    }

    @RequestMapping("/read-multiple-teacher-m")
    @ResponseBody
    List<Teacher> readMultipleTeacher(@RequestParam List<Integer> rollNos) {
        return service1.readMultipleTeacher(rollNos);
    }

    @RequestMapping("/read-all-teacher-m")
    @ResponseBody
    List<Teacher> readAllTeacher() {
        return service1.readAllTeacher();
    }

    @RequestMapping("/update-single-teacher-m")
    @ResponseBody
    String updateSingleTeacher(@RequestBody Teacher teachers) {
        return service1.updateSingleTeacher(teachers);
    }

    @RequestMapping("/update-multiple-teacher-m")
    @ResponseBody
    String updateMultipleTeacher(@RequestBody List<Teacher> teacherList) {
        return service1.updateMultipleTeacher(teacherList);
    }

    @RequestMapping("/delete-single-teacher-m")
    @ResponseBody
    String deleteSingleTeacher(@RequestParam int rollNo) {
        return service1.deleteSingleTeacher(rollNo);
    }

    @RequestMapping("/delete-multiple-teacher-m")
    @ResponseBody
    String deleteMultipleTeacher(@RequestParam List<Integer> rollNo) {
        return service1.deleteMultipleTeacher(rollNo);
    }

    @RequestMapping("/delete-all-teacher-m")
    @ResponseBody
    String deleteAllTeacher() {
        return service1.deleteAllTeacher();
    }
    @RequestMapping("/update-single-management-self")
    @ResponseBody
    String updateSingleManagementSelf(@RequestBody Management managements){
        return service1.updateSingleManagement(managements);
    }
    @RequestMapping("/read-single-management-self")
    @ResponseBody
    Student readSingleManagement(@RequestParam int id)
    {
        return service.readSingleManagement(id);
    }
}

