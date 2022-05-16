package com.company;

import java.util.Scanner;

public class Main {
/*Последовательность состоит из различных натуральных чисел и завершается числом 0.
 Определите значение второго по величине элемента в этой последовательности. */

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the first number of the sequence: ");
        int n = user.nextInt();
        System.out.println("Enter the second number of the sequence: ");
        int m = user.nextInt();
        int max1 = 0;
        int max2 = 0;

        if (n>m) {
            max1 = n;
            max2 = m;
        }else {
            max1 = m;
            max2 = n;
        }
        while (m!= 0) {
            m = user.nextInt();
            if (m > max1) {
                max2 = max1;
                max1 = m;
            }else{
                   if  (m > max2){
                   max2 = m;
                }
            }
        }

System.out.println(max2);

    }
}
