package arrays.slidingwindow.maximumsubarrayaverage1;

public class MaximumAverageSubarrayBruteForce {

    static double getMaximumSubarrayAverage(int[] arr, int k) {

        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        double maxAverage = Double.NEGATIVE_INFINITY;

        int i = 0;
        int j = i + k - 1;

        while (j < arr.length) {

            double currentAverage = 0;

            for (int l = i; l <= j; l++) {
                currentAverage += arr[l];
            }

            currentAverage = currentAverage / k;

            maxAverage = Math.max(maxAverage, currentAverage);

            i++;
            j++;
        }

        return maxAverage;
    }

    public static void main(String[] args) {

        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.printf("Maximum Subarray Average %.5f%n",
                getMaximumSubarrayAverage(arr, k));
    }
}


//Time: O(n × k) — recalculating the sum for every window
//Space: O(1) — no additional data structures