package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Mapeos.Cliente;
import java.util.List;
import Beans.ClienteDAO;

public final class ModificarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cliente</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Portal de modificacion de datos del cliente</h1>\n");
      out.write("        ");
 ClienteDAO clienteDAO = new ClienteDAO();
            List<Cliente> listaClientes = clienteDAO.obtenListaCliente();
            int valor = 0;
        
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <CENTER>\n");
      out.write("                <HR> \n");
      out.write("                <I>Para modificar un cliente seleccionar las filas desde el primer cliente hasta el que se desea modificar en la columna final.<a href=\"AutentificarEmpleado.jsp\">Cerrar Sesion</a> </I>.\n");
      out.write("                </HR>\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID cliente</th>\n");
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
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
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

                            valor = a.getIdCliente().intValue();
                        }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <input type=\"submit\" value=\"Actualizar seleccionado\" name=\"actualizar\" />\n");
      out.write("                <a href=\"EliminarCliente.jsp\">Regresar</a>\n");
      out.write("                ");

                    if ((request.getParameter("actualizar") != null)) {
                
      out.write("\n");
      out.write("                <h2>");
      out.print(valor);
      out.write("</h2>\n");
      out.write("                <h2>Insertar producto</h2>\n");
      out.write("                <table border=\"1\"  cellpadding=\"0\" cellspacing=\"0\" height=\"40%\" width=\"25\">\n");
      out.write("                    ");
      Mapeos.Cliente producto = null;
      synchronized (_jspx_page_context) {
        producto = (Mapeos.Cliente) _jspx_page_context.getAttribute("producto", PageContext.PAGE_SCOPE);
        if (producto == null){
          producto = new Mapeos.Cliente();
          _jspx_page_context.setAttribute("producto", producto, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("producto"), request);
      out.write("\n");
      out.write("                    ");

                        String[] chbProductos = request.getParameterValues("cbactores");
                        for (int i = 0; i <= chbProductos.length; i++) {
                            if (i == chbProductos.length) {
                                
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Nombre\" name=\"nombre\" placeholder=\"Nombre\"\n");
      out.write("                                   title=\"Nombre del cliente\" type=\"text\" value=\"");
      out.print( listaClientes.get(i - 1).getNombre() );
      out.write(" \" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Apell_pat\" name=\"apellPat\" placeholder=\"Apellido paterno \"\n");
      out.write("                                   title=\"Apellido Paterno\" type=\"text\" value=\"");
      out.print( listaClientes.get(i - 1).getApellPat() );
      out.write("\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Apell_mat\" name=\"apellMat\" placeholder=\"Apellido materno\"\n");
      out.write("                                   title=\"Apellido materno\" type=\"text\" value=\"");
      out.print( listaClientes.get(i - 1).getApellMat() );
      out.write("\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Fecha_nac\" name=\"fechaNac\" placeholder=\"Fecha de nacimiento \"\n");
      out.write("                                   title=\"Fecha de nacimiento\" type=\"text\" value=\"");
      out.print( listaClientes.get(i - 1).getFechaNac() );
      out.write("\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"RFC\" name=\"rfc\" placeholder=\"RFC \"\n");
      out.write("                                   title=\"RFC cliente\" type=\"text\" value=\"");
      out.print( listaClientes.get(i - 1).getRfc() );
      out.write("\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Correo\" name=\"correo\" placeholder=\"Email\"\n");
      out.write("                                   title=\"Correo electronico\" type=\"text\" value=\"");
      out.print( listaClientes.get(i - 1).getCorreo() );
      out.write("\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Password\" name=\"password\" placeholder=\"Contraseña\"\n");
      out.write("                                   title=\"Contraseña\" type=\"password\" value=\"");
      out.print( listaClientes.get(i - 1).getPassword() );
      out.write("\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"direccion\" name=\"direccion\" placeholder=\"Dirección\"\n");
      out.write("                                   title=\"Dirección\" type=\"text\" value=\"");
      out.print( listaClientes.get(i - 1).getDireccion() );
      out.write("\" size=\"25\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"telefono\" name=\"telefono\" placeholder=\"Telefono\"\n");
      out.write("                                   title=\"Telefono\" type=\"text\" value=\"");
      out.print( listaClientes.get(i - 1).getTelefono() );
      out.write("\" size=\"10\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"carrito\" name=\"carrito\" placeholder=\"Carrito\"\n");
      out.write("                                   title=\"Carrito\" type=\"text\" value=\"");
      out.print( listaClientes.get(i - 1).getCarrito() );
      out.write("\" size=\"10\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"submit\" name=\"submit\" type=\"submit\" value=\"Crear\">\n");
      out.write("                            <input type=\"reset\" value=\"Limpiar\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </CENTER>\n");
      out.write("        </form>\n");
      out.write("        ");

                    }
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
