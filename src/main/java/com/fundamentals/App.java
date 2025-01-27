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
        src.addNewEmploye("Prajurit", "K102");
        // System.out.println(entity.getNames());
        src.promotionEmploye("K102");
        src.removeOldEmploye("k101");
        for (var i : src.getAllEntities()){
            System.out.println(i.getNames());
            System.out.println(i.getId());
            System.out.println(i.getPosition());
        }
    }
}
