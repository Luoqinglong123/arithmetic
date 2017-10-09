package com.zuochengyun.stackandqueue;

import java.util.LinkedList;

public class QueueAndStack31 {

	public static void main(String[] args) {
		int[] arr = { 6, 5, 8 };
		int num = 1;
		System.out.println(getNum1(arr, num));
	}

	public static int getNum(int[] arr, int num) {
		if (arr == null || arr.length == 0)
			return 0;
		LinkedList<Integer> qmin = new LinkedList<Integer>();
		LinkedList<Integer> qmax = new LinkedList<Integer>();
		int i = 0, j = 0, res = 0;
		while (i < arr.length) {
			while (j < arr.length) {
				while (!qmin.isEmpty() && arr[qmin.peekLast()] >= arr[j]) {
					qmin.pollLast();
				}
				qmin.addLast(j);
				while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[j]) {
					qmax.pollLast();
				}
				qmax.addLast(j);
				if (arr[qmax.getFirst()] - arr[qmin.getFirst()] > num) {
					break;
				}
				j++;
			}
			if (qmin.peekFirst() == i) {
				qmin.pollFirst();
			}
			if (qmax.peekFirst() == i) {
				qmax.pollFirst();
			}
			res += j - i;
			i++;
		}
		return res;
	}

	public static int getNum1(int[] arr, int num) {
		if (arr == null || arr.length == 0)
			return 0;
		LinkedList<Integer> qmin = new LinkedList<Integer>();
		LinkedList<Integer> qmax = new LinkedList<Integer>();
		int i = 0, j = 0, res = 0;
		while (i < arr.length) {
			while (j < arr.length) {
				while (!qmin.isEmpty() && qmin.peekLast() >= arr[j]) {
					qmin.pollLast();
				}
				qmin.addLast(j);
				while (!qmax.isEmpty() && qmax.peekLast() <= arr[j]) {
					qmax.pollLast();
				}
				qmax.addLast(j);
				if (arr[qmax.getFirst()] - arr[qmin.getFirst()] > num) {
					break;
				}
				j++;
			}
			if (qmin.peekFirst() == i) {
				qmin.pollFirst();
			}
			if (qmax.peekFirst() == i) {
				qmax.pollFirst();
			}
			res += j - i;
			i++;
		}
		return res;

	}
}