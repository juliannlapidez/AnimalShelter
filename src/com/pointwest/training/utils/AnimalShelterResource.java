package com.pointwest.training.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import com.pointwest.training.bean.Animal;

public class AnimalShelterResource extends Animal {

	public int homepage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to JC's Animal Shelter!");
		System.out.println("Please select an option: ");
		System.out.println("[1] Add an animal");
		System.out.println("[2] Remove an animal");
		System.out.println("[3] View all animals");
		int optionChoose = sc.nextInt();
		return optionChoose;
	}

	public List<Animal> addAnimal(List<Animal> addedAnimals) {
		AtomicInteger sequenceNumber = new AtomicInteger(1);
		Animal animal = new Animal();
		Scanner sc = new Scanner(System.in);
		System.out.println("What animal you are trying to add?");
		System.out.println("[1] A Dog");
		System.out.println("[2] A Cat");
		System.out.println("[3] A Parrot");
		int animalChoose = sc.nextInt();

		animal.setUniqueId(sequenceNumber.incrementAndGet());
		System.out.println("I. Name ");
		animal.setName(sc.next());
		System.out.println("II. Age ");
		animal.setAge(sc.nextInt());
		System.out.println("III. Gender");
		animal.setGender(sc.next());

		switch (animalChoose) {
		case 1:
			animal.setAnimalSpecies("Dog");
			break;
		case 2:
			animal.setAnimalSpecies("Cat");
			break;
		case 3:
			animal.setAnimalSpecies("Parrot");
			break;

		}

		addedAnimals.add(animal);
		System.out.println("Animal is now added.");

		return addedAnimals;
	}

	public List<Animal> removeAnimal(List<Animal> deletedAnimals) {
		Animal animal = new Animal();
		Scanner sc = new Scanner(System.in);
		System.out.println("REMOVE ANIMAL PAGE");
		System.out.println("Please enter the reference the ID of the animal to remove: ");
		int idToRemove = sc.nextInt();		

		return deletedAnimals;

	}

}
