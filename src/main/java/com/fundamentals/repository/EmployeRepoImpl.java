package com.fundamentals.repository;

import java.util.ArrayList;

import com.fundamentals.entity.Entity;
import static com.fundamentals.repository.PositionLabels.*;

public class EmployeRepoImpl  implements EmployeRepo{

    // ArrayList list = new ArrayList<>();
    Entity entity;
    EmployeRepo repo;

    @Override
    public ArrayList<Entity> getAllEntities() {
        return repo.getAllEntities();
    }

    @Override
    public String employeNames(String employeNames) {
        return entity.getNames(); 
    }

    @Override
    public String employeId(String employeId) {
        return entity.getId();
    }

    @Override
    public void addNewEmploye(String employeNames, String employeId) {
        entity.setNames(employeNames);
        entity.setId(employeId);
    }

    @Override
    public void removeOldEmploye(String employeId) {
        int numbers = 0;
        for (int i = 0; i < repo.getAllEntities().size(); i++) {
            if (repo.getAllEntities().get(i).equals(employeId)) {
                numbers = i;
            }
        }
        repo.getAllEntities().remove(numbers);
    }

    @Override
    public void promotionEmploye(String id) { // cari cara untuk mengubah label sebelumnya
        for (int i = 0; i < repo.getAllEntities().size(); i++) {
            if (repo.getAllEntities().get(i).equals(id)) {
                entity.setPosition(KARYAWAN); // menaikan status label
            }
        }
    }
    
}
