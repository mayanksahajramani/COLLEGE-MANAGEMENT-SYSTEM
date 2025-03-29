package org.example.controller;

import org.example.model.Admin;
import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.impl.AdminServiceImpl;
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
public class AdminController {
    @Autowired
    TeacherServiceImpl service;
    @RequestMapping("/register")
    @ResponseBody
    String register (@RequestBody Student student){
        return service.register(student);
    }

    @RequestMapping("/create-multiple-student-a")
    @ResponseBody
    String createMultipleStudent (@RequestBody List<Student> students){
        return service.createMultipleStudent(students);
    }
    @RequestMapping("/read-single-student-a")
    @ResponseBody
    Student readSingleStudent(@RequestParam int rollNo){
        return service.readSingleStudent(rollNo);
    }
    @RequestMapping("/read-multiple-student-a")
    @ResponseBody
    List<Student> readMultipleStudent(@RequestParam List<Integer> rollNos) {
        return service.readMultipleStudent(rollNos);
    }

    @RequestMapping("/read-all-student-a")
    @ResponseBody
    List<Student> readAllStudent() {
        return service.readAllStudent();
    }
    @RequestMapping("/update-single-student-a")
    @ResponseBody
    String updateSingleStudent(@RequestBody Student students){
        return service.updateSingleStudent(students);
    }

    @RequestMapping("/update-multiple-student-a")
    @ResponseBody
    String updateMultipleStudent(@RequestBody List<Student>studentList){
        return service.updateMultipleStudent(studentList);
    }
    @RequestMapping("/delete-single-student-a")
    @ResponseBody
    String deleteSingleStudent(@RequestParam int rollNo){
        return service.deleteSingleStudent(rollNo);
    }
    @RequestMapping("/delete-multiple-student-a")
    @ResponseBody
    String deleteMultipleStudent(@RequestParam List <Integer>rollNo){
        return service.deleteMultipleStudent(rollNo);
    }
    @RequestMapping("/delete-all-student-a")
    @ResponseBody
    String deleteAllStudent(){
        return service.deleteAllStudent();
    }
    @Autowired
    ManagementServiceImpl service1;

    @RequestMapping("/register")
    @ResponseBody
    String register(@RequestBody Teacher teacher) {
        return service1.register(teacher);
    }

    @RequestMapping("/create-multiple-teacher-a")
    @ResponseBody
    String createMultipleTeacher(@RequestBody List<Teacher> teachers) {
        return service1.createMultipleTeacher(teachers);
    }

    @RequestMapping("/read-single-teacher-a")
    @ResponseBody
    Teacher readSingleTeacher(@RequestParam int id) {
        return service1.readSingleTeacher(id);
    }

    @RequestMapping("/read-multiple-teacher-a")
    @ResponseBody
    List<Teacher> readMultipleTeacher(@RequestParam List<Integer> rollNos) {
        return service1.readMultipleTeacher(rollNos);
    }

    @RequestMapping("/read-all-teacher-a")
    @ResponseBody
    List<Teacher> readAllTeacher() {
        return service1.readAllTeacher();
    }

    @RequestMapping("/update-single-teacher-a")
    @ResponseBody
    String updateSingleTeacher(@RequestBody Teacher teachers) {
        return service1.updateSingleTeacher(teachers);
    }

    @RequestMapping("/update-multiple-teacher-a")
    @ResponseBody
    String updateMultipleTeacher(@RequestBody List<Teacher> teacherList) {
        return service1.updateMultipleTeacher(teacherList);
    }

    @RequestMapping("/delete-single-teacher-a")
    @ResponseBody
    String deleteSingleTeacher(@RequestParam int rollNo) {
        return service1.deleteSingleTeacher(rollNo);
    }

    @RequestMapping("/delete-multiple-teacher-a")
    @ResponseBody
    String deleteMultipleTeacher(@RequestParam List<Integer> rollNo) {
        return service1.deleteMultipleTeacher(rollNo);
    }

