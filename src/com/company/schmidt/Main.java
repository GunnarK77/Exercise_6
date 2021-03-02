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

    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        Double userDouble = 0.0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid Double. " + message);
                userInput = scanner.nextLine();
            }

        }
        return userDouble;
    }
    public String promptString(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        String userString = "";
        boolean isString = false;
        while (!isString) {
            try {
                while (userInput.equals("") || Integer.parseInt(userString) < 2147483647) {
                    System.out.println("Please enter an String");
                }

            try{
                while (userInput.equals("") || Double.parseDouble(userString ) < 2147483647 ){
                    System.out.println("Please enter an String");

                }


            }catch(NumberFormatException e){
                System.out.println(userInput + " is not a valid String. " + message);
                userInput = scanner.nextLine();
            }
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid String. " + message);
                userInput = scanner.nextLine();
            }
            isString = true;


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
