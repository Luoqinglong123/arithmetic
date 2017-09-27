package com.zuochengyun.catDog;

import java.util.LinkedList;
import java.util.Queue;

public class CatDogQueue {

	private Queue<Cat> catQueue;
	private Queue<Dog> dogQueue;
	private int cout;

	public CatDogQueue() {
		this.catQueue = new LinkedList<Cat>();
		this.dogQueue = new LinkedList<Dog>();
		this.cout = 0;
	}
	
}
