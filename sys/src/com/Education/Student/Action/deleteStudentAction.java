package com.Education.Student.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;


import com.Education.Bean.studentbean;
import com.Education.imp.Studentimplements;
import com.opensymphony.xwork2.ActionSupport;

public class deleteStudentAction extends ActionSupport{
	
	private HttpServletRequest request;
	public String admin_delete_student() {
		// TODO Auto-generated method stub	
		try{
			request = ServletActionContext.getRequest();
			int id = Integer.parseInt(request.getParameter("s_id"));
			studentbean st = new studentbean();
			Studentimplements stimp = new Studentimplements();
			st.setSid(id);
			stimp.delete(st.getSid());
			List<studentbean> list = stimp.findAll();
			request.getSession().setAttribute("list", list);
			//JOptionPane.showMessageDialog(null,"删除成功","",JOptionPane.ERROR_MESSAGE);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "admin_delete_student";
	}
}
