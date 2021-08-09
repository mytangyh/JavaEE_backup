package org.model;

import org.omg.PortableInterceptor.SUCCESSFUL;

import com.opensymphony.xwork2.ActionSupport;

public class SaveAction extends ActionSupport {
	private User xs;

	public User getXs() {
		return xs;
	}

	public void setXs(User xs) {
		this.xs = xs;
	}
	public String execute()throws Exception {
		User stu = new User();
		stu.setUsername(xs.getUsername());
		stu.setPassword(xs.getPassword());
		if (!"zhangsan".equals(stu.getUsername())) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
