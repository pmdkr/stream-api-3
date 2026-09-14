package stringBasedQuestions;

public class PalindromeString {
    public static void main(String[] args) {

        //find is that string is palindrome

        String str = "madamddfd";
        String rev = "";

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
            }
            left++;
            right--;

            //System.out.println("Palindrome string");

        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {

            System.out.println("Not a Palindrome");


        }
    }

}
