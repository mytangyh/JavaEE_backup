package org.service.imp;

import org.dao.DlDao;
import org.model.Dlb;
import org.service.DlService;

public class DlServiceManage implements DlService {
private DlDao dlDao;
	public void setDlDao(DlDao dlDao) {
	this.dlDao = dlDao;
}
	public Dlb find(String xh, String kl) {
		// TODO Auto-generated method stub
		return dlDao.find(xh, kl);
	}

}
