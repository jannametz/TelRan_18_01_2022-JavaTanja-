package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" Please Enter a: ");
        double a = user.nextDouble();
        System.out.println(" Please Enter b: ");
        double b = user.nextDouble();
        /*System.out.println(" Please Enter x: ");
        double x = user.nextDouble();             // give allways 0ne !*/
        double x = -b / a;
        if (a != 0) {
            x = -b / a;
            System.out.println("The root of one equation x = " + x);
        } if (b != 0) {
            System.out.println("Equation has no roots -> NO" );

        } else {
            System.out.println("Equation has many roots -> INF" );

        }

       }
    }

