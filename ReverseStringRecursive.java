
public class ReverseStringRecursive {

    public static String reverse(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args){
        
        String str = "CARROS";
        String strReversed = reverse(str);
        System.out.println(strReversed);
    }
}