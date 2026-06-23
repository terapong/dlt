package dlt.entity;

import java.time.Instant;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id")
	private Long id;
	
	@Column(name = "id_card_number")
	private Long idCardNumber;
	
	@Column(name = "owner_name")
	private String ownerName;
	
	@Column(name = "possessor_name")
	private String possessorName;
	
	@Column(name = "document_type")
	private String documentType;
	
	private String brand;
	
	private String model;
	
	@Column(name = "power_cc")
	private String powerCC;
	
	@Column(name = "vehicle_type")
	private String vehicleType;
	
	@Column(name = "license_plate")
	private String licensePlate;
	
	private String province;
	
	@Column(name = "chassis_number")
	private String chassisNumber;
	
	@Column(name = "passenger_capacity")
	private String passengerCapacity;
	
	@Column(name = "tax_expiry_date")
	private Instant taxExpiryDate;
	
	@Column(name = "vehicle_status")
	private String vehicleStatus;
	
	@Column(name = "public_license_plate")
	private String publicLicensePlate;
	
	@Column(name = "public_tax_expiry_date")
	private Instant publicTaxExpiryDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(Long idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPossessorName() {
		return possessorName;
	}

	public void setPossessorName(String possessorName) {
		this.possessorName = possessorName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPowerCC() {
		return powerCC;
	}

	public void setPowerCC(String powerCC) {
		this.powerCC = powerCC;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(String passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public Instant getTaxExpiryDate() {
		return taxExpiryDate;
	}

	public void setTaxExpiryDate(Instant taxExpiryDate) {
		this.taxExpiryDate = taxExpiryDate;
	}

	public String getVehicleStatus() {
		return vehicleStatus;
	}

	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}

	public String getPublicLicensePlate() {
		return publicLicensePlate;
	}

	public void setPublicLicensePlate(String publicLicensePlate) {
		this.publicLicensePlate = publicLicensePlate;
	}

	public Instant getPublicTaxExpiryDate() {
		return publicTaxExpiryDate;
	}

	public void setPublicTaxExpiryDate(Instant publicTaxExpiryDate) {
		this.publicTaxExpiryDate = publicTaxExpiryDate;
	}
	
}
