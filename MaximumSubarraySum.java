//Calculate the maximum subarray sum, i.e., the largest possible sum of a 
//sequence of consecutive values in the array. 
//Brute force = O(n³) but this solution is O(n)

public class MaximumSubarraySum {

    public static void main(String[] args) {

        int[] givenArray = {-1, 2, 4, -3, 5, 2, -5, 2};
        int sum = 0, best = 0;

        for (int i = 0; i < givenArray.length; i++) {
            sum = Math.max(givenArray[i], sum + givenArray[i]);
            best = Math.max(best, sum);
        }
    }    
}