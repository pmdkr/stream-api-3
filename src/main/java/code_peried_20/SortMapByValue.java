package code_peried_20;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue
{

    public static  void main(String[] args){
        Map<Integer, String> map= new HashMap<>();

        map.put(1,"Rahul");
        map.put(2,"Keshav");
        map.put(3,"Amit");
        map.put(4,"Ram");
        map.put(5,"Shubham");


        Map<Integer,String> sortedMap= map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b)->a,
                        LinkedHashMap::new
                ));


        System.out.println(sortedMap);



    }
}
