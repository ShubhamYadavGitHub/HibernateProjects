package com.oehm4.basics.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oehm4.basics.dto.AccountDTO;



public class AccountDAO {

public 	void saveAccountDetails(AccountDTO accountDTO)
{
	
	  Configuration configuration = new Configuration();
	  configuration.configure();
	  configuration.addAnnotatedClass(AccountDTO.class );
	  
	  SessionFactory sessionFactory = configuration.buildSessionFactory();
	         Session session = sessionFactory.openSession();
          
	         Transaction transaction = session.beginTransaction();
	         session.save(accountDTO);
	         
	         transaction.commit();
	         

}

}
