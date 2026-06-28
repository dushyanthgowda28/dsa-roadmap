package arrays.productofarrayexceptself;

public class ProductOfArrayExceptSelfBruteForce {

    static int[] productOfArrayExceptSelfBruteForce(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid array");
        }

        int[] productArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product = product * arr[j];
                }
            }
            productArray[i] = product;
        }
        return productArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] result = productOfArrayExceptSelfBruteForce(arr);
        for (int a : result) {
            System.out.print(a + " ");
        }
    }
}

/*
 * Time Complexity:
 * Worst Case  : O(n^2)
 *
 * Space Complexity:
 * O(n)
 */