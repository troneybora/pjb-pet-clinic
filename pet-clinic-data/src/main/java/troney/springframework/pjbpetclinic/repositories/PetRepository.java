package troney.springframework.pjbpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import troney.springframework.pjbpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
