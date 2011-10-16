package pojo;
// Generated Oct 16, 2011 2:22:38 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Preinscrito generated by hbm2java
 */
public class Preinscrito  implements java.io.Serializable {


     private String cedula;
     private Aspirante aspirante;
     private String numeroPreins;
     private Date fechaPreins;
     private Boolean borrado;
     private Set<PreinscritoCarrera> preinscritoCarreras = new HashSet<PreinscritoCarrera>(0);
     private Set<Estudiante> estudiantes = new HashSet<Estudiante>(0);
     private Set<ExamenAsisten> examenAsistens = new HashSet<ExamenAsisten>(0);

    public Preinscrito() {
    }

	
    public Preinscrito(String cedula, Aspirante aspirante) {
        this.cedula = cedula;
        this.aspirante = aspirante;
    }
    public Preinscrito(String cedula, Aspirante aspirante, String numeroPreins, Date fechaPreins, Boolean borrado, Set<PreinscritoCarrera> preinscritoCarreras, Set<Estudiante> estudiantes, Set<ExamenAsisten> examenAsistens) {
       this.cedula = cedula;
       this.aspirante = aspirante;
       this.numeroPreins = numeroPreins;
       this.fechaPreins = fechaPreins;
       this.borrado = borrado;
       this.preinscritoCarreras = preinscritoCarreras;
       this.estudiantes = estudiantes;
       this.examenAsistens = examenAsistens;
    }
   
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Aspirante getAspirante() {
        return this.aspirante;
    }
    
    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }
    public String getNumeroPreins() {
        return this.numeroPreins;
    }
    
    public void setNumeroPreins(String numeroPreins) {
        this.numeroPreins = numeroPreins;
    }
    public Date getFechaPreins() {
        return this.fechaPreins;
    }
    
    public void setFechaPreins(Date fechaPreins) {
        this.fechaPreins = fechaPreins;
    }
    public Boolean getBorrado() {
        return this.borrado;
    }
    
    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }
    public Set<PreinscritoCarrera> getPreinscritoCarreras() {
        return this.preinscritoCarreras;
    }
    
    public void setPreinscritoCarreras(Set<PreinscritoCarrera> preinscritoCarreras) {
        this.preinscritoCarreras = preinscritoCarreras;
    }
    public Set<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }
    
    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public Set<ExamenAsisten> getExamenAsistens() {
        return this.examenAsistens;
    }
    
    public void setExamenAsistens(Set<ExamenAsisten> examenAsistens) {
        this.examenAsistens = examenAsistens;
    }




}

