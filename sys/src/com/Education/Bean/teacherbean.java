package com.Education.Bean;

public class teacherbean {
	
	private int tid;
	private String tusername;
	private String tpassword;
	private int tage;
	private String tgrender;
	private String tphone;
	private String temail;
	private String tdate;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTusername() {
		return tusername;
	}
	public void setTusername(String tusername) {
		this.tusername = tusername;
	}
	public String getTpassword() {
		return tpassword;
	}
	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}
	public String getTgrender() {
		return tgrender;
	}
	public void setTgrender(String tgrender) {
		this.tgrender = tgrender;
	}
	public String getTphone() {
		return tphone;
	}
	public void setTphone(String tphone) {
		this.tphone = tphone;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	@Override
	public String toString() {
		return "techerbean [tid=" + tid + ", tusername=" + tusername
				+ ", tpassword=" + tpassword + ", tage=" + tage + ", tgrender="
				+ tgrender + ", tphone=" + tphone + ", temail=" + temail
				+ ", tdate=" + tdate + "]";
	}
}
