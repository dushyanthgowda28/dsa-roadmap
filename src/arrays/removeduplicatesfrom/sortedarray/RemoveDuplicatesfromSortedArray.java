package arrays.removeduplicatesfrom.sortedarray;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        ArrayList<Integer> result = removeDuplicates(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}

// Single Traversal - O(n) Time and O(n) Space