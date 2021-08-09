package org.action;

import java.util.Map;

import org.dao.XsInfDaol;
import org.dao.imp.XsInfDaoImp;
import org.hibernate.Session;
import org.model.Dlb;
import org.model.Xsb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class XsInfAction extends ActionSupport {
private Xsb xsb;

public Xsb getXsb() {
	return xsb;
}

public void setXsb(Xsb xsb) {
	this.xsb = xsb;
}
@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
	Map session=ActionContext.getContext().getSession();
	Dlb dlb=(Dlb) session.get("user");
	XsInfDaol xsInfDaol=new XsInfDaoImp();
	Xsb xsb=xsInfDaol.select(dlb.getXh());
	if (xsb!=null) {
	//	Map request=(Map)ActionContext.getContext().get("request");
	//	request.put("xs", xsb);
		
		session.put("xs", xsb);
		return SUCCESS;
	} else {
		
	}
		return ERROR;
	}
	
		
	
}
