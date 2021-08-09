package org.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
private String xh;
private String kl;
public String getXh() {
	return xh;
}
public void setXh(String xh) {
	this.xh = xh;
}
public String getKl() {
	return kl;
}
public void setKl(String kl) {
	this.kl = kl;
}
@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
}
