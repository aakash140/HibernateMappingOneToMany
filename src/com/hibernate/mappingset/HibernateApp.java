package com.hibernate.mappingset;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author aakash.gupta
 *
 */
public class HibernateApp {

	public static void main(String ...args) {
		Session session=configureHibernate();
		StoreEmployee employee=new StoreEmployee();
		employee.storeEmployee(session);
		session.close();
	}
	public static Session configureHibernate(){
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session;
	}
}