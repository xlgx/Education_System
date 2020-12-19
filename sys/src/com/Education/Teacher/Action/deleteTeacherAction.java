package com.Education.Teacher.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;


import com.Education.Bean.teacherbean;
import com.Education.imp.Teacherimplements;
import com.opensymphony.xwork2.ActionSupport;

public class deleteTeacherAction extends ActionSupport{
	
	private HttpServletRequest request;
	
	public String admin_delete_teacher() {
		// TODO Auto-generated method stub	
		try{
			request = ServletActionContext.getRequest();
			int id = Integer.parseInt(request.getParameter("t_id"));
			teacherbean te = new teacherbean();
			Teacherimplements teimp = new Teacherimplements();
			te.setTid(id);
			teimp.delete(te.getTid());
			List<teacherbean> list = teimp.findAll();
			request.getSession().setAttribute("list_teacher", list);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "admin_delete_teacher";
	}
}
