package com.shivanand.OneToManyCourse;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "kodstudent")
public class kodStudent {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	String email;
	@Column
	int phone;
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	List<Course>course;
	
	public kodStudent() {
		// Default Constructor....
	}

	public kodStudent(int id, String name, String email, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public kodStudent(String name, String email, int phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	//Setters and getters

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "kodStudent [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
