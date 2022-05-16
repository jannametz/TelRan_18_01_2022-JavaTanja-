package com.company;

import java.util.Scanner;
/*Задача №341. Количество делителей
Подсчитайте количество натуральных делителей числа x
(включая 1 и само число; 𝑥 ≤ 2 * 10ˆ9). */
public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Please Enter x: ");
        int x = user.nextInt();
        int k = 0;
        System.out.println(divisors(k,x));
    }
    public static int divisors ( int k,int x ) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                k++;
                //System.out.println("Делители числа " + x + " это: " + i);
            }
        }
        return k;
    }
}

