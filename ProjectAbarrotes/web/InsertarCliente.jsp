<%-- 
    Document   : InsertarCliente
    Created on : 2/01/2014, 03:53:37 PM
    Author     : Search
--%>

<%@page import="Beans.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css.css" title="style">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- cosas que ocupa el calendario-->
        <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" media="screen"
              href="http://tarruda.github.com/bootstrap-datetimepicker/assets/css/bootstrap-datetimepicker.min.css">
        <!-- aqui terminan las cosas que ocupa el clendario-->  
        <title>Clientes</title>
        <script>
             function validacion() {

                //validamos campo1
                valor1 = document.getElementById("Nombre").value;
                if (valor1 == null || valor1.length == 0 || /^\s+$/.test(valor1))
                {
                    alert("*Campo vacio... Debes coloar Nombre");
                    //return false; 
                }
                valor3 = document.getElementById("Apell_pat").value;

                if (valor3 == "" || valor3==null ||  !/^[A-Za-z\_\-\.\,\s]+$/.test(valor3)) {
                    alert("*Campo vacio...Coloca apellido Paterno");
                    //return false; 
                }

                valor4 = document.getElementById("Apell_mat").value;

                if (valor4 == "" || valor4==null ||  !/^[A-Za-z\_\-\.\,\s]+$/.test(valor4)) {
                    alert("*Campo vacio...coloca apellido Materno");
                   // return false; 
                }

                valor5 = document.getElementById("Fech_nac").value;

                if (valor5 == "" || valor5==null) {
                    alert("*Campo vacio...Indica la Fecha");
                    //return false; 
                }

                valor6 = document.getElementById("RFC").value;

                if (valor6 == "" || valor6==null) {
                    alert("*Campo vacio...Indica su RFC");
                    //return false; 
                }
                valor7 = document.getElementById("Correo").value;

                if (valor7 == "" || valor7==null ) {
                    alert("*Campo vacio...Salario");
                    //return false; 
                }
                //validamos campo2
                valor2 = document.getElementById("Password").value;

                if (valor2 == "" || valor2==null) {
                    alert("*Campo vacio...Indica un acontraseña");
                    //return false; 
                }
                valor8 = document.getElementById("direccion").value;

                if (valor8 == "" || valor8==null ) {
                    alert("*Campo vacio...Direccion");
                   // return false; 
                }
                valor9 = document.getElementById("telefono").value;

                if (valor9 == "" || valor9==null ) {
                    alert("*Campo vacio...Telefono");
                    return false; 
                }
            }
        </script>
    </head>
    <body>
        <h1>Portal de creacion de cuenta</h1>
        <%
            if (request.getParameter("submit") == null) {
        %> 
        <form onsubmit="return  validacion()" method="post">
            <CENTER>
                <HR>
                 <I>Crear Cuanta Cliente<a href="AutentificarCliente.jsp">Cerrar Sesion</a></I>
                <table border="1"  cellpadding="0" cellspacing="0" 
                       height="40%" width="25">
                    <tr>
                        <td>
                            <input id="Nombre" name="nombre" placeholder="Nombre"
                                   title="Nombre del cliente" type="text" value="" size="25"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="Apell_pat" name="apellPat" placeholder="Apellido paterno "
                                   title="Apellido Paterno" type="text" value="" size="25"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="Apell_mat" name="apellMat" placeholder="Apellido materno"
                                   title="Apellido materno" type="text" value="" size="25"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div id="datetimepicker2" class="input-append date">
                            <input id="Fech_nac" type="text" name="fechNac" title="Fecha de nacimieento" placeholder="Fecha de nacimineto" />
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
                            <input id="RFC" name="rfc" placeholder="RFC "
                                   title="RFC cliente" type="text" value="" size="25"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="Correo" name="correo" placeholder="Email"
                                   title="Correo electronico" type="text" value="" size="25"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="Password" name="password" placeholder="Contraseña"
                                   title="Contraseña" type="password" value="" size="25"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="direccion" name="direccion" placeholder="Dirección"
                                   title="Dirección" type="text" value="" size="25"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="telefono" name="telefono" placeholder="Telefono"
                                   title="Telefono" type="text" value="" size="10"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="submit" name="submit" type="submit" value="Crear">
                            <input id="limpiar" name="limpiar" type="reset" value="Limpiar">
                        </td>
                    </tr>
                </table>
                <a href="Principal.html">Regresar</a>
            </CENTER>
        </form> 
        <%        } else {%>
        <jsp:useBean id="cliente" scope="page" class="Mapeos.Cliente" />
        <jsp:setProperty name="cliente" property="*" />
        <%
            ClienteDAO registro = new ClienteDAO();
            int id_cliente = registro.guardarCliente(cliente);
            if (id_cliente > 0) {
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>ID del cliente</th>
                    <th>Nombre cliente</th>
                    <th>Apellido paterno</th>
                    <th>Apellido materno</th>
                    <th>Fecha de nacimiento</th>
                    <th>RFC</th>
                    <th>Email</th>
                    <th>Contraseña</th>
                    <th>Dirección</th>
                    <th>Telefono</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= cliente.getIdCliente() %></td>
                    <td><%= cliente.getNombre() %></td>
                    <td><%= cliente.getApellPat() %></td>
                    <td><%= cliente.getApellMat() %></td>
                    <td><%= cliente.getFechaNac() %></td>
                    <td><%= cliente.getRfc() %></td>
                    <td><%= cliente.getCorreo() %></td>
                    <td><%= cliente.getPassword() %></td>
                    <td><%= cliente.getDireccion() %></td>
                    <td><%= cliente.getTelefono() %></td>
                </tr>
            <h2>Registro completado</h2>
        </tbody>
    </table> 
     <a href="EliminarCliente.jsp">Regresar</a>
    <% } else {%>
    <h2>Lo sentimos, no se pudo crear la cuenta</h2>
    <%}
        }
    %>
</body>
</html>
