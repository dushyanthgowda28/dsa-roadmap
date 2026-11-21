package arrays.removeduplicatesfrom.sortedarray;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesfromSortedArrayBruteForce {
    public static ArrayList<Integer> removeDuplicates(int[] arr) {

        // Put all elements in a sorted set
        Set<Integer> st = new TreeSet<Integer>();
        for (int num : arr) {
            st.add(num);
        }

        // Put set elements into a result ArrayList
        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        ArrayList<Integer> uniqueArr = removeDuplicates(arr);
        for (int i = 0; i < uniqueArr.size(); i++) {
            System.out.print(uniqueArr.get(i) + " ");
        }
    }
}

// Works for Unsorted Also - O(n) Time and O(n) Space