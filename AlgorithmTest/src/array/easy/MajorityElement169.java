package array.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
	public static void main(String[] args) {
		int[] nums = { 2, 8, 8, 6, 5, 6, 8, 48, 28, 8, 6 };
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement1(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			Integer integer = map.get(i);
			if (integer == null) {
				map.put(i, 1);
			} else {
				map.put(i, ++integer);
			}
		}
		int max = 0, index = nums.length / 2;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			max = Math.max(max, entry.getValue());
			if (max > index) {
				return entry.getKey();
			}
		}
		return 0;

	}
    public static int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
           // System.out.print(count+"\t");
        }
        return major;
    }
}
