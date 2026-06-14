package search;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid array input");
        }
        int low = 0, high = arr.length-1, mid;
        while (low <= high) {
            mid = low + (high-low)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 17;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Target element is not present in the array");
        } else {
            System.out.println("Target element is present at index " +result);
        }
    }
}
