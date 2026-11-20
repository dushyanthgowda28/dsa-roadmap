package strings.palindromic.substring;


public class PalindromicSubstrings {

    public static int countSubstrings(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            count += expandAroundCenter(s, i, i);

            // Even length palindrome
            count += expandAroundCenter(s, i, i + 1);
        }

        return count;
    }

    private static int expandAroundCenter(String s, int left, int right) {

        int count = 0;

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            count++;

            left--;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "aaa";

        System.out.println("Palindromic Substrings count " + countSubstrings(s));
    }
}

//Time	O(n²)
//Space	O(1)