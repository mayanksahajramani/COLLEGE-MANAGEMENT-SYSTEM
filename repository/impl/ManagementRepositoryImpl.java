package org.example.repository.impl;


import org.example.model.Teacher;

import java.util.List;

public interface ManagementRepositoryImpl {
    public String register(Teacher teacher);

    Teacher readSingleTeacher(int id);

    List<Teacher> readAllTeacher();

    String updateSingleTeacher(Teacher teachers);

    public String deleteSingleTeacher(int id);

    String deleteAllTeacher();
}
