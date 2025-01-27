package com.fundamentals.repository;

import java.util.ArrayList;

import com.fundamentals.entity.Entity;
import static com.fundamentals.repository.PositionLabels.*;

public class EmployeRepoImpl  implements EmployeRepo{

    ArrayList<Entity> list = new ArrayList<>();
    Entity entity;
    EmployeRepo repo;

    public EmployeRepoImpl(Entity entity){
        this.entity = entity;
    }
    @Override
    public ArrayList<Entity> getAllEntities() {
        return list;
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
                if (entity.getPosition().equals(KARYAWAN)) {
                    entity.setPosition(LEADER);
                } else if (entity.getPosition().equals(LEADER)) {
                    entity.setPosition(MANAGER);
                } else if (entity.getPosition().equals(MANAGER)) {
                    entity.setPosition(SECRETARIS);
                }
            }
        }
    }
    
}
