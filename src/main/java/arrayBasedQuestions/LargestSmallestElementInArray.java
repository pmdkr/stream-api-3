package arrayBasedQuestions;

public class LargestSmallestElementInArray {

    public static void main(String[] args) {
        // find the smallest and largest element in array

        int[] list = {1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 888};


        int maxValue = list[0];
        int minValue = list[0];

        for (int i = 0; i < list.length; i++) {
            if (maxValue < list[i]) {
                maxValue = list[i];
            } else if (minValue > list[i]) {
                minValue = list[i];

            }
        }

        System.out.println("largest value is: " + maxValue);
        System.out.println("smallest value is: " + minValue);

    }
}
