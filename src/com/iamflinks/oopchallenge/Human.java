package com.iamflinks.oopchallenge;

public class Human {
    final private String name;
    final private int age;
    final private Eye leftEye;
    final private Eye rightEye;
    final private Heart heart;
    final private Stomach stomach;
    final private Skin skin;

    public Human(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void getDetails() {
        System.out.println("Choose an Organ:");
        System.out.println("\t1. " + this.getLeftEye().getName());
        System.out.println("\t2. " + this.getRightEye().getName());
        System.out.println("\t3. " + this.getHeart().getName());
        System.out.println("\t4. " + this.getStomach().getName());
        System.out.println("\t5. " + this.getSkin().getName());
        System.out.println("\t6. Quit");
    }
}
