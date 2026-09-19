package TwoPointers;

public class ReplaceInPlace {

    public static void main(String[] args) {
        System.out.println("replace the item from array if matched the value");

        //output array element does not matter


        int[] arr = {3, 2, 2, 3, 3};  // 2
        int finalLength = getLengthOfArray(arr, 3);
        System.out.println(finalLength);
    }

    public static int getLengthOfArray(int[] nums, int val) {

        //two pointer , replace the item if found in the index

        // use two pointer left and right =nums.length-1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == val) {

                //replace the value of right index to left
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }

        }
        return left;
    }
}
