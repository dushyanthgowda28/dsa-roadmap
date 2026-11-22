package strings.string.compression;

public class StringCompression {

    public static int compress(char[] chars) {

        int write = 0;
        int read = 0;

        while (read < chars.length) {

            char currentChar = chars[read];
            int count = 0;

            // Count consecutive occurrences
            while (read < chars.length &&
                    chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write count only if greater than 1
            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int length = compress(chars);

        System.out.println("Compressed Length: " + length);

        System.out.println("Compressed String: " +
                new String(chars, 0, length));
    }
}

//Time	O(n)
//Auxiliary space	O(1)