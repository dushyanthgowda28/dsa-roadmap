package arrays.containsduplicate;

public class FindDuplicateNumber {

    static int findDuplicate(int[] arr) {

        // Phase 1: Find the meeting point
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance of the cycle
        slow = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};

        System.out.println("Duplicate number is: "
                + findDuplicate(arr));
    }
}
