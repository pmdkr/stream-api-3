package code_peried_20;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class ConvertIntToSquare {
    static void main() {
        // convert the int to square

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6);

List<Integer> ans=list.stream().map(x->x*x).collect(Collectors.toList());

        System.out.println(ans);
    }
}
