package PrimitiveStream;

import java.util.*;

public class Level2 {


    public static void main(String[] args) {
        //find the second highest number
        int[] arr = {10, 20, 30, 40, 50};


        int secondHighest = Arrays.stream(arr)
                .distinct()
                .sorted()
                .skip(2)
                .findFirst()
                .orElseThrow();


        System.out.println(secondHighest);


    }
}
