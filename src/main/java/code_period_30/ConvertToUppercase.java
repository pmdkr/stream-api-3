package code_period_30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("breaking bad", "game of throns", "big bang theory");

        List<String> ans = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(ans);
    }
}
