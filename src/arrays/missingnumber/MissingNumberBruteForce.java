package arrays.missingnumber;

public class MissingNumberBruteForce {

    static int missingNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Array");
        }
        for (int i = 1; i <= arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 7};
        int result = missingNumber(arr);
        System.out.println("Missing Number is " + result);
    }
}


//   Linear Search - O(n^2) Time and O(1) Space