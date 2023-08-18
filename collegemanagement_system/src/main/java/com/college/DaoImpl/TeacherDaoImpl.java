package com.college.DaoImpl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.college.Dao.TeacherDao;
import com.college.Entity.Teacher;
import com.college.Entity.Helper;
import com.college.Entity.Student;

public class TeacherDaoImpl implements TeacherDao {

	@Override
	public Teacher createTeacher(Teacher teach_detl1) {
		try (Session session = Helper.getSession()){
			session.beginTransaction();
			session.save(teach_detl1);
			session.getTransaction().commit();
			session.clear();			
			return teach_detl1;
		} catch (HibernateException h) {
			System.out.println("The hibernate error is " + h);
			//((org.jboss.logging.Logger) logger).error("exception happened " + h.toString() + " and error creation time is " + new java.util.Date());
		} catch (Exception e) {
			System.out.println("the error is " + e);
		}
		return null;
	}

	@Override
	public Teacher readTeacher(int id) {
		try (Session session = Helper.getSession()) {
			Teacher td = (Teacher) session.load(Teacher.class, id);
			return td;
		} catch (HibernateException h) {
			System.out.println("The error is " + h);
		}catch (Exception e) {
			System.out.println("The general error is " + e);
		}
		return null;
	}

	@Override
	public Teacher readAll_Teacher() {
		try (Session session = Helper.getSession()) {
			@SuppressWarnings("unchecked")
			List<Teacher> tdAll = session.createQuery("FROM Teacher").list();
			for (Teacher entity1 : tdAll) {
				System.out.println(entity1);
            }
		} catch (HibernateException h) {
			System.out.println("The error is " + h);
		}catch (Exception e) {
			System.out.println("The general error is " + e);
		}
		return null;
	}
@Override
public Teacher updateTeacher(int id,Teacher td) {
	try (Session session = Helper.getSession()) {
		Teacher td1 = (Teacher) session.load(Teacher.class, id);
		//System.out.println("before update: " + td1);
		td1.setName(td.getName());
		td1.setDept(td.getDept());
		td1.setPh_no(td1.getPh_no());
		td1.setSubjects(td.getSubjects());
		session.beginTransaction();
		session.saveOrUpdate(td1);
		session.getTransaction().commit();
		//System.out.println("After update: " + td1);
       return td1;   
	} catch (HibernateException he) {
		System.out.println("the hibernate error is: " + he);
	} catch (Exception e) {
		System.out.println("the hibernate error is: " + e);
	}
	return null;
}
@Override
public void deleteTeacher(int id) {
	try (Session session = Helper.getSession()) {
		Teacher td2 = session.get(Teacher.class, id);
		session.beginTransaction();
		session.delete(td2);
		session.getTransaction().commit();
		//session.evict(td2);
	}catch (HibernateException h) {
		System.out.println("the hibernate error is " + h);
	} catch (Exception h) {
		System.out.println("the general error is " + h);
	}	
}
}
