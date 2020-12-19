package com.Education.Interface;

import java.util.List;

import com.Education.Bean.studentbean;


public interface StudentInterface {
	
	public void add(studentbean st);
	public void update(studentbean st);
	public studentbean findById(int id);
	public List<studentbean>findAll();
	public List<studentbean>findUsername(String type,Object value);
	public void delete(int id);
}
