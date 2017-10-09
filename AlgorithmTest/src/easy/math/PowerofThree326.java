package easy.math;

public class PowerofThree326 {
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(1));
	}

	public static boolean isPowerOfThree(int n) {
		return (Math.pow(3, 19)%n==0&&n>0);
	}
}
