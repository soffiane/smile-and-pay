package fr.smileandpay.shop.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public abstract class HibernateService {

	private Session session = null;

	protected HibernateService() {

	}

	public Session getSession() {
		if (null == session) {
			// on charge le fichier de configuration : hibernate.cfg.xml par defaut
			Configuration configuration = new Configuration().configure();

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			configuration.buildSessionFactory();

			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			session = sessionFactory.openSession();
		}
		return session;
	}
}
