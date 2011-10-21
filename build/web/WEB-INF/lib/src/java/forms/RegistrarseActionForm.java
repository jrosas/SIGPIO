/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;
import org.apache.struts.validator.ValidatorForm;

/**
 *
 * @author nelly
 */
public class RegistrarseActionForm extends ValidatorForm {
    
    private String nombres;
    private String apellidos;
    private String cedula;
    private String email;
    private String telefonos;
    private String clave;

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getClave() {
        return clave;
    }

    public String getEmail() {
        return email;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTelefonos() {
        return telefonos;
    }
    
    
    
    /**
     *
     */
    public RegistrarseActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }


}
