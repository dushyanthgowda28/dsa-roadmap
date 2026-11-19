package arrays.sort.colors;

public class SortColorsBruteForce {
    public static void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count occurrences
        for (int num : nums) {

            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;

        // Insert zeros
        while (count0 > 0) {
            nums[index++] = 0;
            count0--;
        }

        // Insert ones
        while (count1 > 0) {
            nums[index++] = 1;
            count1--;
        }

        // Insert twos
        while (count2 > 0) {
            nums[index++] = 2;
            count2--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
//
//Time Complexity: O(n) — two traversals.
//Space Complexity: O(1) — only three counter variables.