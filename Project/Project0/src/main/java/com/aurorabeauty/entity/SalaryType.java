package com.aurorabeauty.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SalaryType_TBL")
public class SalaryType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_salaryType")
	private int id;
	private String name;
	private String present;
	@OneToMany(mappedBy="salaryType",targetEntity=Staff.class, fetch=FetchType.EAGER)
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPresent() {
		return present;
	}
	public void setPresent(String present) {
		this.present = present;
	}
	
	
}
