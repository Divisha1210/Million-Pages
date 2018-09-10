package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        label{\n");
      out.write("display:inline-block;\n");
      out.write("width:100px;\n");
      out.write("margin-left:30px;\n");
      out.write("text-align:left;\n");
      out.write("}\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("<br><br>\n");
      out.write("    <body background=\"image/loli.png\" width='1520'>\n");
      out.write("        <table width=\"100%\" height=\"70\"/>\n");
      out.write("    <center><h2>\n");
      out.write("         \n");
      out.write("          &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Enter the following details and we will contact you later.<br><br>\n");
      out.write("    <label for=\"name\">Name:</label> <input type=\"text\" name=\"name\" size=\"35\" align='left'/><br><br>\n");
      out.write("       <label for=\"email\">e-mail:</label> <input type=\"text\" name=\"mail\" size=\"35\" align='left'/><br><br>\n");
      out.write("     <label for=\"msg\">Message:</label><input type=\"text\" name=\"msg\" size=\"35\" align='left'   \n");
      out.write("   style=\"height:200px\"/>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<br><br></h2>\n");
      out.write("    </center>\n");
      out.write("</table>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
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
