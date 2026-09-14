package arrayBasedQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {

        //print duplicate from the list - using HashSet

        int[] list = {1, 2, 3, 4, 5, 5, 6, 4, 3, 2, 1, 3};

        Set<Integer> set = new HashSet<>();

        for (int j : list) {
            if (!set.add(j)) {
                System.out.println("duplicate value are: " + j);
            }
        }


    }
}
