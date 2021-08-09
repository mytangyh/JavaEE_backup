package org.action;

import java.util.Map;

import org.dao.UpdateXsDao;
import org.dao.XsInfDaol;
import org.dao.imp.UpdateXsDaoImp;
import org.dao.imp.XsInfDaoImp;
import org.model.Dlb;
import org.model.Xsb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateXsAction extends ActionSupport {
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
	UpdateXsDao uXsDao=new UpdateXsDaoImp();
	uXsDao.update(xsb);
	return ERROR;
	}
}
