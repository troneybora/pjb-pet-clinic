package troney.springframework.pjbpetclinic.services.map;

import org.springframework.stereotype.Service;
import troney.springframework.pjbpetclinic.model.Speciality;
import troney.springframework.pjbpetclinic.services.SpecialityService;

import java.util.Set;
@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality,Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
    super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }
}
