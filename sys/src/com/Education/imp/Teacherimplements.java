package com.Education.imp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Education.Bean.teacherbean;
import com.Education.Interface.TeacherInterface;


public class Teacherimplements implements TeacherInterface {

	private SessionFactory sf = new Configuration().configure().buildSessionFactory();
	private Session session = sf.openSession();
	public void add(teacherbean tb) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.save(tb);
		tx.commit();
	}

	public void update(teacherbean tb) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.update(tb);
		tx.commit();
	}

	public teacherbean findById(int tid) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		teacherbean tb = session.get(teacherbean.class, tid);	
		tx.commit();
		return tb;
	}
	
	public List<teacherbean> findAll() {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Criteria createCriteria = session.createCriteria(teacherbean.class);
		List<teacherbean> list = createCriteria.list();
		tx.commit();
		return list;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		teacherbean tb = session.get(teacherbean.class, id);
		session.delete(tb);
		tx.commit();
	}

	public List<teacherbean> findUsername(String type, Object value) {
		Transaction tx = session.beginTransaction();
		String hqlsql = "from Education_System_Bean.teacherbean as t where t.tusername=?";
		Query query = session.createQuery(hqlsql);
		query.setParameter(0, value);
		List<teacherbean> list = query.list();
		tx.commit();
		return list;
	}
}
