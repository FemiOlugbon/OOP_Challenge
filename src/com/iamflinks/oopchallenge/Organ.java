package com.iamflinks.oopchallenge;

public class Organ {
    final private String name;
    final private String medicalCondition;
    private String actions;

    public Organ(String name, String medicalCondition, String actions) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.actions = actions;
    }

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public String getName() {
        return name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }
}
