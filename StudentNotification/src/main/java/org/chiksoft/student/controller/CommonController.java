package org.chiksoft.student.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.chiksoft.student.model.Country;
import org.chiksoft.student.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class CommonController {

	private static final Logger LOG = Logger.getLogger(CommonController.class);

	@Autowired
	private CountryService countryService;

	@RequestMapping(value = "/country", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Country> listCountries() {
		LOG.debug("Calling function to List countries from controller");
		return countryService.listCountries();
	}

}
