package com.fundamentals.repository;

import java.util.ArrayList;

import com.fundamentals.entity.Entity;

public interface EmployeRepo {
    ArrayList<Entity> getAllEntities();

    void addNewEmploye(String employeNames, String employeId);

    void removeOldEmploye(String employeId);

    void promotionEmploye(String id);
}
