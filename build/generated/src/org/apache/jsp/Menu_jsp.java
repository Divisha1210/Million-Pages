package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    body {\n");
      out.write("        font-family: Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("        margin: 0;\n");
      out.write("        font-size: 80%;\n");
      out.write("        font-weight: bold;\n");
      out.write("        background: #F3FAFF;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("        list-style: none;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("/* =-=-=-=-=-=-=-[Menu Three]-=-=-=-=-=-=-=- */\n");
      out.write("\n");
      out.write("#menu3 {\n");
      out.write("        width: 200px;\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        margin: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("#menu3 li a {\n");
      out.write("          height: 32px;\n");
      out.write("          voice-family: \"\\\"}\\\"\";\n");
      out.write("          voice-family: inherit;\n");
      out.write("          height: 24px;\n");
      out.write("        text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("#menu3 li a:link, #menu3 li a:visited {\n");
      out.write("        color: #888;\n");
      out.write("        display: block;\n");
      out.write("        background: url(menu3.gif);\n");
      out.write("        padding: 8px 0 0 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("#menu3 li a:hover, #menu3 li #current, #menu3 li a:active {\n");
      out.write("        color: #283A50;\n");
      out.write("        background: url(menu3.gif) 0 -32px;\n");
      out.write("        padding: 8px 0 0 30px;\n");
      out.write("        }\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       <body> <h4> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mesg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("           <div id=\"menu3\">\n");
      out.write("                        <ul>\n");
      out.write("                                <!-- CSS Tabs -->\n");
      out.write("<li><a id=\"current\" href=\"Home.html\">Home</a></li>\n");
      out.write("<li><a href=\"Products.html\">Products</a></li>\n");
      out.write("<li><a href=\"Services.html\">Services</a></li>\n");
      out.write("<li><a href=\"Support.html\">Support</a></li>\n");
      out.write("<li><a href=\"Order.html\">Order</a></li>\n");
      out.write("<li><a href=\"News.html\">News</a></li>\n");
      out.write("<li><a href=\"About.html\">About</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                </div>\n");
      out.write("           ");
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
