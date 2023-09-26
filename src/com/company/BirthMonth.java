package com.company;

import java.util.Scanner;

public class BirthMonth {

    public static void main(String[] args) {
        // create an instance of Scanner class to read input from the user
        Scanner sc = new Scanner(System.in);
        int month ;


        // get the mont input from the use
        System.out.println("Enter your date of birth month: ");
        month = sc.nextInt();


        // use 'if' to check if the month lies within limits
        if(1 <= month && month <= 12){
            // print the message
            System.out.println("Your birth month is: " + month);
        } else {
            // print the error message
            System.out.println("You entered an incorrect month value: " + month);
        }
    }
}
