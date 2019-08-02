//How many vowels and consonants there is in a string

import java.util.Scanner;

public class VowelAndConsonant {

    public static void howMany(char[] charArray) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) { 
                case 'a': 
                case 'e': 
                case 'i': 
                case 'o': 
                case 'u': 
                vowels++; 
                break;
            }
        }
        consonants = charArray.length - vowels;
        System.out.printf("Vowels: %d and Consonants: %d%n", vowels, consonants);
    }
    public static void main (String[] args) {

        System.out.println("Please enter some text, NOT SYMBOLS OR DIGITS!"); 
        Scanner reader = new Scanner(System.in); 
        String input = reader.nextLine(); 
        char[] charArray = input.toCharArray(); 

        howMany(charArray);
    }
}
