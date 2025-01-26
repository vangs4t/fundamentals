package com.fundamentals.entity;

import com.fundamentals.repository.PositionLabels;

public class Entity {
    String names;
    String id;
    PositionLabels position;

    Entity(String names, String id){
        names = this.names;
        id = this.id;
    }
    Entity(String names){
        names = this.names;
    }
    Entity(){

    }

    public String getNames(){
        return this.names;
    }
    public void setNames(String names){
        names = this.names;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        id = this.id;
    }

    public PositionLabels getPosition(){
        return this.position;
    }

    public void setPosition(PositionLabels position){
        position = this.position;
    }
}
