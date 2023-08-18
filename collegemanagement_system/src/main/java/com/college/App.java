package com.college;
import java.time.LocalDate;

import com.college.DaoImpl.DepartmentDaoImpl;
import com.college.DaoImpl.ExamDaoImpl;
import com.college.DaoImpl.StudentDaoImpl;
import com.college.DaoImpl.TeacherDaoImpl;
import com.college.Entity.Department;
import com.college.Entity.Student;
import com.college.Entity.Teacher;



public class App 
{
    public static void main( String[] args )
    {
    	/*Student student = new Student();
    	Student student1 = new Student("Partha Sarathi","IT","9512025100",LocalDate.of(2002,6,16));
    	Student student2 = new Student("Nanda Kumar","IT","9456789321",LocalDate.of(2004,9,02));
    	Student student3 = new Student("Nargis Jagan","ECE","9023456789",LocalDate.of(2002,2,17));
    	Student student4 = new Student("Thirumoorthy","Mech","9123456798",LocalDate.of(2006,10,22));
    	Student student5 = new Student("Mohan Raj","Aero","9890123456",LocalDate.of(2007,1,13));
    	Student student6= new Student("Kokila","CSC","7612027390",LocalDate.of(2001,5,20));
    	Student student7 = new Student("Kavitha","EEE","6417025187",LocalDate.of(2003,7,14));
    	Student student8 = new Student("Sai Harsha","Mech","7354024231",LocalDate.of(2004,4,17));
    	Student student9 = new Student("Anjani Kumar","ECE","6730025975",LocalDate.of(2003,8,12));
    	StudentDaoImpl sdi = new StudentDaoImpl();
    	Student stud = sdi.createStudent(student1);
    	Student stud1 = sdi.createStudent(student2);
    	Student stud2 = sdi.createStudent(student3);
    	Student stud3 = sdi.createStudent(student4);
    	Student stud4 = sdi.createStudent(student5);
    	Student stud5 = sdi.createStudent(student6);
    	Student stud6 = sdi.createStudent(student7);
    	Student stud7 = sdi.createStudent(student8);
    	Student stud8 = sdi.createStudent(student9);
    	
    	//sdi.updateStudent(102, stud);
    	//System.out.println(sdi.readStudent(100));
    	//System.out.println(teach);
    	//System.out.println(sdi.readAll_Student());
    	TeacherDaoImpl tdi = new TeacherDaoImpl();
    	Teacher teacher1 = new Teacher("Mona lisa","IT","9812025134","Advance Java");
    	Teacher teacher2 = new Teacher("Radha Krishnan","CSC","6742125100","Core Java");
    	Teacher teacher3 = new Teacher("Esther","EEE","9517825153","Moral Values");
    	Teacher teacher4 = new Teacher("Arun Kumar","Mech","7358425110","Angular");
    	Teacher teacher5 = new Teacher("Kamatchi","CSC","9841425162","Sql");
    	Teacher teacher6 = new Teacher("Anbuvizhi","ECE","9420025122","E-commerce");
    	Teacher staff1 = tdi.createTeacher(teacher1	);
    	Teacher staff2 = tdi.createTeacher(teacher2);
    	Teacher staff3 = tdi.createTeacher(teacher3);
    	Teacher staff4 = tdi.createTeacher(teacher4);
    	Teacher staff5 = tdi.createTeacher(teacher5);
    	Teacher staff6 = tdi.createTeacher(teacher6);
    	//TeacherDaoImpl tdi = new TeacherDaoImpl();
    	//tdi.readAll_Teacher();
    	
    	
    	DepartmentDaoImpl ddi = new DepartmentDaoImpl();
    	
    	Department department1 = new Department("IT",2);
    	Department department2 = new Department("ECE",2);
    	Department department3 = new Department("Mech",2);
    	Department department4 = new Department("CSC",1);
    	Department department5 = new Department("EEE",1);
    	Department department6 = new Department("Aero",1);

    	Department dept1 = ddi.createDepartment(department1);
    	Department dept2 = ddi.createDepartment(department2);
    	Department dept3 = ddi.createDepartment(department3);
    	Department dept4 = ddi.createDepartment(department4);
    	Department dept5 = ddi.createDepartment(department5);
    	Department dept6 = ddi.createDepartment(department6);*/
    	Department department6 = new Department("Aero",4);
    	DepartmentDaoImpl ddi = new DepartmentDaoImpl();
    	ddi.updateDepartment(6,department6);
    	//DepartmentDaoImpl ddi = new DepartmentDaoImpl();
    	//ddi.readAll_Department();
    	
    }
}
