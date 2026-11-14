package arrays.longest.consecutivesequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    static int longestConsecutive(int[] arr) {
        Set<Integer> st = new HashSet<>();
        int res = 0;

        // Hash all the array elements
        for (int val : arr)
            st.add(val);

        // Check each possible sequence from the start then update optimal length
        for (int val : arr) {

            // If current element is the starting element of a sequence
            if (st.contains(val) && !st.contains(val - 1)) {

                // Then check for next elements in the sequence
                int cur = val, cnt = 0;
                while (st.contains(cur)) {
                    cur++;
                    cnt++;
                }

                // Update optimal length
                res = Math.max(res, cnt);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(longestConsecutive(arr));
    }
}


//Hashing - O(n) Time and O(n) Space