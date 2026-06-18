package arrays.maximumsubarraysum;

public class MaximumSubArraySumBruteForce {

    static int maximumSubArraySumBruteForce(int[] arr) {
        int maxSum = 0;

        for(int  i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for(int  j = i; j < arr.length; j++) {
                currentSum = currentSum + arr[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maximumSubArraySumBruteForce(arr);
        System.out.println("Maximum Subarray Sum is " + result);
    }
}


/*
 * Time Complexity:
 * Worst Case  : O(n^2)
 *
 * Space Complexity:
 * O(1)
 */