package test;

import lab8.Human;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
	Human human=null;
	human=(Human) ctx.getBean("chinese");
	human.speak();
	}

}
