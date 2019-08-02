import java.util.Scanner;

public class StringRotation {

    public static boolean checkRotation(String original, String rotation) {
        if (original.length() != rotation.length()) return false;
        
        String concatenated = original + original;
        if (concatenated.indexOf(rotation) != -1) {
		System.out.println(concatenated.indexOf(rotation));
		return true;
	}
        else return false;
    }
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the original string");
        String original = scnr.nextLine();

        System.out.println("Please enter rotation of String"); 
        String rotation = scnr.nextLine();

        if (checkRotation(original, rotation)) System.out.println(original + " and " + rotation + " are rotation of each other");
        else System.out.println("Sorry, they are not rotation of another"); 
        scnr.close();
    }
}
