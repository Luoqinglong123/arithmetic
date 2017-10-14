package com.zuochengyun.video;

class GetUpMedian {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		System.out.println(getUpMedian(arr1, arr2));
	}

	public static int getUpMedian(int[] arr1, int[] arr2) {

		int start1 = 0, end1 = arr1.length - 1, start2 = 0, end2 = arr2.length - 1, offset = 0, mid1 = 0, mid2 = 0;
		while (end1 > start1) {
			// 6->1 5->0
			offset = (end1 - start1 + 1) & 1 ^ 1;
			mid1 = (end1 + start1) / 2;
			mid2 = (end2 + start2) / 2;
			if (arr1[mid1] > arr2[mid2]) {
				end1 = mid1;
				start2 = mid2 + offset;
			} else if (arr1[mid1] < arr2[mid2]) {
				start1 = mid1 + offset;
				end2 = mid2;
			} else {
				return arr1[mid1];
			}
		}
		return Math.min(arr1[start1], arr2[start2]);
	}
}
