<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html:errors/>
<html:javascript formName="RegistrarseActionForm"/>
<table>
    <html:form action="Registrarse">
        <tr>
            <td>
                <bean:message key="Registrarse.nombres" />*
            </td>
            <td>
                <html:text property="nombres" />
            </td>
        </tr>

        <tr>
            <td>
                <bean:message key="Registrarse.apellidos" />*
            </td>
            <td>
                <html:text property="apellidos" />
            </td>
        </tr>

        <tr>
            <td>
                <bean:message key="Registrarse.cedula" />*
            </td>
            <td>
                <html:text property="cedula" />
            </td>
        </tr>


        <tr>
            <td>
                <bean:message key="Registrarse.email" />*
            </td>
            <td>
                <html:text property="email" />
            </td>
        </tr>


        <tr>
            <td>
                <bean:message key="Registrarse.telefonos" />*
            </td>
            <td>
                <html:text property="telefonos" />
            </td>
        </tr>
        <tr>
            <td>
                <bean:message key="Registrarse.clave" />*
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