/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import forms.LoginActionForm;
import helpers.UsuarioHelper;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pojo.Usuario;

/**
 *
 * @author nelly
 */
public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "exito";
    private static final String FAILURE = "fail";
    

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
            LoginActionForm beanForm = (LoginActionForm) form;
            String usrname= beanForm.getEmail();
            String clave=beanForm.getClave();
            UsuarioHelper helper = new UsuarioHelper();
            Usuario usuarios = helper.getUsuarioByemail(usrname);
            
            
            if(((usuarios.getEmail()).equals(usrname)) && ((usuarios.getClave()).equals(clave))){
                 return mapping.findForward(SUCCESS);
            
            }else {
                 return mapping.findForward(FAILURE);
            }
                
            
            
        }     
      
}
