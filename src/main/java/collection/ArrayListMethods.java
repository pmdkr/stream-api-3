package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 60, 70));

        list.add(50);
        System.out.println(list.get(0));
    }
}
