package net.javademo.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;
import net.javademo.hibernate.model.Student;
import net.javademo.hibernate.util.HibernateUtil;

public class StudentDao implements IStudentDao {
	// save Student
	// get All Students
	// get Student By Id
	// Update Student
	// Delete Student
	
	@Override
	@SuppressWarnings("deprecation")
	public void saveStudent(Student student) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public void updateStudent(Student student) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.saveOrUpdate(student);
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	@Override
	public Student getStudentById(Long id) {
		Transaction transaction = null;
		Student student = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			student = session.get(Student.class, id);
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
		return student;
	}
	
	@Override
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Student> getAllStudents() {
		Transaction transaction = null;
		List<Student> students = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			students= session.createQuery("from Student").list();
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
		return students;
	}
	
	@Override
	public void deleteStudent(Long id) {
		Transaction transaction = null;
		Student student = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			student = session.get(Student.class, id);
			session.remove(student);
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}
}
