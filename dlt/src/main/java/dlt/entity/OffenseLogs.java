package dlt.entity;

import java.time.Instant;

import jakarta.persistence.*;

@Entity
@Table(name = "offense_logs")
public class OffenseLogs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "offense_log_id")
	private Long id;
	
	@Column(name = "id_card_number")	
	private Long idCardNumber;
	
	@Column(name = "article_id")
	private Long articleId;
	
	@Column(name = "provider_id")
	private Long providerId;
	
	@Column(name = "fine_amount")
	private double fineAmount;
	
	@Column(name = "payment_status")
	private StatusType paymentStatus;
	
	@Column(name = "offense_date")
	private Instant offenseDate;

	@Column(name = "loc_checkpoint")
	private String locCheckpoint;
	
	@Column(name = "loc_subdistrict")
	private String locSubdistrict;
	
	@Column(name = "loc_district")
	private String locDistrict;
	
	@Column(name = "loc_province")
	private String locProvince;

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

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public Long getProviderId() {
		return providerId;
	}

	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}

	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}

	public StatusType getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(StatusType paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Instant getOffenseDate() {
		return offenseDate;
	}

	public void setOffenseDate(Instant offenseDate) {
		this.offenseDate = offenseDate;
	}

	public String getLocCheckpoint() {
		return locCheckpoint;
	}

	public void setLocCheckpoint(String locCheckpoint) {
		this.locCheckpoint = locCheckpoint;
	}

	public String getLocSubdistrict() {
		return locSubdistrict;
	}

	public void setLocSubdistrict(String locSubdistrict) {
		this.locSubdistrict = locSubdistrict;
	}

	public String getLocDistrict() {
		return locDistrict;
	}

	public void setLocDistrict(String locDistrict) {
		this.locDistrict = locDistrict;
	}

	public String getLocProvince() {
		return locProvince;
	}

	public void setLocProvince(String locProvince) {
		this.locProvince = locProvince;
	}
	
}
