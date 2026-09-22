package TwoPointers;

public class TwoSumII {

    public static void main(String[] args) {

        //array is sorted - two pointer
        // return the index of two sum

        int[] arr = {2, 7, 11, 15, 18};
        int[] ans = getIndexOfTwoSum(arr, 9);


        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

    public static int[] getIndexOfTwoSum(int[] nums, int target) {

        //two pointer  -- O(n)
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) return new int[]{left+1, right+1};
            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1};

    }
}
