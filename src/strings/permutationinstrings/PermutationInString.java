package strings.permutationinstrings;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] freq = new int[26];

        // Store character frequencies of s1
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        // Fixed-size sliding window
        for (int i = 0; i < m; i++) {

            // Add current character
            freq[s2.charAt(i) - 'a']--;

            // Remove character outside the window
            if (i >= n) {
                freq[s2.charAt(i - n) - 'a']++;
            }

            // Check if all frequencies match
            if (i >= n - 1 && isPermutation(freq)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isPermutation(int[] freq) {

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(
                "Contains permutation: " + checkInclusion(s1, s2)
        );
    }
}


//Time Complexity: O(26 × n) = O(n)
//Space Complexity: O(26) = O(1)