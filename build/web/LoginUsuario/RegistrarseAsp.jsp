<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
<title> Registrar Estudiante</title>
</head>
<body>
<h1>Registrar Estudiante</h1>
<html:errors/>

<table>
    <html:form action="RegistrarseAsp">
<tr>
<td>
<bean:message key="RegistrarseAsp.nombres" />*
</td>
<td>
<html:text property="nombres" />
</td>
</tr>

<tr>
<td>
<bean:message key="RegistrarseAsp.apellidos" />*
</td>
<td>
<html:text property="apellidos" />
</td>
</tr>




<tr>
<td>
<bean:message key="RegistrarseAsp.cedula" />*
</td>
<td>
<html:text property="cedula" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAsp.email" />*
</td>
<td>
<html:text property="email" />
</td>
</tr>

<tr>
<td>
<bean:message key="RegistrarseAsp.sexo" />*
</td>
<td>
<html:text property="sexo" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAsp.telefonos" />*
</td>
<td>
<html:text property="telefonos" />
</td>
</tr>

<tr>
<td>
<bean:message key="RegistrarseAsp.clave" />*
</td>
<td>
<html:text property="clave" />
</td>
</tr>

<tr>
<td>
<bean:message key="RegistrarseAsp.plantel" />*
</td>
<td>
<html:text property="plantel" />
</td>
</tr>



<tr>
<td>
<bean:message key="RegistrarseAsp.nivelIngreso" />*
</td>
<td>
<html:text property="nivelIngreso" />
</td>
</tr>

<tr>
<td>
<bean:message key="RegistrarseAsp.horasTrabajo" />*
</td>
<td>
<html:text property="horasTrabajo" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAsp.beca" />*
</td>
<td>
<html:text property="beca" />
</td>
</tr>

<tr>
<td>
<bean:message key="RegistrarseAsp.hermanosUniv" />*
</td>
<td>
<html:text property="hermanosUniv" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAsp.servicios" />*
</td>
<td>
<html:text property="servicios" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAsp.actividadExtr" />*
</td>
<td>
<html:text property="actividadExtr" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAsp.materiasFalla" />*
</td>
<td>
<html:text property="materiasFalla" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAsp.hermanosUniv" />*
</td>
<td>
<html:text property="hermanosUniv" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAsp.dependenciaEco" />*
</td>
<td>
<html:text property="dependenciaEco" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAsp.promedio" />*
</td>
<td>
<html:text property="promedio" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAsp.habitosEstudio" />*
</td>
<td>
<html:text property="habitosEstudio" />
</td>
</tr>





<tr>
<td>
<html:submit />
</td>
<td>
<html:cancel />
</td>
</tr>

    </html:form>
</table>
</body>
</html>