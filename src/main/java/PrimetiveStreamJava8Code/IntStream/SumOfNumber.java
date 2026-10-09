package PrimetiveStreamJava8Code.IntStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNumber {

    static void main() {
        // print the sum to number to n

        int n = 10;
        int sum = IntStream.range(0, n).sum();

        System.out.println(sum);


        List<Integer> list = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8).filter(x -> x % 2 != 0).boxed().collect(Collectors.toList());

        System.out.println(list);


    }
}
