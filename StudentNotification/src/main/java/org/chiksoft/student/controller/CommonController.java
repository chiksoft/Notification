package org.chiksoft.student.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.chiksoft.student.model.Country;
import org.chiksoft.student.model.Student;
import org.chiksoft.student.service.CountryService;
import org.chiksoft.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class CommonController {

	private static final Logger LOG = Logger.getLogger(CommonController.class);

	@Autowired
	private CountryService countryService;

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/country/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean addCountry(@RequestBody Country country) {
		LOG.debug("Calling function to add country" +country + " from controller");
		return countryService.addCountry(country);
	}

	@RequestMapping(value = "/country/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateCountry(@RequestBody Country country) {
		LOG.debug("Calling function to update country" +country + " from controller");
		return countryService.updateCountry(country);
	}

	@RequestMapping(value = "/country", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Country> listCountries() {
		LOG.debug("Calling function to List countries from controller");
		return countryService.listCountries();
	}

	@RequestMapping(value = "/country/delete/{code}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean removeCountry(@PathVariable("code") String code) {
		LOG.debug("Calling function to delete country" +code + " from controller");
		return countryService.removeCountry(code);
	}

	@RequestMapping(value = "/country/{code}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Country getCountryByCode(@PathVariable("code") String code) {
		LOG.debug("Calling function to List countries from controller");
		return countryService.getCountryByCode(code);
	}

	@RequestMapping(value = "/student/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean addStudent(@RequestBody Student student) {
		LOG.debug("Calling function to add student" +student + " from controller");
		return studentService.addStudent(student);
	}

	@RequestMapping(value = "/student/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateStudent(@RequestBody Student student) {
		LOG.debug("Calling function to update student" +student + " from controller");
		return studentService.updateStudent(student);
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Student> listStudents() {
		LOG.debug("Calling function to List students from controller");
		return studentService.listStudents();
	}

	@RequestMapping(value = "/student/delete/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean removeStudent(@PathVariable("userId") int userId) {
		LOG.debug("Calling function to delete student" +userId + " from controller");
		return studentService.removeStudent(userId);
	}

	@RequestMapping(value = "/student/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Student getStudentById(@PathVariable("userId") int userId) {
		LOG.debug("Calling function to List countries from controller");
		return studentService.getStudentById(userId);
	}

	@RequestMapping(value = "/student/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String registerStudent(@RequestBody Student student) {
		LOG.debug("Calling function to add student" +student + " from controller");
		return studentService.registerStudent(student);
	}

}
