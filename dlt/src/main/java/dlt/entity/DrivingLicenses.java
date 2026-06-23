package dlt.entity;

import java.time.Instant;

import jakarta.persistence.*;

@Entity
@Table(name = "driving_licenses")
public class DrivingLicenses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "license_id")
	private Long id;
	
	@Column(name = "id_card_number")
	private Long idCardNumber;
	
	@Column(name = "license_number")
	private String licenseNumber;
	
	@Column(name = "expiry_date")
	private Instant expiryDate;
	
	@Column(name = "issued_by")
	private String issuedBy;
	
	@Column(name = "photo_path")
	private String photoPath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Instant getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Instant expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public Long getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(Long idCardNumber) {
		this.idCardNumber = idCardNumber;
	}
	
}
