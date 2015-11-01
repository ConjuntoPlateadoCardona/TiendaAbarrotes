package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Mapeos.Empleado;
import java.util.List;
import java.util.ArrayList;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      Mapeos.Empleado login = null;
      synchronized (_jspx_page_context) {
        login = (Mapeos.Empleado) _jspx_page_context.getAttribute("login", PageContext.PAGE_SCOPE);
        if (login == null){
          login = new Mapeos.Empleado();
          _jspx_page_context.setAttribute("login", login, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("login"), request);
      out.write('\n');

    int existe = 0;
    if (application.getAttribute("empleado") == null) {
        application.setAttribute("empleado", new ArrayList());
    }

    ArrayList listaEmpleados = (ArrayList) application.getAttribute("empleado");
      for (int b = 0; b < listaEmpleados.size(); b++) {
        Empleado clt = (Empleado) listaEmpleados.get(b);
        if (clt.getNombreEmpleado().equals(login.getNombreEmpleado())
                && clt.getPassword().equals(login.getPassword())) {
            existe = 1;
        }
    }     
    /*
     String userid = request.getParameter("uname");
     String pwd = request.getParameter("pass");
     */
    /*if (existe == 1) {
        session.setAttribute("NombreEmpleado", login.getNombreEmpleado());
        //out.println("welcome " + login.getUname());
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("compra.jsp");
    } else {
        out.println("Datos no validos <a href='AutentificarAdmon.jsp'>Intenta de nuevo</a>");
    }*/

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
