package com.company;

import java.util.Scanner;

/* Write a program that takes two integers
	and finds their product without using multiplication.
	Please note that numbers can be negative.
	 */
public class Main {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println(" Please Enter the Number 1: ");
        int a = user.nextInt();
        System.out.println(" Please Enter the Number 2: ");
        int b = user.nextInt();
        System.out.println("Product of entered numbers: " + getMultiplyLoop(a, b));
    }
    public static int getMultiplyLoop(int a, int b) { //Method multiply Loop + for
        int result = 0;
    for (int i = 1; i <=b; i++) {
        result += a;
    }
    return result;
    }
}
