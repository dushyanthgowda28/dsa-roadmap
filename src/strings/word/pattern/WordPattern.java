package strings.word.pattern;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> mapPattern = new HashMap<>();
        Map<String, Character> mapWord = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (mapPattern.containsKey(ch) && !mapPattern.get(ch).equals(word)) {
                return false;
            }

            if (mapWord.containsKey(word) && mapWord.get(word) != ch) {
                return false;
            }

            mapPattern.put(ch, word);
            mapWord.put(word, ch);
        }

        return true;
    }

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }
}

//Time	O(n + m)
//Space	O(n + m)