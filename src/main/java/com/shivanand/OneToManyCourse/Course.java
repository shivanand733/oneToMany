package com.shivanand.OneToManyCourse;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Course { 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "courseName")
	String name;
	
	@ManyToOne
	@JoinColumn(name = "studentId" , referencedColumnName = "id")
	kodStudent student;
	//Default Constructor....
	public Course() {}

	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	//setters and getters 
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

	
	public kodStudent getStudent() {
		return student;
	}

	public void setStudent(kodStudent student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
