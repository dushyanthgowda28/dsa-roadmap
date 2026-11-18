package strings.firstuniquecharacter.inastring;

public class FirstUniqueCharacterInAString {
    public static char firstUniqChar(String s) {

        int[] frequency = new int[26];

        // Step 1: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }

        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {

            if (frequency[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String str = "leetcode";

        char result = firstUniqChar(str);

        if (result != '\0') {
            System.out.println("First unique character: " + result);
        } else {
            System.out.println("No unique character found");
        }
    }
}

//Complexity analysis
//Complexity	Value	Reason
//Time	\(O(n)\)	Two iterations
//Space	\(O(1)\)	Fixed-size array of 26