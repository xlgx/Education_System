package com.Education.Teacher.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;


import com.Education.Bean.teacherbean;
import com.Education.imp.Teacherimplements;
import com.opensymphony.xwork2.ActionSupport;

public class addTeacherAction extends ActionSupport{
	
	private String username;
	private String password;
	private String gender;
	private String phone;
	private int age;
	private String date;
	private String email;
	private HttpServletRequest request;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = this.username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String admin_add_teacher(){
		request = ServletActionContext.getRequest();
		Teacherimplements teimp = new Teacherimplements();
		List<teacherbean> ls = teimp.findUsername("username", getUsername());
		if(ls.size() == 0){
			teacherbean te = new teacherbean();
			te.setTusername(getUsername());
			te.setTpassword(getUsername());
			te.setTgrender(getGender());
			te.setTage(getAge());
			te.setTphone(getPhone());
			te.setTdate(getDate());
			te.setTemail(getEmail());
			teimp.add(te);
			List<teacherbean> list = teimp.findAll();
			request.getSession().setAttribute("list", list);
		}else {
			return "ERROR";
		}
		return "admin_add_teacher";
	}
}
