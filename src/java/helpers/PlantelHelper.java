/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import org.hibernate.Query;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import pojo.Plantel;

/**
 *
 * @author nelly
 */

public class PlantelHelper {
    
    Session session = null;

    public PlantelHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public Plantel getPlantelBynombre(String nombre){

    Plantel plantel = null;

    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Plantel as plantel where plantel.nombre='" + nombre +"'");
        plantel = (Plantel) q.uniqueResult();
        
    } catch (Exception e) {
        System.out.print("nada");
    }

    return plantel;
    }
    
}