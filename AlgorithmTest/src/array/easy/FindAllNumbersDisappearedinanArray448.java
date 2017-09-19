package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray448 {
	public static void main(String[] args) {
		int[] nums={4,3,2,7,8,2,3,1};
		List<Integer> list = findDisappearedNumbers1(nums);
		for (Integer integer : list) {
			System.out.print(integer+"\t");
		}
	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < nums.length-1; i++) {
				if(nums[i]!=nums[i+1])
					list.add(nums[i]);
		}
		for (int i = 0; i < list.size()-1; i++) {
			if(list.get(i)+1!=list.get(i+1))	
				list1.add(list.get(i)+1);
		}
		return list1;

	}
	
	public static List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
}
