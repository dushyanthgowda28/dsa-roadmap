package arrays.maximumsubarraysum;

public class MaximumSubArraySum {

    static int maximumSubArraySum(int[] arr) {
        int maxSum = 0;
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maximumSubArraySum(arr);
        System.out.println("Maximum Subarray Sum is " + result);
    }
}

/*
 * Time Complexity:
 * Worst Case  : O(n)
 *
 * Space Complexity:
 * O(1)
 */