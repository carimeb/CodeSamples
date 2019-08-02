//Checks if two words are anagram of each other
//COMMAND TO COMPILE: javac CheckAnagram.java
//COMMAND TO RUN: java CheckAnagram 


import java.util.Arrays;

public class CheckAnagram {

    public static void printChecking(char[] char1, char[] char2) {
        
        Arrays.sort(char1);
        Arrays.sort(char2);

        int checked = 0;
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] == char2[i]) checked++;
            else break;
        }

        if (checked == char1.length) System.out.println("Strings are anagram of each other!");
        else System.out.println("Strings are NOT anagram of each other");
    } 

    public static void main(String[] args) {
        
        String str1 = "BANANAPRAta";
        String str2 = "PRABAtaNANA";

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();


        if (char1.length != char2.length) {
            System.out.println("Strings are not anagram of each other.");
        } else printChecking(char1, char2); 
    }
}
