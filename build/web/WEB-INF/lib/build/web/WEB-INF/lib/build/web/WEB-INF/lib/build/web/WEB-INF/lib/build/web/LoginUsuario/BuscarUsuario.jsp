<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<table>
    <html:form action="BuscarUsuario">
<tr>
<td>
<bean:message key="BuscarUsuario.nombres" />*
</td>
<td>
<html:text property="nombres" />
</td>
</tr>

<tr>
<td>
<bean:message key="BuscarUsuario.apellidos" />*
</td>
<td>
<html:text property="apellidos" />
</td>
</tr>

<tr>
<td>
<bean:message key="BuscarUsuario.cedula" />*
</td>
<td>
<html:text property="cedula" />
</td>
</tr>


<tr>
<td>
<bean:message key="BuscarUsuario.email" />*
</td>
<td>
<html:text property="email" />
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