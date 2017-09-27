package com.zuochengyun.catDog;

public class PetEnterQueue {

	private Pet pet;
	private long count;

	public PetEnterQueue(Pet pet, long count) {
		super();
		this.pet = pet;
		this.count = count;
	}

	public Pet getPet() {
		return pet;
	}

	public long getCount() {
		return count;
	}

	public String getPetType() {
		return this.pet.getPetType();
	}

}
