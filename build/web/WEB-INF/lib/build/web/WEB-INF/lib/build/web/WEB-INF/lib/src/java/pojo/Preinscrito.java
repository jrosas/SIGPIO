package pojo;
// Generated Oct 18, 2011 12:37:12 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Preinscrito generated by hbm2java
 */
public class Preinscrito  implements java.io.Serializable {


     private Aspirante cedula;
     private String numeropreins;
     private String fechapreins;
     private Boolean borrado;
     private Set<Preinscritocarrera> preinscritocarreras = new HashSet<Preinscritocarrera>(0);
     private Set<Estudiante> estudiantes = new HashSet<Estudiante>(0);
     private Set<Examenasisten> examenasistens = new HashSet<Examenasisten>(0);

    public Preinscrito() {
    }

	
    public Preinscrito(Aspirante cedula) {
        this.cedula = cedula;
        
    }
    public Preinscrito(Aspirante cedula, String numeropreins, String fechapreins, Boolean borrado, Set<Preinscritocarrera> preinscritocarreras, Set<Estudiante> estudiantes, Set<Examenasisten> examenasistens) {
       this.cedula = cedula;
       this.numeropreins = numeropreins;
       this.fechapreins = fechapreins;
       this.borrado = borrado;
       this.preinscritocarreras = preinscritocarreras;
       this.estudiantes = estudiantes;
       this.examenasistens = examenasistens;
    }
   
    public Aspirante getCedula() {
        return this.cedula;
    }
    
    public void setCedula(Aspirante cedula) {
        this.cedula = cedula;
    }
    
    public String getNumeropreins() {
        return this.numeropreins;
    }
    
    public void setNumeropreins(String numeropreins) {
        this.numeropreins = numeropreins;
    }
    public String getFechapreins() {
        return this.fechapreins;
    }
    
    public void setFechapreins(String fechapreins) {
        this.fechapreins = fechapreins;
    }
    public Boolean getBorrado() {
        return this.borrado;
    }
    
    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }
    public Set<Preinscritocarrera> getPreinscritocarreras() {
        return this.preinscritocarreras;
    }
    
    public void setPreinscritocarreras(Set<Preinscritocarrera> preinscritocarreras) {
        this.preinscritocarreras = preinscritocarreras;
    }
    
    public Set<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }
    
    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public Set<Examenasisten> getExamenasistens() {
        return this.examenasistens;
    }
    
    public void setExamenasistens(Set<Examenasisten> examenasistens) {
        this.examenasistens = examenasistens;
    }

}

