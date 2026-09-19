package TwoPointers;

public class RemoveDuplicate {


    static void main() {
        System.out.println("remove duplicate element from array , in sorted ");


        int[] arr = {1, 2, 2, 3, 4, 5, 6, 6, 7, 7};

        int lenghtOfArray = getLengthOfUniqeArray(arr);
        System.out.println(" length of the array after removing duplicate :" + lenghtOfArray);
    }


    public static int getLengthOfUniqeArray(int[] nums) {


        // two pointer approch

        /**
         * Input: nums = [1,1,2]
         * Output: 2, nums = [1,2,_]
         * */
        int left = 0;
        for (int right = 1; right < nums.length; right++) {

            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }

        }


        return left+1;
    }
}
