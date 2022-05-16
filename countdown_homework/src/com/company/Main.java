package com.company;
import java.util.Scanner;
/*
mplement method “countdown” that prints numbers from 5 to 1, than prints „start“
countdown() -> 5,4,3,2,1,Start */


public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" Please Enter the number: ");
        int n = user.nextInt();
        //String start = "Start \n";
        System.out.println(countdown(n)); //method
        System.out.println("Start");

    }

    public static int countdown(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + "\n");
        }
        return 0;
    }
}


