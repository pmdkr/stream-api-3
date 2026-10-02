package code_peried_20;

import java.util.regex.Pattern;
import java.util.*;
import java.util.stream.*;

public class RemoveNonNumericChar {

    static void main() {
        // remove the none numeric char fron the list to string


        List<String> list = Arrays.asList("a1b2c3", "1ab23c", "12365abc");

        Pattern pattern = Pattern.compile("[^0-9]");

        List<String> ans = list.stream().map(x -> pattern.matcher(x).replaceAll("")).collect(Collectors.toList());

        System.out.println(ans);
    }
}
