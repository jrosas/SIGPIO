package pojo;
// Generated Oct 16, 2011 2:22:38 PM by Hibernate Tools 3.2.1.GA



/**
 * EstudianteRepresentante generated by hbm2java
 */
public class EstudianteRepresentante  implements java.io.Serializable {


     private EstudianteRepresentanteId id;
     private Representante representante;
     private Aspirante aspirante;
     private Boolean borrado;

    public EstudianteRepresentante() {
    }

	
    public EstudianteRepresentante(EstudianteRepresentanteId id, Representante representante, Aspirante aspirante) {
        this.id = id;
        this.representante = representante;
        this.aspirante = aspirante;
    }
    public EstudianteRepresentante(EstudianteRepresentanteId id, Representante representante, Aspirante aspirante, Boolean borrado) {
       this.id = id;
       this.representante = representante;
       this.aspirante = aspirante;
       this.borrado = borrado;
    }
   
    public EstudianteRepresentanteId getId() {
        return this.id;
    }
    
    public void setId(EstudianteRepresentanteId id) {
        this.id = id;
    }
    public Representante getRepresentante() {
        return this.representante;
    }
    
    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }
    public Aspirante getAspirante() {
        return this.aspirante;
    }
    
    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }
    public Boolean getBorrado() {
        return this.borrado;
    }
    
    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }




}


