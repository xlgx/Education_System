package com.Education.Student.Action;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;


import com.Education.Bean.studentbean;
import com.Education.imp.Studentimplements;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.java.swing.plaf.windows.resources.windows;

public class registerAction extends ActionSupport{
	
	private String username;
	private String confirm_password;
	private String password;
	private String gender;
	private String phone;
	private int age;
	private String date;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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

	public String register(){
		
		if(getConfirm_password().equals(getPassword())){
			Studentimplements stimp = new Studentimplements();
			List<studentbean> list = stimp.findUsername("username", getUsername());
			if(list.size() == 0){
				studentbean st = new studentbean();
				st.setSusername(getUsername());
				st.setSpassword(getPassword());
				st.setSgrender(getGender());
				st.setSage(getAge());
				st.setSphone(getPhone());
				st.setSdate(getDate());
				st.setSemail(getEmail());
				stimp.add(st);
			}else {
				return "ERROR";
			}
		}else{
			return "ERROR";
		}
		return "register";
	}
}
