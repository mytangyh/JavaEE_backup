package test;





import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import org.model.Kcb;
import org.util.HibernateSessionFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=(Session) HibernateSessionFactory.getSession();
		Transaction ts=session.beginTransaction();
	/*	Kcb kc=new Kcb();
		kc.setKcb("1");//课程号kch
		kc.setKcm("JavaEE");
		kc.setKxxq(new Integer(5).shortValue());
		kc.setXf(new Integer(4));
		kc.setXs(new Integer(59));
		session.save(kc);*/
	/*	Query query=session.createQuery("from Kcb");
		List list=query.list();
	for (int i = 0; i < list.size(); i++) {
		Kcb kcb=(Kcb) list.get(i);
		System.out.println("课程名:"+kcb.getKcm());
		
	}*/
		Query query=session.createQuery("from Kcb order by xs desc");
		query.setMaxResults(1);
		Kcb kcb=(Kcb) query.uniqueResult();
		System.out.println(kcb.getKcm()+" "+kcb.getXs());
ts.commit();
HibernateSessionFactory.closeSession();
	}

}
