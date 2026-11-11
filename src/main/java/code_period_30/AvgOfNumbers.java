package code_period_30;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {

    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6);

        double ans = list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();

        System.out.println(ans);


    }
}
