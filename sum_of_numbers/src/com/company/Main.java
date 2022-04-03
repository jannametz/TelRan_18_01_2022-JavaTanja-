package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" Please Enter the number: ");
        int go = user.nextInt();
        int sum = 0;
        for (int i = 0; i <= go; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}



