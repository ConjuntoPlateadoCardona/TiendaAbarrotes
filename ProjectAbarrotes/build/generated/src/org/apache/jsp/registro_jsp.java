package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.JasperException;
import Beans.ClienteDAO;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
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
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\" title=\"style\">\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function permite(elEvento, permitidos) { // Variables que definen los caracteres permitidos \n");
      out.write("                var numeros = \"0123456789\";\n");
      out.write("                var caracteres = \" abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ\";\n");
      out.write("                var numeros_caracteres = numeros + caracteres;\n");
      out.write("                var teclas_especiales = [8, 37, 39, 46];\n");
      out.write("                // 8 = BackSpace, 46 = Supr, 37 = flecha izquierda, 39 = flecha derecha \n");
      out.write("                // Seleccionar los caracteres a partir del parámetro de la función \n");
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
      out.write("        <div id=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                 ");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <li><a href=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\"  class = \"normalMenu\">Conocenos</a></li>\n");
      out.write("                        <li><a href=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\"  class = \"normalMenu\">Productos </a></li>\n");
      out.write("                        <li><a href=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\"  class = \"normalMenu\">Contacto</a></li>\n");
      out.write("                        <li><a href=\"");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("\"  class = \"normalMenu\">Ingresar</a></li>\n");
      out.write("                        <li><a href=\"");
      if (_jspx_meth_c_out_4(_jspx_page_context))
        return;
      out.write("\"  class = \"normalMenu\">Registrate_Aquí</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        ");

            if (request.getParameter("submit") == null) {
        
      out.write(" \n");
      out.write("        <form onsubmit=\"return validacion()\">\n");
      out.write("            <CENTER>\n");
      out.write("                <HR>\n");
      out.write("                <I>Crear Cuenta Cliente</I>\n");
      out.write("                <table border=\"1\"  cellpadding=\"0\" cellspacing=\"0\" \n");
      out.write("                       height=\"40%\" width=\"25\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Nombre\" name=\"nombre\" placeholder=\"Nombre\"\n");
      out.write("                                   title=\"Nombre del cliente\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                                   onkeypress=\"return permite(event, 'car')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Apell_pat\" name=\"apellPat\" placeholder=\"Apellido paterno \"\n");
      out.write("                                   title=\"Apellido Paterno\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                                   onkeypress=\"return permite(event, 'car')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Apell_mat\" name=\"apellMat\" placeholder=\"Apellido materno\"\n");
      out.write("                                   title=\"Apellido materno\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                                   onkeypress=\"return permite(event, 'car')\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div id=\"datetimepicker\" class=\"input-append date\">\n");
      out.write("                                <input id=\"Fecha_nac\" type=\"text\" name=\"fechaNac\" title=\"Fecha de nacimiento\"\n");
      out.write("                                       placeholder=\"Fecha de nacimiento\" size=\"25\"/>\n");
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
      out.write("                                $('#datetimepicker').datetimepicker({\n");
      out.write("                                    format: 'yyyy-MM-dd',\n");
      out.write("                                    language: 'pt-EN'\n");
      out.write("                                });\n");
      out.write("                            </script>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"RFC\" name=\"rfc\" placeholder=\"RFC \"\n");
      out.write("                                   title=\"RFC cliente\" type=\"text\" value=\"\" size=\"25\"\n");
      out.write("                                   onkeypress=\"return permite(event, 'num_car')\"/>\n");
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
      out.write("                                   title=\"Telefono\" type=\"text\" value=\"\" size=\"10\" onkeypress=\"return limita(10);\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"submit\" name=\"submit\" type=\"submit\" value=\"Crear\">\n");
      out.write("                            <input id=\"limpiar\" name=\"limpiar\" type=\"reset\" value=\"Limpiar\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <a href=\"Principal.html\">Pagina Principal</a>\n");
      out.write("            </CENTER>\n");
      out.write("        </form> \n");
      out.write("        ");
        } else {
                try{ 
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
      out.write("        \n");
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
      out.write("                    ");
 
      out.write("\n");
      out.write("                    <td>");
      out.print( cliente.getIdCliente());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getNombre());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getApellPat());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getApellMat());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getFechaNac());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getRfc());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getCorreo());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getPassword());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getDireccion());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cliente.getTelefono());
      out.write("</td>\n");
      out.write("                    ");
 
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            <h2>Registro completado</h2>\n");
      out.write("        </tbody>\n");
      out.write("    </table> \n");
      out.write("    ");
 } else {
      out.write("\n");
      out.write("    <h2>Lo sentimos, no se pudo crear la cuenta</h2>\n");
      out.write("    ");
}
        }catch(NumberFormatException e){}
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/Conocenos.jsp");
    _jspx_th_c_url_0.setVar("itemDetailsURL");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_0);
    _jspx_th_c_param_0.setName("itemId");
    _jspx_th_c_param_0.setValue("Dev");
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/Productos.jsp");
    _jspx_th_c_url_1.setVar("itemProducto");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_url_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_1.setPageContext(_jspx_page_context);
    _jspx_th_c_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_1.setName("itemIdPro");
    _jspx_th_c_param_1.setValue("DevProducto");
    int _jspx_eval_c_param_1 = _jspx_th_c_param_1.doStartTag();
    if (_jspx_th_c_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/Contacto.jsp");
    _jspx_th_c_url_2.setVar("itemContacto");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_url_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_2 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_2.setPageContext(_jspx_page_context);
    _jspx_th_c_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_2.setName("itemIdCon");
    _jspx_th_c_param_2.setValue("DevContacto");
    int _jspx_eval_c_param_2 = _jspx_th_c_param_2.doStartTag();
    if (_jspx_th_c_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/Acceso.jsp");
    _jspx_th_c_url_3.setVar("itemAcceso");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_url_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_3 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_3.setPageContext(_jspx_page_context);
    _jspx_th_c_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
    _jspx_th_c_param_3.setName("itemIdAcc");
    _jspx_th_c_param_3.setValue("DevAcceso");
    int _jspx_eval_c_param_3 = _jspx_th_c_param_3.doStartTag();
    if (_jspx_th_c_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/registro.jsp");
    _jspx_th_c_url_4.setVar("itemRegistro");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_param_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_url_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_param_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_4 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_4.setPageContext(_jspx_page_context);
    _jspx_th_c_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_4.setName("itemIdReg");
    _jspx_th_c_param_4.setValue("DevRegistro");
    int _jspx_eval_c_param_4 = _jspx_th_c_param_4.doStartTag();
    if (_jspx_th_c_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemDetailsURL}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemProducto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemContacto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemAcceso}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent(null);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemRegistro}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }
}
