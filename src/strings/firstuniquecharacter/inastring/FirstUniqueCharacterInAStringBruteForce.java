package strings.firstuniquecharacter.inastring;

public class FirstUniqueCharacterInAStringBruteForce {

    public static char firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            boolean isUnique = true;

            for (int j = 0; j < s.length(); j++) {

                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return s.charAt(i);
            }
        }

        return '\0'; // No unique character found
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

//Complexity
//- Time: \(O(n^2)\)
//- Space: \(O(1)\)