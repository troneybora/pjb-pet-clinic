package troney.springframework.pjbpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import troney.springframework.pjbpetclinic.model.*;
import troney.springframework.pjbpetclinic.services.*;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0){
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Troney");
        owner1.setLastName("Bora");
        owner1.setAddress("Thane");
        owner1.setCity("Mumbai");
        owner1.setTelephone("914367895");

        Pet troneyPet = new Pet();
        troneyPet.setPetType(savedCatPetType);
        troneyPet.setOwner(owner1);
        troneyPet.setBirthDate(LocalDate.now());
        troneyPet.setName("Just Cat");
        owner1.getPets().add(troneyPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Prayash");
        owner2.setLastName("Bora");
        owner2.setAddress("Thane");
        owner2.setCity("Mumbai");
        owner2.setTelephone("914367895");


        Pet prayashPet = new Pet();
        prayashPet.setPetType(savedDogPetType);
        prayashPet.setOwner(owner2);
        prayashPet.setBirthDate(LocalDate.now());
        prayashPet.setName("Rosco");
        owner2.getPets().add(prayashPet);


        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(troneyPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");
        visitService.save(catVisit);

        System.out.println("Loaded Owners.......");


        Vet vet1 = new Vet();
        vet1.setFirstName("Sane");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Snowy");
        vet2.setLastName("Axe");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vet.......");
    }
}
