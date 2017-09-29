package com.zuochengyun.TowerofHanoi;

public class TowerofHanoi16 {

	public static int hanoipronlem1(int num, String left, String mid,
			String right) {
		if (num < 1)
			return 0;
		return process(num, left, mid, right, left, right);

	}

	private static int process(int num, String left, String mid, String right,
			String from, String to) {
		if(num == 1)
			if(from.equals(mid)||to.equals(mid)){
				System.out.println("move 1 from "+from+" to "+to);
				return 1;
			}else {
				System.out.println("move 1 from "+from+" to "+mid);
				System.out.println("move 1 from "+mid+" to "+to);
				return 2;
			}
		return 0;
	}
	public static void main(String[] args) {
		int hanoipronlem1 = hanoipronlem1(1, "mid", "mid", "right");
		System.out.println(hanoipronlem1);
	}

}
