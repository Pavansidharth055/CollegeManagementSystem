package com.college.Dao;

import com.college.Entity.Student;

public interface StudentDao {
	Student createStudent(Student stud_detl1);
	Student readStudent(int reg_no);
	Student readAll_Student();
	Student updateStudent(int reg_no,Student sd);
	void deleteStudent(int reg_no);

}
