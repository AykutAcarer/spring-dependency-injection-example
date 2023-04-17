package com.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * created by Acarer on 17.04.2023
 */

@Service
@Profile({"dog", "default"})
public class DogPetService implements PetService {

	@Override
	public String getpetType() {
		// TODO Auto-generated method stub
		return "Dogs are the Best";
	}

}
