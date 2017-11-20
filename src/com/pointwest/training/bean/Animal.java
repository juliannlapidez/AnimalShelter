package com.pointwest.training.bean;

public class Animal {
	private int uniqueId;
	private String name;
	private int age;
	private String gender;
	private String animalSpecies;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(int uniqueId, String name, int age, String gender, String animalSpecies) {
		super();
		this.uniqueId = uniqueId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.animalSpecies = animalSpecies;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAnimalSpecies() {
		return animalSpecies;
	}

	public void setAnimalSpecies(String animalSpecies) {
		this.animalSpecies = animalSpecies;
	}

	@Override
	public String toString() {
		return "Animal [uniqueId=" + uniqueId + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", animalSpecies=" + animalSpecies + "]";
	}

}
