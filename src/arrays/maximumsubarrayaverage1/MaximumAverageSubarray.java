package arrays.maximumsubarrayaverage1;

public class MaximumAverageSubarray {

    static double getMaximumSubarrayAverage(int[] arr, int k) {

        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Calculate the sum of the first window
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum += arr[i];       // Add incoming element
            windowSum -= arr[i - k];   // Remove outgoing element

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.printf("Maximum Subarray Average %.5f%n",
                getMaximumSubarrayAverage(arr, k));
    }
}


//Time	O(n)
//Space	O(1)