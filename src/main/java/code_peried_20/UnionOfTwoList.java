package code_peried_20;

import java.util.stream.*;
import java.util.*;

public class UnionOfTwoList {
    static void main() {
        //find the union of two list

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(7, 8, 9, 10);


        List<Integer> ans = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

        System.out.println(ans);

    }
}
