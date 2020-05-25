package troney.springframework.pjbpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import troney.springframework.pjbpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
