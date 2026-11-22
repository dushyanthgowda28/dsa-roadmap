package strings.minimumwindowsubstring;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] freq = new int[128];

        // Store frequency of characters in t
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        int required = t.length();

        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            // Character is required
            if (freq[rightChar] > 0) {
                required--;
            }

            freq[rightChar]--;

            // All required characters are found
            while (required == 0) {

                int windowLength = right - left + 1;

                // Update minimum window
                if (windowLength < minLength) {
                    minLength = windowLength;
                    start = left;
                }

                char leftChar = s.charAt(left);

                freq[leftChar]++;

                // Window becomes invalid
                if (freq[leftChar] > 0) {
                    required++;
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = minWindow(s, t);

        System.out.println("Minimum Window: " + result);
    }
}
