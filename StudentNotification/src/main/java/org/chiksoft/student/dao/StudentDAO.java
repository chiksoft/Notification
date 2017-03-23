package org.chiksoft.student.dao;

import java.util.List;
import org.chiksoft.student.model.Student;

public interface StudentDAO {

	public boolean addStudent(Student student);

	public boolean updateStudent(Student student);

	public List<Student> listStudents();

	public boolean removeStudent(int userId);

	public Student getStudentById(int userId);

}
