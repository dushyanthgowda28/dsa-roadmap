package arrays.anagrams;

import java.util.Arrays;

public class ValidAnagramBruteForce {

    static boolean isValidAnagramBruteForce(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }
        char[] oneChars = one.toCharArray();
        char[] twoChars = two.toCharArray();

        Arrays.sort(oneChars);
        Arrays.sort(twoChars);

        return Arrays.equals(oneChars, twoChars);
    }

    public static void main(String[] args) {
        String one = "silent";
        String two = "listen";
        if (isValidAnagramBruteForce(one, two)) {
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Not Valid Anagram");
        }
    }
}

//Time Complexity = O(n log n)
//Space Complexity = O(n)