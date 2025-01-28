package com.fundamentals.service;

import java.util.ArrayList;

import com.fundamentals.entity.Entity;
import com.fundamentals.repository.EmployeRepoImpl;

public class EmployeServiceImpl implements EmployeService{

    EmployeRepoImpl impl;

    public EmployeServiceImpl (EmployeRepoImpl impl){
        this.impl = impl;
    }

    public ArrayList<Entity> getAll(){
        return impl.getAllEntities();
    }

    @Override
    public void listKaryawan() {
        if (!getAll().isEmpty()) {
            for (int i = 0; i < getAll().size(); i++) {
                System.out.print(getAll().get(i).getNames());
                System.out.print(getAll().get(i).getId());
                System.out.print(getAll().get(i).getPoint());
                System.out.println(getAll().get(i).getPosition());
            }
        }
    }
    /*
     * membuat kondisi kerajinan jika point lebih dari 70 maka 
     * setiap kehadiran tepat waktu atau awal waktu akan mendapatkan tambahan point
     * 10
     * dan jika point lebih dari 200 maka akan mendapatkan promotion
     * jika point <= 50 maka akan di rumahkan 
     */
    @Override
    public int pointKerajinan() {
        
        for (int i = 0; i < getAll().size(); i++) {
            
        }
        return 0;
    }

    @Override
    public void qualification() {
        // TODO Auto-generated method stub
        
    }
    
}
