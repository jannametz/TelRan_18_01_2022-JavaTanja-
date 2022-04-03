package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.print("Enter any number : ");  // Take number from user
        int num = user.nextInt();
        System.out.println(" \n Natural numbers from 1 to " + num);
        int sum = 0;
        for (int i = 1; i <= num; i++) {
                sum = sum+2;
                System.out.print( " " + sum);

        }
    }
}
