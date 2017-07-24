package com.venustech.vwf.mic.actions.update;

/**
 * 检查更新Action
 *
 * @author anna.wang
 * 
 */
public class UpdateCheckAction extends AbstractUpdateAction{

	@Override
	public String execute(){
	   String seid = this.getReq().getSession().getAttribute("seid").toString();
	    
	   String update =this.getUpdateServices().updateCheck(seid);
	   this.sendJson(update.toString());
	  return JSON;
	}
}
