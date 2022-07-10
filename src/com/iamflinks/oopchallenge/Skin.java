package com.iamflinks.oopchallenge;

public class Skin extends Organ{
    public Skin(String name, String medicalCondition) {
        super(name, medicalCondition);
    }

    public void getDetails() {
        System.out.println("Name: " + this.getName());
        System.out.println("Medical Condition: " + this.getMedicalCondition());
    }
}
