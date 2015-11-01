package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Beans.ClienteDAO;
import java.util.List;
import Mapeos.Cliente;

public final class EliminarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \n");
      out.write("    \n");
      out.write("     \n");
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Empleado</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Portal de información del cliente</h1>\n");
      out.write("        ");
 ClienteDAO clienteDAO = new ClienteDAO();
            List<Cliente> listaClientes = clienteDAO.obtenListaCliente();
        
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <HR> \n");
      out.write("            <I>Para eliminar un cliente seleccionarlo en la columna final <a href=\"AutentificarEmpleado.jsp\">  Cerrar Sesion</a></I>.\n");
      out.write("            </HR>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID cliente</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Apellido paterno</th>\n");
      out.write("                        <th>Apellido materno</th>\n");
      out.write("                        <th>Fecha de nacimiento</th>\n");
      out.write("                        <th>RFC</th>\n");
      out.write("                        <th>Correo</th>\n");
      out.write("                        <th>Contraseña</th>\n");
      out.write("                        <th>Direccion</th>\n");
      out.write("                        <th>Telefono</th>\n");
      out.write("                        <th>Carrito</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
  for (Cliente a : listaClientes) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( a.getIdCliente() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( a.getNombre() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( a.getApellPat() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( a.getApellMat() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( a.getFechaNac() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( a.getRfc() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( a.getCorreo() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( a.getPassword() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( a.getDireccion() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( a.getTelefono() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( a.getCarrito() );
      out.write("</td>\n");
      out.write("                        <td><input type=\"checkbox\" name=\"cbactores\" value=\"");
      out.print(a.getIdCliente());
      out.write("\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" value=\"Eliminar Seleccionados\" name=\"eliminar\" />\n");
      out.write("            <input type=\"button\" onclick=\" location.href='ModificarCliente.jsp' \" value=\"Actualizar Cliente \" name=\"boton\" />\n");
      out.write("            <input type=\"button\" onclick=\" location.href='InsertarCliente.jsp' \" value=\"Insertar Cliente \" name=\"boton1\" />\n");
      out.write("        </form>\n");
      out.write("        ");

            if (request.getParameter("eliminar") != null) {
                String[] chbClientes = request.getParameterValues("cbactores");
                for (int i = 0; i < chbClientes.length; i++) {
                    out.println("<li>" + chbClientes[i]);
                    clienteDAO.eliminaCliente(Short.valueOf(chbClientes[i]));
                    out.println(" El cliente ha sido eliminado");
                }
            }
        
      out.write("\n");
      out.write("    </body>\n");
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
