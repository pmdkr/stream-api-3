package TwoPointers;

public class FindStartingIndexOfStringInAnotherString {

    public static void main(String[] args) {
        System.out.println("Find the Index of the First Occurrence in a String");


        String hayStack = "sadkdjadiadjlajljdd";
        String needle = "sad";

        int result = getFirstIndexOfSecondWord(hayStack, needle);
        System.out.println(result);


    }


    public static int getFirstIndexOfSecondWord(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();


        for (int i = 0; i < n - m; i++) {
            int j = 0;

            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {


                j++;

                // first iteration: j=1 as haystack string
                // first iteration: j=2
                // first iteration: j=3
            }
            if (j == m) {
                return i;   // 0
            }
        }
        return -1;
    }
}
