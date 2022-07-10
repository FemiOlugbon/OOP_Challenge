package com.iamflinks.oopchallenge;
import java.util.Scanner;

public class Main {
    // Display root app menu
    public void displayRoot(Human human) {
        System.out.println("Choose an Organ:");
        System.out.println("\t1. " + human.getLeftEye().getName());
        System.out.println("\t2. " + human.getRightEye().getName());
        System.out.println("\t3. " + human.getHeart().getName());
        System.out.println("\t4. " + human.getStomach().getName());
        System.out.println("\t5. " + human.getSkin().getName());
        System.out.println("\t6. Quit");
    }
    public void displayOrgan(Eye eye) {
        System.out.println("Name: " + eye.getName());
        System.out.println("Medical Condition: " + eye.getMedicalCondition());
        System.out.println("Color: " + eye.getColor());
        System.out.println("\t\t 1. " + eye.getActions());
    }
    public void displayOrgan(Heart heart) {
        System.out.println("Name: " + heart.getName());
        System.out.println("Medical Condition: " + heart.getMedicalCondition());
        System.out.println("Heart rate: " + heart.getHeartRate());
        System.out.println("\t\t 1. " + heart.getActions());
    }
    public void displayOrgan(Stomach stomach) {
        System.out.println("Name: " + stomach.getName());
        System.out.println("Medical Condition: " + stomach.getMedicalCondition());
        System.out.println(stomach.getText());
        System.out.println("\t\t 1. " + stomach.getActions());
    }
    public void displayOrgan(Skin skin) {
        System.out.println("Name: " + skin.getName());
        System.out.println("Medical Condition: " + skin.getMedicalCondition());
    }
    public static void main(String[] args) {

        Main display = new Main();
        // create a human object
        Human femi = new Human(
                "Femi",
                28,
                new Eye("Left Eye", "Short Sighted", "Close the Eye", "Black"),
                new Eye("Right Eye", "Normal", "Close the Eye", "Black"),
                new Heart("Heart", "Normal", "Change the heart rate", 72),
                new Stomach("Stomach", "Indigestion", "Digest Food", "Need to Eat"),
                new Skin("Skin", "Burn")
        );

        // Logic of the code
        boolean isQuit = false;  // use to check when user quit the app

        Scanner scanner = new Scanner(System.in);  // Scanner for user input

        System.out.println("Welcome to HealthCheck");
        System.out.println("Name: " + femi.getName());
        System.out.println("Age: " + femi.getAge());
        while (!isQuit) {
            display.displayRoot(femi);
            System.out.print("Please select one of the options above: ");
            int option = scanner.nextInt();
            if (option>=6){
                isQuit =true;
            }
            else if (option==1) {
                display.displayOrgan(femi.getLeftEye());
                int action = scanner.nextInt();
                if (action==1) {
                    System.out.println(femi.getLeftEye().closeEye());
                }
            }
            else if (option==2) {
                display.displayOrgan(femi.getRightEye());
                int action = scanner.nextInt();
                if (action==1) {
                    System.out.println(femi.getRightEye().closeEye());
                }
            }
            else if (option==3) {
                display.displayOrgan(femi.getHeart());
                int action =scanner.nextInt();
                if (action==1) {
                    System.out.print("Please entered the desired heart rate: ");
                    int heartRate = scanner.nextInt();
                    System.out.println(femi.getHeart().changeHeartRate(heartRate));
                }
            }
            else if (option==4) {
                display.displayOrgan(femi.getStomach());
                int action =scanner.nextInt();
                if (action==1) {
                    System.out.println(femi.getStomach().digest());
                }
            }
            else if (option==5) {
                display.displayOrgan(femi.getSkin());
            }
        }
        System.out.println("Thank you for using the app! \nThe program was terminated!!!");
    }

}
