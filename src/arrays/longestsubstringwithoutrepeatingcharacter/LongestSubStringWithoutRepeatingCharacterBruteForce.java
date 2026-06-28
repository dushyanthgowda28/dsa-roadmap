package arrays.longestsubstringwithoutrepeatingcharacter;

public class LongestSubStringWithoutRepeatingCharacterBruteForce {

    static int longestSubstring(String str) {

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Invalid string");
        }

        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

                if (isUnique(str, i, j)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    static boolean isUnique(String str, int start, int end) {

        boolean[] visited = new boolean[128];

        for (int i = start; i <= end; i++) {

            char ch = str.charAt(i);

            if (visited[ch]) {
                return false;
            }

            visited[ch] = true;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "abcabcbb";

        System.out.println(longestSubstring(str));
    }
}


//Time Complexity: O(n³)
//Two nested loops generate all substrings: O(n²)
//isUnique() scans each substring: O(n)
//Space Complexity: O(1)
//The boolean[128] array has a fixed size, so it uses constant extra space.