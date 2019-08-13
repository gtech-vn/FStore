package org.fstore.Entity;
// Generated Aug 10, 2019, 10:55:06 PM by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * BussinessPayment generated by hbm2java
 */
public class BussinessPayment implements java.io.Serializable {

	private Short paymentId;
	private BussinessRental bussinessRental;
	private BussinessStaff bussinessStaff;
	private Customer customer;
	private BigDecimal amount;
	private Date paymentDate;
	private Date lastUpdate;

	public BussinessPayment() {
	}

	public BussinessPayment(BussinessStaff bussinessStaff, Customer customer, BigDecimal amount, Date paymentDate) {
		this.bussinessStaff = bussinessStaff;
		this.customer = customer;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public BussinessPayment(BussinessRental bussinessRental, BussinessStaff bussinessStaff, Customer customer,
			BigDecimal amount, Date paymentDate, Date lastUpdate) {
		this.bussinessRental = bussinessRental;
		this.bussinessStaff = bussinessStaff;
		this.customer = customer;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.lastUpdate = lastUpdate;
	}

	public Short getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Short paymentId) {
		this.paymentId = paymentId;
	}

	public BussinessRental getBussinessRental() {
		return this.bussinessRental;
	}

	public void setBussinessRental(BussinessRental bussinessRental) {
		this.bussinessRental = bussinessRental;
	}

	public BussinessStaff getBussinessStaff() {
		return this.bussinessStaff;
	}

	public void setBussinessStaff(BussinessStaff bussinessStaff) {
		this.bussinessStaff = bussinessStaff;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
