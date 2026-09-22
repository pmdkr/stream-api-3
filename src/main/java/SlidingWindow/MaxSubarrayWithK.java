package SlidingWindow;

public class MaxSubarrayWithK {

    public static void main(String[] args) {
        // Maximum sum of subarray with size K
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};

        int result = getMaxSum(arr, 4);
        System.out.println(result);


    }

    public static int getMaxSum(int[] nums, int k) {


        //will use sliding window -

        //find the first window sum
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];

        }

        // move the window with size k and check is current window sum maximum or not
        int maxSum = windowSum;

        for (int j = k; j < nums.length - k; j++) {
            windowSum += nums[j]; // add the right index value

            windowSum -= nums[j - k]; // remove the left index value
            maxSum = Math.max(maxSum, windowSum);

        }

        return maxSum;


    }
}
