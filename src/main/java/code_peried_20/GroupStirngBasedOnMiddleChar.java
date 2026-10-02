package code_peried_20;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class GroupStirngBasedOnMiddleChar {

    public static void main(String[] args) {
        //group the stirng based on middle char

        String[] str = {"ewe", "jji", "jhj", "kwk", "aha"};

        Map<String, List<String>> map = Stream.of(str).
                collect(Collectors.groupingBy(x -> x.toString().substring(1, 2)));

        System.out.println(map);

    }
}
