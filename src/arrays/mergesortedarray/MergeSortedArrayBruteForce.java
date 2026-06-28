package arrays.mergesortedarray;

import java.util.Arrays;

public class MergeSortedArrayBruteForce {

    static int[] mergeSortedArrayBruteForce(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null) {
            throw new IllegalArgumentException("Input arrays cannot be null");
        }

        int[] merged = new int[nums1.length + nums2.length];

        // Copy nums1
        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }

        // Sort the merged array
        Arrays.sort(merged);

        return merged;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};

        int[] result = mergeSortedArrayBruteForce(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}

//Time Complexity - O((m + n) log(m + n))
//Space Complexity - O(m + n)