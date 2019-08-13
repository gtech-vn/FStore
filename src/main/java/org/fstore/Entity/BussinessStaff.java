package org.fstore.Entity;
// Generated Aug 10, 2019, 10:55:06 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BussinessStaff generated by hbm2java
 */
public class BussinessStaff implements java.io.Serializable {

	private Byte staffId;
	private BusinessStore businessStore;
	private CustomerAddress customerAddress;
	private String firstName;
	private String lastName;
	private byte[] picture;
	private String email;
	private boolean active;
	private String username;
	private String password;
	private Date lastUpdate;
	private Set bussinessPayments = new HashSet(0);
	private Set businessStores = new HashSet(0);
	private Set bussinessRentals = new HashSet(0);

	public BussinessStaff() {
	}

	public BussinessStaff(BusinessStore businessStore, CustomerAddress customerAddress, String firstName,
			String lastName, boolean active, String username, Date lastUpdate) {
		this.businessStore = businessStore;
		this.customerAddress = customerAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
		this.username = username;
		this.lastUpdate = lastUpdate;
	}

	public BussinessStaff(BusinessStore businessStore, CustomerAddress customerAddress, String firstName,
			String lastName, byte[] picture, String email, boolean active, String username, String password,
			Date lastUpdate, Set bussinessPayments, Set businessStores, Set bussinessRentals) {
		this.businessStore = businessStore;
		this.customerAddress = customerAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.picture = picture;
		this.email = email;
		this.active = active;
		this.username = username;
		this.password = password;
		this.lastUpdate = lastUpdate;
		this.bussinessPayments = bussinessPayments;
		this.businessStores = businessStores;
		this.bussinessRentals = bussinessRentals;
	}

	public Byte getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Byte staffId) {
		this.staffId = staffId;
	}

	public BusinessStore getBusinessStore() {
		return this.businessStore;
	}

	public void setBusinessStore(BusinessStore businessStore) {
		this.businessStore = businessStore;
	}

	public CustomerAddress getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Set getBussinessPayments() {
		return this.bussinessPayments;
	}

	public void setBussinessPayments(Set bussinessPayments) {
		this.bussinessPayments = bussinessPayments;
	}

	public Set getBusinessStores() {
		return this.businessStores;
	}

	public void setBusinessStores(Set businessStores) {
		this.businessStores = businessStores;
	}

	public Set getBussinessRentals() {
		return this.bussinessRentals;
	}

	public void setBussinessRentals(Set bussinessRentals) {
		this.bussinessRentals = bussinessRentals;
	}

}
