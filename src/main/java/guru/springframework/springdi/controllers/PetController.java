package guru.springframework.springdi.controllers;

import org.springframework.stereotype.Controller;

import com.springframework.pets.PetService;

/**
 * created by Acarer on 17.04.2023
 */

@Controller
public class PetController {

	private final PetService petService;

	public PetController(PetService petService) {
	
		this.petService = petService;
	}
	
	public String whichPetIsTheBest() {
		return petService.getpetType();
	}
}
