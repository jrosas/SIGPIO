package pojo;
// Generated Oct 16, 2011 2:22:38 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * CharlaPlantelId generated by hbm2java
 */
public class CharlaPlantelId  implements java.io.Serializable {


     private String plantel;
     private String estudiante;
     private Date fecha;

    public CharlaPlantelId() {
    }

    public CharlaPlantelId(String plantel, String estudiante, Date fecha) {
       this.plantel = plantel;
       this.estudiante = estudiante;
       this.fecha = fecha;
    }
   
    public String getPlantel() {
        return this.plantel;
    }
    
    public void setPlantel(String plantel) {
        this.plantel = plantel;
    }
    public String getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CharlaPlantelId) ) return false;
		 CharlaPlantelId castOther = ( CharlaPlantelId ) other; 
         
		 return ( (this.getPlantel()==castOther.getPlantel()) || ( this.getPlantel()!=null && castOther.getPlantel()!=null && this.getPlantel().equals(castOther.getPlantel()) ) )
 && ( (this.getEstudiante()==castOther.getEstudiante()) || ( this.getEstudiante()!=null && castOther.getEstudiante()!=null && this.getEstudiante().equals(castOther.getEstudiante()) ) )
 && ( (this.getFecha()==castOther.getFecha()) || ( this.getFecha()!=null && castOther.getFecha()!=null && this.getFecha().equals(castOther.getFecha()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPlantel() == null ? 0 : this.getPlantel().hashCode() );
         result = 37 * result + ( getEstudiante() == null ? 0 : this.getEstudiante().hashCode() );
         result = 37 * result + ( getFecha() == null ? 0 : this.getFecha().hashCode() );
         return result;
   }   


}


