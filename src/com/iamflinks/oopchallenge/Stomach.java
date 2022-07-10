package com.iamflinks.oopchallenge;

public class Stomach extends Organ{
    final private String text;

    public Stomach(String name, String medicalCondition, String actions, String text) {
        super(name, medicalCondition, actions);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String digest() {
        return "Digestion started ...";
    }

    public void getDetails() {
        System.out.println("Name: " + this.getName());
        System.out.println("Medical Condition: " + this.getMedicalCondition());
        System.out.println(this.getText());
        System.out.println("\t\t 1. " + this.getActions());
    }
}
