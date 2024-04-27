package org.example;

import java.util.*;

/*
Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character.
For example, in the string "abracadabra", the first non-repeating character is 'c'.
 */
public class T9StringUniqueChar {
    public static void main(String[] args) {

        String string = "abracadabra";

        Set <Character> uniqueChar = new LinkedHashSet<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (uniqueChar.contains(ch)) {
                uniqueChar.remove(ch);

            } else {
                uniqueChar.add(ch);
            }
        }

        if (uniqueChar.isEmpty()) {
            System.out.println("There is no non-repeating char");
        }

        List<Character> word = new ArrayList<>(uniqueChar);
        System.out.println(word.getFirst());
    }
}
