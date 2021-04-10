package com.aurorabeauty.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Staff_TBL")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_staff")
	private int id;
	private String name;
	private String address;
	private String username;
	private String password;
	private String phone;
	private String email;
	private boolean gender;
	private String birthday;
	private float salary;
	@ManyToOne(optional=false)
    @JoinColumn(name = "salarytype_id",referencedColumnName="id_salarytype")
    private SalaryType salaryType;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public SalaryType getSalaryType() {
		return salaryType;
	}
	public void setSalaryType(SalaryType salaryType) {
		this.salaryType = salaryType;
	}
	
	
	
}
