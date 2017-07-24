package com.venustech.vwf.mic.actions.update;

import javax.annotation.Resource;

import com.venustech.vwf.mic.actions.BasicAction;
import com.venustech.vwf.mic.service.update.IupdateServices;

public class AbstractUpdateAction extends BasicAction {

	private static final long serialVersionUID = 1L;
	//在线升级service
	private IupdateServices updateServices;

	public IupdateServices getUpdateServices() {
		return updateServices;
	}

	@Resource(type = IupdateServices.class)
	public void setUpdateServices(IupdateServices updateServices) {
		this.updateServices = updateServices;
	}

}
