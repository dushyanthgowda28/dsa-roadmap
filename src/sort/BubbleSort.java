package sort;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Array");
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{64, 34, 25, 12, 22};
        System.out.println("Before Sorting " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting " + Arrays.toString(arr));
    }
}

//Time Complexity: O(n2)
//Space Complexity: O(1)