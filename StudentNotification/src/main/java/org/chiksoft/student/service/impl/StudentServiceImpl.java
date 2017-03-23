package org.chiksoft.student.service.impl;

import java.util.List;

import org.chiksoft.student.dao.StudentDAO;
import org.chiksoft.student.model.Student;
import org.chiksoft.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public boolean addStudent(Student student) {
		Assert.notNull(student, "Student Object should not be null.");
		return studentDAO.addStudent(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		Assert.notNull(student, "Student Object should not be null.");
		return studentDAO.updateStudent(student);
	}

	@Override
	public List<Student> listStudents() {
		return studentDAO.listStudents();
	}

	@Override
	public boolean removeStudent(int userId) {
		Assert.isTrue((userId == (int)userId && userId > 0 ), "Student Id should be a valid number.");
		return studentDAO.removeStudent(userId);
	}

	@Override
	public Student getStudentById(int userId) {
		Assert.isTrue((userId == (int)userId && userId > 0 ), "Student Id should be a valid number.");
		return studentDAO.getStudentById(userId);
	}

	@Override
	public String registerStudent(Student student) {
		student.setRegisteredDate();
		boolean success;
		if(studentDAO.addStudent(student))
			success =  true;
		else{
			success = false;
			student = null;
		}
 
        ObjectMapper mapper = new ObjectMapper();
        
        String jsonString = "";
		try {
			jsonString = "{\"success\":\""+success+"\",\"student\":"+mapper.writeValueAsString(student)+"}";
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        
		return jsonString;
	}

}
