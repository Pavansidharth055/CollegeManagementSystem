package com.college.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Exam {
	@Id
	@GeneratedValue(generator="stu_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="stu_id",initialValue = 100,allocationSize = 1)
	int reg_no;            // one to one mapping must be done here
	@Column(name="Student_Name",length = 30)
	String name;
	@Column(name="Student_CGPA",length = 5)
	float cgpa;
	@Column(name="Student_Performance",length = 20)
	String performance;
	
	
	
	public Exam() {
		super();
	}
	public Exam(String name, float cgpa, String performance) {
		super();
		this.name = name;
		this.cgpa = cgpa;
		this.performance = performance;
	}
	public int getReg_no() {
		return reg_no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getCgpa() {
		return cgpa;
	}
	
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	public String getPerformance() {
		return performance;
	}
	
	public void setPerformance(String performance) {
		this.performance = performance;
	}

}
