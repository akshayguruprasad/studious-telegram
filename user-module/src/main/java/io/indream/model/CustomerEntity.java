package io.indream.model;

import java.io.Serializable;
import java.sql.Date;

public class CustomerEntity implements Serializable {

	/**
	 * 
	 */
	private String name;
	private String email;
	private Date birthDate;
	private boolean isPrimeCustomer;
	private double walletBalance;
	private String password;
	private static final long serialVersionUID = 1L;

	public CustomerEntity() {
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

	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", isPrimeCustomer="
				+ isPrimeCustomer + ", walletBalance=" + walletBalance + ", password=" + password + "]";
	}

}
