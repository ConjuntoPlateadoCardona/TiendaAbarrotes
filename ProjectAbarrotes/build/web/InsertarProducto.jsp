<%-- 
    Document   : InsertarProducto
    Created on : 3/01/2014, 01:12:57 PM
    Author     : Search
--%>

<%@page import="Beans.ProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.hibernate.HibernateException" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;">
        <!-- cosas que ocupa el calendario-->
        <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" media="screen"
              href="http://tarruda.github.com/bootstrap-datetimepicker/assets/css/bootstrap-datetimepicker.min.css">
        <!-- aqui terminan las cosas que ocupa el clendario-->  
        <title>JSP Page</title>
        <script type="text/javascript">
             
            function permite(elEvento, permitidos) { // Variables que definen los caracteres permitidos 
                var numeros = "0123456789";
                var caracteres = " abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                var numeros_caracteres = numeros + caracteres;
                var teclas_especiales = [8, 37, 39, 46];

                switch (permitidos) {
                    case 'num':
                        permitidos = numeros;
                        break;
                    case 'car':
                        permitidos = caracteres;
                        break;
                    case 'num_car':
                        permitidos = numeros_caracteres;
                        break;
                }
                // Obtener la tecla pulsada
                var evento = elEvento || window.event;
                var codigoCaracter = evento.charCode || evento.keyCode;
                var caracter = String.fromCharCode(codigoCaracter);
                // Comprobar si la tecla pulsada es alguna de las teclas especiales
                // (teclas de borrado y flechas horizontales)
                var tecla_especial = false;
                for (var i in teclas_especiales) {
                    if (codigoCaracter == teclas_especiales[i]) {
                        tecla_especial = true;
                        break;
                    }
                }
                // Comprobar si la tecla pulsada se encuentra en los caracteres permitidos
                // o si es una tecla especial
                return permitidos.indexOf(caracter) != -1 || tecla_especial;
            }

            function limita(maximoCaracteres) {
                var elemento = document.getElementById("texto");
                if (elemento.value.length >= maximoCaracteres) {
                    return false;
                }
                else {
                    return true;
                }
            }
            function validacion() {
                valor1 = document.getElementById("Nombre_producto").value;
                if (valor1 == null || valor1.length == 0 || /^\s+$/.test(valor1))
                {
                    alert("*Falta el Nombre");
                    //return false; 
                }
                valor2 = document.getElementById("Presentacion").value;
                if (valor2 == "" || valor2==null ||  !/^[A-Za-z\_\-\.\,\s]+$/.test(valor2)) {
                    alert("*Indica la Presentacion");
                    //return false; 
                }
                valor3 = document.getElementById("Caducidad").value;
                if (valor3 == "" || valor3==null) {
                    alert("*Indica Caducidad");
                    //return false; 
                }
                valor4 = document.getElementById("PProveedor").value;
                if (valor4 == "" || valor4 == null) {
                    alert("*Indica Precio del Proveedor");
                    //return false; 
                }
                valor5 = document.getElementById("PUnitario").value;
                if (valor5 == "" || valor5==null) {
                    alert("*Indica Precio Unitario");
                    //return false; 
                }
                valor6 = document.getElementById("Existencias").value;
                if (valor6 == "" || valor6==null) {
                    alert("*Indica el numero en existencia");
                    //return false; 
                }
                valor7 = document.getElementById("Fech").value;
                if (valor7== "" || valor7==null) {
                    alert("*Indica Fecha de llegada");
                    //return false; 
                }
                valor8 = document.getElementById("Marca").value;
                if (valor8 == "" || valor8==null) {
                    alert("*Indica la Marca");
                    //return false; 
                }
                valor9 = document.getElementById("IdProveedor").value;
                if (valor9 == "" || valor9==null) {
                    alert("*Inica ID del Proveedor");
                    return false; 
                }
                    function enviar_formulario(){
                document.formulario1.submit();
                }
            }
        </script>

        <title> Nuevo Producto</title>
    </head>
    <body>
        <h1>Portal de registro de nuevos productos</h1>
        <%
            if (request.getParameter("submit") == null) {
        %> 
        <form onsubmit="return validacion()" method="post">
            <CENTER>
                <HR>
                <I>Insertar Producto.<a href="AutentificarEmpleado.jsp">Cerrar Sesion</a></I>
                <table border="1"  cellpadding="0" cellspacing="0" 
                       height="40%" width="25">
                    <tr>
                        <td>
                            <input id="Nombre_producto" name="nombreProducto" placeholder="Nombre de producto"
                                   title="Nombre de producto" type="text" value="" size="25"
                                   onkeypress="return permite(event, 'car')"/>
                        </td>
                    </tr>
                    <td>
                        <input id="Presentacion" name="presentacion" placeholder="Presentacion"
                               title="Presentacion" type="text" value="" size="25"
                               onkeypress="return permite(event, 'num_car')"/>
                    </td>
                    </tr>
                    <tr>
                        <td>
                            <div id="datetimepicker" class="input-append date">
                                <input id="Caducidad" type="text" name="caducidad" title="Caducidad" placeholder="Caducidad"/>
                                 <span class="add-on">
                                 <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
                                </span>
                            </div>
                            <script type="text/javascript"
                                    src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.3/jquery.min.js">
                            </script> 
                            <script type="text/javascript"
                                    src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/js/bootstrap.min.js">
                            </script>
                            <script type="text/javascript"
                                    src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
                            </script>
                            <script type="text/javascript"
                                    src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.pt-BR.js">
                            </script>
                            <script type="text/javascript">
                                $('#datetimepicker').datetimepicker({
                                    format: 'yyyy-MM-dd',
                                    language: 'pt-EN'
                                });
                            </script>
                                </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="PProveedor" name="precioProv" placeholder="Precio Proveedor"
                                   title="PrecioProveedor" type="text" value="" size="25"
                                   onkeypress="return permite(event, 'num')"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="PUnitario" name="precioUni" placeholder="Precio Unitario"
                                   title="Precio Unitario" type="text" value="" size="25"
                                   onkeypress="return permite(event, 'num')"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="Existencias" name="existencias" placeholder="Existencias"
                                   title="Existencias ---" type="text" value="" size="25"
                                   onkeypress="return permite(event, 'num')"/>
                        </td>
                    </tr>
                    <td>
                        <div id="datetimepicker2" class="input-append date">
                            <input id="Fech" type="text" name="fech" title="Fecha" placeholder="Fecha" />
                                 <span class="add-on">
                                 <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
                                </span>
                            </div>
                            <script type="text/javascript"
                                    src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.3/jquery.min.js">
                            </script> 
                            <script type="text/javascript"
                                    src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/js/bootstrap.min.js">
                            </script>
                            <script type="text/javascript"
                                    src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
                            </script>
                            <script type="text/javascript"
                                    src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.pt-BR.js">
                            </script>
                            <script type="text/javascript">
                                $('#datetimepicker2').datetimepicker({
                                    format: 'yyyy-MM-dd',
                                    language: 'pt-EN'
                                });
                            </script>
                    </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="Marca" name="marca" placeholder="Marca"
                                   title="Marca" type="text" value="" size="25"
                                   onkeypress="return permite(event, 'num_car')"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="IdProveedor" name="idProveedor" placeholder="IdProveedor"
                                   title="ID de Proveedor" type="text" value="" size="25"
                                   onkeypress="return permite(event, 'num')"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="submit" name="submit" type="submit" value="Crear" onkeypress="if(event.keyCode== 13) enviar_formulario()">
                            <input id="limpiar" name="limpiar" type="reset" value="Limpiar">
                        </td>
                    </tr>
                </table>
                <a href="EliminarProducto.jsp">Regresar</a>
            </CENTER>
        </form>
        <%        } else {%>
        <jsp:useBean id="producto" scope="page" class="Mapeos.Producto" />
        <jsp:setProperty name="producto" property="*" />
        <%
            ProductoDAO pregistro = new ProductoDAO();
            int NoProducto = pregistro.guardaProducto(producto);
            if (NoProducto > 0) {
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>Numero producto</th>
                    <th>Nombre producto</th>
                    <th>Presentacion</th>
                    <th>Caducidad</th>
                    <th>P. Proveedor</th>
                    <th>P. Unitario</th>
                    <th>Existencias</th>
                    <th>Fecha</th>
                    <th>Marca</th>
                    <th>Id proveedor</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= producto.getIdProducto()%></td>
                    <td><%= producto.getNombreProducto()%></td>
                    <td><%= producto.getPresentacion()%></td>
                    <td><%= producto.getCaducidad()%></td>
                    <td><%= producto.getPrecioProv()%></td>
                    <td><%= producto.getPrecioUni()%></td>
                    <td><%= producto.getExistencias()%></td>
                    <td><%= producto.getFech()%></td>
                    <td><%= producto.getMarca()%></td>
                    <td><%= producto.getIdProveedor()%></td>
                </tr>
            <h2>Empleado agregado</h2>
        </tbody>
    </table>
    <a href="EliminarProducto.jsp">Regresar</a>
    <% } else {%>
    <h2>Lo sentimos, no se puedo insertar el registro</h2>
    <%}
        }
    %>
</body>
</html>
