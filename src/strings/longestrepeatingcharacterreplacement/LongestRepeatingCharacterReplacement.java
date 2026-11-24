package strings.longestrepeatingcharacterreplacement;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // Update frequency
            freq[current - 'A']++;

            // Track maximum character frequency
            maxFreq = Math.max(maxFreq, freq[current - 'A']);

            // Shrink window if replacements exceed k
            while ((right - left + 1) - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update maximum window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        System.out.println(
                "Longest repeating character replacement: "
                        + characterReplacement(s, k)
        );
    }
}


//Time	O(n)
//Space	O(1)