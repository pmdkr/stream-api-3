package code_peried_20;

import java.util.*;
import java.util.stream.*;


public class sortTheListInAlphbeticalOrder {

    static void main() {


        // sort the element in alphbetical order
        
        List<String> str = Arrays.asList("Zudio", "Puma", "Addidas", "MAC", "H&M");

        List<String> ans = str.stream().sorted().collect(Collectors.toList());
        System.out.println(ans);


    }
}
