package arrays.reversewords;

public class ReverseWords {

    public static String reverseWords(String s) {

        StringBuilder result = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            // End index of current word
            int end = i;

            // Move to beginning of current word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Add space before every word except the first
            if (result.length() > 0) {
                result.append(" ");
            }

            // Append the word
            result.append(s.substring(i + 1, end + 1));
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