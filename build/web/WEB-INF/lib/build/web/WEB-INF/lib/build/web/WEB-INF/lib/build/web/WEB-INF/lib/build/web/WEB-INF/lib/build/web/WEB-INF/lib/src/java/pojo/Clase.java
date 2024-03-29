package pojo;
// Generated Oct 18, 2011 12:37:12 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Clase generated by hbm2java
 */
public class Clase  implements java.io.Serializable {


     private int codigo;
     private Profesor profesor;
     private Aula aula;
     private Catedra catedra;
     private String dia;
     private String bloque;
     private String valida;
     private Boolean borrado;
     private Set<Claseestudiante> claseestudiantes = new HashSet<Claseestudiante>(0);

    public Clase() {
    }

	
    public Clase(int codigo) {
        this.codigo = codigo;
    }
    public Clase(int codigo, Profesor profesor, Aula aula, Catedra catedra, String dia, String bloque, String valida, Boolean borrado, Set<Claseestudiante> claseestudiantes) {
       this.codigo = codigo;
       this.profesor = profesor;
       this.aula = aula;
       this.catedra = catedra;
       this.dia = dia;
       this.bloque = bloque;
       this.valida = valida;
       this.borrado = borrado;
       this.claseestudiantes = claseestudiantes;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Profesor getProfesor() {
        return this.profesor;
    }
    
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public Aula getAula() {
        return this.aula;
    }
    
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public Catedra getCatedra() {
        return this.catedra;
    }
    
    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }
    public String getDia() {
        return this.dia;
    }
    
    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getValida() {
        return valida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }
    
    public Boolean getBorrado() {
        return this.borrado;
    }
    
    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }
    public Set<Claseestudiante> getClaseestudiantes() {
        return this.claseestudiantes;
    }
    
    public void setClaseestudiantes(Set<Claseestudiante> claseestudiantes) {
        this.claseestudiantes = claseestudiantes;
    }




}


