package vr.apps.petcarev2.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import vr.apps.petcarev2.model.Pet;
import vr.apps.petcarev2.model.PetCareCenter;
import vr.apps.petcarev2.model.PetOwner;
import vr.apps.petcarev2.model.Document;
import vr.apps.petcarev2.model.BusinessHours;
import vr.apps.petcarev2.model.PetService;
import vr.apps.petcarev2.enums.PetServiceType;
import vr.apps.petcarev2.converter.PetServiceTypeConverter;
import vr.apps.petcarev2.converter.DurationConverter;
import vr.apps.petcarev2.converter.UUIDToByteConverter;
import vr.apps.petcarev2.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "PetCareCenter")
@Table(name = "\"PetCareCenter\"", schema =  "\"petcarevr\"")
@Data
                        
public class PetCareCenter {
	public PetCareCenter () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"BcId\"", nullable = true )
  private Integer bcId;
	  
  @Column(name = "\"Address\"", nullable = true )
  private String address;
  
	  
  @Column(name = "\"Name\"", nullable = true )
  private String name;
  
	  
  @Column(name = "\"Description\"", nullable = true )
  private String description;
  
	  
  @Column(name = "\"BranchName\"", nullable = true )
  private String branchName;
  
	  
  @Column(name = "\"Latitude\"", nullable = true )
  private Float latitude;
  
	  
  @Column(name = "\"Longitude\"", nullable = true )
  private Float longitude;
  
	  
  @Column(name = "\"Pincode\"", nullable = true )
  private Integer pincode;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"PetCareCenterLogo\"", referencedColumnName = "\"DocId\"", insertable = false, updatable = false)
	private Document logo;
	
	@Column(name = "\"PetCareCenterLogo\"")
	private Integer petCareCenterLogo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"PetCareCenterBusinessHours\"", referencedColumnName = "\"Id\"", insertable = false, updatable = false)
	private BusinessHours businessHours;
	
	@Column(name = "\"PetCareCenterBusinessHours\"")
	private Integer petCareCenterBusinessHours;
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PetCareCenterImages\"",
            joinColumns = @JoinColumn( name="\"BcId\""),
            inverseJoinColumns = @JoinColumn( name="\"DocId\""), schema = "\"petcarevr\"")
private List<Document> images = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PetCareCenterServices\"",
            joinColumns = @JoinColumn( name="\"BcId\""),
            inverseJoinColumns = @JoinColumn( name="\"ServiceId\""), schema = "\"petcarevr\"")
private List<PetService> services = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PetCareCenterPets\"",
            joinColumns = @JoinColumn( name="\"BcId\""),
            inverseJoinColumns = @JoinColumn( name="\"PetId\""), schema = "\"petcarevr\"")
private List<Pet> pets = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "PetCareCenter [" 
  + "BcId= " + bcId  + ", " 
  + "Address= " + address  + ", " 
  + "Name= " + name  + ", " 
  + "Description= " + description  + ", " 
  + "BranchName= " + branchName  + ", " 
  + "Latitude= " + latitude  + ", " 
  + "Longitude= " + longitude  + ", " 
  + "Pincode= " + pincode 
 + "]";
	}
	
}