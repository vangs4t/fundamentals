package com.fundamentals.repository;

import static com.fundamentals.utility.PositionLabels.*;

import java.util.ArrayList;

import com.fundamentals.entity.Entity;
import com.fundamentals.utility.PositionLabels;

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
        PositionLabels labels = KARYAWAN;
        list.add(new Entity(employeNames, employeId, labels));
    }

    @Override
    public void removeOldEmploye(String employeId) {
        int numbers = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(employeId)) {
                numbers = i;
            }
        }
        list.remove(numbers);
    }

    @Override
    public void promotionEmploye(String id) { // cari cara untuk mengubah label sebelumnya
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                if (list.get(i).getPosition().equals(KARYAWAN)) {
                    list.get(i).setPosition(LEADER);
                } else if (list.get(i).getPosition().equals(LEADER)) {
                    list.get(i).setPosition(MANAGER);
                } else if (list.get(i).getPosition().equals(MANAGER)) {
                    list.get(i).setPosition(SECRETARIS);
                }
            }
        }
    }
    
}
