package com.zuochengyun.catDog;

public class Test {

	public static void main(String[] args) {
		CatDogQueue queue = new CatDogQueue();
		Pet pet = new Dog("dog");
		Pet pet1 = new Cat("cat");
		Pet pet2 = new Dog("dog");
		Pet pet3 = new Dog("dog");
		Pet pet4 = new Cat("cat");
		Pet pet5 = new Dog("dog");
		queue.add(pet);
		queue.add(pet1);
		queue.add(pet2);
		queue.add(pet3);
		queue.add(pet4);
		queue.add(pet5);
		System.out.println(queue.pollDog().getPetType());
		System.out.println(queue.pollDog().getPetType());
		System.out.println(queue.pollDog().getPetType());
		System.out.println(queue.pollDog().getPetType());
		System.out.println(queue.pollAll().getPetType());
		
	}
}
