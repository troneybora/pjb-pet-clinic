package troney.springframework.pjbpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import troney.springframework.pjbpetclinic.model.Speciality;
import troney.springframework.pjbpetclinic.repositories.SpecialityRepository;
import troney.springframework.pjbpetclinic.services.SpecialityService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {


    private final SpecialityRepository specialityRepository;

    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {

        Set<Speciality> specialitySet = new HashSet<>();

        specialityRepository.findAll().forEach(specialitySet::add);
        return specialitySet;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
