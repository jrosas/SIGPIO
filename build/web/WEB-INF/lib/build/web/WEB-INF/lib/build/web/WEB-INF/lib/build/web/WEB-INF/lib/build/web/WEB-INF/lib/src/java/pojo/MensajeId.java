package pojo;
// Generated Oct 16, 2011 2:22:38 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * MensajeId generated by hbm2java
 */
public class MensajeId  implements java.io.Serializable {


     private Date fecha;
     private String emisor;

    public MensajeId() {
    }

    public MensajeId(Date fecha, String emisor) {
       this.fecha = fecha;
       this.emisor = emisor;
    }
   
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getEmisor() {
        return this.emisor;
    }
    
    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MensajeId) ) return false;
		 MensajeId castOther = ( MensajeId ) other; 
         
		 return ( (this.getFecha()==castOther.getFecha()) || ( this.getFecha()!=null && castOther.getFecha()!=null && this.getFecha().equals(castOther.getFecha()) ) )
 && ( (this.getEmisor()==castOther.getEmisor()) || ( this.getEmisor()!=null && castOther.getEmisor()!=null && this.getEmisor().equals(castOther.getEmisor()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getFecha() == null ? 0 : this.getFecha().hashCode() );
         result = 37 * result + ( getEmisor() == null ? 0 : this.getEmisor().hashCode() );
         return result;
   }   


}


