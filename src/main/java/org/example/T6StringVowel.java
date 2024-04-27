package org.example;
/*
Create a method to count how many vowels are present in a string “documentation”

 */
public class T6StringVowel {
    public static void main(String[] args) {

        String string = "documentation";

        String vowels = string.replaceAll("[^a,e,i,o,u,A,E,I,O,U]", "");
        System.out.println(vowels.length());
    }
}
