package arrays.mergesortedarray;

import java.util.Arrays;

public class MergeSortedArray {

    static int[] mergeSortedArrays(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null) {
            throw new IllegalArgumentException("Input arrays cannot be null");
        }

        int[] result = new int[nums1.length + nums2.length];

        int i = 0; // nums1 pointer
        int j = 0; // nums2 pointer
        int k = 0; // result pointer

        // Time Complexity: O(m + n)
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 6};

        System.out.println(Arrays.toString(
                mergeSortedArrays(nums1, nums2)));
    }
}

// Time Complexity: O(m + n)
// Each element is visited exactly once

// Space Complexity: O(m + n)
// New result array of size m + n