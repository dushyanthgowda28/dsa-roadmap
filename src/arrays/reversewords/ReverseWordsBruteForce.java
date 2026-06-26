package arrays.reversewords;

public class ReverseWordsBruteForce {

    public static String reverseWords(String s) {

        // Remove leading and trailing spaces
        s = s.trim();

        // Split using one or more spaces
        String[] words = s.split("\\s+");

        StringBuilder result = new StringBuilder();

        // Traverse from last word to first
        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            // Add space except after last word
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "  the   sky is   blue  ";

        System.out.println(reverseWords(s));
    }
}

//Overall Time : O(n)
//Overall Space : O(n)