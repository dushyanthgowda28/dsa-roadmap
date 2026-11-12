package arrays.subarraysum;

public class SubArrraySumEqualsKBruteForce {

    static int subArraySum(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Array");
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, -2, -20, 10};
        int k = -10;
        int subArrayCount = subArraySum(arr, k);
        System.out.println("Subarray sum equals k = " + subArrayCount);
    }
}

//Using Nested Loop - O(n2) Time and O(1) Space