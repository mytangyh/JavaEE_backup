package cn.edu.ujn.ch5.factory;

import cn.edu.ujn.ch5.American;
import cn.edu.ujn.ch5.Chinese;
import cn.edu.ujn.ch5.IHuman;

public class Factory {
	public static IHuman getHuman(){
		return new American();
	}
}
