package com.company.schmidt;

import java.util.Scanner;
import java.util.*;
class Prompt {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();
        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
        }


        return userInt;
    }

    public double promptDouble(String message){
        boolean isDouble = false;
        String useString="";
        double userDouble=0;
        while (isDouble!=true) {
            try {
                System.out.println(message);
                useString = scanner.nextLine();
                userDouble=Double.parseDouble(useString);
                isDouble=true;
            } catch (Exception NumberFormatException) {
                System.out.println("Please enter an actual double bubble");
            }


        }
        return userDouble;
    }
    public String promptString(String message){
        boolean isString = false;
        String userString="";
        while (isString!=true) {
            try {
                System.out.println(message);
                userString = scanner.nextLine();
                Double.parseDouble(userString);
                System.out.println("Please enter a valid string statement");
            } catch ( NumberFormatException e) {
                isString = true;
            }
        }
        return userString;
    }

public static class Main {
        public static void main(String[] args) {
            Prompt input = new Prompt();

            int aNumber = input.promptInt("Enter an integer: ");
            double aNumber2 = input.promptDouble("Enter an Double: ");
            String firstString = input.promptString("Enter a String: ");
            System.out.println("Your int is: " + aNumber + " Your double is: " + aNumber2 + " Your string is: " + firstString);

        }
    }


}
