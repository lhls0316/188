package com.venustech.vwf.mic.actions.update;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import com.venustech.vwf.mic.actions.BasicAction;

public class UpdateShowAction  extends BasicAction{

	/**
	 * 规则列表show action
	 */
	private static final long serialVersionUID = 1L;

	@Override
	@Action(results = { @Result(name = "success", location = RESULT_PATH
	+ "/update/cp7.jsp") })
	public String execute(){ 
		
		return SUCCESS;
	}

}
