package org.chiksoft.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "country_name")
	private String countryName;
	
	@Column(name = "pincode_format")
	private String pincodeFormat;
	
	@Column(name = "phone_number_format")
	private String phoneNumberFormat;
	
	@Column(name = "phone_number_prefix")
	private String phoneNumberPrefix;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getPincodeFormat() {
		return pincodeFormat;
	}

	public void setPincodeFormat(String pincodeFormat) {
		this.pincodeFormat = pincodeFormat;
	}

	public String getPhoneNumberFormat() {
		return phoneNumberFormat;
	}

	public void setPhoneNumberFormat(String phoneNumberFormat) {
		this.phoneNumberFormat = phoneNumberFormat;
	}

	public String getPhoneNumberPrefix() {
		return phoneNumberPrefix;
	}

	public void setPhoneNumberPrefix(String phoneNumberPrefix) {
		this.phoneNumberPrefix = phoneNumberPrefix;
	}

	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", countryName=" + countryName + ", pincodeFormat="
				+ pincodeFormat + ", phoneNumberFormat=" + phoneNumberFormat + ", phoneNumberPrefix="
				+ phoneNumberPrefix + "]";
	}

}
