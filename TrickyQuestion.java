
public class TrickyQuestion{
    public static void main(String[] args) {
        long longWithL = 1000*60*60*24*365L;
        long longNoL = 1000*60*60*24*365;
        System.out.println("longWithL: " + longWithL + " NoL: " + longNoL);
    }
}

//In case of the first variable, we are explicitly creating it as long by placing
// an “L” at the end, so the compiler will treat this at long and assign it to
//the first variable.

//In the second case, the compiler will do the calculation and treat it as a 
//32-bit integer, since the output is outside the range of integer max value
//(2147483647), the compiler will truncate the most significant bits and then 
//assign it to the variable