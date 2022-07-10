package com.iamflinks.oopchallenge;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
            femi.getDetails();
            System.out.print("Please select one of the options above: ");
            int option = scanner.nextInt();
            if (option>=6){
                isQuit =true;
            }
            else if (option==1) {
                femi.getLeftEye().getDetails();
                int action = scanner.nextInt();
                if (action==1) {
                    System.out.println(femi.getLeftEye().closeEye());
                }
            }
            else if (option==2) {
                femi.getRightEye().getDetails();
                int action = scanner.nextInt();
                if (action==1) {
                    System.out.println(femi.getRightEye().closeEye());
                }
            }
            else if (option==3) {
                femi.getHeart().getDetails();
                int action =scanner.nextInt();
                if (action==1) {
                    System.out.print("Please entered the desired heart rate: ");
                    int heartRate = scanner.nextInt();
                    System.out.println(femi.getHeart().changeHeartRate(heartRate));
                }
            }
            else if (option==4) {
                femi.getStomach().getDetails();
                int action =scanner.nextInt();
                if (action==1) {
                    System.out.println(femi.getStomach().digest());
                }
            }
            else if (option==5) {
                femi.getSkin().getDetails();
            }
        }
        System.out.println("Thank you for using the app! \nThe program was terminated!!!");
    }

}
