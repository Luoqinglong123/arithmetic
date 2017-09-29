package com.zuochengyun.TowerofHanoi;

public class TowerofHanoi16 {

	public static int hanoipronlem1(int num, String left, String mid, String right) {
		if (num < 1)
			return 0;
		return process(num, left, mid, right, left, right);

	}

	private static int process(int num, String left, String mid, String right, String from, String to) {
		if (num == 1) {
			if (from.equals(mid) || to.equals(mid)) {
				System.out.println("move 1 from " + from + " to " + to);
				return 1;
			} else {
				System.out.println("move 1 from " + from + " to " + mid);
				System.out.println("move 1 from " + mid + " to " + to);
				return 2;
			}
		}
		if (from.equals(mid) || to.equals(mid)) {
			String another = (from.equals(left) || to.equals(left)) ? right : left;
			int part1 = process(num - 1, left, mid, right, from, another);
			int part2 = 1;
			System.out.println("move " + num + " from " + from + " to " + to);
			int part3 = process(num - 1, left, mid, right, another, to);
			return part1 + part2 + part3;
		} else {
			int part1 = process(num - 1, left, mid, right, from, to);
			int part2 = 1;
			System.out.println("move " + num + " from " + from + " to " + mid);
			int part3 = process(num - 1, left, mid, right, to, from);
			int part4 = 1;
			System.out.println("move " + num + " from " + mid + " to " + to);
			int part5 = process(num - 1, left, mid, right, from, to);
			return part1 + part2 + part3 + part4 + part5;
		}
	}

	public static void main(String[] args) {
		int hanoipronlem1 = hanoipronlem1(2, "left", "left", "mid");
		System.out.println(hanoipronlem1);
	}

}