package easy.math;

public class Sqrt_x69 {
	public static void main(String[] args) {
		
			System.out.println(sqrt(10));
	}
	public static  int sqrt(int x) {
		long r = x; 
		while(r*r>x){
			r = (r+x/r)/2;
		}
		
		return (int) r;
		
	}
}
