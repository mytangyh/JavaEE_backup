package org.dao.imp;

import org.dao.DlDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Dlb;

public class DlDaoImp implements DlDao {

	public Dlb check(String xh, String kl) {
		// TODO Auto-generated method stub
		try{
			Session session=org.util.HibernateSessionFactory.getSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Dlb where xh=? and kl=?");
			query.setParameter(0, xh);
			query.setParameter(1, kl);
			query.setMaxResults(1);
			Dlb dlb=(Dlb) query.uniqueResult();
			if(dlb!=null){
				return dlb;
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
			
	}

}
