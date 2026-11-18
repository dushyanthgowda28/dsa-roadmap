package strings.ransomenote;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] frequency = new int[26];

        // Step 1: Count characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            frequency[magazine.charAt(i) - 'a']++;
        }

        // Step 2: Use characters to construct ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {

            int index = ransomNote.charAt(i) - 'a';

            if (frequency[index] == 0) {
                return false;
            }

            frequency[index]--;
        }

        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = canConstruct(ransomNote, magazine);

        System.out.println("Can construct: " + result);
    }
}
