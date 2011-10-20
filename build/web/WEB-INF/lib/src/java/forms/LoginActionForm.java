/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;



/**
 *
 * @author nelly
 */
public class LoginActionForm extends ValidatorForm {

    private String email;
    private String clave;
    
    
    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public String getEmail() {
        return email;
    }
    
    

    

    /**
     *
     */
    public LoginActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    
    @Override
public void reset(ActionMapping mapping, HttpServletRequest request) {
    email=null;
    clave=null;
}


    

}
