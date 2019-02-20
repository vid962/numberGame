package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random number=new Random();
        int random = number.randomNumber();
        boolean hasWon = false;
        Scanner userScanner= new Scanner(System.in);
        System.out.println("Type your number between 1-100 You have 10 chances!");

       for (int i=10; i>0; i--){
           int userGuess=userScanner.nextInt();
         if (userGuess<random){
             System.out.println("Your number is smaller then win number! You have "+(i-1)+" chances left");
         }
         else if (userGuess>random){
             System.out.println("Your number is greater then win number! You have "+(i-1)+" chances left");
         }
         else if (userGuess==random){
             hasWon=true;
             System.out.println("You win! ");
               break;
           }
       }
        if (hasWon==false){
            System.out.print("You lost!");
        }
    }
}
