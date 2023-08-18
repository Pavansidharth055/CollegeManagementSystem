package com.college.Dao;

import com.college.Entity.Department;

public interface DepartmentDao {
	Department createDepartment(Department dept_detl1);
	Department readDepartment(int dept_id);
	Department readAll_Department();
	Department updateDepartment(int dept_id,Department dd);
	void deleteDepartment(int dept_id);
	

}
