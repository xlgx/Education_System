package com.Education.Student.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import com.Education.Bean.studentbean;
import com.Education.imp.Studentimplements;
import com.opensymphony.xwork2.ActionSupport;

public class lookStudentMessageAction extends ActionSupport{
	private HttpServletRequest request;
	
	public String lookStudentMessage(){
		request = ServletActionContext.getRequest();
		Studentimplements stimp = new Studentimplements();
		List<studentbean> list = stimp.findAll();
		request.getSession().setAttribute("list", list);
		return "lookStudentMessage";
	}
}
