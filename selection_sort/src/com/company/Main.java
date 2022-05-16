package com.company;

//Suchen min element
public class Main {
    public static void main(String[] args) {
        int[] data = {-2, 45, 0, 11, -9};
        selection(data);
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(i == 0 ? "" : ", ");
            System.out.print(data[i] + " ");
        }
        System.out.print("]");
    }

    public static void selection(int array[]) {
        int size = array.length;   //lange von array
        for (int i = 1; i < size; i++) { // iterajion
            int index_min = i; // bewegen c elemente i
            for (int j = 0; j < size - 1; j++) {// hier suchen wir po j
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
}