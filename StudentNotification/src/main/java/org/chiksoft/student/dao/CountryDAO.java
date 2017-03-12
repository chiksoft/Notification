package org.chiksoft.student.dao;

import java.util.List;

import org.chiksoft.student.model.Country;

public interface CountryDAO {

	public boolean addCountry(Country country);
	public boolean updateCountry(Country country);
	public List<Country> listCountries();
	public boolean removeCountry(String code);
	public Country getCountryByCode(String code);

}
