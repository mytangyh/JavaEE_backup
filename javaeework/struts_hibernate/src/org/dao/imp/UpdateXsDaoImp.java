package org.dao.imp;

import org.dao.UpdateXsDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Xsb;

public class UpdateXsDaoImp implements UpdateXsDao {

	public void update(Xsb xsb) {
		// TODO Auto-generated method stub
		try {
			
			Session session=org.util.HibernateSessionFactory.getSession();
			Transaction ts=session.beginTransaction();
			//hql
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
