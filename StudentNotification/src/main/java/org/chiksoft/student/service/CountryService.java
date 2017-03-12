package org.chiksoft.student.service;


import java.util.List;

import org.chiksoft.student.model.Country;

public interface CountryService {

	public boolean addCountry(Country c);
	public boolean updateCountry(Country c);
	public List<Country> listCountries();
	public boolean removeCountry(String code);
	public Country getCountryByCode(String code);
}
