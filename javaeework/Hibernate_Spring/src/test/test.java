package test;

import org.dao.DlDao;
import org.model.Dlb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dlb dlb=new Dlb();
dlb.setXh("123123");
dlb.setKl("123123");
ApplicationContext context=new FileSystemXmlApplicationContext("WebRoot/WEB-INF/classes/applicationContext.xml");
DlDao dlDao=(DlDao) context.getBean("dlDao");
dlDao.save(dlb);
	}

}
