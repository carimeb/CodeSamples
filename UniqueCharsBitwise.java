// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?
//p. 171, Craking

public class UniqueCharsBitwise {

    public static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0 ; i < str.length(); i++) {
            int val = str.charAt(i) - 'a'; //transforma o char da string em numero inteiro
            System.out.println("val: " + val);
            System.out.println("____________________________________");
            if ((checker & (1 << val)) > 0) { //<< binary left shift operator
                return false;
            }
            System.out.println("checker: " + checker);
            System.out.println("1 << val: " + (1 << val));
            System.out.println(">0 ?: " + (checker & (1 << val)));
            System.out.println("____________________________________");

            checker |= (1 << val); //checker = checker | (1 << val)
            System.out.println("checker |=: " + (checker |= (1 << val)));
            System.out.println("____________________________________");
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Verdict: " + isUniqueChars("cac"));
    }

}