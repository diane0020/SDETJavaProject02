package org.example;

import java.util.ArrayList;

/*
You have a list of strings and you want to keep only those that start with “A” and you want to return them in lower case".
 */
public class T8StringLowerCase {
    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>();
        words.add("Arizona");
        words.add("Alaska");
        words.add("California");
        words.add("San Francisco");
        words.add("New Jersey");

        words.removeIf(s-> !s.startsWith("A"));
        words.replaceAll(String::toLowerCase);

        System.out.println(words);

    }
}
