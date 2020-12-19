package com.Education.Teacher.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import com.Education.Bean.studentbean;
import com.Education.imp.Studentimplements;
import com.opensymphony.xwork2.ActionSupport;

public class updateTeacherAction extends ActionSupport{
	
	private int id;
	private int age;
	private String pwd;
	private String date;
	private String email;
	private String gender;
	private String phone;
	private String username;
	private HttpServletRequest request;
	public int getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "updateAction [id=" + id + ", age=" + age + ", pwd=" + pwd
				+ ", date=" + date + ", email=" + email + ", gender=" + gender
				+ ", phone=" + phone + ", username=" + username + "]";
	}
	public String admin_update_student(){
		request = ServletActionContext.getRequest();
		Studentimplements stimp = new Studentimplements();
		studentbean st = new studentbean();
		st.setSage(getAge());
		st.setSid(getId());
		st.setSdate(getDate());
		st.setSemail(getEmail());
		st.setSgrender(getGender());
		st.setSpassword(getPwd());
		st.setSphone(getPhone());
		st.setSusername(getUsername());
		stimp.update(st);
		List<studentbean> list = stimp.findAll();
		request.getSession().setAttribute("list", list);
		return "admin_update_student";
	}
}
