package com.college.DaoImpl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.college.Dao.ExamDao;
import com.college.Entity.Exam;
import com.college.Entity.Helper;

public class ExamDaoImpl implements ExamDao {

	@Override
	public Exam createExam(Exam exam_detl1) {
	try (Session session = Helper.getSession()) {
			session.beginTransaction();
			session.save(exam_detl1);
			session.getTransaction().commit();
			session.clear();
			return exam_detl1;
		} catch (HibernateException h) {
			System.out.println("The hibernate error is " + h);
		} catch (Exception e) {
			System.out.println("the error is " + e);
		}
		return null;
	}

	@Override
	public Exam readExam_Details(int reg_no) {
		try (Session session = Helper.getSession()) {
			Exam er = (Exam) session.load(Exam.class, reg_no);
			return er;
		} catch (HibernateException h) {
			System.out.println("The error is " + h);
		}catch (Exception e) {
			System.out.println("The general error is " + e);
		}
		return null;
	}

	@Override
	public Exam readAll_Exam_Details() {
		try (Session session = Helper.getSession()) {
			@SuppressWarnings("unchecked")
			List<Exam> erAll = session.createQuery("FROM Exam").list();
			return (Exam) erAll;
		} catch (HibernateException h) {
			System.out.println("The error is " + h);
		}catch (Exception e) {
			System.out.println("The general error is " + e);
		}
		return null;
	}

	@Override
	public Exam updateExam_Details(int reg_no,Exam ex) {
		try (Session session = Helper.getSession()) {
			Exam er1 = (Exam) session.load(Exam.class, reg_no);
			//System.out.println("before update: " + er1);
			
			er1.setName(ex.getName());
			er1.setCgpa(ex.getCgpa());
			er1.setPerformance(ex.getPerformance());
			session.beginTransaction();
			session.saveOrUpdate(er1);
			session.getTransaction().commit();
			//System.out.println("After update: " + er1);
           return er1;   
		} catch (HibernateException he) {
			System.out.println("the hibernate error is: " + he);
		} catch (Exception e) {
			System.out.println("the hibernate error is: " + e);
		}
		return null;
	}

	@Override
	public void deleteExam_Results(int reg_no) {
		try (Session session = Helper.getSession()) {
			Exam er2 = session.load(Exam.class, reg_no);
			session.beginTransaction();
			session.delete(er2);
		}catch (HibernateException h) {
			System.out.println("the hibernate error is " + h);
		} catch (Exception h) {
			System.out.println("the general error is " + h);
		}
		
	}

}
