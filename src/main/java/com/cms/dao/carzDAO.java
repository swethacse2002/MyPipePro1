package com.cms.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cms.bean.carz;
import com.cms.util.DBUtil;



public class carzDAO {
	
	Transaction transaction;
	Session session;

	public void Register(carz bean) {

		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.save(bean);
		transaction.commit();
		session.close();
	}


}
