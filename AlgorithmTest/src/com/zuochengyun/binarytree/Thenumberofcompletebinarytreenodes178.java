package com.zuochengyun.binarytree;

import com.zuochengyun.MaxTree.Node;

public class Thenumberofcompletebinarytreenodes178 {

	public int nodeNum(Node n) {
		return 0;
	}

	public int bs(Node node, int l, int h) {
		if (mostLeftLevel(node.right, l + 1) == h) {
			return (int) (Math.pow(2, h - l) + bs(node.right, l + 1, h));
		} else {
			return (int) (Math.pow(2, h - 1 - l) + bs(node.left, l + 1, h));
		}
	}

	public int mostLeftLevel(Node n, int level) {
		while (n != null) {
			level++;
			n = n.left;
		}
		return level - 1;

	}
}
