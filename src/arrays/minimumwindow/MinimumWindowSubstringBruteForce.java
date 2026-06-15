package arrays.minimumwindow;

public class MinimumWindowSubstringBruteForce {

    static String minWindow(String s, String t) {
        String result = "";
        int minLength = Integer.MAX_VALUE;

        for (int start = 0; start < s.length(); start++) {
             for (int end = start; end < s.length(); end++) {
                 if (end-start >= t.length()) {
                     String str = s.substring(start, end + 1);
                     System.out.println(str);
                     if (containsAllCharacters(str, t)) {
                         if (str.length() < minLength) {
                             minLength = str.length();
                             result = str;
                         }
                     }
                 }
             }
            System.out.println();
        }
        return result;
    }

    static boolean containsAllCharacters(String str, String t) {
        int[] chars = new int[256];
        for (char ch : str.toCharArray()) {
            chars[ch]++;
        }

        for (char ch : t.toCharArray()) {
            if (chars[ch] == 0) {
                return false;
            }
            chars[ch]--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println("Minimum Window Substring is " + minWindow(s, t));
    }
}

