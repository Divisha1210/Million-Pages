package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <title>JSP Page</title>\n");
      out.write(" <style>\n");
      out.write(" body {\n");
      out.write("        margin:0;\n");
      out.write("        padding:0;\n");
      out.write("        font: bold 11px/1.5em Verdana;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("        font: bold 14px Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("        color: #000;\n");
      out.write("        margin: 0px;\n");
      out.write("        padding: 0px 0px 0px 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*- Menu Tabs D--------------------------- */\n");
      out.write("\n");
      out.write("    #tabsD {\n");
      out.write("      float:left;\n");
      out.write("      width:100%;\n");
      out.write("      background:#FCF3F8;\n");
      out.write("      font-size:10px;\n");
      out.write("      line-height:normal;\n");
      out.write("          border-bottom:1px solid #F4B7D6;\n");
      out.write("      }\n");
      out.write("    #tabsD ul {\n");
      out.write("        margin:0;\n");
      out.write("        padding:10px 10px 10px 50px;\n");
      out.write("        list-style:none;\n");
      out.write("      }\n");
      out.write("    #tabsD li {\n");
      out.write("      display:inline;\n");
      out.write("      margin:10px;\n");
      out.write("      padding:0;\n");
      out.write("      }\n");
      out.write("    #tabsD a {\n");
      out.write("      float:left;\n");
      out.write("      background:url(\"tableftD.gif\") no-repeat left top;\n");
      out.write("      margin:0;\n");
      out.write("      padding:0 0 0 4px;\n");
      out.write("      text-decoration:none;\n");
      out.write("      }\n");
      out.write("    #tabsD a span {\n");
      out.write("      float:left;\n");
      out.write("      display:block;\n");
      out.write("      background:url(\"tabrightD.gif\") no-repeat right top;\n");
      out.write("      padding:5px 5px 4px 6px;\n");
      out.write("      color:#C7377D;\n");
      out.write("      }\n");
      out.write("    /* Commented Backslash Hack hides rule from IE5-Mac \\*/\n");
      out.write("    #tabsD a span {float:none;}\n");
      out.write("    /* End IE5-Mac hack */\n");
      out.write("    #tabsD a:hover span {\n");
      out.write("      color:#C7377D;\n");
      out.write("      }\n");
      out.write("    #tabsD a:hover {\n");
      out.write("      background-position:0% -42px;\n");
      out.write("      }\n");
      out.write("    #tabsD a:hover span {\n");
      out.write("      background-position:100% -42px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("        #tabsD #current a {\n");
      out.write("                background-position:0% -42px;\n");
      out.write("        }\n");
      out.write("        #tabsD #current a span {\n");
      out.write("                background-position:100% -42px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("p {\n");
      out.write("  text-align: right;\n");
      out.write("  margin-top:0px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table width=\"100%\" >\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1520\" height=\"5\" valign=\"top\">\n");
      out.write("                 ");
      out.write("\n");
      out.write("                    <div style=\"background-color: #ff9966\" align=\"center\" >\n");
      out.write("                        <img src=\"image/h1.jpg\"  width=\"1520\" height=\"145\">\n");
      out.write("                     \n");
      out.write("                    <div id=\"tabsD\">\n");
      out.write("                                <ul>\n");
      out.write("                                  \n");
      out.write("                                    <h2>      \n");
      out.write("                                        <li id=\"current\"><a href=\"Login.jsp\"><span>Home</span></a></li>\n");
      out.write("<li><a href=\"contact.jsp\"><span>Contact Us</span></a></li>\n");
      out.write("<li><a href=\"about.jsp\"><span>About Us</span></a></li>\n");
      out.write("<li><a href=\"MyAccount.jsp\"><span>My Account</span></a></li>       \n");
      out.write("<li><a href=\"Download.jsp\"><span>Download App</span></a></h2>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("Offer ends in :<p id=\"demo\"></p>\n");
      out.write("<script>\n");
      out.write("// Set the date we're counting down to\n");
      out.write("var countDownDate = new Date(\"Sep 5, 2018 15:37:25\").getTime();\n");
      out.write("\n");
      out.write("// Update the count down every 1 second\n");
      out.write("var x = setInterval(function() {\n");
      out.write("\n");
      out.write("    // Get todays date and time\n");
      out.write("    var now = new Date().getTime();\n");
      out.write("    \n");
      out.write("    // Find the distance between now an the count down date\n");
      out.write("    var distance = countDownDate - now;\n");
      out.write("    \n");
      out.write("    // Time calculations for days, hours, minutes and seconds\n");
      out.write("   // var days = Math.floor(distance / (1000 * 60 * 60 * 24));\n");
      out.write("    var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));\n");
      out.write("    var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));\n");
      out.write("    var seconds = Math.floor((distance % (1000 * 60)) / 1000);\n");
      out.write("    \n");
      out.write("    // Output the result in an element with id=\"demo\"\n");
      out.write("    document.getElementById(\"demo\").innerHTML = hours + \"h \"\n");
      out.write("    + minutes + \"m \" + seconds + \"s \";\n");
      out.write("    \n");
      out.write("    // If the count down is over, write some text \n");
      out.write("    if (distance < 0) {\n");
      out.write("        clearInterval(x);\n");
      out.write("        document.getElementById(\"demo\").innerHTML = \"EXPIRED\";\n");
      out.write("    }\n");
      out.write("}, 1000);\n");
      out.write("</script>\n");
      out.write("</li>\n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write(" ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      out.write(" </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
