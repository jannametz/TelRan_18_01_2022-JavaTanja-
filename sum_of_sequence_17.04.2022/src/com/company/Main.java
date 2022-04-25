package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter the sequence length: ");
        int n = user.nextInt();
        System.out.println(sumOfSequence(n));
    }

    public static  int sumOfSequence(int n) {
        int sum = 0;

        for (int i = 1; i <= n;i++) {
            sum = sum + i;
        }
        return sum;
    }

}
