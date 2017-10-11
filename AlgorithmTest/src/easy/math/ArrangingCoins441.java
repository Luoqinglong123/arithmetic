package easy.math;

public class ArrangingCoins441 {
	public static void main(String[] args) {
		System.out.println(arrangeCoins(2147483647));
	}
	
	public static int arrangeCoins(int n) {	return (int) ((Math.sqrt(1+8.0*n)-1)/2);}
}
