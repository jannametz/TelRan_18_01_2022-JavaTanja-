package com.company;

import java.util.Arrays;
import java.util.Scanner;
/* Задача №112317. Сортировка
Напишите программу, которая сортирует массив по возрастанию "методом камня": аналогично "методу пузырька", но в обратном порядке: самый "тяжелый" элемент из оставшихся спускается к концу массива.
Входные данные

Первая строка содержит размер массива N . Во второй строке через пробел задаются N чисел – элементы массива. Гарантируется, что 0 < N ≤ 1000 .

Выходные данные

Программа должна выводить весь массив после каждой перестановки элементов. Все элементы массива выводятся в одну строку и разделяются пробелами, после окончания вывода массива выполняется переход на новую строку. Если перестановок не было, программа выводит только число 0.

Примеры
Входные данные
4
4 3 2 1
Выходные данные
3 4 2 1
3 2 4 1
3 2 1 4
2 3 1 4
2 1 3 4
1 2 3 4
for ex. {45 -9 0 -2 11}
*/

public class Main {

    public static void steinSort(int array[]) {
        int size = array.length;   //lange von array
        for (int i = 0; i < size; i++) {//warum -1? weil weil sortietre element 1 yge onsortirovan // n-2 iteration obmena
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j + 1] > array[j]) { //change for methid stein
                    int tmp = array[j];     //sehen nachbar und menaem mestami
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = user.nextInt();
        int [] data = new int[n];
        System.out.print( "Enter all elements for array: "  );
        for (int i = 0; i < n; i++){ //enter array z.B n= 5
            data[i] = user.nextInt();

        }
        steinSort(data);
        System.out.print("[");
        for (int i =0; i < data.length; i++) {
            System.out.print(i == 0 ? "" : ", ");
            System.out.print( data[i]  + " "  );
        }
        System.out.print("]");
     }
    }
