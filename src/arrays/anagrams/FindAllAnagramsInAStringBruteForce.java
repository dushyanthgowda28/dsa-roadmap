package arrays.anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAStringBruteForce {

    static List<Integer> findAllAnagramsInAStringBruteForce(String str, String p) {
        List<Integer> list = new ArrayList<>();
        char[] pChars = p.toCharArray();
        Arrays.sort(pChars);

        for (int i = 0; i <= str.length() - p.length(); i++) {
            char[] subStrChars = str.substring(i, i + 4).toCharArray();
            Arrays.sort(subStrChars);
            if (Arrays.equals(subStrChars, pChars)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String str = "BACDGABCDA";
        String p = "ABCD";
        System.out.println(findAllAnagramsInAStringBruteForce(str, p));
    }
}

//Time Complexity: O(n × m log m)
//Space Complexity: O(m)