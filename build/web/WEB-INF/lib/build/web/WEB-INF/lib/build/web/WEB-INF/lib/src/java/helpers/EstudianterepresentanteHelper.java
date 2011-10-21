/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import org.hibernate.Query;
import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import pojo.Aspirante;
import pojo.Estudianterepresentante;
import pojo.Usuario;

/**
 *
 * @author nelly
 */
public class EstudianterepresentanteHelper {
    
    Session session = null;

    public EstudianterepresentanteHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    
    public void guardar (Estudianterepresentante stre){
        
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(stre);
     
    }
    
    
}
