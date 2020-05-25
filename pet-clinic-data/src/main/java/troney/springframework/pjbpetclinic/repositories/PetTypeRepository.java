package troney.springframework.pjbpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import troney.springframework.pjbpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {

}
