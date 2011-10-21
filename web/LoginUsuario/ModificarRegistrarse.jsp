<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html:errors/>
<html:javascript formName="ModificarRegistrarseActionForm"/>
<table>
    <html:form action="ModificarRegistrarse">
        <tr>
            <td>
                <bean:message key="ModificarRegistrarse.nombres" />*
            </td>
            <td>
                <html:text property="nombres" />
            </td>
        </tr>

        <tr>
            <td>
                <bean:message key="ModificarRegistrarse.apellidos" />*
            </td>
            <td>
                <html:text property="apellidos" />
            </td>
        </tr>

        <tr>
            <td>
                <bean:message key="ModificarRegistrarse.cedula" />*
            </td>
            <td>
                <html:text property="cedula" />
            </td>
        </tr>


        <tr>
            <td>
                <bean:message key="ModificarRegistrarse.email" />*
            </td>
            <td>
                <html:text property="email" />
            </td>
        </tr>


        <tr>
            <td>
                <bean:message key="ModificarRegistrarse.telefonos" />*
            </td>
            <td>
                <html:text property="telefonos" />
            </td>
        </tr>
        <tr>
            <td>
                <bean:message key="ModificarRegistrarse.clave" />*
            </td>
            <td>
                <html:text property="clave" />
            </td>
        </tr>
        <tr>
            <td>
            </td>
            <td>
                <html:submit /><html:cancel />
            </td>
        </tr>
    </html:form>