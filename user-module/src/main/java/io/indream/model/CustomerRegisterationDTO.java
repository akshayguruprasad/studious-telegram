package io.indream.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class CustomerRegisterationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String name;
	private String email;
	private Date birthDate;
	private boolean isPrimeCustomer;
	private double walletBalance;
	private String password;
	private String confimPassword;

	public CustomerRegisterationDTO() {
		super();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isPrimeCustomer() {
		return isPrimeCustomer;
	}

	public void setPrimeCustomer(boolean isPrimeCustomer) {
		this.isPrimeCustomer = isPrimeCustomer;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfimPassword() {
		return confimPassword;
	}

	public void setConfimPassword(String confimPassword) {
		this.confimPassword = confimPassword;
	}

	@Override
	public String toString() {
		return "UserRegsiterationDTO [name=" + name + ", email=" + email + ", birthDate=" + birthDate
				+ ", isPrimeCustomer=" + isPrimeCustomer + ", walletBalance=" + walletBalance + ", password=" + password
				+ ", confimPassword=" + confimPassword + "]";
	}

}
