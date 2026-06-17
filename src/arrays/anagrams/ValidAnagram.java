package arrays.anagrams;

import java.util.Arrays;

public class ValidAnagram {

    static boolean isValidAnagram(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }

        int[] array = new int[256];

        for (int i = 0; i < one.length(); i++) {
            array[one.charAt(i)]++;
            array[two.charAt(i)]--;
        }

        for(int a : array) {
            if (a != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String one = "silent";
        String two = "listen";
        if (isValidAnagram(one, two)) {
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Not Valid Anagram");
        }
    }
}

//Time Complexity = O(n)
//Space Complexity = O(1)