package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Beans.EmpleadoDAO;

public final class InsertarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html;\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function permite(elEvento, permitidos) { // Variables que definen los caracteres permitidos \n");
      out.write("                var numeros = \"0123456789\";\n");
      out.write("                var caracteres = \" abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ\";\n");
      out.write("                var numeros_caracteres = numeros + caracteres;\n");
      out.write("                var teclas_especiales = [8, 37, 39, 46];\n");
      out.write("                switch (permitidos) {\n");
      out.write("                    case 'num':\n");
      out.write("                        permitidos = numeros;\n");
      out.write("                        break;\n");
      out.write("                    case 'car':\n");
      out.write("                        permitidos = caracteres;\n");
      out.write("                        break;\n");
      out.write("                    case 'num_car':\n");
      out.write("                        permitidos = numeros_caracteres;\n");
      out.write("                        break;\n");
      out.write("                }\n");
      out.write("                // Obtener la tecla pulsada\n");
      out.write("                var evento = elEvento || window.event;\n");
      out.write("                var codigoCaracter = evento.charCode || evento.keyCode;\n");
      out.write("                var caracter = String.fromCharCode(codigoCaracter);\n");
      out.write("                // Comprobar si la tecla pulsada es alguna de las teclas especiales\n");
      out.write("                // (teclas de borrado y flechas horizontales)\n");
      out.write("                var tecla_especial = false;\n");
      out.write("                for (var i in teclas_especiales) {\n");
      out.write("                    if (codigoCaracter == teclas_especiales[i]) {\n");
      out.write("                        tecla_especial = true;\n");
      out.write("                        break;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                // Comprobar si la tecla pulsada se encuentra en los caracteres permitidos\n");
      out.write("                // o si es una tecla especial\n");
      out.write("                return permitidos.indexOf(caracter) != -1 || tecla_especial;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function limita(maximoCaracteres) {\n");
      out.write("                var elemento = document.getElementById(\"texto\");\n");
      out.write("                if (elemento.value.length >= maximoCaracteres) {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function validacion() {\n");
      out.write("\n");
      out.write("                //validamos campo1\n");
      out.write("                valor1 = document.getElementById(\"Nombre_empleado\").value;\n");
      out.write("                if (valor1 == null || valor1.length == 0 || /^\\s+$/.test(valor1))\n");
      out.write("                {\n");
      out.write("                    alert(\"*Campo vacio... Debes coloar Nombre\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                //validamos campo2\n");
      out.write("                valor2 = document.getElementById(\"password\").value;\n");
      out.write("\n");
      out.write("                if (isNaN(valor2)) {\n");
      out.write("                    alert(\"*Campo vacio...Indica un acontraseña\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                valor3 = document.getElementById(\"Apell_pat_empleado\").value;\n");
      out.write("\n");
      out.write("                if (isNaN(valor3)) {\n");
      out.write("                    alert(\"*Campo vacio...Coloca apellido\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                valor4 = document.getElementById(\"Apell_mat_empleado\").value;\n");
      out.write("\n");
      out.write("                if (isNaN(valor4)) {\n");
      out.write("                    alert(\"*Campo vacio...coloca apellido\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                valor5 = document.getElementById(\"Fec_nac\").value;\n");
      out.write("\n");
      out.write("                if (isNaN(valor5)) {\n");
      out.write("                    alert(\"*Campo vacio...Indica la Fecha\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                valor6 = document.getElementById(\"RFCE\").value;\n");
      out.write("\n");
      out.write("                if (isNaN(valor6)) {\n");
      out.write("                    alert(\"*Campo vacio...Indica su RFCE\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor7 = document.getElementById(\"Salario\").value;\n");
      out.write("\n");
      out.write("                if (isNaN(valor7)) {\n");
      out.write("                    alert(\"*Campo vacio...Salario\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //validamos select\n");
      out.write("                indice1 = document.getElementById(\"Edo_civil\").selectedIndex;\n");
      out.write("                if (indice1 == null || indice1 == 0) {\n");
      out.write("                    alert(\"*No se ha seleccionado Estado Civil\");\n");
      out.write("                    //return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //validamos select\n");
      out.write("                indice2 = document.getElementById(\"Estatus_emp\").selectedIndex;\n");
      out.write("                if (indice2 == null || indice2 == 0) {\n");
      out.write("                    alert(\"*No se ha seleccionado estatus\");\n");
      out.write("                    //return false;\n");
      out.write("                }\n");
      out.write("                //validamos select\n");
      out.write("                indice3 = document.getElementById(\"Nivel\").selectedIndex;\n");
      out.write("                if (indice3 == null || indice3 == 0) {\n");
      out.write("                    alert(\"*No se ha seleccionado Nivel de estudios\");\n");
      out.write("                    //return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //validamos select\n");
      out.write("                indice4 = document.getElementById(\"tipoUsuario\").selectedIndex;\n");
      out.write("                if (indice4 == null || indice4 == 0) {\n");
      out.write("                    alert(\"*No se ha seleccionado tipo de Usuario\");\n");
      out.write("                    //return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Empleado</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Portal de registro de empleados</h1>\n");
      out.write("        ");

