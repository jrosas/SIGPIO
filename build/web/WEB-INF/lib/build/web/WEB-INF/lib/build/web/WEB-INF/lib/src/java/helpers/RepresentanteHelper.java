/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import org.hibernate.Query;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import pojo.Plantel;
import pojo.Representante;

/**
 *
 * @author nelly
 */

public class RepresentanteHelper {
    
    Session session = null;

    public RepresentanteHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public void guardar (Representante repre){
        
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(repre);
     
    }
    
}