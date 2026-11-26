package arrays.longestonesafterdeletion;

public class LongestOnesAfterDeletion {

    public static int longestSubarray(int[] nums) {

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            // Count zeros in the current window
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Allow at most one zero
            while (zeroCount > 1) {

                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            // Subtract one because exactly one element must be deleted
            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};

        System.out.println(longestSubarray(nums));
    }
}


//Time Complexity: O(n) – Each pointer traverses the array at most once.
//Space Complexity: O(1) – Only three variables are used.