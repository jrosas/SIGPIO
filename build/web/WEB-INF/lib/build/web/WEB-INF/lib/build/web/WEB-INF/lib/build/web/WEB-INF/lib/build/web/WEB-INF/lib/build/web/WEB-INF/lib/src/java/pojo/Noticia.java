package pojo;
// Generated Oct 18, 2011 12:37:12 AM by Hibernate Tools 3.2.1.GA



/**
 * Noticia generated by hbm2java
 */
public class Noticia  implements java.io.Serializable {


     private int idnoticia;
     private String titulo;
     private String contenido;
     private String imagen;

    public Noticia() {
    }

	
    public Noticia(int idnoticia) {
        this.idnoticia = idnoticia;
    }
    public Noticia(int idnoticia, String titulo, String contenido, String imagen) {
       this.idnoticia = idnoticia;
       this.titulo = titulo;
       this.contenido = contenido;
       this.imagen = imagen;
    }
   
    public int getIdnoticia() {
        return this.idnoticia;
    }
    
    public void setIdnoticia(int idnoticia) {
        this.idnoticia = idnoticia;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String getImagen() {
        return this.imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }




}


