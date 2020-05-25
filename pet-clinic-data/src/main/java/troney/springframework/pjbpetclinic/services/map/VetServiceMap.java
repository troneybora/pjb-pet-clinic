package troney.springframework.pjbpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import troney.springframework.pjbpetclinic.model.Speciality;
import troney.springframework.pjbpetclinic.model.Vet;
import troney.springframework.pjbpetclinic.services.CrudService;
import troney.springframework.pjbpetclinic.services.SpecialityService;
import troney.springframework.pjbpetclinic.services.VetService;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {


    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
    super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() >0 ){
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId()== null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
