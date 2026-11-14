package arrays.longest.consecutivesequence;

import java.util.Arrays;

public class LongestConsecutiveSequenceBruteForce {

    static int longestConsecutiveSequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Array");
        }

        Arrays.sort(arr);

        int result = 1, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                continue;
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            result = Math.max(result, count);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{100, 4, 200, 1, 3, 2};
        int result = longestConsecutiveSequence(arr);
        System.out.println("Longest Consecutive Sequence is " + result);
    }
}


//Sorting - O(n*log n) Time and O(1) Space