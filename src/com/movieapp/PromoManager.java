package com.movieapp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class PromoManager {

    @SuppressWarnings("unchecked")
	public List<PromoInfo> getAllPromo() {
	    	
    	Session session = null;
		session = HibernateUtil.getSession();

	          List<PromoInfo> promo = new ArrayList<PromoInfo>();
	           
	            try {
	            	promo = session.createQuery("from PromoInfo").list();
	            } catch (RuntimeException e) {
	                e.printStackTrace();
	            } finally {
	                session.flush();
	                session.close();
	            }
	            return promo;
	        }
}
