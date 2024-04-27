package org.example;
/*
Count the Number of Words in a String: Write a function to count the number of words in a given string.
Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
 */
public class T7StringWordCount {
    public static void main(String[] args) {

        String string = "Hello, world!";

        String [] words = string.split(" ");
        System.out.println(words.length);
    }
}
