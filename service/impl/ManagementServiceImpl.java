package org.example.service.impl;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;

import java.util.List;

public interface ManagementServiceImpl {
    public String register(Teacher teacher);
    String createMultipleTeacher ( List<Teacher> teachers);
    Teacher readSingleTeacher(int id);
    List<Teacher> readMultipleTeacher(List<Integer>rollNos);
    List<Teacher> readAllTeacher();
    String updateSingleTeacher(Teacher teachers);
    String updateMultipleTeacher(List<Teacher>teacherList);
    String deleteSingleTeacher(int id);
    String deleteMultipleTeacher(List <Integer>id);
    String deleteAllTeacher( );

    String updateSingleManagement(Management managements);

}
