package array.easy;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveElement27 {

	public static void main(String[] args) {
		int elem = 3;
		int[] A = { 3, 2, 1, 2, 3, 2, 2, 3 };
		System.out.println(removeElement(A, elem));
	}

	public static int removeElement(int[] A, int elem) {
		int m = 0;
		for (int i = 0; i < A.length; i++) {

			if (A[i] != elem) {
				A[m] = A[i];
				m++;
			}
		}
		return m;
	}

	public static int removeElement1(int[] A, int elem) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		if (A.length == 0)
			return 0;
		for (int i = 0; i < A.length; i++) {
			list.add(A[i]);
		}
		Iterator<Integer> it = list.iterator();
		try {
			while (it.hasNext()) {
				if (it.next() == elem) {
					it.remove();
				}
			}
		} catch (Exception e) {
			System.out.println("No such element");
		}
		return list.size();
	}

}
