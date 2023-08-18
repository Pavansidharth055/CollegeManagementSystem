package com.college.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Teacher {
	@Id
	@GeneratedValue(generator ="staff_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="staff_id",initialValue = 1000,allocationSize = 1)
	private int id;
	@Column(name="Teacher_Name",length = 30)
	private String name;
	@Column(name="Department", length = 10)
	private String dept;
	@Column(name="Contact_Number",length = 14)
	private String ph_no;
	@Column(name="Teaching_Subject",length = 16)
	private String subjects;
	

	public Teacher() {
		super();
	}

	public Teacher(String name, String dept, String ph_no, String subjects) {
		super();
		this.name = name;
		this.dept = dept;
		this.ph_no = ph_no;
		this.subjects = subjects;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	public void setPh_no(String ph_no)
	{
		this.ph_no = ph_no;
	}
	
	public void setSubjects(String subjects)
	{
		this.subjects = subjects;
	}
	
	
	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public String getPh_no()
	{
		return ph_no;
	}
	
	public String getSubjects()
	{
		return subjects;
	}


	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", dept=" + dept + ", ph_no=" + ph_no + ", subjects=" + subjects
				+ "]";
	}

}
