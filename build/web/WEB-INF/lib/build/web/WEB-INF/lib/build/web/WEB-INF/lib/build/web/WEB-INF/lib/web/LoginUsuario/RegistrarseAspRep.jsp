<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
<title> Registrar Representante</title>
</head>
<body>
<h1>Registrar Representante</h1>
<html:errors/>
<html:javascript formName="RegistrarseActionForm"/>

<table>
    <html:form action="RegistrarseAspRep">
<tr>
<td>
<bean:message key="RegistrarseAspRep.nombres" />*
</td>
<td>
<html:text property="nombres" />
</td>
</tr>

<tr>
<td>
<bean:message key="RegistrarseAspRep.apellidos" />*
</td>
<td>
<html:text property="apellidos" />
</td>
</tr>




<tr>
<td>
<bean:message key="RegistrarseAspRep.cedula" />*
</td>
<td>
<html:text property="cedula" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAspRep.gradoEstudio" />*
</td>
<td>
<html:text property="gradoEstudio" />
</td>
</tr>

<tr>
<td>
<bean:message key="RegistrarseAspRep.lugarTrabajo" />*
</td>
<td>
<html:text property="lugarTrabajo" />
</td>
</tr>


<tr>
<td>
<bean:message key="RegistrarseAspRep.telefonos" />*
</td>
<td>
<html:text property="telefonos" />
</td>
</tr>

<tr>
<td>
<bean:message key="RegistrarseAspRep.direccion" />*
</td>
<td>
<html:text property="direccion" />
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