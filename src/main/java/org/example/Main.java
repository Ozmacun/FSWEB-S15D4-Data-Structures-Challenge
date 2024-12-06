package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));



    }
    public static boolean checkForPalindrome(String input) {
        if (input == null) {
            return false;//Input Null Check Done!
        }
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ENGLISH);//Normalizing with suitable regex and transforming letters to lower case!
        // +  local language changed to ENGLISH in toLowerCase(For I letter).
        LinkedList<Character> charList = new LinkedList<>();
        for(char c : normalized.toCharArray()){
            charList.add(c);
        }

        while(charList.size()>1){
            if(!charList.pollFirst().equals(charList.pollLast())){
                return false;
            }
        }
        /*String reversed = new StringBuilder(normalized).reverse().toString();//MULTIPLE ACTIONS AT ONCE!! StringBuilder + reversing the string + changing toString.
        return reversed.equals(normalized);*/
        return true;
    }

    public static String convertDecimalToBinary(int input){
        LinkedList<Integer> binary = new LinkedList<>();
        while(input > 0){
            int left = input % 2;
            binary.addFirst(left);
            input = input / 2;
        }

        StringBuilder binaryBuilder = new StringBuilder();
        for(int d : binary){
            binaryBuilder.append(d);
        }
        return binaryBuilder.toString();
    }
}