package troney.springframework.pjbpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import troney.springframework.pjbpetclinic.model.Owner;
import troney.springframework.pjbpetclinic.model.Vet;
import troney.springframework.pjbpetclinic.services.OwnerService;
import troney.springframework.pjbpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Troney");
        owner1.setLastName("Bora");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Prayash");
        owner2.setLastName("Bora");

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
