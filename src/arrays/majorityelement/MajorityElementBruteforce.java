package arrays.majorityelement;

public class MajorityElementBruteforce {

    static int majorityElementBruteForce(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid array");
        }

        int majorityCount = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {

            int frequency = 0;

            // Count occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }

            // If frequency is greater than n/2, it's the majority element
            if (frequency > majorityCount) {
                return arr[i];
            }
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElementBruteForce(arr);

        System.out.println("Majority Element: " + result);
    }
}

//Time Complexity  : O(n²)
//Space Complexity : O(1)