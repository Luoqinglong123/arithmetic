package easy.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII119 {
	public static void main(String[] args) {
		List<Integer> row = getRow(3);
		for (Integer integer : row) {
			System.out.print(integer+"\t");
		}
	}

	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> pre = null, row = null;
		for (int i = 0; i < rowIndex+1; i++) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					row.add(pre.get(j - 1) + pre.get(j));
				}
			}
			pre = row;
			list.add(row);

		}
		List<Integer> res = list.get(rowIndex);
		return res;
	}
}
