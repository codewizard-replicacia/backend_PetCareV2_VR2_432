package vr.apps.petcarev2.function;

import vr.apps.petcarev2.model.Pet;
import vr.apps.petcarev2.model.PetCareCenter;
import vr.apps.petcarev2.model.PetOwner;
import vr.apps.petcarev2.model.Document;
import vr.apps.petcarev2.model.BusinessHours;
import vr.apps.petcarev2.model.PetService;
import vr.apps.petcarev2.enums.PetServiceType;
import vr.apps.petcarev2.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import vr.apps.petcarev2.repository.PetServiceRepository;
import vr.apps.petcarev2.repository.PetOwnerRepository;
import vr.apps.petcarev2.repository.PetCareCenterRepository;
import vr.apps.petcarev2.repository.BusinessHoursRepository;
import vr.apps.petcarev2.repository.DocumentRepository;
import vr.apps.petcarev2.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
