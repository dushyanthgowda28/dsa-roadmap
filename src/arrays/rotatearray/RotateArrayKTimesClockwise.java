package arrays.rotatearray;

import java.util.Arrays;

public class RotateArrayKTimesClockwise {

    static void rotateClockwise(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Invalid array");
        }

        k = k % arr.length;

        rotate(arr, 0, arr.length - 1);
        rotate(arr, 0, k - 1);
        rotate(arr, k, arr.length - 1);

    }

    static void rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int k = 3;
        System.out.println(Arrays.toString(arr));
        rotateClockwise(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * Time Complexity:
 * Worst Case  : O(n)
 *
 * Space Complexity:
 * O(n)
 */