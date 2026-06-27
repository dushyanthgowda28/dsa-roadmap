package arrays.anagrams.groupanagrams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] sorted = Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();

        for(int a : sorted) {
            System.out.print(a+ " ");
        }
    }
}
