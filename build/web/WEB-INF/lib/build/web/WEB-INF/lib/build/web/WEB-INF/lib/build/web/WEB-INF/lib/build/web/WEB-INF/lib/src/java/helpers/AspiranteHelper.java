/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import org.hibernate.Query;
import hibernate.HibernateUtil;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import pojo.Aspirante;
import pojo.Plantel;
import pojo.Usuario;

/**
 *
 * @author nelly
 */
public class AspiranteHelper {
    
    Session session = null;

    public AspiranteHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

   
   
    public List ListarUsuarios(String nombre, String apellido, String cedula, String email) {
        
        List<Usuario> usuarioList = null;
       
        try{
           
            org.hibernate.Transaction tx = session.beginTransaction();       
            Query q = session.createQuery("from Usuario as usuario where usuario.nombres like '%"+nombre+"%' and usuario.apellidos like '%"+apellido+"%' and usuario.cedula like '%"+cedula+"%' and usuario.email like '%"+email+"%'");
            usuarioList = (List<Usuario>) q.list();
            
            
        } catch(Exception e) {
            System.out.print("uno");
        }
      
     
        return usuarioList;
    }
    
    public void guardar (Aspirante asp){
        
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(asp);
     
    }
    
    
}
