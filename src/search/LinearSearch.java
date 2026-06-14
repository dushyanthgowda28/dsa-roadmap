package search;

public class LinearSearch {

    static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid array input");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 47, 55, 3, 99, 12, 74};
        int target = 55;
        int result = linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Target element is not present in the array");
        } else {
            System.out.println("Target element is present at index " + result);
        }
    }
}

//Time Complexity - O(n)
//Space Complexity - O(1)