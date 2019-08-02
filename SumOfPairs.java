//Write a program to find all pairs of 
//integers whose sum is equal to a given number.
//Read more: https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz5cQfIeTzE

import java.util.HashSet;
import java.util.Set;

public class SumOfPairs {

    public static void sumInHashSet(int[] array, int givenSum) {
        
        Set set = new HashSet(array.length);
        
        for (Integer i : array) {
            int target = givenSum - i;
            // if target number is not in set then add 
            if (!set.contains(target)) { 
                set.add(i); 
            } else { 
                System.out.printf("(%d, %d) %n", i, target); 
              }
        }

    }
    public static void main(String[] args) {
        int[] array = {0, 14, 0, 4, 7, 8, 3, 5, 7};
        sumInHashSet(array, 11);
    }
}
