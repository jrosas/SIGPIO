package pojo;
// Generated Oct 16, 2011 2:22:38 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Plantel generated by hbm2java
 */
public class Plantel  implements java.io.Serializable {


     private String rif;
     private String nombre;
     private String distrito;
     private String tipo;
     private String telefonos;
     private String direccion;
     private String correo;
     private String coordinadorPio;
     private String director;
     private String menciones;
     private String materiasFalla;
     private String programasRemit;
     private String danosPlanta;
     private Integer matricula;
     private Integer casosEmbarazo;
     private Boolean asistioCharla;
     private Boolean orientacionFam;
     private Boolean orientacionInd;
     private Boolean borrado;
     private Set<ViolenciaPlantel> violenciaPlantels = new HashSet<ViolenciaPlantel>(0);
     private Set<Aspirante> aspirantes = new HashSet<Aspirante>(0);
     private Set<CharlaPlantel> charlaPlantels = new HashSet<CharlaPlantel>(0);

    public Plantel() {
    }

	
    public Plantel(String rif) {
        this.rif = rif;
    }
    public Plantel(String rif, String nombre, String distrito, String tipo, String telefonos, String direccion, String correo, String coordinadorPio, String director, String menciones, String materiasFalla, String programasRemit, String danosPlanta, Integer matricula, Integer casosEmbarazo, Boolean asistioCharla, Boolean orientacionFam, Boolean orientacionInd, Boolean borrado, Set<ViolenciaPlantel> violenciaPlantels, Set<Aspirante> aspirantes, Set<CharlaPlantel> charlaPlantels) {
       this.rif = rif;
       this.nombre = nombre;
       this.distrito = distrito;
       this.tipo = tipo;
       this.telefonos = telefonos;
       this.direccion = direccion;
       this.correo = correo;
       this.coordinadorPio = coordinadorPio;
       this.director = director;
       this.menciones = menciones;
       this.materiasFalla = materiasFalla;
       this.programasRemit = programasRemit;
       this.danosPlanta = danosPlanta;
       this.matricula = matricula;
       this.casosEmbarazo = casosEmbarazo;
       this.asistioCharla = asistioCharla;
       this.orientacionFam = orientacionFam;
       this.orientacionInd = orientacionInd;
       this.borrado = borrado;
       this.violenciaPlantels = violenciaPlantels;
       this.aspirantes = aspirantes;
       this.charlaPlantels = charlaPlantels;
    }
   
    public String getRif() {
        return this.rif;
    }
    
    public void setRif(String rif) {
        this.rif = rif;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDistrito() {
        return this.distrito;
    }
    
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTelefonos() {
        return this.telefonos;
    }
    
    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCoordinadorPio() {
        return this.coordinadorPio;
    }
    
    public void setCoordinadorPio(String coordinadorPio) {
        this.coordinadorPio = coordinadorPio;
    }
    public String getDirector() {
        return this.director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    public String getMenciones() {
        return this.menciones;
    }
    
    public void setMenciones(String menciones) {
        this.menciones = menciones;
    }
    public String getMateriasFalla() {
        return this.materiasFalla;
    }
    
    public void setMateriasFalla(String materiasFalla) {
        this.materiasFalla = materiasFalla;
    }
    public String getProgramasRemit() {
        return this.programasRemit;
    }
    
    public void setProgramasRemit(String programasRemit) {
        this.programasRemit = programasRemit;
    }
    public String getDanosPlanta() {
        return this.danosPlanta;
    }
    
    public void setDanosPlanta(String danosPlanta) {
        this.danosPlanta = danosPlanta;
    }
    public Integer getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    public Integer getCasosEmbarazo() {
        return this.casosEmbarazo;
    }
    
    public void setCasosEmbarazo(Integer casosEmbarazo) {
        this.casosEmbarazo = casosEmbarazo;
    }
    public Boolean getAsistioCharla() {
        return this.asistioCharla;
    }
    
    public void setAsistioCharla(Boolean asistioCharla) {
        this.asistioCharla = asistioCharla;
    }
    public Boolean getOrientacionFam() {
        return this.orientacionFam;
    }
    
    public void setOrientacionFam(Boolean orientacionFam) {
        this.orientacionFam = orientacionFam;
    }
    public Boolean getOrientacionInd() {
        return this.orientacionInd;
    }
    
    public void setOrientacionInd(Boolean orientacionInd) {
        this.orientacionInd = orientacionInd;
    }
    public Boolean getBorrado() {
        return this.borrado;
    }
    
    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }
    public Set<ViolenciaPlantel> getViolenciaPlantels() {
        return this.violenciaPlantels;
    }
    
    public void setViolenciaPlantels(Set<ViolenciaPlantel> violenciaPlantels) {
        this.violenciaPlantels = violenciaPlantels;
    }
    public Set<Aspirante> getAspirantes() {
        return this.aspirantes;
    }
    
    public void setAspirantes(Set<Aspirante> aspirantes) {
        this.aspirantes = aspirantes;
    }
    public Set<CharlaPlantel> getCharlaPlantels() {
        return this.charlaPlantels;
    }
    
    public void setCharlaPlantels(Set<CharlaPlantel> charlaPlantels) {
        this.charlaPlantels = charlaPlantels;
    }




}


