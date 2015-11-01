package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Beans.EmpleadoDAO;
import Mapeos.Empleado;

public final class AutentificarAdmon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      Mapeos.Empleado uname = null;
      synchronized (_jspx_page_context) {
        uname = (Mapeos.Empleado) _jspx_page_context.getAttribute("uname", PageContext.PAGE_SCOPE);
        if (uname == null){
          uname = new Mapeos.Empleado();
          _jspx_page_context.setAttribute("uname", uname, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\" title=\"style\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Acceso</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <center>\n");
      out.write("                <h1>Acceso del Administrador</h1>\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                            <li><a href=\"Conocenos.jsp\"  class = \"normalMenu\">Conocenos</a></li>\n");
      out.write("                            <li><a href=\"Productos.jsp\"  class = \"normalMenu\">Productos </a></li>\n");
      out.write("                            <li><a href=\"Contacto.jsp\"  class = \"normalMenu\">Contacto</a></li>\n");
      out.write("                            <li><a href=\"Acceso.jsp\"  class = \"normalMenu\">Ingresar</a></li>\n");
      out.write("                            <li> <a href=\"registro.jsp\"  class = \"normalMenu\">Registrate_Aquí</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <table border=\"1\" width=\"30%\" cellpadding=\"3\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"2\">Login</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nombre</td>\n");
      out.write("                            <td><input type=\"text\" name=\"usuario\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Password</td>\n");
      out.write("                            <td><input type=\"password\" name=\"contrasenia\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" name=\"enviar\" value=\"Entrar\" /></td>\n");
      out.write("                            <td><input type=\"reset\" value=\"Limpiar\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <a href=\"Principal.html\">Pagina Principal</a>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        ");
 if (request.getParameter("enviar") != null) {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("uname"), request);
      out.write("\n");
      out.write("        ");

            int i = 1;
            boolean us = false;
            EmpleadoDAO empDAO = new EmpleadoDAO();
            List<Empleado> listaEmpleados = empDAO.obtenListaEmpleado();
            for (i = 0; i < listaEmpleados.size(); i++) {
                uname.setNombreEmpleado(request.getParameter("usuario"));
                uname.setPassword(request.getParameter("contrasenia"));
                if ((uname.getNombreEmpleado().toString().equals(listaEmpleados.get(i).getNombreEmpleado().toString()))
                        && (uname.getPassword().toString().equals(listaEmpleados.get(i).getPassword().toString()))) {
                    if (listaEmpleados.get(i).getTipoUsuario().toString().equals("Administrador")) {
                        us = true;
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h3>Bienvenido ");
 out.println(uname.getNombreEmpleado().toString());
      out.write("</h3>\n");
      out.write("        <P> <B>PORTAL PARA LOS PRODUCTOS</B> </P>\n");
      out.write("        <input type=\"button\" onclick=\" location.href = 'EliminarProducto.jsp' \" value=\"Productos\" name=\"boton1\" />\n");
      out.write("        <P> <B>PORTAL PARA LA CONFIGURACION DE CLIENTES</B> </P>\n");
      out.write("        <input type=\"button\" onclick=\" location.href = 'EliminarCliente.jsp' \" value=\"Clientes\" name=\"boton\" />\n");
      out.write("         <P> <B>Ingresar Nuevo Empleado</B> </P>\n");
      out.write("        <input type=\"button\" onclick=\" location.href = 'InsertarEmpleado.jsp' \" value=\"Registrar Empleado\" name=\"boton2\" />\n");
      out.write("    </center>\n");
      out.write("        \n");
      out.write("    ");
  break;
    } else {
        us = true;
    
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h3>ACCESO DENEGADO - SOLO PERSONAL AUTORIZADO</h3>\n");
      out.write("        <a href=\"Principal.html\">Pagina Principal</a>\n");
      out.write("    </center>\n");
      out.write("    ");
   break;
                }
            }
        }
        if (us == false) {
    
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h3>El usuario y/ó contraseña son incorrectos.</h3>\n");
      out.write("        <a href=\"AutentificarEmpleado.jsp\">Intentar de nuevo</a>\n");
      out.write("    </center>\n");
      out.write("    ");
                }
        }

    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
