package org.dao.imp;

import java.util.List;

import org.dao.DlDao;
import org.model.Dlb;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DlDaoImp extends HibernateDaoSupport implements DlDao {

	public Dlb find(String xh, String kl) {
		// TODO Auto-generated method stub
		String str[]={xh,kl};
		List list=getHibernateTemplate().find("from Dlb where xh=? and kl=?",str);
		if (list.size()>0) {
			return (Dlb) list.get(0);
		} else {
			return null;
		}
		
	}

}
