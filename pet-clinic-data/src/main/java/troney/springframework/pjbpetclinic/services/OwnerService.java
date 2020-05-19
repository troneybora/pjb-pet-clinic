package troney.springframework.pjbpetclinic.services;

import troney.springframework.pjbpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);


}
