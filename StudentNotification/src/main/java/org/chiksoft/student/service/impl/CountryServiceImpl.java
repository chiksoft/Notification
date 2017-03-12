package org.chiksoft.student.service.impl;

import java.util.List;

import org.chiksoft.student.dao.CountryDAO;
import org.chiksoft.student.model.Country;
import org.chiksoft.student.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDAO countryDAO;

	public boolean addCountry(Country country) {
		Assert.notNull(country, "Country Object should not be null.");
		return countryDAO.addCountry(country);
	}

	public boolean updateCountry(Country country) {
		Assert.notNull(country, "Country Object should not be null.");
		return countryDAO.updateCountry(country);
	}

	public List<Country> listCountries() {
		return countryDAO.listCountries();
	}

	public boolean removeCountry(String code) {
		Assert.hasText(code, "Country Code should not be null.");
		return countryDAO.removeCountry(code);
	}

	public Country getCountryByCode(String code) {
		Assert.hasText(code, "Country Code should not be null.");
		return countryDAO.getCountryByCode(code);
	}

}
