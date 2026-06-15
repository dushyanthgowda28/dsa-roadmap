package arrays.anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {

    static List<Integer> findAllAnagramsInAString(String str, String p) {

        List<Integer> result = new ArrayList<>();

        if (str == null || p == null || str.length() < p.length()) {
            return result;
        }

        // Supports uppercase, lowercase, digits, and ASCII characters
        int[] pFreq = new int[256];
        int[] windowFreq = new int[256];

        // Build frequency map for pattern
        for (char ch : p.toCharArray()) {
            pFreq[ch]++;
        }

        int windowSize = p.length();

        for (int i = 0; i < str.length(); i++) {

            // Add current character to window
            windowFreq[str.charAt(i)]++;

            // Remove character that goes out of the window
            if (i >= windowSize) {
                windowFreq[str.charAt(i - windowSize)]--;
            }

            // Compare only when window size is reached
            if (i >= windowSize - 1 && Arrays.equals(pFreq, windowFreq)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "BACDGABCDA";
        String p = "ABCD";

        System.out.println(findAllAnagramsInAString(str, p));
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)