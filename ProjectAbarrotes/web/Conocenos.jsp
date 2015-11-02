<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" type="text/css" href="css.css" title="style">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conocenos</title>
      
    <h1>Conocenos</h1>
         <br>
         <div id="menu">
                    <ul>
                           <c:url value="/Conocenos.jsp" var="itemDetailsURL">
                            <c:param name="itemId" value="Dev"/>
                        </c:url>
                        <c:url value="/Productos.jsp" var="itemProducto">
                            <c:param name="itemIdPro" value="DevProducto"/>
                        </c:url>
                        <c:url value="/Contacto.jsp" var="itemContacto">
                            <c:param name="itemIdCon" value="DevContacto"/>
                        </c:url>
                        <c:url value="/Acceso.jsp" var="itemAcceso">
                            <c:param name="itemIdAcc" value="DevAcceso"/>
                        </c:url>
                        <c:url value="/registro.jsp" var="itemRegistro">
                            <c:param name="itemIdReg" value="DevRegistro"/>
                        </c:url>
                        <li><a href="<c:out value="${itemDetailsURL}"/>"  class = "normalMenu">Conocenos</a></li>
                        <li><a href="<c:out value="${itemProducto}"/>"  class = "normalMenu">Productos </a></li>
                        <li><a href="<c:out value="${itemContacto}"/>"  class = "normalMenu">Contacto</a></li>
                        <li><a href="<c:out value="${itemAcceso}"/>"  class = "normalMenu">Ingresar</a></li>
                        <li><a href="<c:out value="${itemRegistro}"/>"  class = "normalMenu">Registrate_Aquí</a></li>
                    </ul>
                </div>
    </head>
    <body>
        
        Abarrotes "El compi" fue fundada en al año 1810 para abastecer a los combatientes de la lucha de
        independencia en el país, creada por Don José López Calleja.<br>
        Hoy en día cuenta con 41 sucursales a lo largo de toda la república mexicana, teniendo presencia en
        los 32 estados. <br>
        Abarrotes "El Compi"es una empresa dedicada a la venta de articulos tanto nacionales como internacionales; 
        contamos con la más amplia variedad y surtido en lacteos, carnes frias, articulos de limpieza y para el hogar, 
        bebidas y más mucho más.<br>
        <br>
        Nuestros precios son unicos, venga y compare!!!<br><br>
        <img src="abarrotes.png" align="center"/><br>

    </body>
    <a href="Principal.html">Pagina Principal</a>
</html>
