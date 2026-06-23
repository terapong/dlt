package dlt.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "persons")
public class Persons {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private Long id;
	
	@Column(name = "id_card_number")	
	private Long idCardNumber;
	
	@Column(name = "prefix")
	private String prefix;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "address_id_card")
	private String addressIdCard;
	
	@Column(name = "address_current")
	private String addressCurrent;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	private String email;

	private String gender;
	
	@Column(name = "line_id")
	private String lineId;
	
	@Column(name = "addr_house_no")
	private String addrHouseNo;
	
	@Column(name = "addr_moo")
	private String addrMoo;
	
	@Column(name = "addr_road")
	private String addrRoad;
	
	@Column(name = "addr_soi")
	private String addrSoi;
	
	@Column(name = "addr_subdistrict")
	private String addrSubdistrict;
	
	@Column(name = "addr_district")
	private String addrDistrict;
	
	@Column(name = "addr_province")
	private String addrProvince;
	
	@Column(name = "win_affiliation")
	private String winAffiliation;
	
	@Column(name = "jacket_number")
	private String jacketNumber;

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

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressIdCard() {
		return addressIdCard;
	}

	public void setAddressIdCard(String addressIdCard) {
		this.addressIdCard = addressIdCard;
	}

	public String getAddressCurrent() {
		return addressCurrent;
	}

	public void setAddressCurrent(String addressCurrent) {
		this.addressCurrent = addressCurrent;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getAddrHouseNo() {
		return addrHouseNo;
	}

	public void setAddrHouseNo(String addrHouseNo) {
		this.addrHouseNo = addrHouseNo;
	}

	public String getAddrMoo() {
		return addrMoo;
	}

	public void setAddrMoo(String addrMoo) {
		this.addrMoo = addrMoo;
	}

	public String getAddrRoad() {
		return addrRoad;
	}

	public void setAddrRoad(String addrRoad) {
		this.addrRoad = addrRoad;
	}

	public String getAddrSoi() {
		return addrSoi;
	}

	public void setAddrSoi(String addrSoi) {
		this.addrSoi = addrSoi;
	}

	public String getAddrSubdistrict() {
		return addrSubdistrict;
	}

	public void setAddrSubdistrict(String addrSubdistrict) {
		this.addrSubdistrict = addrSubdistrict;
	}

	public String getAddrDistrict() {
		return addrDistrict;
	}

	public void setAddrDistrict(String addrDistrict) {
		this.addrDistrict = addrDistrict;
	}

	public String getAddrProvince() {
		return addrProvince;
	}

	public void setAddrProvince(String addrProvince) {
		this.addrProvince = addrProvince;
	}

	public String getWinAffiliation() {
		return winAffiliation;
	}

	public void setWinAffiliation(String winAffiliation) {
		this.winAffiliation = winAffiliation;
	}

	public String getJacketNumber() {
		return jacketNumber;
	}

	public void setJacketNumber(String jacketNumber) {
		this.jacketNumber = jacketNumber;
	}
	
}
