package arrays.longestsubstringwithoutrepeatingcharacter;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacter {

    static int longestSubstring(String str) {

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Invalid string");
        }

        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String str = "abcabcbb";

        System.out.println(longestSubstring(str));
    }
}
//
//Time Complexity: O(n)
//Space Complexity: O(min(n, charset))