    @RequestMapping("/delete-all-teacher-a")
    @ResponseBody
    String deleteAllTeacher() {
        return service1.deleteAllTeacher();
    }

    @Autowired
    AdminServiceImpl service2;

    @RequestMapping("/register")
    @ResponseBody
    String register(@RequestBody Management management) {
        return service2.register(management);
    }

    @RequestMapping("/create-multiple-management-a")
    @ResponseBody
    String createMultipleManagement (@RequestBody List<Management > managements) {
        return service2.createMultipleManagement (managements);
    }

    @RequestMapping("/read-single-management-a")
    @ResponseBody
    Management  readSingleManagement (@RequestParam int id) {
        return service2.readSingleManagement (id);
    }

    @RequestMapping("/read-multiple-management-a")
    @ResponseBody
    List<Management > readMultipleManagement (@RequestParam List<Integer> id) {
        return service2.readMultipleManagement (id);
    }

    @RequestMapping("/read-all-management-a")
    @ResponseBody
    List<Management > readAllManagement () {
        return service2.readAllManagement ();
    }

    @RequestMapping("/update-single-management-a")
    @ResponseBody
    String updateSingleManagement (@RequestBody Management  managements) {
        return service2.updateSingleManagement (managements);
    }

    @RequestMapping("/update-multiple-management-a")
    @ResponseBody
    String updateMultipleManagement (@RequestBody List<Management > managementList) {
        return service2.updateMultipleManagement (managementList);
    }

    @RequestMapping("/delete-single-management-a")
    @ResponseBody
    String deleteSingleManagement (@RequestParam int id) {
        return service2.deleteSingleManagement (id);
    }

    @RequestMapping("/delete-multiple-management-a")
    @ResponseBody
    String deleteMultipleManagement (@RequestParam List<Integer> id) {
        return service2.deleteMultipleManagement (id);
    }

    @RequestMapping("/delete-all-management-a")
    @ResponseBody
    String deleteAllManagement () {
        return service2.deleteAllManagement ();
    }
    @Autowired
    AdminServiceImpl service3;

    @RequestMapping("/register")
    @ResponseBody
    String register(@RequestBody Admin admin) {
        return service3.register(admin);
    }

    @RequestMapping("/create-multiple-admin-a")
    @ResponseBody
    String createMultipleAdmin (@RequestBody List<Admin > admins) {
        return service3.createMultipleAdmin (admins);
    }

    @RequestMapping("/read-single-admin-a")
    @ResponseBody
    Admin  readSingleAdmin (@RequestParam int id) {
        return service3.readSingleAdmin (id);
    }

    @RequestMapping("/read-multiple-admin-a")
    @ResponseBody
    List<Admin > readMultipleAdmin(@RequestParam List<Integer> id) {
        return service3.readMultipleAdmin (id);
    }

    @RequestMapping("/read-all-admin-a")
    @ResponseBody
    List<Admin > readAllAdmin () {
        return service3.readAllAdmin();
    }

    @RequestMapping("/update-single-admin-a")
    @ResponseBody
    String updateSingleAdmin (@RequestBody Admin  admins) {
        return service3.updateSingleAdmin(admins);
    }

    @RequestMapping("/update-multiple-management-a")
    @ResponseBody
    String updateMultipleAdmin (@RequestBody List<Admin > adminList) {
        return service3.updateMultipleAdmin (adminList);
    }

    @RequestMapping("/delete-single-admin-a")
    @ResponseBody
    String deleteSingleAdmin (@RequestParam int id) {

        return service3.deleteSingleAdmin (id);
    }

    @RequestMapping("/delete-multiple-admin-a")
    @ResponseBody
    String deleteMultipleAdmin(@RequestParam List<Integer> id) {
        return service3.deleteMultipleAdmin (id);
    }

    @RequestMapping("/delete-all-admin-a")
    @ResponseBody
    String deleteAllAdmin () {
        return service3.deleteAllAdmin ();
    }
}
