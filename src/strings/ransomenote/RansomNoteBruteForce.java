package strings.ransomenote;

public class RansomNoteBruteForce {
    public static boolean canConstruct(String ransomNote, String magazine) {

        boolean[] used = new boolean[magazine.length()];

        for (int i = 0; i < ransomNote.length(); i++) {

            boolean found = false;

            for (int j = 0; j < magazine.length(); j++) {

                if (!used[j] && ransomNote.charAt(i) == magazine.charAt(j)) {

                    used[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
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
