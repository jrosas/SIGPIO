package pojo;
// Generated Oct 18, 2011 12:37:12 AM by Hibernate Tools 3.2.1.GA



/**
 * Personalpio generated by hbm2java
 */
public class Personalpio  implements java.io.Serializable {


     
     private String cedula;
     private Usuario usuario;
     private String cargo;
     private Boolean borrado;

    public Personalpio() {
    }

	
    public Personalpio(String usuario) {
        this.cedula = usuario;
        
    }
    public Personalpio(String cedula, Usuario usuario, String cargo, Boolean borrado) {
       this.cedula = cedula;
       this.usuario=usuario;
       this.cargo = cargo;
       this.borrado = borrado;
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




}


