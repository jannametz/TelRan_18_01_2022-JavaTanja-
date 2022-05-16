package com.company;

import java.util.Scanner;

public class Main {
/*
 Implement the method that takes two Strings and return the String that contain chars from the first string mixed through one with chars from other String
 “abcd”, “qwer” -> “aqbwcedr”
 “ab”, “qwer” -> “aqbwer”
 “abcd”, “qw” -> “aqbwcd”
 */
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String str1 = user.nextLine();
        System.out.println("Enter the second word: ");
        String str2 = user.nextLine();
        System.out.println(mixedStr(str1, str2));
        System.out.println(mixedStr2(str1, str2));
    }

        public  static String mixedStr(String str1, String str2) {// code doesn't work as well as I wanted.
            //my head is tired
            int x = str1.length();
            int y = str2.length();
            int max = Math.max(x, y);
            String result = "";
            for (int i = 0; i < max; i++) {
               if (i <= x - 1) {
                  result += str1.substring(i, i + 1);
                    if (i <= y - 1) {
                        result += str2.substring(i, i + 1);
                    }
                }
            }
            return result;
    }

    public  static String mixedStr2(String str1, String str2) { // Solution 2 works well
        int i = 0;
        String result = "";
        while (i < str1.length() && i < str2.length()){
            result = result + str1.charAt(i) + str2.charAt(i);
            i++;
        }
        return result + str1.substring(i) + str2.substring(i);
    }

}
