package arrays.containsduplicate;

import java.util.HashSet;

public class ContainsDuplicate {

    static int duplicate(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        int len = arr.length;
        int result = -1;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < len; i++) {
            if (hashSet.contains(arr[i])) {
                return arr[i];
            } else {
                hashSet.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 5, 7, 8, 5};
        int result = duplicate(arr);
        if (result == -1) {
            System.out.println("Array contains unique elements");
        }
        else {
            System.out.println("Duplicate element is " +result);
        }
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