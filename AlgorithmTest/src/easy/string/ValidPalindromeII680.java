package easy.string;

public class ValidPalindromeII680 {
	public static void main(String[] args) {
		System.out.println(validPalindrome("abc"));
		
	}
	public static  boolean validPalindrome(String s) {
		int l=-1,r= s.length();
		while(++l<--r){
			if(s.charAt(l)!=s.charAt(r)) return isPalindromic(s,l-1,r)|| isPalindromic(s,l,r+1);
		}
	    return true;
	}

	public  static boolean isPalindromic(String s, int l, int r) {
		while(++l<--r){
			if(s.charAt(l)!=s.charAt(r)) return false;
		}
	    return true;
	}
}
