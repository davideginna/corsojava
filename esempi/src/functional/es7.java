package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class es7 {
    public static void main(String[] args) {
        List<List<Integer>> myList = new ArrayList<>();
        myList.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        myList.add(new ArrayList<>(Arrays.asList(7, 34, 28)));
        myList.add(new ArrayList<>(Arrays.asList(99, 77, 11)));

        System.out.println(myList);

        myList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .forEach(integer -> isPrimeNumber(integer));

    }

    public static void isPrimeNumber(int i) {
        int factors = 0;
        int j = 1;
        while (j <= i) {
            if (i % j == 0) {
                factors++;
            }
            j++;
        }
        if (factors == 2) {
            System.out.println("numero primo " + i);
        }
    }
}
