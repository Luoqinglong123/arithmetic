package easy.math;

public class AddDigits258 {
	public static void main(String[] args) {
		System.out.println(addDigits1(38));
	}

	public static int addDigits(int num) {
		String nums = num + "";
		int res = calc(nums);
		while ((res + "").length() > 1) {
			res = calc((res + ""));
		}

		return res;
	}

	private static int calc(String nums) {
		int res = 0;
		for (int i = 0; i < nums.length(); i++) {
			res += Integer.parseInt(nums.charAt(i) + "");
		}
		return res;
	}
	  public static int addDigits1(int num) {

	        return num==0?0:(num%9==0?9:(num%9));

	    }
}
