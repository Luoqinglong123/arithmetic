package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * K-diff Pairs in an Array
 *
 * @author LQL
 * @create 2017-09-20 18:07
 **/
public class KdiffPairsinanArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 5, 4};
        System.out.println(findPairs(nums, 0));
    }

    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : nums
                ) {
            list.add(i);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1) && k != 0)
                list.remove(list.get(i));
            for (int j = i + 1; j < list.size(); j++) {
                if (Math.abs(list.get(i) - list.get(j)) == k) {
                    res += 1;
                }
            }
        }
        return res;
    }
}
