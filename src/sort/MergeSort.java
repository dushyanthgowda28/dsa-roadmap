package sort;

import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;

public class MergeSort {

    static int[] mergeSort(int[] arr) {
        if (arr == null | arr.length == 0) {
            throw new IllegalArgumentException("Invalid Array");
        }

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                result[k++] = right[j++];
            } else {
                result[k++] = left[i++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6, 7};
        System.out.println("Array Before Sort " + Arrays.toString(arr));
        int[] sortedArray = mergeSort(arr);
        System.out.println("Merge Sorted Array " + Arrays.toString(sortedArray));
    }
}
