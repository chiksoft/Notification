package org.chiksoft.student.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.chiksoft.student.dao.StudentDAO;
import org.chiksoft.student.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

	private static final Logger LOG = Logger.getLogger(StudentDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addStudent(Student student) {
		Transaction transaction = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
			LOG.debug("Student saved successfully, Student Details=" + student);
		} catch (Exception e) {
			transaction.rollback();
			LOG.error("Error is thrown while inserting student details into table ", e);
			return false;
		} finally {
			if (session != null)
				session.close();
		}
		return true;
	}

	@Override
	public boolean updateStudent(Student student) {
		Transaction transaction = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.update(student);
			transaction.commit();
			LOG.debug("Student updated successfully, Student Details=" + student);
		} catch (Exception e) {
			transaction.rollback();
			LOG.error("Error is thrown while updating student details into table ", e);
			return false;
		} finally {
			if (session != null)
				session.close();
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> listStudents() {
		List<Student> studentList = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			studentList = session.createQuery("from org.chiksoft.student.model.Student").list();
			LOG.debug("Student List " + studentList);

		} catch (Exception e) {
			LOG.error("Error is thrown while fetching student list from table ", e);
		} finally {
			if (session != null)
				session.close();
		}
		return studentList;
	}

	@Override
	public boolean removeStudent(int userId) {
		Transaction transaction = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			transaction = session.beginTransaction();
			Student student = (Student) session.get(Student.class, userId);
			if (null != student) {
				session.delete(student);
				transaction.commit();
				LOG.debug("Student deleted successfully, Student details=" + student);
				return true;
			} else {
				LOG.debug("Student not found for userId=" + userId);
				return false;
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.error("Error is thrown while deleting student from table ", e);
			return false;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public Student getStudentById(int userId) {
		Transaction transaction = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			transaction = session.beginTransaction();
			Student student = (Student) session.get(Student.class, userId);
			if (null != student) {
				LOG.debug("Student loaded successfully, Student details=" + student);
				return student;
			} else {
				LOG.debug("Student not found for userId=" + userId);
				return null;
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.error("Error is thrown while getting student details from table ", e);
			return null;
		} finally {
			if (session != null)
				session.close();
		}
	}

}
