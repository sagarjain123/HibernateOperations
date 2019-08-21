package com.sai.om.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sai.om.HibernateUtil4;
import com.sai.om.dto.MobileDTO;

public class MobileDAO {
	
	public MobileDAO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public void SaveMobile(MobileDTO MobileDTO)
	{
		SessionFactory factory=HibernateUtil4.getFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(MobileDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	public void updateMobile(MobileDTO MobileDTO)
	{
		SessionFactory factory=HibernateUtil4.getFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(MobileDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	public void deleteMobile(MobileDTO MobileDTO)
	{
		SessionFactory factory=HibernateUtil4.getFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(MobileDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	public void mergeMobile(MobileDTO MobileDTO)
	{
		SessionFactory factory=HibernateUtil4.getFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.merge(MobileDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	public MobileDTO getMobile(MobileDTO MobileDTO)
	{
		SessionFactory factory=HibernateUtil4.getFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
	MobileDTO dto=session.get(MobileDTO.getClass(),2);
		transaction.commit();
		session.close();
		factory.close();
		return dto;
	}
}
