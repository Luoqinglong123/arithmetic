package com.zuochengyun.array;

public class MaxProduct {

	public double maxProduct(double[] arr) {
		double max = arr[0];
		double min = arr[0];
		double res = arr[0];
		double maxEnd = 0;
		double minEnd = 0;
		for (int i = 0; i < arr.length; i++) {
			maxEnd = max * arr[i];
			minEnd = min * arr[i];
			max = Math.max(Math.max(minEnd, maxEnd), arr[i]);
			min = Math.min(Math.min(minEnd, maxEnd), arr[i]);
			res= Math.max(res, max);
		}
		return res;
	}
}
