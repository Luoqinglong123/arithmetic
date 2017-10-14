package easy.array;

import java.util.Arrays;

public class MaximumProductofThreeNumbers628 {

	public static void main(String[] args) {
		int[] nums={9,2,4,3};
		int maximumProduct = maximumProduct1(nums);
		System.out.println(maximumProduct);
	}
	 public  static int maximumProduct(int[] nums) {
		 
		 int product = 1;
		 for (int i : nums) {
			 if(i!=0)
			product*=i;
		}
		return product;

	 }
	 public static int maximumProduct1(int[] a) {
	        Arrays.sort(a);
	        int len = a.length;
	        return Math.max(a[0] * a[1] * a[len-1], a[len-1] * a[len-2] * a[len-3]);

	    }
}
