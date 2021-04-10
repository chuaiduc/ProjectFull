package com.aurorabeauty.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="SalaryType_TBL")
public class SalaryType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_salarytype")
	private int id;
	private String name;
	private String percent;
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
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}
	
	
	
	
	
}
