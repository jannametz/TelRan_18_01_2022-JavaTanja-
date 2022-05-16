package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = user.nextInt();
        int [] data = new int[n];
        System.out.print( "Enter all elements for array: "  );
        for (int i = 0; i<n; i++){ //enter array z.B n= 5
            data[i] = user.nextInt();
        }
        bubbleSort(data);
        System.out.print("[");
        for (int i =0; i < data.length; i++) {
            System.out.print(i == 0 ? "" : ", ");
            System.out.print( data[i]  + " "  );
        }
        System.out.print("]");
    }
    public static void bubbleSort(int array[]){
        int size = array.length;   //lange von array
        for (int i =0; i < size-1; i++){//warum -1? weil weil sortietre element 1 yge onsortirovan // n-2 iteration obmena
            for (int j =0; j < size-1-i; j++){
                if(array[j] > array[j+1]) {
                    int tmp = array[j];     //sehen nachbar und menaem mestami
                    array[j]= array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

}
