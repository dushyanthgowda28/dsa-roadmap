package search;

public class RecursiveBinarySearch {

    static int recursiveBinarySearch(int[] arr, int low, int high, int target) {

        // Base condition: element not found
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return recursiveBinarySearch(arr, low, mid - 1, target);
        } else {
            return recursiveBinarySearch(arr, mid + 1, high, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 17;

        int result = recursiveBinarySearch(arr, 0, arr.length - 1, target);

        if (result == -1) {
            System.out.println("Target element is not present in the array");
        } else {
            System.out.println("Target element is present at index " + result);
        }
    }
}

//Time Complexity - O(log n)
//Space Complexity - O(log n)