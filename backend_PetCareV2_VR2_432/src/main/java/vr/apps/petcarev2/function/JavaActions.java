package vr.apps.petcarev2.function;

import vr.apps.petcarev2.model.Pet;
import vr.apps.petcarev2.model.PetCareCenter;
import vr.apps.petcarev2.model.PetOwner;
import vr.apps.petcarev2.model.Document;
import vr.apps.petcarev2.model.BusinessHours;
import vr.apps.petcarev2.model.PetService;




import vr.apps.petcarev2.enums.PetServiceType;
import vr.apps.petcarev2.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  