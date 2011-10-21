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
public class RegistrarseAspRepActionForm extends ValidatorForm {
    
    private String nombres;
    private String apellidos;
    private String cedula;
    private String lugarTrabajo;
    private String telefonos;
    private String gradoEstudio;
    private String direccion;

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGradoEstudio(String gradoEstudio) {
        this.gradoEstudio = gradoEstudio;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
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

    public String getDireccion() {
        return direccion;
    }

    public String getGradoEstudio() {
        return gradoEstudio;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
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
    public RegistrarseAspRepActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    
}
