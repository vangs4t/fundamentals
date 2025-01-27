package com.fundamentals.entity;

public class Entitas extends Entity{

    /*kata kunci super digunakan untuk mendapatkan variable-variable di parent class */
    public Entitas(String names, String id){
        super(names, id); // penggunaan super untuk memamnggil field
    }
    @Override
    public String getNames(){
        return super.names; // penggunaan super untuk mendapatkan index dari variable nama
    }
    /*
     * Jika kita menggoveride method yang ada di parent class maka method tersebut hanya bisa di gunakan di 
     * child class
     */
    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return super.getId(); // penggunaan super untuk mendapatkan index dari variable nama
    }
}
