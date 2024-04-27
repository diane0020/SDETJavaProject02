package org.example;
/*
Reverse a String: Write a function to reverse a given string. For example, given the input "Hello",
the output should be "olleH".
 */
public class T3StringReverse {
    public static void main(String[] args) {
        String string = "Hello";

        System.out.println(new StringBuilder(string).reverse());
    }
}
