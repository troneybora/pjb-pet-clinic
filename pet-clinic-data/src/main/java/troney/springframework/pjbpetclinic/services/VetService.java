package troney.springframework.pjbpetclinic.services;

import troney.springframework.pjbpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
