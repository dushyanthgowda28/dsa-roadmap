package arrays.slidingwindow.fruitintobaskets;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {

    public static int totalFruit(int[] fruits) {

        Map<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit to the window
            map.put(fruits[right],
                    map.getOrDefault(fruits[right], 0) + 1);

            // More than 2 distinct fruit types
            while (map.size() > 2) {

                int fruit = fruits[left];

                map.put(fruit, map.get(fruit) - 1);

                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                left++;
            }

            // Update maximum window size
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] fruits = {1, 2, 1, 3, 3, 2, 2, 1, 4, 4, 4, 3};

        System.out.println("Total fruits " + totalFruit(fruits)); // 4
    }
}

//Time	O(n)
//Space	O(n) (can also be O(1) because hasmap stores max of 3)