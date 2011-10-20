/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import forms.BuscarUsuarioActionForm;
import helpers.UsuarioHelper;
import java.util.ArrayList;
import java.util.List;
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
public class BuscarUsuarioAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "iniciabusqueda";

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
            
            BuscarUsuarioActionForm beanForm = (BuscarUsuarioActionForm) form;
           
          
            UsuarioHelper helper = new UsuarioHelper();
            List<Usuario> listausuario = new ArrayList<Usuario>();
            listausuario=helper.ListarUsuarios(beanForm.getNombres(),beanForm.getApellidos(), beanForm.getCedula(), beanForm.getEmail());
            request.setAttribute("listausuario", listausuario);
        
                 return mapping.findForward(SUCCESS);
            
        }
}
