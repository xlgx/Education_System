package com.Education.Interface;

import java.util.List;

import com.Education.Bean.teacherbean;


public interface TeacherInterface {
	
	public void add(teacherbean tb);
	public void update(teacherbean tb);
	public teacherbean findById(int id);
	public List<teacherbean>findAll();
	public List<teacherbean>findUsername(String type,Object value);
	public void delete(int id);
}
