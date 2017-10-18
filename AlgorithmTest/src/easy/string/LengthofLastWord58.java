package easy.string;

public class LengthofLastWord58 {
	public static void main(String[] args) {
		String s = "hello world";
		System.out.println(lengthOfLastWord2("hello world"));
	}
	  public static   int lengthOfLastWord(String s) {
		  if(s==null||s.length()==0) return 0;
		  String[] split = s.split(" ");
		return split[split.length-1].length();
	        
	    }
	  public static   int lengthOfLastWord2(String s) {
		  int length = s.trim().length();
		  return length-s.trim().lastIndexOf(" ")-1;
		  
	  }
}
