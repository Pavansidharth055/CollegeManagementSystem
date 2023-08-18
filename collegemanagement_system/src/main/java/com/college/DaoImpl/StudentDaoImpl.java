package com.college.DaoImpl;

import java.util.*;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;

import org.hibernate.Session;


import com.college.Dao.StudentDao;
import com.college.Entity.Student;
import com.college.Entity.Helper;

public class StudentDaoImpl implements StudentDao {

	@Override
	public Student createStudent(Student stud_detl1) {
		try (Session session = Helper.getSession()) {
			// creating a new Account object
			session.beginTransaction();
			session.save(stud_detl1);
			// java object saved to the database
			session.getTransaction().commit();
			session.clear();
			session.close();
			return stud_detl1;
		} catch (HibernateException h) {
			System.out.println("The hibernate error is " + h);	
		} catch (Exception e) {
			System.out.println("the error is " + e);
		}
		return null;
	}

	@Override
	public Student readStudent(int reg_no) {
		try (Session session = Helper.getSession()) {
			Student sd = (Student) session.get(Student.class, reg_no);
			return sd;
		} catch (HibernateException h) {
			System.out.println("The error is " + h);
		}catch (Exception e) {
			System.out.println("The general error is " + e);
		}
		return null;
	}

	@Override
	public Student readAll_Student() {
		try (Session session = Helper.getSession()) {
			@SuppressWarnings("unchecked")
	

			List<Student> sdAll = session.createQuery("FROM Student").list();
			for (Student entity : sdAll) {
				System.out.println(entity);
            }
			/*Criteria criteria = session.createCriteria(Student.class);
			List sdAll= criteria.list();

			Iterator itr = sdAll.iterator();
			while (itr.hasNext()) {

				Student stu = (Student) itr.next();
				System.out.println(stu.getReg_no());
				System.out.println(stu.getName());
				System.out.println(stu.getDept());
				System.out.println(stu.getPh_no());
				System.out.println(stu.getDOJ());
			}*/
			/*CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery <Student> criteria = builder.createQuery(Student.class);
			criteria.from(Student.class);
			List<Student> resultList = session.createQuery(criteria).getResultList();
			System.out.println(resultList);*/
			session.getTransaction().commit();
			
		} catch (HibernateException h) {
			System.out.println("The error is " + h);	
		}catch (Exception e) {
			System.out.println("The general error is " + e);
		}
		return null;
	}

	@Override
	public Student updateStudent(int reg_no, Student sd) {
		try (Session session = Helper.getSession()) {
			Student sd1 = (Student) session.load(Student.class, reg_no);
			//System.out.println("before update: " + sd1);
			
			sd1.setName(sd.getName());
			sd1.setDept(sd.getDept());
			sd1.setPh_no(sd.getPh_no());
			sd1.setDOJ(sd.getDOJ());
			session.beginTransaction();
			session.saveOrUpdate(sd1);
			session.getTransaction().commit();
			//System.out.println("After update: " + sd1);
            return sd1;  
		} catch (HibernateException he) {
			System.out.println("the hibernate error is: " + he);
		} catch (Exception e) {
			System.out.println("the hibernate error is: " + e);
		}
		return null;
	}

	@Override
	public void deleteStudent(int reg_no) {
		try (Session session = Helper.getSession()) {
			Student sd2 = session.get(Student.class, reg_no);
			session.beginTransaction();
			session.delete(sd2);
			session.getTransaction().commit();
		}catch (HibernateException h) {
			System.out.println("the hibernate error is " + h);
		} catch (Exception h) {
			System.out.println("the general error is " + h);
		}
		
	}
	
}
