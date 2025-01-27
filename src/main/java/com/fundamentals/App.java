package com.fundamentals;

import com.fundamentals.entity.Entitas;
import com.fundamentals.entity.Entity;
import com.fundamentals.repository.EmployeRepoImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Entity entity = new Entitas("Naufal","K100");
        EmployeRepoImpl src = new EmployeRepoImpl(entity);
        src.addNewEmploye("Kesatria", "K101");
        // System.out.println(entity.getNames());
        System.out.println(src.getAllEntities().get(0));
    }
}
