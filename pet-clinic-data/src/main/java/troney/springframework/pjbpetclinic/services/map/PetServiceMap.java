package troney.springframework.pjbpetclinic.services.map;

import troney.springframework.pjbpetclinic.model.Pet;
import troney.springframework.pjbpetclinic.services.CrudService;
import troney.springframework.pjbpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
    super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
