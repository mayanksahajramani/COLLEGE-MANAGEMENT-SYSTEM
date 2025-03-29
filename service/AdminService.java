package org.example.service;

import org.example.model.Admin;
import org.example.model.Management;
import org.example.model.Teacher;
import org.example.repository.impl.AdminRepositoryImpl;
import org.example.repository.impl.ManagementRepositoryImpl;
import org.example.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
public class AdminService implements AdminServiceImpl{
    @Autowired
    AdminRepositoryImpl repository;

    @Override
    public String register(Management management) {
        return repository.register(management);
    }

    @Override
    public String createMultipleManagement(List<Management> managements) {
        String result = null;
        List<String> results = new ArrayList<>();
        for (int i = 0; i < managements.size(); i++) {
            results.add(repository.register(managements.get(i)));
        }
        if (results.size() > 1) {
            result = "registered successsulyy";
        }
        return result;
    }

    @Override
    public Management readSingleManagement(int id) {
        return repository.readSingleManagement(id);
    }

    @Override
    public List<Management> readMultipleManagement(List<Integer> ids) {
        List<Management> managementList = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            managementList.add(repository.readSingleManagement(ids.get(i)));
        }
        return managementList;
    }

    @Override
    public List<Management> readAllManagement() {
        return repository.readAllManagement();
    }

    @Override
    public String updateSingleManagement(Management managements) {
        return repository.updateSingleManagement(managements);
    }
    @Override
    public String updateMultipleManagement(List<Management> managementList) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < managementList.size(); i++) {
            results.add(repository.updateSingleManagement(managementList.get(i)));
        }
        String result = null;
        if (results.size()>0) {
            result = "you have updated successfully";
        }
        return result;
    }


    @Override
    public String deleteSingleManagement(int id){
        return repository.deleteSingleManagement(id);
    }
    @Override
    public String deleteMultipleManagement(List<Integer> ids) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i <ids.size(); i++) {
            results.add(repository.deleteSingleManagement(ids.get(i)));
        }
        String result = null;
        if (results.size()>0) {
            result = "you have deleted successfully";
        }
        return result;
    }

    @Override
    public String deleteAllManagement() {
        return repository.deleteAllManagement();
    }


    @Override
    public String updateSingleAdmin(Admin Admins) {
        return "";
    }

    @Override
    public String register(Admin admin) {
        return "";
    }

    @Override
    public String createMultipleAdmin(List<Admin> admins) {
        return "";
    }

    @Override
    public Admin readSingleAdmin(int id) {
        return null;
    }

    @Override
    public List<Admin> readMultipleAdmin(List<Integer> id) {
        return Collections.emptyList();
    }

    @Override
    public List<Admin> readAllAdmin() {
        return Collections.emptyList();
    }

    @Override
    public String updateMultipleAdmin(List<Admin> adminList) {
        return "";
    }

    @Override
    public String deleteSingleAdmin(int id) {
        return "";
    }

    @Override
    public String deleteMultipleAdmin(List<Integer> id) {
        return "";
    }

    @Override
    public String deleteAllAdmin() {
        return "";
    }
}
