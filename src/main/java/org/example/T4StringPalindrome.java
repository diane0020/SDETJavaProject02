package org.example;
/*
Check if a String is Palindrome: Determine whether a given string is a palindrome,
which means it reads the same forwards and backward. For example, "madam" is a palindrome.
 */
public class T4StringPalindrome {
    public static void main(String[] args) {
        String string = "Madam";

        StringBuilder reversed = new StringBuilder(string).reverse();

        if (string.equalsIgnoreCase(reversed.toString())) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}
