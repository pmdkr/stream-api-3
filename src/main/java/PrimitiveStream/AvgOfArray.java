package PrimitiveStream;

import java.util.*;
import java.util.stream.*;

public class AvgOfArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};


        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);

        //maximum and minimum
        int[] arr1 = {10, 5, 30, 2, 50};

        int max = Arrays.stream(arr1).max().orElse(0);

        int min = Arrays.stream(arr1).min().orElse(0);


        System.out.println("Max : " + max);
        System.out.println("Min : " + min);


        //count even and odd number
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 23, 44, 55, 67};
        long eventCount = Arrays.stream(arr3).filter(n -> n % 2 == 0).count();
        long oddCount = Arrays.stream(arr3).filter(n -> n % 2 != 0).count();

        System.out.println("Even number: " + eventCount);
        System.out.println("Odd numbers : " + oddCount);

        //find the sum of even numbers

        int sum2 = Arrays.stream(arr3).filter(n -> n % 2 == 0).sum();


        System.out.println("sum of even number : " + sum2);

        //sum of each number:
        int[] result = Arrays.stream(arr3).map(n -> n * n).toArray();

        System.out.println("square of each number : " + Arrays.toString(result));


        //find numbers greater then 10

        int[] result2 = Arrays.stream(arr3).filter(n -> n > 10).toArray();
        System.out.println("numbers greater then 10 : " + Arrays.toString(result2));


    }
}
