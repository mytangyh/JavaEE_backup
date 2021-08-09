package org.action;

import java.util.Map;

import org.dao.DlDao;
import org.dao.imp.DlDaoImp;
import org.model.Dlb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
private Dlb dlb;

public Dlb getDlb() {
	return dlb;
}

public void setDlb(Dlb dlb) {
	this.dlb = dlb;
}
@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
	DlDao dlDao=new DlDaoImp();
	Dlb user=dlDao.check(dlb.getXh(), dlb.getKl());
	if (user!=null) {
		Map session=ActionContext.getContext().getSession();
		session.put("user", user);
		return SUCCESS;
	} else {

	}
		return ERROR;
	}
}
