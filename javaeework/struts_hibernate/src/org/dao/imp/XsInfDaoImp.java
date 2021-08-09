package org.dao.imp;

import java.util.List;

import org.dao.XsInfDaol;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Xsb;
import org.model.Zyb;
import org.util.HibernateSessionFactory;

public class XsInfDaoImp implements XsInfDaol {

	public Xsb select(String xh) {
		// TODO Auto-generated method stub
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Xsb where xh=?");
			query.setParameter(0, xh);
			query.setMaxResults(1);
			Xsb xsb=(Xsb) query.uniqueResult();
			int zyid=xsb.getZyId();//专业号
			Query query2 = session.createQuery("from Zyb where id=?");
			query2.setParameter(0, zyid);
			query2.setMaxResults(1);
			Zyb zyb=(Zyb) query2.uniqueResult();
			xsb.setZyb(zyb);
			if (xsb!=null) {
				return xsb;
			} else {
				return null;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

}
