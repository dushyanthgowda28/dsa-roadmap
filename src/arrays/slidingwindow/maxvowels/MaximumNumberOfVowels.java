package arrays.slidingwindow.maxvowels;

public class MaximumNumberOfVowels {

    static int maxVowels(String s, int k) {

        int windowVowels = 0;

        // Calculate vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                windowVowels++;
            }
        }

        int maxVowels = windowVowels;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Add incoming character
            if (isVowel(s.charAt(i))) {
                windowVowels++;
            }

            // Remove outgoing character
            if (isVowel(s.charAt(i - k))) {
                windowVowels--;
            }

            maxVowels = Math.max(maxVowels, windowVowels);

            // Maximum possible is k
            if (maxVowels == k) {
                return k;
            }
        }

        return maxVowels;
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u';
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        System.out.println("Maximum Number of Vowels: " +
                maxVowels(s, k));
    }
}
