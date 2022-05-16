package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner user = new Scanner(System.in);
        //System.out.println("How many articles you wants to buy?  ");
        //double n = user.nextInt();
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double discriminant = b * b - 4.0 * c;
        double d = Math.sqrt(discriminant);
        System.out.println(-b + d / 2.0);
        System.out.println(-b - d / 2.0);
    }
}
