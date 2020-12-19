package com.Education.Bean;

public class studentbean {
	
	private int sid;
	private String susername;
	private String spassword;
	private int sage;
	private String sgrender;
	private String sphone;
	private String semail;
	private String sdate;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSusername() {
		return susername;
	}
	public void setSusername(String susername) {
		this.susername = susername;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSgrender() {
		return sgrender;
	}
	public void setSgrender(String sgrender) {
		this.sgrender = sgrender;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	@Override
	public String toString() {
		return "studentbean [id=" + sid + ", username=" + susername
				+ ", password=" + spassword + ", age=" + sage + ", grender="
				+ sgrender + ", phone=" + sphone + ", email=" + semail + ", date="
				+ sdate + "]";
	}
}
