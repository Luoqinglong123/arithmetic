package easy.math;

public class PowerofTwo231 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(5));
	}
	public static  boolean isPowerOfTwo(int n) {
		return n>0&&Integer.bitCount(n)==1;
	}
	
	 public boolean isPowerOfTwo1(int n) {
	        
	        return ((n&(n-1))==0&&n>0);
	    }
}
