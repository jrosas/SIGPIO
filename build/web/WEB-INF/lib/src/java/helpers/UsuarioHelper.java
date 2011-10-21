/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import org.hibernate.Query;
import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import pojo.Usuario;

/**
 *
 * @author nelly
 */
public class UsuarioHelper {
    
    Session session = null;

    public UsuarioHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

   
   public Usuario getUsuarioByemail(String email){

    Usuario usuario = null;

    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Usuario as usuario where usuario.email='" + email +"'");
        usuario = (Usuario) q.uniqueResult();
        
    } catch (Exception e) {
        System.out.print("nada");
    }

    return usuario;
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
    
}
