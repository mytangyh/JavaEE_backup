package test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Detail;
import org.model.Login;
import org.util.HibernateSessionFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction ts=session.beginTransaction(); // 创建事务对象
		Detail detail=new Detail();
		Login login=new Login();
		login.setUsername("xiaoming");
		login.setPassword("123");
		detail.setTruename("测试");
		detail.setEmail("xiaoming@126.com");
		login.setDetail(detail);
		detail.setLogin(login);
		session.save(detail);
		ts.commit();
		HibernateSessionFactory.closeSession();
	}

}
