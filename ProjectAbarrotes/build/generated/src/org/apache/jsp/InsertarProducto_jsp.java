package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Beans.ProductoDAO;

public final class InsertarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("                valor1 = document.getElementById(\"Nombre_producto\").value;\n");
      out.write("                if (valor1 == null || valor1.length == 0 || /^\\s+$/.test(valor1))\n");
      out.write("                {\n");
      out.write("                    alert(\"*Falta el Nombre\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor2 = document.getElementById(\"Presentación\").value;\n");
      out.write("                if (isNaN(valor2)) {\n");
      out.write("                    alert(\"*Indica la Presentacion\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor3 = document.getElementById(\"Caducidad\").value;\n");
      out.write("                if (isNaN(valor3)) {\n");
      out.write("                    alert(\"*Indica Caducidad\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor4 = document.getElementById(\"PProveedor\").value;\n");
      out.write("                if (isNaN(valor4)) {\n");
      out.write("                    alert(\"*Indica Precio del Proveedor\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor5 = document.getElementById(\"PUnitario\").value;\n");
      out.write("                if (isNaN(valor5)) {\n");
      out.write("                    alert(\"*Indica Precio Unitario\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor6 = document.getElementById(\"Existencias\").value;\n");
      out.write("                if (isNaN(valor6)) {\n");
      out.write("                    alert(\"*Indica el numero en existencia\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor7 = document.getElementById(\"Fech\").value;\n");
      out.write("                if (isNaN(valor7)) {\n");
      out.write("                    alert(\"*Indica Fecha de llegada\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor8 = document.getElementById(\"Marca\").value;\n");
      out.write("                if (isNaN(valor8)) {\n");
      out.write("                    alert(\"*Indica la Marca\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("                valor9 = document.getElementById(\"IdProveedor\").value;\n");
      out.write("                if (isNaN(valo9)) {\n");
      out.write("                    alert(\"*Inica ID del Proveedor\");\n");
      out.write("                    //return false; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <title> Nuevo Producto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Portal de registro de nuevos productos</h1>\n");
      out.write("        ");

            if (request.getParameter("submit") == null) {
        
      out.write(" \n");
      out.write("        <form onsubmit=\"return validacion()\">\n");
      out.write("            <CENTER>\n");
      out.write("                <HR>\n");
      out.write("                <I>Insertar Producto.<a href=\"AutentificarEmpleado.jsp\">Cerrar Sesion</a></I>\n");
      out.write("                <table border=\"1\"  cellpadding=\"0\" cellspacing=\"0\" \n");
      out.write("                       height=\"40%\" width=\"25\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Nombre_producto\" name=\"nombreProducto\" placeholder=\"Nombre de producto\"\n");
      out.write("                                   title=\"Nombre de producto\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                                   onkeypress=\"return permite(event, 'car')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input id=\"Presentacion\" name=\"presentacion\" placeholder=\"Presentacion\"\n");
      out.write("                               title=\"Presentacion\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                               onkeypress=\"return permite(event, 'num_car')\"/>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div id=\"datetimepicker\" class=\"input-append date\">\n");
      out.write("                                <input id=\"Caducidad\" type=\"text\" name=\"caducidad\" title=\"Caducidad\"/>\n");
      out.write("                        <span class=\"add-on\">\n");
      out.write("                            <i data-time-icon=\"icon-time\" data-date-icon=\"icon-calendar\"></i>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                    <script type=\"text/javascript\"\n");
      out.write("                            src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.3/jquery.min.js\">\n");
      out.write("                    </script> \n");
      out.write("                    <script type=\"text/javascript\"\n");
      out.write("                            src=\"http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/js/bootstrap.min.js\">\n");
      out.write("                    </script>\n");
      out.write("                    <script type=\"text/javascript\"\n");
      out.write("                            src=\"http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js\">\n");
      out.write("                    </script>\n");
      out.write("                    <script type=\"text/javascript\"\n");
      out.write("                            src=\"http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.pt-BR.js\">\n");
      out.write("                    </script>\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        $('#datetimepicker').datetimepicker({\n");
      out.write("                            format: 'yyyy-MM-dd',\n");
      out.write("                            language: 'pt-EN'\n");
      out.write("                        });\n");
      out.write("                    </script>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"PProveedor\" name=\"precioProv\" placeholder=\"Precio Proveedor\"\n");
      out.write("                                   title=\"PrecioProveedor\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                                   onkeypress=\"return permite(event, 'num')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"PUnitario\" name=\"precioUni\" placeholder=\"Precio Unitario\"\n");
      out.write("                                   title=\"Precio Unitario\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                                   onkeypress=\"return permite(event, 'num')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Existencias\" name=\"existencias\" placeholder=\"Existencias\"\n");
      out.write("                                   title=\"Existencias ---\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                                   onkeypress=\"return permite(event, 'num')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input id=\"Fech\" name=\"fech\" placeholder=\"Fecha\"\n");
      out.write("                               title=\"Fecha\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                               onkeypress=\"return permite(event, 'num_car')\"/>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Marca\" name=\"marca\" placeholder=\"Marca\"\n");
      out.write("                                   title=\"Marca\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                                   onkeypress=\"return permite(event, 'num_car')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"IdProveedor\" name=\"idProveedor\" placeholder=\"IdProveedor\"\n");
      out.write("                                   title=\"ID de Proveedor\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                                   onkeypress=\"return permite(event, 'num')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"submit\" name=\"submit\" type=\"submit\" value=\"Crear\">\n");
      out.write("                            <input id=\"limpiar\" name=\"limpiar\" type=\"reset\" value=\"Limpiar\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <a href=\"EliminarProducto.jsp\">Regresar</a>\n");
      out.write("            </CENTER>\n");
      out.write("        </form>\n");
      out.write("        ");
        } else {
      out.write("\n");
      out.write("        ");
      Mapeos.Producto producto = null;
      synchronized (_jspx_page_context) {
        producto = (Mapeos.Producto) _jspx_page_context.getAttribute("producto", PageContext.PAGE_SCOPE);
        if (producto == null){
          producto = new Mapeos.Producto();
          _jspx_page_context.setAttribute("producto", producto, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("producto"), request);
      out.write("\n");
      out.write("        ");

            ProductoDAO pregistro = new ProductoDAO();
            int NoProducto = pregistro.guardaProducto(producto);
            if (NoProducto > 0) {
        
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Numero producto</th>\n");
      out.write("                    <th>Nombre producto</th>\n");
      out.write("                    <th>Presentacion</th>\n");
      out.write("                    <th>Caducidad</th>\n");
      out.write("                    <th>P. Proveedor</th>\n");
      out.write("                    <th>P. Unitario</th>\n");
      out.write("                    <th>Existencias</th>\n");
      out.write("                    <th>Fecha</th>\n");
      out.write("                    <th>Marca</th>\n");
      out.write("                    <th>Id proveedor</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( producto.getIdProducto());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( producto.getNombreProducto());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( producto.getPresentacion());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( producto.getCaducidad());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( producto.getPrecioProv());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( producto.getPrecioUni());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( producto.getExistencias());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( producto.getFech());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( producto.getMarca());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( producto.getIdProveedor());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            <h2>Empleado agregado</h2>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    <a href=\"EliminarProducto.jsp\">Regresar</a>\n");
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
