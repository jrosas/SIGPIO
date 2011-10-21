/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

/**
 *
 * @author nelly
 */
public class BuscarUsuarioActionForm extends org.apache.struts.action.ActionForm {
    
    private String nombres;
    private String apellidos;
    private String cedula;
    private String email;

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public String getNombres() {
        return nombres;
    }
    
    
    
    /**
     *
     */
    public BuscarUsuarioActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    
}
