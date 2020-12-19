package com.Education.Student.Action;

import java.util.List;

import javax.swing.JOptionPane;


import com.Education.Bean.studentbean;
import com.Education.Bean.teacherbean;
import com.Education.imp.Studentimplements;
import com.Education.imp.Teacherimplements;
import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport{
	
	private String username;
	private String password;
	private String radio;
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
		this.password = password;
	}
	public String getRadio() {
		return radio;
	}
	public void setRadio(String radio) {
		this.radio = radio;
	}
	
	public String login() {
		// TODO Auto-generated method stub
		if(radio.equals("学生")){
			Studentimplements stimp = new Studentimplements();
			List<studentbean> list = stimp.findUsername("username", getUsername());
			if(list.size() == 0){
				JOptionPane.showMessageDialog(null,"用户名或密码错误","警告",JOptionPane.ERROR_MESSAGE);
				return "ERROR";
			}else{
				for(int i = 0; i < list.size();i++){
					studentbean st = list.get(i);
					if(getUsername().equals(st.getSusername()) && getPassword().equals(st.getSpassword())){
						return "login";
					}else {
						JOptionPane.showMessageDialog(null,"用户名或密码错误","警告",JOptionPane.ERROR_MESSAGE);
						return "ERROR";
					}
				}
			}
		}else if(radio.equals("教师")) {
			Teacherimplements teimp = new Teacherimplements();
			List<teacherbean> list = teimp.findUsername("username", getUsername());
			if(list.size() == 0){
				JOptionPane.showMessageDialog(null,"用户名或密码错误","警告",JOptionPane.ERROR_MESSAGE);
				return "ERROR";
			}else{
				for(int i = 0; i < list.size(); i++){
					teacherbean te = list.get(i);
					if(getUsername().equals(te.getTusername()) && getPassword().equals(te.getTpassword())){
						return "login";
					}else{
						JOptionPane.showMessageDialog(null,"用户名或密码错误","警告",JOptionPane.ERROR_MESSAGE);
						return "ERROR";
					}
				}
			}
		}else{
			if(getUsername().equals("admin") && getPassword().equals("admin")){
				return "login";
			}else {
				JOptionPane.showMessageDialog(null,"用户名或密码错误","警告",JOptionPane.ERROR_MESSAGE);
				return "ERROR";
			}
		}
		return "ERROR";
	}
}

