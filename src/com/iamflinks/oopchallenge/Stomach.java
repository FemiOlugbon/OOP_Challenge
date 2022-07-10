package com.iamflinks.oopchallenge;

public class Stomach extends Organ{
    private String text;

    public Stomach(String name, String medicalCondition, String actions, String text) {
        super(name, medicalCondition, actions);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String digest() {
        return "Digestion started ...";
    }
}
