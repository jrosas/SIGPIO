<%-- 
    Document   : common-layout
    Created on : Oct 16, 2011, 5:21:17 PM
    Author     : jrosas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html>
    <head>
        <title> Sistema Integral de Gestion del Programa de Igualdad de Oportunidades</title>
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/SIGPIO/media/css/estilo.css" />
        <meta HTTP-EQUIV="Pragma" CONTENT="no-cache" />
    </head>
    <body>
        <tiles:insert attribute="header"/>
<div id="contenedor">
      <div id="cuerpo">
        <tiles:insert attribute="body"/> 
      </div>
</div>
        <tiles:insert attribute="footer"/> 
    </body>
</html>