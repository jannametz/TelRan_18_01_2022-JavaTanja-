package com.company;
public class Main {

    public static void insertionSort(int array[]){
        int size = array.length;   //lange von array
        for (int i =1; i < size; i++){//warum -1? weil weil sortietre element 1 yge onsortirovan // n-2 iteration obmena
            int key = array[i];// das ist key in 1 scrinn = 45, Key in 2 schricht = 0; etc.
            int j = i -1;// sucht platz // sravnivau mit 0 , wenn j= 0; ich mache nichts
            while ((j >= 0) && (key < array[j])){
                array[j+1] = array[j]; // change Plätze
                j--;
            }
            array[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = {-2, 45, 0, 11, -9};
        insertionSort(data);
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(i == 0 ? "" : ", ");
            System.out.print(data[i] + " ");
        }
        System.out.print("]");
    }
}

