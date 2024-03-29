package pojo;
// Generated Oct 16, 2011 2:22:38 PM by Hibernate Tools 3.2.1.GA



/**
 * ProveedoresEventoId generated by hbm2java
 */
public class ProveedoresEventoId  implements java.io.Serializable {


     private String rif;
     private String evento;

    public ProveedoresEventoId() {
    }

    public ProveedoresEventoId(String rif, String evento) {
       this.rif = rif;
       this.evento = evento;
    }
   
    public String getRif() {
        return this.rif;
    }
    
    public void setRif(String rif) {
        this.rif = rif;
    }
    public String getEvento() {
        return this.evento;
    }
    
    public void setEvento(String evento) {
        this.evento = evento;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProveedoresEventoId) ) return false;
		 ProveedoresEventoId castOther = ( ProveedoresEventoId ) other; 
         
		 return ( (this.getRif()==castOther.getRif()) || ( this.getRif()!=null && castOther.getRif()!=null && this.getRif().equals(castOther.getRif()) ) )
 && ( (this.getEvento()==castOther.getEvento()) || ( this.getEvento()!=null && castOther.getEvento()!=null && this.getEvento().equals(castOther.getEvento()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRif() == null ? 0 : this.getRif().hashCode() );
         result = 37 * result + ( getEvento() == null ? 0 : this.getEvento().hashCode() );
         return result;
   }   


}


