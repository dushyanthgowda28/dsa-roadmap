package arrays.stockbuyandsell;

public class BestTimeToBuyAndSellStockBruteForce {

    public static int getMaximumProfit(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        int len = arr.length;
        int maxProfit = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                maxProfit = Math.max(maxProfit, arr[j] - arr[i]);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 10, 1, 3, 6, 9, 2};
        System.out.println("Maximum profit is " + getMaximumProfit(arr));
    }
}

/*
 * Time Complexity:
 * Worst Case  : O(n^2)  -> when we check all possible pairs
 * Best Case   : O(1)    -> when first pair matches target
 * Average Case: O(n^2)
 *
 * Space Complexity:
 * O(1) -> no extra data structure used (only variables i, j, len)
 */