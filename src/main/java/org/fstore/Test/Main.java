package org.fstore.Test;

import java.time.LocalTime;
import java.util.Date;

import org.fstore.Entity.Customer;
import org.fstore.Entity.CustomerCountry;
import org.fstore.Model.FStoreHibernateDao;
import org.fstore.Model.IGenericDao;

public class Main {
	static FStoreHibernateDao<Customer> dao;
	public static void main(String[] args) {
		dao = new FStoreHibernateDao();
		insertCountry(dao);
		System.out.print(111);
	}
	
	public static void insertCountry(FStoreHibernateDao dao) {
		dao.setClazz(CustomerCountry.class);
		CustomerCountry country = new CustomerCountry();
		country.setCountry("Viet Nam");
		country.setLastUpdate(new Date());
		dao.create(country);
	}
}
