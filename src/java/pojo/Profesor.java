package pojo;
// Generated Oct 18, 2011 12:37:12 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Profesor generated by hbm2java
 */
public class Profesor  implements java.io.Serializable {


     private String cedula;
     private Usuario usuario;
     private String fechaingreso;
     private String cargo;
     private Boolean borrado;
     private Set<Profesormateria> profesormaterias = new HashSet<Profesormateria>(0);
     private Set<Clase> clases = new HashSet<Clase>(0);

    public Profesor() {
    }

	
    public Profesor(String usuario) {
        this.cedula = usuario;
        
    }
    public Profesor(String cedula,Usuario usuario, String fechaingreso, String cargo, Boolean borrado, Set<Profesormateria> profesormaterias, Set<Clase> clases) {
       this.cedula = cedula;
       this.usuario=usuario;
       this.fechaingreso = fechaingreso;
       this.cargo = cargo;
       this.borrado = borrado;
       this.profesormaterias = profesormaterias;
       this.clases = clases;
    }
   
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    public String getFechaingreso() {
        return this.fechaingreso;
    }
    
    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Boolean getBorrado() {
        return this.borrado;
    }
    
    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }
    public Set<Profesormateria> getProfesormaterias() {
        return this.profesormaterias;
    }
    
    public void setProfesormaterias(Set<Profesormateria> profesormaterias) {
        this.profesormaterias = profesormaterias;
    }
    public Set<Clase> getClases() {
        return this.clases;
    }
    
    public void setClases(Set<Clase> clases) {
        this.clases = clases;
    }




}


