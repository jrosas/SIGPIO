/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author nelly
 */
public class RegistrarseAspRepActionForm extends org.apache.struts.action.ActionForm {
    
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

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNombres() == null || getNombres().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
