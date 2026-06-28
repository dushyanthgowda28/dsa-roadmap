package arrays.reverse;

public class ReverseString {

    static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        int left = 0;
        int right = str.length() - 1;
        char[] chars = str.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            right--;
            left++;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reverse String is " + reverseString(str));
    }
}

/*
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */