package arrays.majorityelement;

public class MajorityElement {

    static int majorityElement(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid array");
        }

        // Phase 1: Find candidate
        int candidate = 0;
        int count = 0;

        for (int num : arr) {

            if (count == 0) {
                candidate = num;
            }

            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify candidate
        count = 0;

        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return count > arr.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2,1,1,1,3,4,8};

        System.out.println("Majority Element: " + majorityElement(arr));
    }
}
//
//Time Complexity  : O(n)
//Space Complexity : O(1)