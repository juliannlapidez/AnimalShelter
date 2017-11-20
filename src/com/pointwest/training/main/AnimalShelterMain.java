package com.pointwest.training.main;

import java.util.ArrayList;
import java.util.List;

import com.pointwest.training.bean.Animal;
import com.pointwest.training.utils.AnimalShelterResource;

public class AnimalShelterMain {

	public static void main(String[] args) {
		AnimalShelterResource animalShelterResource = new AnimalShelterResource();
		List<Animal> listOfAnimals = new ArrayList<>();
		//boolean isContinue = true;

		while (listOfAnimals.size()!=10) {
			switch (animalShelterResource.homepage()) {
			case 1:
				listOfAnimals = animalShelterResource.addAnimal(listOfAnimals);
				for (Animal animal : listOfAnimals) {
					System.out.println(animal.toString());
				}
				break;
			default:
				break;
			}
		}System.out.println( "The animal shelter is currently full. Thank you!");

	}

}
