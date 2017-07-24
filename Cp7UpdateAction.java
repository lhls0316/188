package com.venustech.vwf.mic.actions.update;

import com.venustech.vwf.commons.view.web.annotations.Param;

/**
 * 立即更新Action
 *
 * @author anna.wang
 * 
 */

public class Cp7UpdateAction extends AbstractUpdateAction{

    private String ips;
    
	public String getIps() {
		return ips;
	}

	@Param
	public void setIps(String ips) {
		this.ips = ips;
	}

	@Override
	public String execute(){
	   String seid = this.getReq().getSession().getAttribute("seid").toString();
	    
	   String update =this.getUpdateServices().update(ips, seid);
	   putViewData("msg", update);
	  return JSON;
	}

}
