package test;

import cn.edu.ujn.ch5.IHuman;
import cn.edu.ujn.ch5.factory.Factory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IHuman human=null;
		human=Factory.getHuman();
		human.eat();
		human.walk();
	}

}
