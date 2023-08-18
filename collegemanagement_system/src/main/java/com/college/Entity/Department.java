package com.college.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Department {
	@Id
	@GeneratedValue(generator="dept_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="dept_id",initialValue = 1,allocationSize = 1)
	private int dept_id ;
	@Column(name="Department_Name",length = 10)
	private String dept_name;
	@Column(name="Department_Strength", length = 5)
	private int dept_Strength;
	
	
	public Department(String dept_name, int dept_Strength) {
		super();
		this.dept_name = dept_name;
		this.dept_Strength = dept_Strength;
	}


	public Department() {
		super();
	}


	public int getDept_id() {
		return dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}


	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}


	public int getDept_Strength() {
		return dept_Strength;
	}


	public void setDept_Strength(int dept_Strength) {
		this.dept_Strength = dept_Strength;
	}

}
