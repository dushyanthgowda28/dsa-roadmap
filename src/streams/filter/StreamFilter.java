package streams.filter;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);

        //even number from list
        List<Integer> evenNumbers = numberList.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenNumbers);

        //odd number from list
        List<Integer> oddNumbers = numberList.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);
    }
}
