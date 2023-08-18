package com.college.Dao;

import com.college.Entity.Exam;

public interface ExamDao {
	Exam createExam(Exam exam_detl1);
	Exam readExam_Details(int reg_no);
	Exam readAll_Exam_Details();
	Exam updateExam_Details(int reg_no,Exam ex);
	void deleteExam_Results(int reg_no);

}
