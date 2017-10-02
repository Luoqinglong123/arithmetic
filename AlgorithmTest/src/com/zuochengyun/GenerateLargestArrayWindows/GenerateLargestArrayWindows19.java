package com.zuochengyun.GenerateLargestArrayWindows;

import java.util.LinkedList;

public class GenerateLargestArrayWindows19 {
	public static void main(String[] args) {
		int w=3;
		int[] arr={4,3,5,4,3,3,6,7};
		int[] maxWidow = getMaxWidow(arr, w);
		for (int i : maxWidow) {
			System.out.print(i+"\t");
		}
	}

	public static int[] getMaxWidow(int[] arr, int w) {
		if (arr == null || w < 1 || arr.length < w) {
			return null;
		}
		int index = 0;
		int[] res = new int[arr.length - w + 1];
		LinkedList<Integer> qmax = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
				qmax.pollLast();
			}
			qmax.addLast(i);
			if (qmax.peekFirst() == i - w) {
				qmax.pollFirst();
			}
			if (i >= w - 1) {
				res[index++] = arr[qmax.peekFirst()];
			}
		}
		return res;

	}
}
