

// Check if a String contains only digits (dá pra fazer tbm usando Regex)
// google it: Regular Expression in Java to check numbers in String

public class OnlyDigits {

    public static boolean stringDigits(String str) {

        char[] charArray = str.toCharArray();
        int temp = 0;

        for (int i = 0; i < charArray.length; i++) {
            int number = Character.getNumericValue(charArray[i]); //ou usar char x = '9' com int y = x - '0' 
            if (number >= 10) return false;
            else temp ++; 
        }
        if (temp == charArray.length) return true;
        else return false;
         
    } 

    public static void main (String[] args) {

        System.out.println(stringDigits("paralelepipedo"));
        System.out.println(stringDigits("12321456789"));
        System.out.println(stringDigits("201277p"));
    }
}