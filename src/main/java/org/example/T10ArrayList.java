package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
10. How can you remove all duplicates from ArrayList?
 */
public class T10ArrayList {
    public static void main(String[] args) {

        String string = "abracadabra";
        List <Character> characters = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            characters.add(ch);
        }

        System.out.println(characters);

        //to remove all duplicate character in an array. We can convert it to Set as Set do not allow duplicate object
        Set <Character> uniqueChar = new LinkedHashSet<>(characters);
        System.out.println(uniqueChar);
    }
}
