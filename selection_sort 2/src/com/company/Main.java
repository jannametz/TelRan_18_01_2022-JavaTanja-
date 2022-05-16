package com.company;

//Suchen min element
public class Main {
    public static void main(String[] args) {
        int[] data = {-2, 45, 0, 11, -9};
        int[] data1 = {-2, 45, 0, 11, -9};
        selection(data);
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(i == 0 ? "" : ", ");
            System.out.print(data[i] + " ");
        }
        System.out.print("]");

        System.out.println("");

        selectionmax(data1);
        System.out.print("[");
        for (int i = 0; i < data1.length; i++) {
            System.out.print(i == 0 ? "" : ", ");
            System.out.print(data1[i] + " ");
        }
        System.out.print("]");

    }

    public static void selection(int array[]) {
        int size = array.length;   //lange von array
        for (int i = 0; i < size -1; i++) { // iterajion
            int index_min = i; // bewegen c elemente i
            for (int j = i+1; j < size; j++) {// hier suchen wir po j
                if (array[j] < array[index_min]) {
                    index_min = j; // look rlrmrnt po index // suche min element
                }
            }
            int tmp = array[i];// change place
            array[i] = array[index_min];
            array[index_min] = tmp;
            //Suchen min element
        }
    }

    public static void selectionmax(int array[]) {
        int size = array.length;   //lange von array
        for (int i = 0; i < size; i++) { // iterajion
            int index_max = i; // bewegen c elemente i
            for (int j = i+1; j < size; j++) {// hier suchen wir po j
                if (array[j] > array[index_max]) {
                    index_max = j; // look rlrmrnt po index // suche min element
                }
            }
            int tmp = array[i];// change place
            array[i] = array[index_max];
            array[index_max] = tmp;
            //Suchen min element
        }
    }
}