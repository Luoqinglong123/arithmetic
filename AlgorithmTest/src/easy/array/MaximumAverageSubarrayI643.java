package easy.array;

/**
 * Maximum Average Subarray I
 *
 * @author LQL
 * @create 2017-09-21 21:19
 **/
public class MaximumAverageSubarrayI643 {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage1(nums, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double max = 0;
        for (int i = 0; i < nums.length - k; i++) {
            max = Math.max(nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3], max);
        }
        return max / k;
    }

    public static double findMaxAverage1(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = 0;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        return max / k;
    }
}
