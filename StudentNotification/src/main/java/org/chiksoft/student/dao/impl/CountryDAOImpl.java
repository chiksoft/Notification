package org.chiksoft.student.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.chiksoft.student.dao.CountryDAO;
import org.chiksoft.student.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDAOImpl implements CountryDAO {

	private static final Logger LOG = Logger.getLogger(CountryDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addCountry(Country country) {
		Transaction transaction = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(country);
			transaction.commit();
			LOG.debug("Country saved successfully, Country Details=" + country);
		} catch (Exception e) {
			transaction.rollback();
			LOG.error("Error is thrown while inserting country details into table ", e);
			return false;
		} finally {
			if (session != null)
				session.close();
		}
		return true;
	}

	@Override
	public boolean updateCountry(Country country) {
		Transaction transaction = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.update(country);
			transaction.commit();
			LOG.debug("Country updated successfully, Country Details=" + country);
		} catch (Exception e) {
			transaction.rollback();
			LOG.error("Error is thrown while updating country details into table ", e);
			return false;
		} finally {
			if (session != null)
				session.close();
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Country> listCountries() {
		List<Country> countriesList = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			countriesList = session.createQuery("from org.chiksoft.student.model.Country").list();
			LOG.debug("Country List " + countriesList);

		} catch (Exception e) {
			LOG.error("Error is thrown while fetching country list from table ", e);
		} finally {
			if (session != null)
				session.close();
		}
		return countriesList;
	}

	@Override
	public boolean removeCountry(String countryCode) {
		Transaction transaction = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			transaction = session.beginTransaction();
			Country country = (Country) session.get(Country.class, countryCode);
			if (null != country) {
				session.delete(country);
				transaction.commit();
				LOG.debug("Country deleted successfully, Country details=" + country);
				return true;
			} else {
				LOG.debug("Country not found for code=" + countryCode);
				return false;
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.error("Error is thrown while deleting country from table ", e);
			return false;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public Country getCountryByCode(String countryCode) {
		Transaction transaction = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			transaction = session.beginTransaction();
			Country country = (Country) session.get(Country.class, countryCode);
			if (null != country) {
				LOG.debug("Country loaded successfully, Country details=" + country);
				return country;
			} else {
				LOG.debug("Country not found for code=" + countryCode);
				return null;
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.error("Error is thrown while getting country details from table ", e);
			return null;
		} finally {
			if (session != null)
				session.close();
		}
	}

}
