package springframework.petClinic.services;

import java.util.Set;

import springframework.petClinic.model.Pet;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();

}
