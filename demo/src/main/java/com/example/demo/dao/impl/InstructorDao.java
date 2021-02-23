package com.example.demo.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.IInstructorDAO;
import com.example.demo.util.Instructor;

@Transactional
@Repository
public class InstructorDao implements IInstructorDAO{
	
	@Autowired
	protected SessionFactory sessionFactory;
	

	public List<Instructor> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
	    return session.createQuery("FROM Instructor", Instructor.class).getResultList();
	}
}
