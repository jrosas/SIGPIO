package pojo;
// Generated Oct 18, 2011 12:37:12 AM by Hibernate Tools 3.2.1.GA



/**
 * Proveedoresevento generated by hbm2java
 */
public class Proveedoresevento  implements java.io.Serializable {


     private int id;
     private Proveedor proveedor;
     private Evento evento;
     private boolean borrado;

    public Proveedoresevento() {
    }

    public Proveedoresevento(int id, Proveedor proveedor, Evento evento, boolean borrado) {
       this.id = id;
       this.proveedor = proveedor;
       this.evento = evento;
       this.borrado = borrado;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public Evento getEvento() {
        return this.evento;
    }
    
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public boolean isBorrado() {
        return this.borrado;
    }
    
    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }




}

