package troney.springframework.pjbpetclinic.services;

import troney.springframework.pjbpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
