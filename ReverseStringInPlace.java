import java.util.Arrays;

public class ReverseStringInPlace {

    public static void main(String[] args){
        
        String str = "PARALELEPIPEDOS";
        char[] characters = str.toCharArray();
        int n = characters.length;
        char temp;

        for (int i = 0; i < n/2; i++) {
            temp = characters[i];
            characters[i] = characters[(n - 1) - i];
            characters[(n - 1) - i] = temp;
        }

        System.out.println(Arrays.toString(characters));
    }
}