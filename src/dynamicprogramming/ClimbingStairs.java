package dynamicprogramming;

public class ClimbingStairs {

    static int climbStairs(int n) {

        int previous = 1;
        int secondPrevious = 1;

        for (int i = 2; i <= n; i++) {

            int current = previous + secondPrevious;

            secondPrevious = previous;
            previous = current;
        }

        return previous;
    }

    public static void main(String[] args) {

        int n = 4;
        System.out.println("climbing stairs - " + climbStairs(n)); // 5
    }
}
