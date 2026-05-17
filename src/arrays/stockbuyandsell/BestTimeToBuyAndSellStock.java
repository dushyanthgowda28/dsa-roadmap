package arrays.stockbuyandsell;

public class BestTimeToBuyAndSellStock {

    public static int getMaximumProfit(int[] arr) {

        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        int buyPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {

            // Calculate profit for current day
            int currentProfit = arr[i] - buyPrice;

            // Update maximum profit
            maxProfit = Math.max(maxProfit, currentProfit);

            // Update minimum buying price
            buyPrice = Math.min(buyPrice, arr[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] arr = {7, 10, 1, 3, 6, 9, 2};

        System.out.println("Maximum profit is " + getMaximumProfit(arr));
    }
}

//Time Complexity
//O(n) → single traversal
//Space Complexity
//O(1) → no extra space used