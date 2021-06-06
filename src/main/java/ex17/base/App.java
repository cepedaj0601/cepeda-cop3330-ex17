package ex17.base;

/*
 *  UCF COP3330 Summer 2021 Exercise 17 Solution
 *  Copyright 2021 Justin Cepeda
 */

/*
Exercise 17 - Blood Alcohol Calculator
Sometimes you have to perform a more complex calculation based on some provided inputs and then use that result to make
a determination.

Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since
your last drink. Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H
where

A is total alcohol consumed, in ounces (oz).
W is body weight in pounds.
r is the alcohol distribution ratio:
0.73 for men
0.66 for women
H is number of hours since the last drink.
Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.

Example Output
Your BAC is 0.08
It is not legal for you to drive.
Constraint
Prevent the user from entering non-numeric values.
Challenges
Handle metric units.
Look up the legal BAC limit by state and prompt for the state. Display a message that states whether or not it’s legal
to drive based on the computed BAC.
Develop this as a mobile application that makes it easy to record each drink, updating the BAC each time a drink is
entered.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your weight (in pounds)?");
        int weight = in.nextInt();

        System.out.println("What is you gender (male or female)?");
        String gender = in.next();

        System.out.println("What is the total amount of alcohol you've consumed (in ounces)?");
        int alcConsumed = in.nextInt();

        System.out.println("How long has it been since your last drink (in hours)?");
        int time = in.nextInt();

        double bacLimit = 0.08;
        double bacM = (alcConsumed * 5.14 / weight * 0.75) - 0.015 * time;
        double bacF = (alcConsumed * 5.14 / weight * 0.66) - 0.015 * time;

        if(gender.equals("male")){
            if (bacM >= bacLimit) {
                System.out.println("It is not legal for you to drive.");
            }
            else{
                System.out.println("It is legal for you to drive.");
            }
        }
        if(gender.equals("female")){
            if (bacF >= bacLimit) {
                System.out.println("It is not legal for you to drive.");
            }
            else{
                System.out.println("It is legal for you to drive.");
            }
        }
    }
}
