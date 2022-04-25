package com.company;
import java.util.Scanner;

public class Main {
/*
The number of items that are greater than the previous
Количество элементов, которые больше предыдущего
Последовательность состоит из натуральных чисел и завершается числом 0.
Определите, сколько элементов этой последовательности больше предыдущего элемента
 */


    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the first number of the sequence: ");
        int n = user.nextInt();
        System.out.println("Enter the second number of the sequence: ");
        int m = user.nextInt();
        int grosser = 0;

            if (m > n) {
                grosser++;
                n = m;
                while (m != 0) {
                    m = user.nextInt();
                    if (m > n) {
                        grosser++;
                        n = m;
                    }
                }
            }
        System.out.println(grosser);
    }
}
