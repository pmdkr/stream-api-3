package code_peried_20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctOddNumber {

    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);


        //find the distinct off numbers

        List<Integer> ans = list.stream()
                .filter(x -> x % 2 != 0).distinct().collect(Collectors.toList());


        System.out.println(ans);

    }
}
