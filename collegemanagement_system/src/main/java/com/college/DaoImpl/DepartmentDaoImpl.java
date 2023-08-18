package com.college.DaoImpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.college.Dao.DepartmentDao;
import com.college.Entity.Department;
import com.college.Entity.Helper;
import com.college.Entity.Student;





public class DepartmentDaoImpl implements DepartmentDao{

	@Override
	public Department createDepartment(Department dept_detl1) {
		try (Session session = Helper.getSession()) {

			// creating a new Account object
			session.beginTransaction();
			session.save(dept_detl1);
			// java object saved to the database
			session.getTransaction().commit();
			session.clear();
			return dept_detl1;
		} catch (HibernateException h) {
			System.out.println("The hibernate error is " + h);
		} catch (Exception e) {
			System.out.println("the error is " + e);
		}
		return null;
	}

	@Override
	public Department readDepartment(int dept_id) {
		try (Session session = Helper.getSession()) {
			Department dd = (Department) session.get(Department.class, dept_id);
			return dd;
		} catch (HibernateException h) {
			System.out.println("The error is " + h);
		}catch (Exception e) {
			System.out.println("The general error is " + e);
		}
		return null;
	}

	@Override
	public Department readAll_Department() {
		try (Session session = Helper.getSession()) {
			@SuppressWarnings("unchecked")
			/*List<Department> ddAll = session.createQuery("FROM Department").list();
			for (Department entity2 : ddAll) {
				System.out.println(entity2);
            }*/
			Criteria criteria = session.createCriteria(Department.class);
			List ddAll= criteria.list();

			Iterator itr = ddAll.iterator();
			while (itr.hasNext()) {

				Department dept = (Department) itr.next();
				System.out.println("Department id :"+dept.getDept_id()+", Department name :"+dept.getDept_name()+", Department Strength :"+dept.getDept_Strength());
				//System.out.println(dept.getDept_name());
				//System.out.println(dept.getDept_Strength());
	
			}
		} catch (HibernateException h) {
			System.out.println("The error is " + h);
		}catch (Exception e) {
			System.out.println("The general error is " + e);
		}
		return null;
	}

	@Override
	public Department updateDepartment(int dept_id,Department dd) {
		try (Session session = Helper.getSession()) {
			Department dd1 = (Department) session.load(Department.class, dept_id);
			//System.out.println("before update: " + dd1);
			
			dd1.setDept_name(dd.getDept_name());
			dd1.setDept_Strength(dd.getDept_Strength());
			session.beginTransaction();
			session.saveOrUpdate(dd1);
			session.getTransaction().commit();
			//System.out.println("After update: " + ac);
           return dd1; 
		} catch (HibernateException he) {
			System.out.println("the hibernate error is: " + he);
			//((org.jboss.logging.Logger) logger).error("exception happened " + he.toString() + " and error creation time is " + new java.util.Date());
		} catch (Exception e) {
			System.out.println("the hibernate error is: " + e);
		}
		return null;
	}

	@Override
	public void deleteDepartment(int dept_id) {
		try (Session session = Helper.getSession()) {
			Department dd2 = session.get(Department.class, dept_id);
			session.beginTransaction();
			session.delete(dd2);
			session.getTransaction().commit();
		}catch (HibernateException h) {
			System.out.println("the hibernate error is " + h);
		} catch (Exception h) {
			System.out.println("the general error is " + h);
		}
		
	}

}
