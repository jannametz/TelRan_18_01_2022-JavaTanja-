package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*Напишите программу, которая вводит натуральные числа a и b ,
и выводит квадраты натуральных чисел в диапазоне [ a , b ] */
        Scanner user = new Scanner(System.in);
        System.out.print("Enter your number: ");  // Take number from user
        int a = user.nextInt();
        System.out.print("Answer :)");  // Take number from user
        int b = user.nextInt();
        squareNumber(a,b);// list methode
    }

    public static void squareNumber(int a, int b) { //Methode
        int result = 0; // count zetchik
        int i;
        for (i = a; i <= b; i++) {  //loop for
            result = i * i;
            System.out.print("\n" + i + " * " + i + " = " + result);
        }
       // return 0;
    }
}

