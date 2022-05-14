package com.company;

import java.util.Scanner;
//Найдите НОД двух чисел.
//Вводятся два натуральных числа, не превосходящих 10 000, разделенные пробелом.
//Выведите одно число - их наибольший общий делитель.
// with euclidean algorithm we are find greatest common divisor
// so I do it with  Dividieren. We can also work with subtraction, but diving is fast.I used devesion. 
//We can also work with subtraction, but diving is faster
public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = user.nextInt();
        int m = user.nextInt();
       System.out.println("The greatest Divisors is: " + eulidAlgorithm(n,m));
    }

    public static int eulidAlgorithm(int n, int m) {
        int r = n % m ;
        while (r != 0) {
            n = m;
            m = r;
            r = n%m;
        }
        return m;
    }
}
