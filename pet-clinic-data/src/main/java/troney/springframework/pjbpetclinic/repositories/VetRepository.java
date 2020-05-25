package troney.springframework.pjbpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import troney.springframework.pjbpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
