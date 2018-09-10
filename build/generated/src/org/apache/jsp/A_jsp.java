package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class A_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"body\">\n");
      out.write("      <div class=\"inner\">\n");
      out.write("        <div class=\"leftbox\">\n");
      out.write("          <h3>Star Wars Trilogy (Widescreen Edition)</h3>\n");
      out.write("          <img src=\"images/photo_1.jpg\" width=\"93\" height=\"95\" alt=\"photo 1\" class=\"left\" />\n");
      out.write("          <p><b>Price:</b> <b>$225.97</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$195</b>.</p>\n");
      out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\n");
      out.write("          <p class=\"readmore\"><a href=\"http://all-free-download.com/free-website-templates/\">BUY <b>NOW</b></a></p>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end .leftbox -->\n");
      out.write("        <div class=\"rightbox\">\n");
      out.write("          <h3>Batman - The Animated Series </h3>\n");
      out.write("          <img src=\"images/photo_4.jpg\" width=\"107\" height=\"91\" alt=\"photo 4\" class=\"left\" />\n");
      out.write("          <p><b>Price:</b> <b>$125</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$105</b>.</p>\n");
      out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\n");
      out.write("          <p class=\"readmore\"><a href=\"http://all-free-download.com/free-website-templates/\">BUY <b>NOW</b></a></p>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end .rightbox -->\n");
      out.write("        <div class=\"clear br\"></div>\n");
      out.write("        <div class=\"leftbox\">\n");
      out.write("          <h3>Harry Potter and the Prisoner of Azkaban </h3>\n");
      out.write("          <img src=\"images/photo_2.jpg\" width=\"93\" height=\"101\" alt=\"photo 2\" class=\"left\" />\n");
      out.write("          <p><b>Price:</b> <b>$350</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$295</b>.</p>\n");
      out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\n");
      out.write("          <p class=\"readmore\"><a href=\"http://all-free-download.com/free-website-templates/\">BUY <b>NOW</b></a></p>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end .leftbox -->\n");
      out.write("        <div class=\"rightbox\">\n");
      out.write("          <h3>Blade - Trinity (New Platinum Series)</h3>\n");
      out.write("          <img src=\"images/photo_5.jpg\" width=\"90\" height=\"103\" alt=\"photo 5\" class=\"left\" />\n");
      out.write("          <p><b>Price:</b> <b>$115</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$95</b>.</p>\n");
      out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\n");
      out.write("          <p class=\"readmore\"><a href=\"http://all-free-download.com/free-website-templates/\">BUY <b>NOW</b></a></p>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end .rightbox -->\n");
      out.write("        <div class=\"clear br\"></div>\n");
      out.write("        <div class=\"leftbox\">\n");
      out.write("          <h3>Million Dollar Baby (Widescreen Edition)</h3>\n");
      out.write("          <img src=\"images/photo_3.jpg\" width=\"106\" height=\"100\" alt=\"photo 3\" class=\"left\" />\n");
      out.write("          <p><b>Price:</b> <b>$105.97</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$99</b>.</p>\n");
      out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\n");
      out.write("          <p class=\"readmore\"><a href=\"http://all-free-download.com/free-website-templates/\">BUY <b>NOW</b></a></p>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end .leftbox -->\n");
      out.write("        <div class=\"rightbox\">\n");
      out.write("          <h3>The Matrix Reloaded (Full Screen Edition)</h3>\n");
      out.write("          <img src=\"images/photo_6.jpg\" width=\"91\" height=\"99\" alt=\"photo 6\" class=\"left\" />\n");
      out.write("          <p><b>Price:</b> <b>$75</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$55</b>.</p>\n");
      out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\n");
      out.write("          <p class=\"readmore\"><a href=\"http://all-free-download.com/free-website-templates/\">BUY <b>NOW</b></a></p>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end .rightbox -->\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("      </div>\n");
      out.write("      <!-- end .inner -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("       ");
      out.write("\n");
      out.write("            \n");
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
