package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    private String name;
    private Date birthDate;

    // Pet constructors
    public Pet(String name){
        // name = name   -   refers to the name argument passed in the constructor
        this.name = name;
        this.birthDate = new Date();
    }

    public Pet(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    // name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // birthDate getter and setter
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String speak();
}
