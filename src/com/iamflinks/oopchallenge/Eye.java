package com.iamflinks.oopchallenge;

public class Eye extends Organ {
    private String color;

    public Eye(String name, String medicalCondition, String actions, String color) {
        super(name, medicalCondition, actions);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String closeEye() {
        return this.getName() + " Closed";
    }

    public void getDetails() {
        System.out.println("Name: " + this.getName());
        System.out.println("Medical Condition: " + this.getMedicalCondition());
        System.out.println("Color: " + this.getColor());
        System.out.println("\t\t 1. " + this.getActions());
    }
}
