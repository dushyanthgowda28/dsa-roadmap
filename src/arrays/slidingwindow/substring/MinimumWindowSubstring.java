package arrays.slidingwindow.substring;


public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] freq = new int[128];

        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int required = t.length();

        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            if (freq[rightChar] > 0) {
                required--;
            }

            freq[rightChar]--;

            while (required == 0) {

                int windowLength = right - left + 1;

                if (windowLength < minLength) {
                    minLength = windowLength;
                    start = left;
                }

                char leftChar = s.charAt(left);

                freq[leftChar]++;

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

        System.out.println(minWindow(s, t));
    }
}


//Complexity
//- Time: O(N + M)
//- Space: O(1) – fixed-size frequency array (128)