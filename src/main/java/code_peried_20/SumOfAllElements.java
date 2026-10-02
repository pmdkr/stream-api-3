package code_peried_20;

import java.util.*;
import java.util.stream.*;

public class SumOfAllElements {
    static void main() {
        //sum of all the elements in list of integer object

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 6);

        int sum = num.stream().mapToInt(Integer::intValue).sum();


        System.out.println(sum);
    }
}
