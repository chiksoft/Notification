package org.chiksoft.student.service;

import java.util.List;
import org.chiksoft.student.model.Student;

public interface StudentService {

	public boolean addStudent(Student student);

	public boolean updateStudent(Student student);

	public List<Student> listStudents();

	public boolean removeStudent(int userId);

	public Student getStudentById(int userId);

	public String registerStudent(Student student);

}
