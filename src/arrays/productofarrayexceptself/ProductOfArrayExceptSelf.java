package arrays.productofarrayexceptself;

public class ProductOfArrayExceptSelf {

    static int[] productExceptSelf(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid array");
        }

        int n = arr.length;
        int[] result = new int[n];

        // Step 1: Store prefix products in result
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Step 2: Multiply with suffix products
        int suffixProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int[] result = productExceptSelf(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

/*
 * Time Complexity:
 * Worst Case  : O(n)
 *
 * Space Complexity:
 * O(n)
 */