package troney.springframework.pjbpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import troney.springframework.pjbpetclinic.model.Owner;
import troney.springframework.pjbpetclinic.model.Pet;
import troney.springframework.pjbpetclinic.model.PetType;
import troney.springframework.pjbpetclinic.model.Vet;
import troney.springframework.pjbpetclinic.services.OwnerService;
import troney.springframework.pjbpetclinic.services.PetTypeService;
import troney.springframework.pjbpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

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

        System.out.println("Loaded Owners.......");


        Vet vet1 = new Vet();
        vet1.setFirstName("Same");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Same");
        vet2.setLastName("Axe");

        vetService.save(vet2);

        System.out.println("Loaded Vet.......");


    }
}
