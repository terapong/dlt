package dlt.entity;

import java.time.Instant;

import jakarta.persistence.*;

@Entity
@Table(name = "certificates")
public class Certificates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "certificate_id")
	private Long id;
	
	@Column(name = "doc_number_7_digits")
	private String docNumber7Digits;
	
	@Column(name = "issue_date")
	private Instant issueDate;
	
	@Column(name = "provider_ids")
	private Long providerIds;
	
	@Column(name = "cert_number")
	private String certNumber;
	
	@Column(name = "registration_date")
	private Instant registrationDate;
	
	@Column(name = "electronic_cert_number")
	private String electronicCertNumber;
	
	@Column(name = "vehicle_id")
	private Long vehicleId;
	
	@Column(name = "id_card_number")
	private Long idCardNumber;
	
	@Column(name = "license_plate")
	private String licensePlate;
	
	@Column(name = "province")
	private String province;
	
	@Column(name = "service_district")
	private String serviceDistrict;
	
	@Column(name = "expire_date")
	private Instant expireDate;
	
	private StatusType status;
	
	@Column(name = "request_number")
	private String requestNumber;
	
	@Column(name = "request_date")
	private Instant requestDate;
	
	@Column(name = "receive_date")
	private Instant receiveDate;
	
	@Column(name = "request_type")
	private String requestType;
	
	@Column(name = "driver_photo_path")
	private String driverPhotoPath;
	
	@Column(name = "request_year")
	private String requestYear;

	@Column(name = "approval_batch_no")
	private String approvalbatchNo;
	
	@Column(name = "approval_batch_year")
	private String approvalBatchYear;
	
	@Column(name = "cert_year")
	private String certYear;
	
	@Column(name = "approval_date")
	private Instant approvalDate;
	
	@Column(name = "doc_receipt_status")
	private String docReceiptStatus;
	
	@Column(name = "doc_receipt_date")
	private Instant docReceiptDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocNumber7Digits() {
		return docNumber7Digits;
	}

	public void setDocNumber7Digits(String docNumber7Digits) {
		this.docNumber7Digits = docNumber7Digits;
	}

	public Instant getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Instant issueDate) {
		this.issueDate = issueDate;
	}

	public Long getProviderIds() {
		return providerIds;
	}

	public void setProviderIds(Long providerIds) {
		this.providerIds = providerIds;
	}

	public String getCertNumber() {
		return certNumber;
	}

	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
	}

	public Instant getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Instant registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getElectronicCertNumber() {
		return electronicCertNumber;
	}

	public void setElectronicCertNumber(String electronicCertNumber) {
		this.electronicCertNumber = electronicCertNumber;
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Long getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(Long idCardNumber) {
		this.idCardNumber = idCardNumber;
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

	public String getServiceDistrict() {
		return serviceDistrict;
	}

	public void setServiceDistrict(String serviceDistrict) {
		this.serviceDistrict = serviceDistrict;
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

	public String getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(String requestNumber) {
		this.requestNumber = requestNumber;
	}

	public Instant getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Instant requestDate) {
		this.requestDate = requestDate;
	}

	public Instant getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Instant receiveDate) {
		this.receiveDate = receiveDate;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getDriverPhotoPath() {
		return driverPhotoPath;
	}

	public void setDriverPhotoPath(String driverPhotoPath) {
		this.driverPhotoPath = driverPhotoPath;
	}

	public String getRequestYear() {
		return requestYear;
	}

	public void setRequestYear(String requestYear) {
		this.requestYear = requestYear;
	}

	public String getApprovalbatchNo() {
		return approvalbatchNo;
	}

	public void setApprovalbatchNo(String approvalbatchNo) {
		this.approvalbatchNo = approvalbatchNo;
	}

	public String getApprovalBatchYear() {
		return approvalBatchYear;
	}

	public void setApprovalBatchYear(String approvalBatchYear) {
		this.approvalBatchYear = approvalBatchYear;
	}

	public String getCertYear() {
		return certYear;
	}

	public void setCertYear(String certYear) {
		this.certYear = certYear;
	}

	public Instant getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Instant approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getDocReceiptStatus() {
		return docReceiptStatus;
	}

	public void setDocReceiptStatus(String docReceiptStatus) {
		this.docReceiptStatus = docReceiptStatus;
	}

	public Instant getDocReceiptDate() {
		return docReceiptDate;
	}

	public void setDocReceiptDate(Instant docReceiptDate) {
		this.docReceiptDate = docReceiptDate;
	}
	
}
