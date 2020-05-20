package troney.springframework.pjbpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import troney.springframework.pjbpetclinic.model.Owner;
import troney.springframework.pjbpetclinic.model.Vet;
import troney.springframework.pjbpetclinic.services.OwnerService;
import troney.springframework.pjbpetclinic.services.VetService;
import troney.springframework.pjbpetclinic.services.map.OwnerServiceMap;
import troney.springframework.pjbpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Troney");
        owner1.setLastName("Bora");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Prayash");
        owner2.setLastName("Bora");

        ownerService.save(owner2);

        System.out.println("Loaded Owners.......");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Same");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Lala");
        vet2.setLastName("Lali");

        vetService.save(vet2);

        System.out.println("Loaded Vet.......");

    }
}
