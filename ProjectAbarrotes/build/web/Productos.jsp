<%-- 
    Document   : Productos
    Created on : 2/11/2013, 03:30:21 PM
    Author     : USUARIO
--%>

<%@page import="Mapeos.Producto"%>
<%@page import="java.util.List"%>
<%@page import="Beans.ProductoDAO"%>
<link rel="stylesheet" type="text/css" href="css.css" title="style">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>producto</title>
    </head>
    <script type="text/javascript" src="XHR.js"></script>
    <script type="text/javascript">
        //Defino Variables Globales
        var peticion;
        peticion = obtenerXHR();
        function completapalabra(elemento) {

            peticion.open("POST", "servletAjax", true);
            peticion.onreadystatechange = procesarPeticion;

            //Definimos cabecera obligatoria para enviar POST
            peticion.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            //Enviamos los parametros
            var parametros = "nombre=" + elemento.value;
            peticion.send(parametros);
        }
        function procesarPeticion() {
            var div = document.getElementById("resultados");
            if (peticion.readyState == 1) {
                //document.getElementById("mensaje").innerHTML="<img src=\"loading.gif\" align=\"center\" /> Aguarde por favor...";
                div.innerHTML = "<img src=\"loading.gif\" align=\"center\" /> Aguarde por favor...";
            }
            if (peticion.readyState == 4) {
                //La peticion termino
                if (peticion.status == 200) {
                    //Mostramos el texto dentro del DIV
                    div.innerHTML = peticion.responseText;
                }
            }
        }

    </script> 
    <body>
        <h1>Portal de información del producto.</h1>
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

        <% ProductoDAO productoDAO = new ProductoDAO();
            List<Producto> listaproductos = productoDAO.obtenListaProducto();
        %>
        <form method="post">
            <CENTER>
                <HR> 
                <I>Para poder comprar un producto es necesario tener un cuenta.</I>.<a href="Principal.html"> Regresar</a>
                </HR>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Nombre producto</th>
                            <th>Presentacion</th>
                            <th>Caducidad</th>
                            <th>P. Unitario</th>
                            <th>Fecha</th>
                            <th>Marca</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%  for (Producto a : listaproductos) {
                        %>
                        <tr>
                            <td><%= a.getNombreProducto()%></td>
                            <td><%= a.getPresentacion()%></td>
                            <td><%= a.getCaducidad()%></td>
                            <td><%= a.getPrecioUni()%></td>
                            <td><%= a.getFech()%></td>
                            <td><%= a.getMarca()%></td>
                        </tr>
                        <% }
                        %>
                    </tbody>
                </table>
                <input type="button" onclick=" location.href = 'registro.jsp'" value="Registrarse" name="boton1" />
                <input type="button" onclick=" location.href = 'buscador.jsp'" value="Buscar" name="boton" />
            </CENTER>
        </form>
    </body>
</html>
