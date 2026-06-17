package arrays.containsduplicate;

public class ContainsDuplicateBruteForce {

    public static int duplicateElement(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        int len = arr.length;
        int result = -1;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    result = arr[i];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 5, 7, 8, 4};
        int result = duplicateElement(arr);
        if (result == -1) {
            System.out.println("Array contains unique elements");
        }
        else {
            System.out.println("Duplicate element is " + result);
        }
    }
}

/*
 * Time Complexity:
 * Worst Case  : O(n^2)  -> when we check all possible pairs
 * Best Case   : O(1)    -> when first pair matches target
 * Average Case: O(n^2)
 *
 * Space Complexity:
 * O(1) -> no extra data structure used (only variables i, j, len)
 */