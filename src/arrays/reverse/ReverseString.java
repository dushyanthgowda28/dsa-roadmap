package arrays.reverse;

public class ReverseString {

    static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        int right = 0;
        int left = str.length()-1;
        char[] chars = str.toCharArray();
        while(right < left) {
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            right++;
            left--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reverse String is " +reverseString(str));
    }
}

/*
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */