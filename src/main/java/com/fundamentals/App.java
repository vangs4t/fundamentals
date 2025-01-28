package com.fundamentals;

import java.util.ArrayList;
import java.util.StringJoiner;

import com.fundamentals.entity.Entitas;
import com.fundamentals.entity.Entity;
import com.fundamentals.repository.EmployeRepoImpl;
import com.fundamentals.utility.PositionLabels;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        testing1();
    }
    public static void testing1(){
        Entity entity = new Entitas("Naufal","K100");
        EmployeRepoImpl src = new EmployeRepoImpl(entity);
        src.addNewEmploye("Kesatria", "K101");
        src.addNewEmploye("Prajurit", "K102");
        // System.out.println(entity.getNames());
        src.promotionEmploye("K102");
        // src.removeOldEmploye("k101");
        ArrayList<Entity> list = new ArrayList<>();
        list = src.getAllEntities();
        // for (var i : list){
        //     System.out.println(i.getNames());
        // }
        System.out.println("## Daftar Pustaka ##");
        for (int i = 0; i < src.getAllEntities().size(); i++) {
            System.out.println((i + 1) + ". " + src.getAllEntities().get(i)); // melakukan perulangan untuk menampilkan index di dalam arraylist
        }
    }
    // public void listBook(){
    //     System.out.println("## Daftar Pustaka ##");
    //     for (int i = 0; i < impl.getAll().size(); i++) {
    //         System.out.println((i + 1) + ". " + impl.getAll().get(i)); // melakukan perulangan untuk menampilkan index di dalam arraylist
    //     }
    // }
}
