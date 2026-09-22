package code_peried_stream10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagram {

    public static void main(String[] args) {
        // group the anageams words


        String[] str = {"eat", "tea", "tan", "tree", "nat", "ate"};

        //convert the array to list
        List<String> listOfString = Arrays.asList(str);

        System.out.println(listOfString);

        Map<List<String>, List<String>> ans = listOfString.stream()
                .collect(
                        Collectors.groupingBy(x -> Arrays.stream(x.split(""))
                                .sorted()
                                .collect(Collectors.toList())));


        System.out.println(ans);

    }
}
