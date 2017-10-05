package stack.easy;

import java.util.LinkedList;

public class BaseballGame682 {
public int calPoints(String[] ops) {
	int sum = 0  ;
	LinkedList<Integer> integers = new LinkedList<>();
	for (String op : ops) {
		if(op.equals("C")){
			sum-=integers.removeLast();
		}else if(op.equals("D")){
			integers.add(integers.peekLast()*2);
			sum+=integers.peekLast();
		}else if(op.equals("+")){
			integers.add(integers.peekLast()+integers.get(integers.size()-2));
			sum+=integers.peekLast();
		}else{
			integers.add(Integer.parseInt(op));
			sum+=integers.peekLast();
		}
	}
	return sum;
        
    }
}
