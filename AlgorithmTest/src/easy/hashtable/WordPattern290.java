package easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {


	public static boolean wordPattern1(String pattern, String str) {
		String[] split = str.split(" ");
		if (split.length != pattern.length())
			return false;
		Map map = new HashMap();
		for (Integer i = 0; i < split.length; i++) {
			// 上次放的值是上一个下标为i的值res，这一次返回的值就是res (key不同，但是value相同)
			// map.put()返回上一次放入的value
			if (map.put(pattern.charAt(i), i) != map.put(split[i], i))
				return false;
		}
		return true;
	}
}
