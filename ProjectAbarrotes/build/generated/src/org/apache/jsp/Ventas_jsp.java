package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Mapeos.Producto;
import Mapeos.Cliente;
import java.util.List;
import Beans.ProductoDAO;
import Beans.ClienteDAO;

public final class Ventas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      Mapeos.Producto var1 = null;
      synchronized (_jspx_page_context) {
        var1 = (Mapeos.Producto) _jspx_page_context.getAttribute("var1", PageContext.PAGE_SCOPE);
        if (var1 == null){
          var1 = new Mapeos.Producto();
          _jspx_page_context.setAttribute("var1", var1, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      Mapeos.Cliente var2 = null;
      synchronized (_jspx_page_context) {
        var2 = (Mapeos.Cliente) _jspx_page_context.getAttribute("var2", PageContext.PAGE_SCOPE);
        if (var2 == null){
          var2 = new Mapeos.Cliente();
          _jspx_page_context.setAttribute("var2", var2, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\" title=\"style\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>producto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Portal de información del producto</h1>\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                            <li><a href=\"Conocenos.jsp\"  class = \"normalMenu\">Conocenos</a></li>\n");
      out.write("                            <li><a href=\"Productos.jsp\"  class = \"normalMenu\">Productos </a></li>\n");
      out.write("                            <li><a href=\"Contacto.jsp\"  class = \"normalMenu\">Contacto</a></li>\n");
      out.write("                            <li><a href=\"Acceso.jsp\"  class = \"normalMenu\">Ingresar</a></li>\n");
      out.write("                            <li> <a href=\"registro.jsp\"  class = \"normalMenu\">Registrate_Aquí</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("        ");
 ProductoDAO productoDAO = new ProductoDAO();
            List<Producto> listaproductos = productoDAO.obtenListaProducto();

            ClienteDAO clienteDAO = new ClienteDAO();
            List<Cliente> listaclientes = clienteDAO.obtenListaCliente();
            int valor = 0;
        
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <CENTER>\n");
      out.write("                <HR> \n");
      out.write("                <I>Selecciona en la columna final el producto que deseas comprar.</I>.\n");
      out.write("                </HR>\n");
      out.write("                ");
  
                    String name = request.getParameter("usuario");
                    for (Cliente b : listaclientes) {
                
      out.write("\n");
      out.write("                <I>----------  </I><tr><I>BIENBENID@</I>.");
      out.print( name);
      out.write("<I></tr> \n");
      out.write("                    <I>----------  </I><th>SU CARRITO</I>. ");
      out.print( b.getCarrito());
      out.write("</th>\n");
      out.write("                <I>----------  </I><a href=\"Acceso.jsp\">Cerrar Sesion</a>\n");
      out.write("                    ");
 }
                    
      out.write("\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Nombre producto</th>\n");
      out.write("                            <th>Presentacion</th>\n");
      out.write("                            <th>Caducidad</th>\n");
      out.write("                            <th>P. Unitario</th>\n");
      out.write("                            <th>Fecha</th>\n");
      out.write("                            <th>Marca</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
  for (Producto a : listaproductos) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( a.getNombreProducto());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( a.getPresentacion());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( a.getCaducidad());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( a.getPrecioUni());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( a.getFech());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( a.getMarca());
      out.write("</td>\n");
      out.write("                            <td><input type=\"checkbox\" name=\"cbactores\" value=\"");
      out.print(a.getIdProducto());
      out.write("\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                                valor = a.getIdProducto();
                            }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <input type=\"submit\" value=\"Comprar\" name=\"comprar\" />\n");
      out.write("                ");

                    int compra = 0;
                    if (request.getParameter("comprar") != null) {
                
      out.write("\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    ");
      Mapeos.Producto producto = null;
      synchronized (_jspx_page_context) {
        producto = (Mapeos.Producto) _jspx_page_context.getAttribute("producto", PageContext.PAGE_SCOPE);
        if (producto == null){
          producto = new Mapeos.Producto();
          _jspx_page_context.setAttribute("producto", producto, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("producto"), request);
      out.write("\n");
      out.write("                    ");

                        String[] chbproductos = request.getParameterValues("cbactores");
                        for (int i = 0; i <= chbproductos.length; i++) {
                            if (i == chbproductos.length) {
                                compra = listaclientes.get(i - 1).getCarrito() - listaproductos.get(i - 1).getExistencias().intValue();
                                listaclientes.get(i - 1).setCarrito(compra);
                                //listaclientes.remove(i - 1).getCarrito();
                                out.println("*Compra efectuada*  " + "Carrito actual: " + compra);
                                //var1.setExistencias(var1.getExistencias() - 1);
                    
      out.write("\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Nombre producto</th>\n");
      out.write("                            <th>Presentacion</th>\n");
      out.write("                            <th>Caducidad</th>\n");
      out.write("                            <th>P. Unitario</th>\n");
      out.write("                            <th>Marca</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( listaproductos.get(i - 1).getNombreProducto());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( listaproductos.get(i - 1).getPresentacion());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( listaproductos.get(i - 1).getCaducidad());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( listaproductos.get(i - 1).getPrecioUni());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( listaproductos.get(i - 1).getMarca());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <a href=\"Ventas.jsp\">Realizar otra compra.</a>\n");
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
