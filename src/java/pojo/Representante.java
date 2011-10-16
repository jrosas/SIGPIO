package pojo;
// Generated Oct 16, 2011 2:22:38 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Representante generated by hbm2java
 */
public class Representante  implements java.io.Serializable {


     private String cedula;
     private String nombres;
     private String apellidos;
     private String lugarTrabajo;
     private String telefonos;
     private String direccion;
     private String gradoEstudio;
     private Boolean borrado;
     private Set<EstudianteRepresentante> estudianteRepresentantes = new HashSet<EstudianteRepresentante>(0);

    public Representante() {
    }

	
    public Representante(String cedula) {
        this.cedula = cedula;
    }
    public Representante(String cedula, String nombres, String apellidos, String lugarTrabajo, String telefonos, String direccion, String gradoEstudio, Boolean borrado, Set<EstudianteRepresentante> estudianteRepresentantes) {
       this.cedula = cedula;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.lugarTrabajo = lugarTrabajo;
       this.telefonos = telefonos;
       this.direccion = direccion;
       this.gradoEstudio = gradoEstudio;
       this.borrado = borrado;
       this.estudianteRepresentantes = estudianteRepresentantes;
    }
   
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getLugarTrabajo() {
        return this.lugarTrabajo;
    }
    
    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }
    public String getTelefonos() {
        return this.telefonos;
    }
    
    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getGradoEstudio() {
        return this.gradoEstudio;
    }
    
    public void setGradoEstudio(String gradoEstudio) {
        this.gradoEstudio = gradoEstudio;
    }
    public Boolean getBorrado() {
        return this.borrado;
    }
    
    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }
    public Set<EstudianteRepresentante> getEstudianteRepresentantes() {
        return this.estudianteRepresentantes;
    }
    
    public void setEstudianteRepresentantes(Set<EstudianteRepresentante> estudianteRepresentantes) {
        this.estudianteRepresentantes = estudianteRepresentantes;
    }




}

