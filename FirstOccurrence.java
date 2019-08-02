import java.util.Map;
import java.util.HashMap;

public class FirstOccurrence {
    
    public static void printFirstOccurrence(String word) { 
        char[] characters = word.toCharArray();

        // build HashMap with character and number of times they appear in String 
        Map<Character, Integer> charMap = new HashMap<Character, Integer>(); 
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) charMap.put(ch, charMap.get(ch) + 1);
            else {
                charMap.put(ch, 1); 
                System.out.print(ch + " ");
            }
        }
    System.out.println();
    }

    public static void main(String[] args) {

        printFirstOccurrence("Programming blablabla blaPp p");
    }
}

