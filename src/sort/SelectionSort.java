package sort;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid array input");
        }

        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            if (lastIndex != maxIndex) {
                int temp = arr[lastIndex];
                arr[lastIndex] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {64, 34, 25, 12, 22, 99};
        selectionSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
