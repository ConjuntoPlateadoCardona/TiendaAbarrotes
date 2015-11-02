<%-- 
    Document   : Ventas
    Created on : 3/01/2014, 12:53:47 PM
    Author     : Search
--%>

<%@page import="Mapeos.Producto"%>
<%@page import="Mapeos.Cliente"%> 
<%@page import="java.util.List"%>
<%@page import="Beans.ProductoDAO"%>
<%@page import="Beans.ClienteDAO"%>
<jsp:useBean id="var1" scope="page" class="Mapeos.Producto" />
<jsp:useBean id="var2" scope="page" class="Mapeos.Cliente" />
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
    <body>
        <h1>Portal de información del producto</h1>
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

            ClienteDAO clienteDAO = new ClienteDAO();
            List<Cliente> listaclientes = clienteDAO.obtenListaCliente();
            int valor = 0;
        %>
        <form method="post"  action="Ventas.jsp">
            <CENTER>
                <HR> 
                <I>Selecciona en la columna final el producto que deseas comprar.</I>.
                </HR>
                <%! String usuario;
                    int pos;
                %>
                <%  
                    usuario = request.getParameter("usuario");
                    for(int i = 0;i<listaclientes.size();i++){
                        if(listaclientes.get(i).getNombre().equals(usuario)){
                            pos=i;
                        }
                    }
                %>
                <I>----------  </I><tr><I>BIENBENID@</I>.<%= usuario%><I></tr> 
                    <I>----------  </I><th>SU CARRITO</I>. <%= listaclientes.get(pos).getCarrito()%></th>
                <I>----------  </I><a href="Acceso.jsp">Cerrar Sesion</a>
                    <% 
                    %>
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
                        <% 
                        
                        for (Producto a : listaproductos) {
                        %>
                        <tr>
                            <td><%= a.getNombreProducto()%></td>
                            <td><%= a.getPresentacion()%></td>
                            <td><%= a.getCaducidad()%></td>
                            <td><%= a.getPrecioUni()%></td>
                            <td><%= a.getFech()%></td>
                            <td><%= a.getMarca()%></td>
                            <%  %>
                            <td><input type="checkbox" name="cbactores" value="<%=a.getIdProducto()%>"/></td>
                        </tr>
                        <%
                        }
                            usuario = request.getParameter("usuario");
                        %>
                    </tbody>
                </table>
                <input type="submit" value="Comprar" name="comprar" />
                <%
                    int compra = 0;
                    if (request.getParameter("comprar") != null) {
                %>
                <table border="1">
                    <jsp:useBean id="producto" scope="page" class="Mapeos.Producto" />
                    <jsp:setProperty name="producto" property="*" />
                    <%
                        String[] chbproductos = request.getParameterValues("cbactores");
                        for (int i = 0; i <= chbproductos.length; i++) {
                            if (i == chbproductos.length) {
                                compra = listaclientes.get(pos).getCarrito() - listaproductos.get(i - 1).getExistencias().intValue();
                                listaclientes.get(pos).setCarrito(compra);
                                //listaclientes.remove(i - 1).getCarrito();
                                out.println("*Compra efectuada*  " + "Carrito actual: " + compra);
                                //var1.setExistencias(var1.getExistencias() - 1);
                    %>
                    <thead>
                        <tr>
                            <th>Nombre producto</th>
                            <th>Presentacion</th>
                            <th>Caducidad</th>
                            <th>P. Unitario</th>
                            <th>Marca</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><%= listaproductos.get(i - 1).getNombreProducto()%></td>
                            <td><%= listaproductos.get(i - 1).getPresentacion()%></td>
                            <td><%= listaproductos.get(i - 1).getCaducidad()%></td>
                            <td><%= listaproductos.get(i - 1).getPrecioUni()%></td>
                            <td><%= listaproductos.get(i - 1).getMarca()%></td>
                        </tr>
                    </tbody>
                </table>
                <a href="Ventas.jsp">Realizar otra compra.</a>
            </CENTER>
        </form>
        <%
                    }
                }
            }
        %>
    </body>
</html>
