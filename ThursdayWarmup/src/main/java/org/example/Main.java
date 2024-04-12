package org.example;

import java.util.Scanner;

//using switch statement
//Hello how is the weather using switch statement 
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        //import the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("How is the weather today? (Sunny, Cloudy, Rainy?)");
       String userInput = scanner.nextLine();


       switch(userInput.toLowerCase()) {
           case "sunny":
               System.out.println("It is a great day for outdoor activities!");
               break;
           case "cloudy":
               System.out.println("The weather is a bit uncertain.");
               break;
           case "rainy":
               System.out.println("The weather is a bit uncertain.");
           default:
               System.out.println("Sorry, I am not sure about that weather type!");
               break;


       }

    }
}