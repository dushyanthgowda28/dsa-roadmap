package arrays.validpalindrome;

public class ValidPalindromeBruteForce {

    public static boolean isPalindrome(String s) {

        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        // Step 3: Create reversed string
        String original = cleaned.toString();
        String reversed = cleaned.reverse().toString();

        // Step 4: Compare
        return original.equals(reversed);
    }

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println(s1 + " = " + isPalindrome(s1)); // true
        System.out.println(s2 + " = " + isPalindrome(s2)); // false
    }
}


//Time: O(n)
//Cleaning string: O(n)
//Reversing string: O(n)
//Comparing strings: O(n)
//Space: O(n)