package com.college.Dao;

import com.college.Entity.Teacher;

public interface TeacherDao {
	
	Teacher createTeacher(Teacher teach_detl1);
	Teacher readTeacher(int id);
	Teacher readAll_Teacher();
	Teacher updateTeacher(int id,Teacher td);
	void deleteTeacher(int id);
	

}
