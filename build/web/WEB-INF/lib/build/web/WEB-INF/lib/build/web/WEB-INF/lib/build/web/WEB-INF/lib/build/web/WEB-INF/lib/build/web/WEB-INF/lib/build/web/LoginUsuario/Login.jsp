<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html:errors/>
<html:javascript formName="LoginActionForm"/>
<h2>Iniciar Sesión</h2>
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
                <html:password
                    property="clave" />
            </td>
        </tr>

        <tr>
            <td>
            </td>
            <td>
                <html:submit />
                <html:cancel />
            </td>
        </tr>

    </html:form>
</table>
