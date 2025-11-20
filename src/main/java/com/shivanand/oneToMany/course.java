package com.shivanand.oneToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
@Column
	private String courseName;
@Column
	private int studentId;
	
	public course() {
		// Default Constructor 
	}

	public course(int id, String courseName, int studentId) {
		this.id = id;
		this.courseName = courseName;
		this.studentId = studentId;
	}

	public course(String courseName, int studentId) {
		this.courseName = courseName;
		this.studentId = studentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "course [id=" + id + ", courseName=" + courseName + ", studentId=" + studentId + "]";
	}
	
	
	
}
