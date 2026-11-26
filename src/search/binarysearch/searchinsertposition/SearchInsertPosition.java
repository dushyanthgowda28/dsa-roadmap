package search.binarysearch.searchinsertposition;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Insertion position
        return left;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};

        int target = 4;

        System.out.println("Insert Position " + searchInsert(nums, target)); // 1
    }
}


//Time	O(log n)	Search space is halved every iteration
//Space	O(1)	Only a few variables are used