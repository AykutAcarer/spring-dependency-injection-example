package com.springframework.pets;


/**
 * created by Acarer on 19.04.2023
 */

public class PetServiceFactory {

	public PetService getPetService(String petType) {
		
		switch (petType) {
			case "dog":
				return new DogPetService();
			
			case "cat":
				return new CatPetService();
				
			default:
				return new DogPetService();
		}
	}
}
