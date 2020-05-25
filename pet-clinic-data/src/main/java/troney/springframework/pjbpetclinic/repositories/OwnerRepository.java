package troney.springframework.pjbpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import troney.springframework.pjbpetclinic.model.Owner;


public interface OwnerRepository extends CrudRepository<Owner, Long> {


}
