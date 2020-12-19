package com.Education.Teacher.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import com.Education.Bean.teacherbean;
import com.Education.imp.Teacherimplements;
import com.opensymphony.xwork2.ActionSupport;

public class lookTeacherMessageAction extends ActionSupport{
	private HttpServletRequest request;
	
	public String lookTeacherMessage(){
		request = ServletActionContext.getRequest();
		Teacherimplements teimp = new Teacherimplements();
		List<teacherbean> list = teimp.findAll();
		request.getSession().setAttribute("list_teacher", list);
		return "lookTeacherMessage";
	}
}
