package com.fundamentals.entity;

import com.fundamentals.repository.PositionLabels;

public class Entity {
    String names;
    String id;
    PositionLabels position;

    public Entity(String names, String id){
        this.names = names;
        this.id = id;
    }
    Entity(String names){
        this.names = names;
    }
    Entity(){

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
}
