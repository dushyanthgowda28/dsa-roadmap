package arrays.maximum.subarraysumwithonedeletion;

public class MaximumSubarraySumWithOneDeletion {
    static int maxSumSubarray(int[] arr) {
        int n = arr.length;

        // noDel -> Maximum subarray sum ending
        // at current index without deletion

        // oneDel -> Maximum subarray sum ending
        // at current index with at most one deletion
        int noDel = arr[0];
        int oneDel = 0;

        // Final answer
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            // Either delete current element
            // OR extend previous deleted subarray
            oneDel = Math.max(noDel, arr[i] + oneDel);

            // Standard Kadane transition
            noDel = Math.max(arr[i], arr[i] + noDel);

            // Update answer
            ans = Math.max(ans, Math.max(noDel, oneDel));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum Subarray Sum with One Deletion " + maxSumSubarray(arr));
    }
}
