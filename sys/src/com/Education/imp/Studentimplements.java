package com.Education.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Education.Bean.studentbean;
import com.Education.Interface.StudentInterface;


public class Studentimplements implements StudentInterface{
	
	private SessionFactory sf = new Configuration().configure().buildSessionFactory();
	private Session session = sf.openSession();
	
	public void add(studentbean st) {
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
	}

	public void update(studentbean st) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.update(st);
		tx.commit();
	}

	public studentbean findById(int sid) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		studentbean st = session.get(studentbean.class, sid);
		tx.commit();
		return st;
	}

	public List<studentbean> findAll() {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Criteria createCriteria = session.createCriteria(studentbean.class);
		List<studentbean> list = createCriteria.list();
		tx.commit();
		return list;
	}

	public void delete(int sid) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		studentbean st = session.get(studentbean.class, sid);
		session.delete(st);
		tx.commit();
	}

	public List<studentbean> findUsername(String type,Object value) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		String hqlsql = "from Education_System_Bean.studentbean as s where s.susername=?";
		Query query = session.createQuery(hqlsql);
		query.setParameter(0, value);
		List<studentbean> list = query.list();
		tx.commit();
		return list;
	}
	
}
