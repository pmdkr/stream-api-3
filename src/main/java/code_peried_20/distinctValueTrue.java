package code_peried_20;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class distinctValueTrue {

    public static void main(String[] args){
        int[] arr= {5,4,1,0,8,2,1};

        List<Integer> list= Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Integer,Long> map=list.stream()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));

        Collection<Long> view =map.values();

        boolean distinctChecker = view.stream().noneMatch(x->x>1);

        System.out.println(distinctChecker);


    }
}
