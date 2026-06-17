package arrays.reverse;

public class ReverseArray {

    static void reverseArray(int[] arr) {

        int right = 0;
        int left = arr.length-1;
        while(right < left) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right++;
            left--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(arr);
        for (int a : arr) {
            System.out.print(a+ " ");
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