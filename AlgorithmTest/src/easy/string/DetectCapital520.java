package easy.string;

public class DetectCapital520 {
	public static void main(String[] args) {
		String word="G";
		System.out.println(detectCapitalUse(word));
	}
	public static boolean detectCapitalUse(String word) {
		if(word.length()==1) return true;
		if (word == null || word.length() <1)
			return false;
		int first=word.charAt(0)-'a';
		if(first>=0){
			for (int i = 1; i < word.length(); i++) {
				if(word.charAt(i)-'a'<0) 
					return false;
			}
		}else{
			int second=word.charAt(1)-'a';
			if(second>=0){
				for (int i = 2; i < word.length(); i++) {
					if(word.charAt(i)-'a'<0) 
						return false;
				}
			}else{
				for (int i = 2; i < word.length(); i++) {
					if(word.charAt(i)-'a'>=0) 
						return false;
				}
			}
		}
		return true;
	}
}
