<%--
    Document   : insertarEmpleado
    Created on : 1/11/2013, 06:10:15 PM
    Author     : Search
--%>

<%@page import="Beans.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

                //validamos campo1
                valor1 = document.getElementById("Nombre_empleado").value;
                if (valor1 == null || valor1.length == 0 || /^\s+$/.test(valor1))
                {
                    alert("*Campo vacio... Debes coloar Nombre");
                    //return false; 
                }
                //validamos campo2
                valor2 = document.getElementById("password").value;

                if (valor2 == "" || valor2==null) {
                    alert("*Campo vacio...Indica un acontraseña");
                    //return false; 
                }

                valor3 = document.getElementById("Apell_pat_empleado").value;

                if (valor3 == "" || valor3==null ||  !/^[A-Za-z\_\-\.\,\s]+$/.test(valor3)) {
                    alert("*Campo vacio...Coloca apellido Paterno");
                    //return false; 
                }

                valor4 = document.getElementById("Apell_mat_empleado").value;

                if (valor4 == "" || valor4==null ||  !/^[A-Za-z\_\-\.\,\s]+$/.test(valor4)) {
                    alert("*Campo vacio...coloca apellido Materno");
                    //return false; 
                }

                valor5 = document.getElementById("Fec_nac").value;

                if (valor5 == "" || valor5==null) {
                    alert("*Campo vacio...Indica la Fecha");
                    //return false; 
                }

                valor6 = document.getElementById("RFCE").value;

                if (valor6 == "" || valor6==null) {
                    alert("*Campo vacio...Indica su RFCE");
                    //return false; 
                }
                valor7 = document.getElementById("Salario").value;

                if (valor7 == "" || valor7==null || !/^([0-9])*$/.test(valor7)) {
                    alert("*Campo vacio...Salario");
                    return false; 
                }

                //validamos select
                indice1 = document.getElementById("Edo_civil").selectedIndex;
                if (indice1 == null || indice1 == 0) {
                    alert("*No se ha seleccionado Estado Civil");
                    //return false;
                }

                //validamos select
                indice2 = document.getElementById("Estatus_emp").selectedIndex;
                if (indice2 == null || indice2 == 0) {
                    alert("*No se ha seleccionado estatus");
                    //return false;
                }
                //validamos select
                indice3 = document.getElementById("Nivel").selectedIndex;
                if (indice3 == null || indice3 == 0) {
                    alert("*No se ha seleccionado Nivel de estudios");
                    //return false;
                }

                //validamos select
                indice4 = document.getElementById("tipoUsuario").selectedIndex;
                if (indice4 == null || indice4 == 0) {
                    alert("*No se ha seleccionado tipo de Usuario");
                    return false;
                }


            }
        </script>


        <title>Empleado</title>
    </head>
    <body>
        <h1>Portal de registro de empleados</h1>
        <%
            if (request.getParameter("submit") == null) {
        %> 
        <form onsubmit="return validacion()" method="post">
            <CENTER>
                <HR>
                <I>Insertar empleado.<a href="AutentificarAdmon.jsp">Cerrar Sesion</a></I>
                <table border="1"  cellpadding="0" cellspacing="0" 
                       height="40%" width="25">
                    <tr>
                        <td>
                            <input id="Nombre_empleado" name="nombreEmpleado" placeholder="Nombre de empleado"
                                   title="Nombre" type="text" value="" size="25" onkeypress="return permite(event, 'car')" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="password" name="password" placeholder="Contraseña"
                                   title="Contraseña" type="password" value="" size="25" onkeypress="return permite(event, 'num_car')"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="Apell_pat_empleado" name="apellPatEmpleado" placeholder="Apellido paterno "
                                   title="Apellido paterno" type="text" value="" size="25" onkeypress="return permite(event, 'car')"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="Apell_mat_empleado" name="apellMatEmpleado" placeholder="Apellido materno"
                                   title="Apellido materno" type="text" value="" size="25" onkeypress="return permite(event, 'car')"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div id="datetimepicker2" class="input-append date">
                            <input id="Fec_nac" type="text" name="fechNac" title="Fecha de nacimiento" 
                                   placeholder="Fecha de nacimiento" />
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
                            <input id="RFCE" name="rfce" placeholder="RFC empleado"
                                   title="RFC" type="text" value="" size="25" onkeypress="return permite(event, 'car')"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="Salario" name="salario" placeholder="Salario"
                                   title="Salario" type="text" value="" size="25" onkeypress="return permite(event, 'num')"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <select id="Edo_civil" name="estadoCivil"> 
                                <option value="Soltero">Soltero</option>
                                <option value="Casado">Casado</option>
                                <option value="Divorciado">Divorciado</option>
                                <option value="Viudo">Viudo</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <select id="Estatus_emp" name="estatus"> 
                                <option value="Laborando">Laborando</option>
                                <option value="Desempleado">Desempleado</option>
                                <option value="Periodo Vacacional">Periodo Vacacional</option>
                                <option value="Incapacitado o lactancia">Incapacitado o lactancia</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <select id="Nivel" name="nivelEstudio">
                                <option value="Sin estudios">Sin estudios</option> 
                                <option value="Primaria">Primaria</option>
                                <option value="Secundaria">Secundaria</option>
                                <option value="Bachiller">Bachiller</option>
                                <option value="Universidad">Universidad</option>
                            </select>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <select id="tipoUsuario" name="tipoUsuario"> 
                                <option value="Administrador">Administrador</option>
                                <option value="Empleado">Empleado</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="submit" name="submit" type="submit" value="Crear">
                            <input id="limpiar" name="limpiar" type="reset" value="Limpiar">
                        </td>
                    </tr>
                </table>
                <a href="EliminarEmpleado.jsp">Regresar</a>
            </CENTER>
        </form>
        <%        } else {%>
        <jsp:useBean id="empleado" scope="page" class="Mapeos.Empleado" />
        <jsp:setProperty name="empleado" property="*" />
        <%
            EmpleadoDAO empregistro = new EmpleadoDAO();
            int NoEmpleado = empregistro.guardaEmpleado(empleado);
            if (NoEmpleado > 0) {
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>Numero empleado</th>
                    <th>Nombre empleado</th>
                    <th>Contraseña</th>
                    <th>Apellido paterno</th>
                    <th>Apellido materno</th>
                    <th>Fecha de nacimiento</th>
                    <th>RFC</th>
                    <th>Salario</th>
                    <th>Estado civil</th>
                    <th>Estatus</th>
                    <th>Nivel de estudio</th>
                    <th>Tipo de usuario</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= empleado.getNoEmpleado()%></td>
                    <td><%= empleado.getNombreEmpleado()%></td>
                    <td><%= empleado.getPassword()%></td>
                    <td><%= empleado.getApellPatEmpleado()%></td>
                    <td><%= empleado.getApellMatEmpleado()%></td>
                    <td><%= empleado.getFechaNac()%></td>
                    <td><%= empleado.getRfce()%></td>
                    <td><%= empleado.getSalario()%></td>
                    <td><%= empleado.getEstadoCivil()%></td>
                    <td><%= empleado.getEstatus()%></td>
                    <td><%= empleado.getNivelEstudio()%></td>
                    <td><%= empleado.getTipoUsuario()%></td>
                </tr>
            <h2>Producto agregado</h2>
        </tbody>
    </table> 
    <a href="EliminarEmpleado.jsp">Regresar</a>
    <% } else {%>
    <h2>Lo sentimos, no se puedo insertar el registro</h2>
    <%}
        }
    %>
</body>
</html>

