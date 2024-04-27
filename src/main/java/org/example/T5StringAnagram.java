package org.example;

import java.util.Arrays;

public class T5StringAnagram {

    static boolean isAnagram (String str1, String str2) {
        char [] arr1 = str1.toLowerCase().toCharArray();
        char [] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        if (isAnagram("Cat", "act")) {
            System.out.println("String is Anagram");

        } else {
            System.out.println("String is not an Anagram");
        }
    }
}
