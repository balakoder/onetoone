package com.bala.onetoone;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * @bala
 *
 */
public class App 
{
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Address address1 = new Address("F C Road", "Pune", "MH", "411005");
			Address address2 = new Address("J M Road", "Pune", "MH", "411004");
			Student student1 = new Student("Bala", address1);
			Student student2 = new Student("Dyana", address2);
			session.save(student1);
			session.save(student2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
 
