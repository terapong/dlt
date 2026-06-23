package dlt.entity;

import java.time.Instant;

import jakarta.persistence.*;

@Entity
@Table(name = "driver_applications")
public class DriverApplications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "driver_app_id")
	private Long id;
	
	@Column(name = "id_card_number")
	private Long idCardNumber;
	
	@Column(name = "cert_number")
	private String certNumber;
	
	@Column(name = "provider_id")
	private Long providerId;
	
	@Column(name = "service_district")
	private String serviceDistrict;
	
	@Column(name = "registration_date")
	private Instant registrationDate;
	
	@Column(name = "expire_date")
	private Instant expireDate;
	
	private StatusType status;
	
	@Column(name = "cert_year")
	private String certYear;

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

	public String getCertNumber() {
		return certNumber;
	}

	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
	}

	public Long getProviderId() {
		return providerId;
	}

	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}

	public String getServiceDistrict() {
		return serviceDistrict;
	}

	public void setServiceDistrict(String serviceDistrict) {
		this.serviceDistrict = serviceDistrict;
	}

	public Instant getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Instant registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Instant getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Instant expireDate) {
		this.expireDate = expireDate;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public String getCertYear() {
		return certYear;
	}

	public void setCertYear(String certYear) {
		this.certYear = certYear;
	}

}
