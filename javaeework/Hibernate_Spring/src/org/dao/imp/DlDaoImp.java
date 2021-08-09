package org.dao.imp;

import org.dao.DlDao;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Dlb;

public class DlDaoImp implements DlDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void save(Dlb dl) {
		// TODO Auto-generated method stub
	try {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		session.save(dl);
		ts.commit();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}

}
