package arrays.movezeros;

import java.util.Arrays;

public class MoveZeroesBruteForce {

    static void moveZeroesBruteForce(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid array input");
        }

        int[] temp = new int[arr.length];
        int index = 0;

        // Copy all non-zero elements
        for (int num : arr) {
            if (num != 0) {
                temp[index++] = num;
            }
        }

        // Fill remaining positions with zeroes
        while (index < arr.length) {
            temp[index++] = 0;
        }

        // Copy back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeroesBruteForce(arr);

        System.out.println(Arrays.toString(arr));
    }
}

//Time Complexity:  O(n)
//    - Traverse array to collect non-zero elements : O(n)
//    - Fill remaining positions with zeroes       : O(n)
//    - Copy temp array back to original array     : O(n)
//Overall = O(n)
//
//Space Complexity: O(n)
//    - Temporary array of size n