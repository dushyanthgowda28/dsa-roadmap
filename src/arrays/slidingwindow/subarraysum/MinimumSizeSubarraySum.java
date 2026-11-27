package arrays.slidingwindow.subarraysum;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Expand the window
            sum += nums[right];

            // Shrink the window while sum >= target
            while (sum >= target) {

                int currentLength = right - left + 1;

                minLength = Math.min(minLength, currentLength);

                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        System.out.println("Minimum Size Subarray Sum "+minSubArrayLen(target, nums));
    }
}

//Time - O(n)
//Space - O(1)
