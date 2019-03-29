package com.test.mvc.pojo;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.test.mvc.controller.IsValidCountry;

public class Student {
	//@Size(min=2, max=15, message="Enter value between {min} and {max}")
	@Size(min=2, max=15)
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	@IsValidCountry
	private String country;
	@Max(2222)
	private Long mobile;
	@Past
	private Date dob;
	private List<String> skills;
	private Address address;

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
