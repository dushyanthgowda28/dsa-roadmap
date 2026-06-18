package arrays.movezeros;

import java.util.Arrays;

public class MoveZeroesOptimal {

    static void moveZeroes(int[] nums) {
        int j = 0; // Position where next non-zero element should be placed

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}

//Time Complexity: O(n) (single traversal)
//Space Complexity: O(1) (in-place)