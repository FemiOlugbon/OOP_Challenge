package com.iamflinks.oopchallenge;

public class Eye {
    private String name;
    private String medicalCondition;
    private String color;
    private String[] action;

    public Eye(String name, String medicalCondition, String color, String[] action) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.color = color;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getAction() {
        return action;
    }

    public void setAction(String[] action) {
        this.action = action;
    }
}
