package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Beans.ClienteDAO;

public final class InsertarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\" title=\"style\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- cosas que ocupa el calendario-->\n");
      out.write("        <link href=\"http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\"\n");
      out.write("              href=\"http://tarruda.github.com/bootstrap-datetimepicker/assets/css/bootstrap-datetimepicker.min.css\">\n");
      out.write("        <!-- aqui terminan las cosas que ocupa el clendario-->  \n");
      out.write("        <title>Clientes</title>\n");
      out.write("        <script>\n");
      out.write("             function validacion() {\n");
      out.write("\n");
      out.write("                //validamos campo1\n");
      out.write("                valor1 = document.getElementById(\"Nombre\").value;\n");
      out.write("                if (valor1 == null || valor1.length == 0 || /^\\s+$/.test(valor1))\n");
      out.write("                {\n");
      out.write("                    alert(\"*Campo vacio... Debes coloar Nombre\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor3 = document.getElementById(\"Apell_pat\").value;\n");
      out.write("\n");
      out.write("                if (valor3 == \"\" || valor3==null ||  !/^[A-Za-z\\_\\-\\.\\,\\s]+$/.test(valor3)) {\n");
      out.write("                    alert(\"*Campo vacio...Coloca apellido Paterno\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                valor4 = document.getElementById(\"Apell_mat\").value;\n");
      out.write("\n");
      out.write("                if (valor4 == \"\" || valor4==null ||  !/^[A-Za-z\\_\\-\\.\\,\\s]+$/.test(valor4)) {\n");
      out.write("                    alert(\"*Campo vacio...coloca apellido Materno\");\n");
      out.write("                   // return false; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                valor5 = document.getElementById(\"Fech_nac\").value;\n");
      out.write("\n");
      out.write("                if (valor5 == \"\" || valor5==null) {\n");
      out.write("                    alert(\"*Campo vacio...Indica la Fecha\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                valor6 = document.getElementById(\"RFC\").value;\n");
      out.write("\n");
      out.write("                if (valor6 == \"\" || valor6==null) {\n");
      out.write("                    alert(\"*Campo vacio...Indica su RFC\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor7 = document.getElementById(\"Correo\").value;\n");
      out.write("\n");
      out.write("                if (valor7 == \"\" || valor7==null ) {\n");
      out.write("                    alert(\"*Campo vacio...Salario\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                //validamos campo2\n");
      out.write("                valor2 = document.getElementById(\"Password\").value;\n");
      out.write("\n");
      out.write("                if (valor2 == \"\" || valor2==null) {\n");
      out.write("                    alert(\"*Campo vacio...Indica un acontraseña\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor8 = document.getElementById(\"direccion\").value;\n");
      out.write("\n");
      out.write("                if (valor8 == \"\" || valor8==null ) {\n");
      out.write("                    alert(\"*Campo vacio...Direccion\");\n");
      out.write("                   // return false; \n");
      out.write("                }\n");
      out.write("                valor9 = document.getElementById(\"telefono\").value;\n");
      out.write("\n");
      out.write("                if (valor9 == \"\" || valor9==null ) {\n");
      out.write("                    alert(\"*Campo vacio...Telefono\");\n");
      out.write("                    return false; \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Portal de creacion de cuenta</h1>\n");
      out.write("        ");

            if (request.getParameter("submit") == null) {
        
      out.write(" \n");
      out.write("        <form onsubmit=\"return  validacion()\">\n");
      out.write("            <CENTER>\n");
      out.write("                <HR>\n");
      out.write("                 <I>Crear Cuanta Cliente<a href=\"AutentificarCliente.jsp\">Cerrar Sesion</a></I>\n");
      out.write("                <table border=\"1\"  cellpadding=\"0\" cellspacing=\"0\" \n");
      out.write("                       height=\"40%\" width=\"25\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Nombre\" name=\"nombre\" placeholder=\"Nombre\"\n");
      out.write("                                   title=\"Nombre del cliente\" type=\"text\" value=\"\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Apell_pat\" name=\"apellPat\" placeholder=\"Apellido paterno \"\n");
      out.write("                                   title=\"Apellido Paterno\" type=\"text\" value=\"\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Apell_mat\" name=\"apellMat\" placeholder=\"Apellido materno\"\n");
      out.write("                                   title=\"Apellido materno\" type=\"text\" value=\"\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div id=\"datetimepicker2\" class=\"input-append date\">\n");
      out.write("                            <input id=\"Fech_nac\" type=\"text\" name=\"fechNac\" title=\"Fecha de nacimieento\" placeholder=\"Fecha de nacimineto\" />\n");
      out.write("                                 <span class=\"add-on\">\n");
      out.write("                                 <i data-time-icon=\"icon-time\" data-date-icon=\"icon-calendar\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                            <script type=\"text/javascript\"\n");
      out.write("                                    src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.3/jquery.min.js\">\n");
      out.write("                            </script> \n");
      out.write("                            <script type=\"text/javascript\"\n");
      out.write("                                    src=\"http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/js/bootstrap.min.js\">\n");
      out.write("                            </script>\n");
      out.write("                            <script type=\"text/javascript\"\n");
      out.write("                                    src=\"http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js\">\n");
      out.write("                            </script>\n");
      out.write("                            <script type=\"text/javascript\"\n");
      out.write("                                    src=\"http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.pt-BR.js\">\n");
      out.write("                            </script>\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                $('#datetimepicker2').datetimepicker({\n");
      out.write("                                    format: 'yyyy-MM-dd',\n");
      out.write("                                    language: 'pt-EN'\n");
      out.write("                                });\n");
      out.write("                            </script>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"RFC\" name=\"rfc\" placeholder=\"RFC \"\n");
      out.write("                                   title=\"RFC cliente\" type=\"text\" value=\"\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Correo\" name=\"correo\" placeholder=\"Email\"\n");
      out.write("                                   title=\"Correo electronico\" type=\"text\" value=\"\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Password\" name=\"password\" placeholder=\"Contraseña\"\n");
      out.write("                                   title=\"Contraseña\" type=\"password\" value=\"\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"direccion\" name=\"direccion\" placeholder=\"Dirección\"\n");
      out.write("                                   title=\"Dirección\" type=\"text\" value=\"\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"telefono\" name=\"telefono\" placeholder=\"Telefono\"\n");
      out.write("                                   title=\"Telefono\" type=\"text\" value=\"\" size=\"10\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"submit\" name=\"submit\" type=\"submit\" value=\"Crear\">\n");
      out.write("                            <input id=\"limpiar\" name=\"limpiar\" type=\"reset\" value=\"Limpiar\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <a href=\"Principal.html\">Regresar</a>\n");
      out.write("            </CENTER>\n");
      out.write("        </form> \n");
      out.write("        ");
        } else {
      out.write("\n");
      out.write("        ");
      Mapeos.Cliente cliente = null;
      synchronized (_jspx_page_context) {
        cliente = (Mapeos.Cliente) _jspx_page_context.getAttribute("cliente", PageContext.PAGE_SCOPE);
        if (cliente == null){
          cliente = new Mapeos.Cliente();
          _jspx_page_context.setAttribute("cliente", cliente, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("cliente"), request);
      out.write("\n");
      out.write("        ");

            ClienteDAO registro = new ClienteDAO();
            int id_cliente = registro.guardarCliente(cliente);
            if (id_cliente > 0) {
        
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID del cliente</th>\n");
      out.write("                    <th>Nombre cliente</th>\n");
      out.write("                    <th>Apellido paterno</th>\n");
      out.write("                    <th>Apellido materno</th>\n");
      out.write("                    <th>Fecha de nacimiento</th>\n");
      out.write("                    <th>RFC</th>\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Contraseña</th>\n");
      out.write("                    <th>Dirección</th>\n");
      out.write("                    <th>Telefono</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( cliente.getIdCliente() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getNombre() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getApellPat() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getApellMat() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getFechaNac() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getRfc() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getCorreo() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getPassword() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getDireccion() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getTelefono() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            <h2>Registro completado</h2>\n");
      out.write("        </tbody>\n");
      out.write("    </table> \n");
      out.write("     <a href=\"EliminarCliente.jsp\">Regresar</a>\n");
      out.write("    ");
 } else {
      out.write("\n");
      out.write("    <h2>Lo sentimos, no se pudo crear la cuenta</h2>\n");
      out.write("    ");
}
        }
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
