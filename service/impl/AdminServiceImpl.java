package org.example.service.impl;

import org.example.model.Admin;
import org.example.model.Management;
import org.example.model.Teacher;

import java.util.List;

public interface AdminServiceImpl {
    public String register(Management management);
    String createMultipleManagement  ( List<Management > managements);
    Management readSingleManagement (int id);
    List<Management> readMultipleManagement (List<Integer>id);
    List<Management> readAllManagement ();
    String updateSingleManagement (Management  managements);
    String updateMultipleManagement (List<Management >managementList);
    String deleteSingleManagement (int id);
    String deleteMultipleManagement (List <Integer>id);
    String deleteAllManagement ( );
    public String updateSingleAdmin(Admin Admins);

    String register(Admin admin);

    String createMultipleAdmin(List<Admin> admins);

    Admin readSingleAdmin(int id);

    List<Admin> readMultipleAdmin(List<Integer> id);

    List<Admin> readAllAdmin();

    String updateMultipleAdmin(List<Admin> adminList);

    String deleteSingleAdmin(int id);

    String deleteMultipleAdmin(List<Integer> id);

    String deleteAllAdmin();
}
