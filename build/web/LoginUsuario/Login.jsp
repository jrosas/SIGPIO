<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
<title> Validar Usuario</title>
</head>
<body>
<h1>Validar Usuario</h1>
<html:errors/>
<html:javascript formName="LoginActionForm"/>

<table>
    <html:form action="Login">
<tr>
<td>
<bean:message key="Login.email" />*
</td>
<td>
<html:text property="email" />
</td>
</tr>

<tr>
<td>
<bean:message key="Login.clave" />*
</td>


<td>
<html:text property="clave" />
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
