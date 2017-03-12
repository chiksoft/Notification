package org.chiksoft.student.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.chiksoft.student.dao.CountryDAO;
import org.chiksoft.student.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDAOImpl implements CountryDAO {

	private static final Logger LOG = Logger.getLogger(CountryDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addCountry(Country country) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(country);
		LOG.debug("Country saved successfully, Country Details=" + country);
		return true;
	}

	@Override
	public boolean updateCountry(Country country) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(country);
		LOG.debug("Country updated successfully, Country Details=" + country);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Country> listCountries() {
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Country> countriesList = session.createQuery("from org.chiksoft.student.model.Country").list();
		LOG.debug("Country List " + countriesList);
		return countriesList;
	}

	@Override
	public boolean removeCountry(String code) {
		Session session = this.sessionFactory.getCurrentSession();
		Country country = (Country) session.load(Country.class, code);
		if (null != country) {
			session.delete(country);
		}
		LOG.debug("Country deleted successfully, Country details=" + country);
		return true;
	}

	@Override
	public Country getCountryByCode(String code) {
		Session session = this.sessionFactory.getCurrentSession();
		Country country = (Country) session.load(Country.class, code);
		LOG.debug("Country loaded successfully, Country details=" + country);
		return country;
	}

}
