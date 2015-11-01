<%@page import="java.util.List"%>
<%@page import="Beans.ClienteDAO" %>
<%@page import="Mapeos.Cliente" %>
<jsp:useBean id="uname" scope="page" class="Mapeos.Cliente" />
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css.css" title="style">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Login</title>
        <script>
            function enviar_formulario(){
                document.formulario1.submit();
            }
        </script>
    </head>
    <body>
        <form method="post" action="Ventas.jsp">
            <center>
                <h1>Acceso del cliente</h1>
                <div id="menu">
                    <ul>
                        <li>
                            <c:url value="/Conocenos.jsp" var="itemDetailsURL">
                            <c:param name="itemId" value="Dev"/>
                            </c:url>
                            <a href="<c:out value="${itemDetailsURL}"/>"  class = "normalMenu">Conocenos</a></li>
                            <li><a href="Productos.jsp"  class = "normalMenu">Productos </a></li>
                            <li><a href="Contacto.jsp"  class = "normalMenu">Contacto</a></li>
                            <li><a href="Acceso.jsp"  class = "normalMenu">Ingresar</a></li>
                            <li> <a href="registro.jsp"  class = "normalMenu">Registrate_Aquí</a></li>
                    </ul>
                </div>
                <table border="1" width="30%" cellpadding="3">
                    <thead>
                        <tr>
                            <th colspan="2">Login</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Nombre</td>
                            <td><input type="text" name="usuario" value=""  /></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name="contrasenia" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" name="enviar" value="Entrar" onkeypress="if(event.keyCode== 13) enviar_formulario();" /></td>
                            <td><input type="reset" value="Limpiar" /></td>
                        </tr>
                    </tbody>
                </table>
                <a href="Principal.html">Pagina Principal</a>
            </center>
        </form>
        <% if (request.getParameter("enviar") != null) {%>

        <jsp:setProperty name="uname" property="*" />
        
                       
        <%
            int i = 1;
            boolean us = false;
            
            String usuario;
            ClienteDAO empDAO = new ClienteDAO();
            List<Cliente> listaClientes = empDAO.obtenListaCliente();
            for (i = 0; i < listaClientes.size(); i++) {
                uname.setNombre(request.getParameter("usuario"));
                uname.setPassword(request.getParameter("contrasenia"));
                if ((uname.getNombre().toString().equals(listaClientes.get(i).getNombre().toString()))
                        && (uname.getPassword().toString().equals(listaClientes.get(i).getPassword().toString()))) {
                    us = true;
                     usuario = uname.getNombre().toString();
        
        %>
    <center>
        <h3>Bienvenido <% out.println(uname.getNombre().toString());%></h3>
        
        <input type="button" onclick=" location.href = 'Ventas.jsp'" value="Consultar los productos" name="boton" />
    </center>
    <%    break;
    } else {
    %>
    <center>
        <h3>NO TIENES UNA CUENTA, CREALA AHORA MISMO...</h3>
        <a href="InsertarCliente.html">Crear cuenta</a>
    </center>
    <%            }
        }
        if (us == false) {
    %>
    <center>
        <h3>Es posible que el usuario y/ó contraseña sean incorrectos.</h3>
        <a href="Acceso.jsp">Intentar de nuevo</a>
    </center>
    <%                }
        }
    %>
</body>
</html>
