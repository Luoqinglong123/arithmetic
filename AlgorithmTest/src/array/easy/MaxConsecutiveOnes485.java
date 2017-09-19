package array.easy;

import java.util.*;

public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1,0,0,1,1,1,1,1,1,1};
        System.err.println(findMaxConsecutiveOnes1(nums));
    }
    public static  int findMaxConsecutiveOnes(int[] nums) {
        int pro =  0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                list.add(++pro);
            }
            else {
                pro=0;
            }
        }
        Object[] array = list.toArray();
        Arrays.sort(array);
        return (int) array[array.length-1];
    }

    public  static int findMaxConsecutiveOnes1(int[] nums) {
        int result = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                result = Math.max(count, result);
            }
            else count = 0;
        }

        return result;
    }

}
