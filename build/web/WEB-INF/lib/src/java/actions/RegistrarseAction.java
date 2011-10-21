/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;



import forms.RegistrarseActionForm;
import helpers.UsuarioHelper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pojo.Usuario;

/**
 *
 * @author nelly
 */
public class RegistrarseAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
  private static final String SUCCESS = "success";
  private static final String FAILURE = "fallo";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
   

    @Override
      public ActionForward execute(
        ActionMapping mapping,
        ActionForm form,
        HttpServletRequest request,
        HttpServletResponse response)
           
            
            throws Exception{
            
            HttpSession session = request.getSession();
            RegistrarseActionForm beanForm = (RegistrarseActionForm) form;
             
            String email=beanForm.getEmail();
            String apellidos=beanForm.getApellidos();
            String cedula=beanForm.getCedula();
            String telefonos=beanForm.getTelefonos();
            String clave=beanForm.getClave();
            String nombres=beanForm.getNombres();
            UsuarioHelper helper = new UsuarioHelper();
           
            Usuario usr=helper.getUsuarioByemaced(email,cedula);
            
            if(usr==null){
                
                helper.guardar(nombres, apellidos, cedula, email, telefonos, clave,true);
                return mapping.findForward(SUCCESS);
            }
            else{
                return mapping.findForward(FAILURE);
            }
            
                          
            }

}
