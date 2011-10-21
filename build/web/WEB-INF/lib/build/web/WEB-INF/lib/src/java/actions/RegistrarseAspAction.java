/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import forms.RegistrarseAspActionForm;
import helpers.AspiranteHelper;
import helpers.EstudianterepresentanteHelper;
import helpers.PlantelHelper;
import helpers.RepresentanteHelper;
import helpers.UsuarioHelper;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pojo.Aspirante;
import pojo.Estudianterepresentante;
import pojo.Plantel;
import pojo.Representante;
import pojo.Usuario;

/**
 *
 * @author nelly
 */
public class RegistrarseAspAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "bien";
    private static final String FAILURE = "fallas";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            
            throws Exception{
            
            //HttpSession session = request.getSession();
            //RegistrarseAspActionForm beanForm = (RegistrarseAspActionForm) form;
            
            
            //String email=beanForm.getEmail();
            //String apellidos=beanForm.getApellidos();
            //String cedula=beanForm.getCedula();
            //String telefonos=beanForm.getTelefonos();
            //String clave=beanForm.getClave();
            //String nombres=beanForm.getNombres();
            //String plantel=beanForm.getPlantel();
            //String nivelingreso=beanForm.getNivelIngreso();
            //Integer horastrabajo=beanForm.getHorasTrabajo();
            //String beca=beanForm.getBeca();
            //Integer hermanosuniv=beanForm.getHermanosUniv();
            //String servicios=beanForm.getServicios();
            //String actividadextr=beanForm.getActividadExtr();
            //String materiasfalla=beanForm.getMateriasFalla();
            //String dependenciaeco=beanForm.getDependenciaEco();
            //String habitosestudio=beanForm.getHabitosEstudio();
            //double promedio=beanForm.getPromedio();
            //String sexo=beanForm.getSexo();
            //String repnombres=beanForm.getRepnombres();
            //String repapellidos=beanForm.getRepapellidos();
            //String repcedula=beanForm.getRepcedula();
            //String replugartrabajo=beanForm.getReplugarTrabajo();
            //String reptelefonos=beanForm.getReptelefonos();
            //String repgradoestudio=beanForm.getRepgradoEstudio();
            //String repdireccion=beanForm.getRepdireccion();

     
            
            
            //UsuarioHelper helper = new UsuarioHelper();
            //PlantelHelper helperp = new PlantelHelper();
            
            //Usuario usr=helper.getUsuarioByemaced(email,cedula);
            //Plantel plan= helperp.getPlantelBynombre(plantel);
            
            //if(usr==null){
        
                //if(plan!=null){
                
                //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                //Date today = Calendar.getInstance().getTime();       
                //String rDate = df.format(today); 
                //AspiranteHelper helpera = new AspiranteHelper();
                //RepresentanteHelper helperr = new RepresentanteHelper();
                //EstudianterepresentanteHelper helperre = new EstudianterepresentanteHelper();
                
                
                //Usuario user=new Usuario(cedula,nombres,apellidos,email, clave, false,rDate,telefonos, false, null);
                //helper.guardar(nombres, apellidos, cedula, email, telefonos, clave,true);
                //Representante repre= new Representante( repcedula, repnombres, repapellidos, replugartrabajo, reptelefonos,repdireccion, repgradoestudio,false);
                //Aspirante asp=new Aspirante(user, plan, nivelingreso, horastrabajo,beca, hermanosuniv,servicios, actividadextr,materiasfalla, dependenciaeco,habitosestudio,promedio, sexo,false,null,null);
                //helperr.guardar(repre);
                //helpera.guardar(asp);
                //Estudianterepresentante estre=new Estudianterepresentante();
                //estre.setAspirante(asp);
                //estre.setRepresentante(repre);
                //estre.setBorrado(false);
                //helperre.guardar(estre);
                
                
                return mapping.findForward(SUCCESS);
                //}
                        
                //else{
                    //return mapping.findForward(FAILURE);
                //}
                
            //}
            //else{
                //return mapping.findForward(FAILURE);
            //}
            
                          
            }

}
