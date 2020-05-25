package troney.springframework.pjbpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import troney.springframework.pjbpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
