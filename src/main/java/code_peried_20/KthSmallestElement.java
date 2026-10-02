package code_peried_20;

import java.util.stream.*;
import java.util.*;

public class KthSmallestElement {

    static void main() {
        //find the kth smallest element in the List of Integer

        List<Integer> list = Arrays.asList(7, 1, 6, 2, 1, 3, 4, 5);

        int k = 3;

        int ans = list.stream()
                .sorted().skip(k - 1)
                .findFirst()
                .get();


        System.out.println(ans);
    }
}
