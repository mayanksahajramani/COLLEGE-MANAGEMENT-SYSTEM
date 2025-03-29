package org.example.repository.impl;

import org.example.model.Admin;
import org.example.model.Management;

import java.util.List;

public interface AdminRepositoryImpl {
    public String register(Management management);

    Management readSingleManagement(int id);

    List<Management> readAllManagement();

    String updateSingleManagement(Management managements);

    public String deleteSingleManagement(int id);

    String deleteAllManagement();

    String register(Admin admin);

    Admin readSingleAdmin(int id);

    List<Admin> readAllAdmin();

    String updateSingleAdmin(Admin admins);

    String deleteSingleAdmin(int id);

    String deleteAllAdmin();
}
