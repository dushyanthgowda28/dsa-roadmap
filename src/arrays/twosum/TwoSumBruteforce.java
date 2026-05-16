package arrays.twosum;

import java.util.Arrays;

public class TwoSumBruteforce {

    static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}

/*
 * Time Complexity:
 * Worst Case  : O(n^2)  -> when we check all possible pairs
 * Best Case   : O(1)    -> when first pair matches target
 * Average Case: O(n^2)
 *
 * Space Complexity:
 * O(1) -> no extra data structure used (only variables i, j)
 */