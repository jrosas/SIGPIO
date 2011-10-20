package pojo;
// Generated Oct 16, 2011 2:22:38 PM by Hibernate Tools 3.2.1.GA



/**
 * ProfesorMateria generated by hbm2java
 */
public class ProfesorMateria  implements java.io.Serializable {


     private String cedula;
     private Catedra catedra;
     private Profesor profesor;
     private Boolean borrado;

    public ProfesorMateria() {
    }

	
    public ProfesorMateria(String cedula, Profesor profesor) {
        this.cedula = cedula;
        this.profesor = profesor;
    }
    public ProfesorMateria(String cedula, Catedra catedra, Profesor profesor, Boolean borrado) {
       this.cedula = cedula;
       this.catedra = catedra;
       this.profesor = profesor;
       this.borrado = borrado;
    }
   
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Catedra getCatedra() {
        return this.catedra;
    }
    
    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }
    public Profesor getProfesor() {
        return this.profesor;
    }
    
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public Boolean getBorrado() {
        return this.borrado;
    }
    
    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }




}


