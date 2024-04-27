package org.example;

import java.util.Scanner;

/*
1. Write a program to swap 2 String without a temporary variable?
 */
public class T1StringManipulation {
    public static void main(String[] args) {
        String str1 = "World!";
        String str2 = "Hello";

        System.out.println("Before: " + str1 + " " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0,(str1.length()-str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println("After: " + str1 + " " + str2);
    }

}