            if (request.getParameter("submit") == null) {
        
      out.write(" \n");
      out.write("        <form onsubmit=\"return validacion()\">\n");
      out.write("            <CENTER>\n");
      out.write("                <HR>\n");
      out.write("                <I>Insertar empleado.<a href=\"AutentificarAdmon.jsp\">Cerrar Sesion</a></I>\n");
      out.write("                <table border=\"1\"  cellpadding=\"0\" cellspacing=\"0\" \n");
      out.write("                       height=\"40%\" width=\"25\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Nombre_empleado\" name=\"nombreEmpleado\" placeholder=\"Nombre de empleado\"\n");
      out.write("                                   title=\"Nombre\" type=\"text\" value=\"\" size=\"25\" onkeypress=\"return permite(event, 'car')\" />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"password\" name=\"password\" placeholder=\"Contraseña\"\n");
      out.write("                                   title=\"Contraseña\" type=\"password\" value=\"\" size=\"25\" onkeypress=\"return permite(event, 'num_car')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Apell_pat_empleado\" name=\"apellPatEmpleado\" placeholder=\"Apellido paterno \"\n");
      out.write("                                   title=\"Apellido paterno\" type=\"text\" value=\"\" size=\"25\" onkeypress=\"return permite(event, 'car')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Apell_mat_empleado\" name=\"apellMatEmpleado\" placeholder=\"Apellido materno\"\n");
      out.write("                                   title=\"Apellido materno\" type=\"text\" value=\"\" size=\"25\" onkeypress=\"return permite(event, 'car')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Fec_nac\" name=\"fechaNac\" placeholder=\"Fecha de nacimiento \"\n");
      out.write("                                   title=\"Fecha de nacimiento\" type=\"text\" value=\"\" size=\"25\" onkeypress=\"return permite(event, 'num_car')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"RFCE\" name=\"rfce\" placeholder=\"RFC empleado\"\n");
      out.write("                                   title=\"RFC\" type=\"text\" value=\"\" size=\"25\" onkeypress=\"return permite(event, 'car')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Salario\" name=\"salario\" placeholder=\"Salario\"\n");
      out.write("                                   title=\"Salario\" type=\"text\" value=\"\" size=\"25\" onkeypress=\"return permite(event, 'num')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <select id=\"Edo_civil\" name=\"estadoCivil\"> \n");
      out.write("                                <option value=\"Soltero\">Soltero</option>\n");
      out.write("                                <option value=\"Casado\">Casado</option>\n");
      out.write("                                <option value=\"Divorciado\">Divorciado</option>\n");
      out.write("                                <option value=\"Viudo\">Viudo</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <select id=\"Estatus_emp\" name=\"estatus\"> \n");
      out.write("                                <option value=\"Laborando\">Laborando</option>\n");
      out.write("                                <option value=\"Desempleado\">Desempleado</option>\n");
      out.write("                                <option value=\"Periodo Vacacional\">Periodo Vacacional</option>\n");
      out.write("                                <option value=\"Incapacitado o lactancia\">Incapacitado o lactancia</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <select id=\"Nivel\" name=\"nivelEstudio\">\n");
      out.write("                                <option value=\"Sin estudios\">Sin estudios</option> \n");
      out.write("                                <option value=\"Primaria\">Primaria</option>\n");
      out.write("                                <option value=\"Secundaria\">Secundaria</option>\n");
      out.write("                                <option value=\"Bachiller\">Bachiller</option>\n");
      out.write("                                <option value=\"Universidad\">Universidad</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <select id=\"tipoUsuario\" name=\"tipoUsuario\"> \n");
      out.write("                                <option value=\"Administrador\">Administrador</option>\n");
      out.write("                                <option value=\"Empleado\">Empleado</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"submit\" name=\"submit\" type=\"submit\" value=\"Crear\">\n");
      out.write("                            <input id=\"limpiar\" name=\"limpiar\" type=\"reset\" value=\"Limpiar\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <a href=\"EliminarEmpleado.jsp\">Regresar</a>\n");
      out.write("            </CENTER>\n");
      out.write("        </form>\n");
      out.write("        ");
        } else {
      out.write("\n");
      out.write("        ");
      Mapeos.Empleado empleado = null;
      synchronized (_jspx_page_context) {
        empleado = (Mapeos.Empleado) _jspx_page_context.getAttribute("empleado", PageContext.PAGE_SCOPE);
        if (empleado == null){
          empleado = new Mapeos.Empleado();
          _jspx_page_context.setAttribute("empleado", empleado, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("empleado"), request);
      out.write("\n");
      out.write("        ");

            EmpleadoDAO empregistro = new EmpleadoDAO();
            int NoEmpleado = empregistro.guardaEmpleado(empleado);
            if (NoEmpleado > 0) {
        
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Numero empleado</th>\n");
      out.write("                    <th>Nombre empleado</th>\n");
      out.write("                    <th>Contraseña</th>\n");
      out.write("                    <th>Apellido paterno</th>\n");
      out.write("                    <th>Apellido materno</th>\n");
      out.write("                    <th>Fecha de nacimiento</th>\n");
      out.write("                    <th>RFC</th>\n");
      out.write("                    <th>Salario</th>\n");
      out.write("                    <th>Estado civil</th>\n");
      out.write("                    <th>Estatus</th>\n");
      out.write("                    <th>Nivel de estudio</th>\n");
      out.write("                    <th>Tipo de usuario</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( empleado.getNoEmpleado());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getNombreEmpleado());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getPassword());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getApellPatEmpleado());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getApellMatEmpleado());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getFechaNac());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getRfce());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getSalario());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getEstadoCivil());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getEstatus());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getNivelEstudio());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( empleado.getTipoUsuario());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            <h2>Producto agregado</h2>\n");
      out.write("        </tbody>\n");
      out.write("    </table> \n");
      out.write("    <a href=\"EliminarEmpleado.jsp\">Regresar</a>\n");
      out.write("    ");
 } else {
      out.write("\n");
      out.write("    <h2>Lo sentimos, no se puedo insertar el registro</h2>\n");
      out.write("    ");
}
        }
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}