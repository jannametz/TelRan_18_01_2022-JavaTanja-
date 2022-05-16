package com.company;

import java.util.Scanner;
/*Задача №3064. Длина последовательности
Программа получает на вход последовательность
целых неотрицательных чисел, каждое число записано в
отдельной строке. Последовательность завершается числом 0,
при считывании которого программа должна закончить свою работу
и вывести количество членов последовательности
(не считая завершающего числа 0).
Числа, следующие за числом 0, считывать не нужно.
*/
public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter the sequence length: ");
        String str = user.nextLine();
        isSequenceLength(str);
    }

    public static void isSequenceLength(String str) {
        int result = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                result++;
            }
        }
        System.out.println("sequence length is: " + result);
    }
}
