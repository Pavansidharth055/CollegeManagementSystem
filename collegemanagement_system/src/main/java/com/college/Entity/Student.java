package com.college.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq",initialValue = 100,allocationSize = 1)
public class Student {
	@Id
	@GeneratedValue(generator="seq",strategy = GenerationType.SEQUENCE)
	
	private int reg_no;
	@Column(name="Student_Name",length = 30)
	private String name;
	@Column(name="Department",length = 10) //one to one mapping has to be done here
	private String dept;
	@Column(name="Contact_Number",length = 14)
	private String ph_no;
	@Column(name="Date_of_Joining") 
	private LocalDate doj;
	
	
	public Student(String name,String dept,String ph_no,LocalDate doj)
	{
		this.name = name;
		this.dept = dept;
		this.ph_no = ph_no;
		this.doj = doj;
	}
	
	
	
	
	public Student() {
		super();
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
	
	public void setDOJ(LocalDate doj)
	{
		this.doj = doj;
	}
	
	
	public int getReg_no()
	{
		return reg_no;
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
	
	public LocalDate getDOJ()
	{
		return doj;
	}




	@Override
	public String toString() {
		return "Student_Details [reg_no=" + reg_no + ", name=" + name + ", dept=" + dept + ", ph_no=" + ph_no
				+ ", doj=" + doj + "]";
	}
}
