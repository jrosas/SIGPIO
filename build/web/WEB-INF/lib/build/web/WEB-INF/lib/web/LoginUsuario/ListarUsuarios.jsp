<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<h1> Listar Usuarios</h1>
 
<logic:iterate name="listausuario" id="listausuarioId">
<p>
	List Users <bean:write name="listausuarioId" property="nombres"/> , 
                   <bean:write name="listausuarioId" property="clave"/>
</p>
</logic:iterate>
