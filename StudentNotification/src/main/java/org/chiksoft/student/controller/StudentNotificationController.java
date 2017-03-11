package org.chiksoft.student.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class StudentNotificationController {

	@Value("${application}")
	private String application;

	@RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
	public @ResponseBody String testSpring(@PathVariable String name) {
		return application;
	}

	@RequestMapping(value = "/test1/{name}", method = RequestMethod.GET)
	public @ResponseBody String testSpring1(@PathVariable String name) {
		return name;
	}

	@RequestMapping(value = "/test2/{name}", method = RequestMethod.GET)
	public @ResponseBody String testSpring2(@PathVariable String name) {
		return name;
	}

}
