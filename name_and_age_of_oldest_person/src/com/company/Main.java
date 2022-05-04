package com.company;
import java.util.Scanner;

public class Main {
   /* Given arrays String[] names and int[ ] yearsOfBirthday of the same length,
    that contains names and years of birthday of the persons.
    Every element in yearsOfBirthday is corresponding with element
    at the same index in names. Implement the program that prints
    the name and the age of all person who older that given int.
    Than print the name and age of oldest person.
    For example: ({“Olga”,”Oleg”,”Svetlana”,”Oleg”} , {2004,1982,2008,2010},15) ->
    Olga 18 years
    Oleg 40 years*/

    public static void main(String[] args) {
        String[] name = {"Lucile Randon", "Max", "Viktoria", "Mischel", "William"}; /* The oldest person living is Lucile Randon (France, b. 11 February 1904) who is 118 years and 73 days old, as verified on 25 April 2022. Lucile is also the record holder for 'oldest person living (female)'.*/
        int[] year = {118, 2, 22, 33, 45};
        System.out.println(theOldestPerson(year,name));
    }

    public static String theOldestPerson(int[] year, String[] name) {

        int result = year[0];
        int max = 0;
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + " is " + year[i] + " year old.");
            result = Math.max(result,year[i]);
                if (year[i] > year[max]) {
                    max = i;
                }
            }
        return (name[max]+ " is " + result + " year old and is the oldest person in the world 2022.");
        }
    }