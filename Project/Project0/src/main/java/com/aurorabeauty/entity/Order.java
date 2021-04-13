package com.aurorabeauty.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_tbl")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_order")
	private int id;
	private String date;
	@ManyToOne(optional=false)
	@JoinColumn(name="customer_id",referencedColumnName = "id_customer")
	private Customer customer;
	@ManyToOne(optional=false)
	@JoinColumn(name="staff_id",referencedColumnName = "id_staff")
	private Staff staff;
	@ManyToOne(optional=false)
	@JoinColumn(name="status_id",referencedColumnName = "id_status")
	private Status status;
	@ManyToOne(optional = false)
	@JoinColumn(name="payment_id",referencedColumnName="id_payment")
	private PaymentMethod paymentMethod;
	@ManyToOne(optional=false)
	@JoinColumn(name="delivery_id",referencedColumnName = "id_delivery")
	private DeliveryStatus deliveryStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
}
