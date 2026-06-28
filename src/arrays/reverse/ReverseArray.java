package arrays.reverse;

public class ReverseArray {

    static void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}

/*
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 */