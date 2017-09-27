package com.zuochengyun.catDog;

import java.util.LinkedList;
import java.util.Queue;

public class CatDogQueue {

	private Queue<PetEnterQueue> catQueue;
	private Queue<PetEnterQueue> dogQueue;
	private int count;

	public CatDogQueue() {
		this.catQueue = new LinkedList<PetEnterQueue>();
		this.dogQueue = new LinkedList<PetEnterQueue>();
		this.count = 0;
	}

	public void add(Pet pet) {
		if (pet.getPetType().equals("cat"))
			this.catQueue.add(new PetEnterQueue(pet, count++));
		else if (pet.getPetType().equals("dog"))
			this.dogQueue.add(new PetEnterQueue(pet, count++));
		else
			throw new RuntimeException("非法参数");
	}

	public Pet pollAll() {
		if (!catQueue.isEmpty() && !dogQueue.isEmpty()) {
			if (catQueue.peek().getCount() < dogQueue.peek().getCount())
				return catQueue.poll().getPet();
			else
				return dogQueue.poll().getPet();
		} else if (!catQueue.isEmpty()) {
			return catQueue.poll().getPet();
		} else if (!dogQueue.isEmpty()) {
			return dogQueue.poll().getPet();
		} else {
			throw new RuntimeException("队列为空");
		}
	}

	public Dog pollDog() {
		if (dogQueue.isEmpty())
			throw new RuntimeException("dog队列为空");
		return (Dog) dogQueue.poll().getPet();
	}

	public Cat pollCat() {
		if (dogQueue.isEmpty())
			throw new RuntimeException("cat队列为空");
		return (Cat) catQueue.poll().getPet();
	}

	public boolean isEmpty() {
		return catQueue.isEmpty() && dogQueue.isEmpty();
	}

	public boolean isDogEmpty() {
		return dogQueue.isEmpty();
	}

	public boolean isCatEmpty() {
		return catQueue.isEmpty();
	}

}
