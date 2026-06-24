package arrays.water.traprainwater;

public class TrappingRainWaterBruteForce {

    public static int trap(int[] height) {

        int n = height.length;
        int totalWater = 0;

        for (int i = 0; i < n; i++) {

            int leftMax = height[i];
            int rightMax = height[i];

            // Find maximum height on the left
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Find maximum height on the right
            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            totalWater += Math.min(leftMax, rightMax) - height[i];
        }

        return totalWater;
    }

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println("Total water trap is " + trap(height)); // Output: 6
    }
}

//Time Complexity: O(n²)
//For every element, we scan left and right.
//Space Complexity: O(1)