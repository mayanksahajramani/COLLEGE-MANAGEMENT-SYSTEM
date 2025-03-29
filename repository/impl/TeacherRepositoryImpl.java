package org.example.repository.impl;

import org.example.model.Student;

import java.util.List;

public interface TeacherRepositoryImpl {
    public String register(Student student);

    Student readSingleStudent(int rollNo);

    List<Student> readAllStudent();

    String updateSingleStudent(Student Students);

    public String deleteSingleStudent(int rollNo);

    String deleteAllStudent();
}
