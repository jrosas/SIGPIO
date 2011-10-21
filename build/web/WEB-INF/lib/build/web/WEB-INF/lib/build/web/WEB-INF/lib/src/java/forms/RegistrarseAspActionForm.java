/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;


import java.math.BigDecimal;
import org.apache.struts.validator.ValidatorForm;

/**
 *
 * @author nelly
 */
public class RegistrarseAspActionForm extends ValidatorForm {
    
    private String nombres;
    private String apellidos;
    private String cedula;
    private String email;
    private String telefonos;
    private String clave;
    private String plantel;
    private String sexo;
    private String nivelIngreso;
    private int horasTrabajo;
    private String beca;
    private int hermanosUniv;
    private String servicios;
    private String actividadExtr;
    private String materiasFalla;
    private String dependenciaEco;
    private String habitosEstudio;
    private BigDecimal promedio;
    private String repnombres;
    private String repapellidos;
    private String repcedula;
    private String replugarTrabajo;
    private String reptelefonos;
    private String repgradoEstudio;
    private String repdireccion;

    public void setRepapellidos(String repapellidos) {
        this.repapellidos = repapellidos;
    }

    public void setRepcedula(String repcedula) {
        this.repcedula = repcedula;
    }

    public void setRepdireccion(String repdireccion) {
        this.repdireccion = repdireccion;
    }

    public void setRepgradoEstudio(String repgradoEstudio) {
        this.repgradoEstudio = repgradoEstudio;
    }

    public void setReplugarTrabajo(String replugarTrabajo) {
        this.replugarTrabajo = replugarTrabajo;
    }

    public void setRepnombres(String repnombres) {
        this.repnombres = repnombres;
    }

    public void setReptelefonos(String reptelefonos) {
        this.reptelefonos = reptelefonos;
    }

    public String getRepapellidos() {
        return repapellidos;
    }

    public String getRepcedula() {
        return repcedula;
    }

    public String getRepdireccion() {
        return repdireccion;
    }

    public String getRepgradoEstudio() {
        return repgradoEstudio;
    }

    public String getReplugarTrabajo() {
        return replugarTrabajo;
    }

    public String getRepnombres() {
        return repnombres;
    }

    public String getReptelefonos() {
        return reptelefonos;
    }

    
    public String getSexo() {
        return sexo;
    }

    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    public String getActividadExtr() {
        return actividadExtr;
    }

    public String getBeca() {
        return beca;
    }

    public String getDependenciaEco() {
        return dependenciaEco;
    }

    public String getHabitosEstudio() {
        return habitosEstudio;
    }

    public int getHermanosUniv() {
        return hermanosUniv;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public String getMateriasFalla() {
        return materiasFalla;
    }

    public String getNivelIngreso() {
        return nivelIngreso;
    }

    public String getPlantel() {
        return plantel;
    }

    public BigDecimal getPromedio() {
        return promedio;
    }

    public String getServicios() {
        return servicios;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setActividadExtr(String actividadExtr) {
        this.actividadExtr = actividadExtr;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public void setDependenciaEco(String dependenciaEco) {
        this.dependenciaEco = dependenciaEco;
    }

    public void setHabitosEstudio(String habitosEstudio) {
        this.habitosEstudio = habitosEstudio;
    }

    public void setHermanosUniv(int hermanosUniv) {
        this.hermanosUniv = hermanosUniv;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public void setMateriasFalla(String materiasFalla) {
        this.materiasFalla = materiasFalla;
    }

    public void setNivelIngreso(String nivelIngreso) {
        this.nivelIngreso = nivelIngreso;
    }

    public void setPlantel(String plantel) {
        this.plantel = plantel;
    }

    public void setPromedio(BigDecimal promedio) {
        this.promedio = promedio;
    }


    public void setServicios(String servicios) {
        this.servicios = servicios;
    }
    
    
    
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


    /**
     *
     */
    public RegistrarseAspActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    
}
