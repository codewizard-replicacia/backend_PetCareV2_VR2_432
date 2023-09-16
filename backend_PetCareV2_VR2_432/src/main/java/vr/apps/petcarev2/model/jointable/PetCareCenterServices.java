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

@Entity(name = "PetCareCenterServices")
@Table(schema = "\"petcarevr\"", name = "\"PetCareCenterServices\"")
@Data
public class PetCareCenterServices{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"BcId\"")
	private Integer bcId;

    
    @Column(name = "\"ServiceId\"")
    private Integer serviceId;
 
}