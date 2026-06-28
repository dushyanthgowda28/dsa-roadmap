package arrays.longestpalindromicsubstring;

public class LongestPalindromicSubString {

    static int start = 0;
    static int maxLength = 1;

    static String longestPalindromicSubString(String str) {

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Invalid string input");
        }

        start = 0;
        maxLength = 1;

        for (int i = 0; i < str.length(); i++) {

            // Odd length palindrome
            expand(str, i, i);

            // Even length palindrome
            expand(str, i, i + 1);
        }

        return str.substring(start, start + maxLength);
    }

    static void expand(String str, int left, int right) {

        while (left >= 0 &&
                right < str.length() &&
                str.charAt(left) == str.charAt(right)) {

            left--;
            right++;
        }

        int length = right - left - 1;

        if (length > maxLength) {
            maxLength = length;
            start = left + 1;
        }
    }

    public static void main(String[] args) {

        String str = "forgeeksskeegfor";
        System.out.println(longestPalindromicSubString(str));
    }
}

//Time Complexity: O(n²)
//Space Complexity: O(1)