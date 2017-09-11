package array.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; i++) {
			row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));

			}
			pre = row;
			res.add(pre);
		}
		return res;
	}
	 public static void printYFTriangle1(){
	        int[] a = new int[5 + 1];
	        int previous = 1;
	        for (int i = 1; i <= 5; i ++){
	            for (int j = 1; j <= i; j++){
	                int current = a[j];
	                a[j] = previous + current;
	                previous = current;
	                System.out.print(a[j] + " ");
	            }
	            System.out.println();
	        }
	    }
	public static void main(String[] args) {/*
		List<List<Integer>> generate = generate(5);
		for (List<Integer> list : generate) {
			System.out.println();
			for (Integer integer : list) {
				System.out.print(integer + "\t");
			}
		}
	*/
		printYFTriangle1();}
}
