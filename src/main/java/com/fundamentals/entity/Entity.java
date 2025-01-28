package com.fundamentals.entity;

import com.fundamentals.utility.PositionLabels;

public class Entity {
    String names;
    String id;
    PositionLabels position;
    int point = 100;

    public Entity(String names, String id, PositionLabels labels){
        this.names = names;
        this.id = id;
        this.position = labels;
        
    }
    public Entity(String names, String id){
        this.names = names;
        this.id = id;
    }
    public Entity(){

    }

    public String getNames(){
        return this.names;
    }
    public void setNames(String names){
        this.names = names;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public PositionLabels getPosition(){
        return this.position;
    }

    public void setPosition(PositionLabels position){
        this.position = position;
    }

    public int getPoint(){
        return this.point;
    }

    public void setPoint(int point){
        this.point = point;
    }

    // @Override
    // public String toString(){
    //     return "Selamat datang di perusahaan Object Oriented";
    // }
}
