package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.print("Enter your number: ");  // Take number from user
        int n = user.nextInt();
        System.out.println("\n List of Squares: " + n);
        squareNumber(n);// list methode

    }

    public static void squareNumber (int n)  { //Methode
        int result = 1; // count zetchik
        int i;
        for (i = 1; i*i<= n; i++) {  //loop for
            result = i * i;
            System.out.print( " \n " + result);
        }
        }

    }



