package arrays.maximumproductsubarray;

public class MaximumProductSubarray {

    static int maximumProduct(int[] arr) {
        int maxProduct = arr[0];
        int currentMax = arr[0];
        int currentMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            // Save previous values before updating
            int previousMax = currentMax;
            int previousMin = currentMin;

            currentMax = Math.max(
                    num,
                    Math.max(previousMax * num, previousMin * num)
            );

            currentMin = Math.min(
                    num,
                    Math.min(previousMax * num, previousMin * num)
            );

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 3, -4};
        System.out.println("Maximum Product Array is " + maximumProduct(arr));
    }
}


//Complexity
//Time: O(n) ✅
//Space: O(1) ✅