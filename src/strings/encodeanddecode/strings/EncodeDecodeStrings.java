package strings.encodeanddecode.strings;


import java.util.*;

public class EncodeDecodeStrings {

    // Encode a list of strings into a single string
    public static String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();

        for (String str : strs) {

            // Append length, delimiter, and actual string
            result.append(str.length())
                    .append("#")
                    .append(str);
        }

        return result.toString();
    }

    // Decode the encoded string back into a list
    public static List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find the delimiter '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Extract the length
            int length = Integer.parseInt(str.substring(i, j));

            // Extract the actual string
            String word = str.substring(j + 1, j + 1 + length);

            result.add(word);

            // Move to the next encoded string
            i = j + 1 + length;
        }

        return result;
    }

    public static void main(String[] args) {

        List<String> input = Arrays.asList(
                "hello",
                "world",
                "java",
                "123",
                ""
        );

        String encoded = encode(input);

        System.out.println("Original List: " + input);

        System.out.println("Encoded String: " + encoded);

        List<String> decoded = decode(encoded);

        System.out.println("Decoded List: " + decoded);
    }
}


//For Encode and Decode Strings (LeetCode 271), let:
//        - N = Total number of characters across all input strings.
//        - K = Number of strings in the input list.
//Time and Space Complexity
//Operation	Time Complexity	Auxiliary Space
//Encode	O(N + K)	O(N + K)
//Decode	O(N + K)	O(N + K)