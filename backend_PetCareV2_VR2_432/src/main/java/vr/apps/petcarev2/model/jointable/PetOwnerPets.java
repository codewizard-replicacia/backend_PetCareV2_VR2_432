package vr.apps.petcarev2.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import vr.apps.petcarev2.model.Pet;
import vr.apps.petcarev2.model.PetCareCenter;
import vr.apps.petcarev2.model.PetOwner;
import vr.apps.petcarev2.model.Document;
import vr.apps.petcarev2.model.BusinessHours;
import vr.apps.petcarev2.model.PetService;
import vr.apps.petcarev2.enums.PetServiceType;
import vr.apps.petcarev2.converter.PetServiceTypeConverter;

@Entity(name = "PetOwnerPets")
@Table(schema = "\"petcarevr\"", name = "\"PetOwnerPets\"")
@Data
public class PetOwnerPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OwnerId\"")
	private Integer ownerId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}