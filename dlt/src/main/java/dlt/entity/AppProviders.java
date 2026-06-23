package dlt.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "app_providers")
public class AppProviders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "provider_id")
	private Long id;
	
	@Column(name = "app_name")
	private String appName;
	
	@Column(name = "short_name")
	private String shortName;
	
	@Column(name = "company_address")
	private String companyAddress;
	
	@Column(name = "coordinator_name")
	private String coordinatorName;
	
	@Column(name = "coordinator_phone")
	private String coordinatorPhone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCoordinatorName() {
		return coordinatorName;
	}

	public void setCoordinatorName(String coordinatorName) {
		this.coordinatorName = coordinatorName;
	}

	public String getCoordinatorPhone() {
		return coordinatorPhone;
	}

	public void setCoordinatorPhone(String coordinatorPhone) {
		this.coordinatorPhone = coordinatorPhone;
	}
	
	
}
