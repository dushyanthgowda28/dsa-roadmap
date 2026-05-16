package arrays.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (hashMap.containsKey(difference)) {
                return new int[]{hashMap.get(difference), i};
            }
            hashMap.put(nums[i], i);
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
 * O(n) -> single traversal of the array
 * Each HashMap operation (put, containsKey) is O(1) average case
 *
 * Space Complexity:
 * O(n) -> worst case all elements are stored in HashMap
 */
