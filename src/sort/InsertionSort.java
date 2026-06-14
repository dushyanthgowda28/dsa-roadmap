package sort;

public class InsertionSort {

    static void insertionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid array input");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {64, 34, 25, 12, 22, 99};
        insertionSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}

//Time Complexity: O(n2)
//Space Complexity: O(1)