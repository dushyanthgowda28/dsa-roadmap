package arrays.maximumproductsubarray;

public class MaximumProductSubarrayBruteForce {

    static int maximumProduct(int[] arr) {
        int maxProduct = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product = product * arr[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, -2, 4};
        System.out.println("Maximum Product Array is " + maximumProduct(arr));
    }
}

