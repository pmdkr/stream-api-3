package WTF;
import java.util.*;
import java.util.stream.*;
public class FindingDuplicate {


public  static  void main(String[] args){
    List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);

    list.stream()
            .distinct()
            .filter(i -> Collections.frequency(list, i) > 1)
            .forEach(System.out::println);


}

}
