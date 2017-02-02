package com.javabycode.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.javabycode.hibernate.model.Student;
import com.javabycode.hibernate.model.StudentExtended;

public class HibernateConstructorHQLExample {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); 
		Session session = sessionFactory.openSession();
		String sql = "select new Student(s.id,s.name) from Student s where s.id=:studentId";
		
		Query query = session.createQuery(sql);
		query.setLong("studentId", 33L);
		
		@SuppressWarnings("unchecked")
		List<Student> list = (List<Student>)query.list();
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		String sql2 = "select new com.javabycode.hibernate.model.StudentExtended(s.name,count(s)) from Student s where s.id=:studentId";
		Query query2 = session.createQuery(sql2);
		query2.setLong("studentId", 33L);
		
		@SuppressWarnings("unchecked")
		List<StudentExtended> list2 = (List<StudentExtended>)query2.list();
		
		for (StudentExtended student2 : list2) {
			System.out.println(student2);
		}
					
	}

}
