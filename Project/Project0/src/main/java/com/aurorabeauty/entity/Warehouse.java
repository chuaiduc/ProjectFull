package com.aurorabeauty.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Warehouse_TBL")
public class Warehouse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_warehouse")
	private int id;
	private String date;
	private String status;
	private String description;
	@ManyToOne(optional=false)
    @JoinColumn(name = "partner_id",referencedColumnName="id_partner")
    private Partner partner;
	@ManyToOne(optional=false)
    @JoinColumn(name = "staff_id",referencedColumnName="id_staff")
    private Staff staff;
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Partner getPartner() {
		return partner;
	}
	public void setPartner(Partner partner) {
		this.partner = partner;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	
	
}
