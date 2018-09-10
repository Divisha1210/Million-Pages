package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_q_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_q_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_q_form_action.release();
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
      out.write("        ");
      out.write("\n");
      out.write("<style>\n");
      out.write("            input[type=submit] {\n");
      out.write("    width: 10%;\n");
      out.write("    background-color:#4CAF50 ;\n");
      out.write("    color: white;\n");
      out.write("    padding: 5px 5px;\n");
      out.write("    margin: 4px ;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor:pointer;\n");
      out.write("}\n");
      out.write("input[type=reset] {\n");
      out.write("    width: 10%;\n");
      out.write("    background-color:#4CAF50 ;\n");
      out.write("    color: white;\n");
      out.write("    padding: 5px 5px;\n");
      out.write("    margin: 4px ;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("\n");
      out.write("}\n");
      out.write("     \n");
      out.write("        label{\n");
      out.write("display:inline-block;\n");
      out.write("width:200px;\n");
      out.write("margin-right:30px;\n");
      out.write("text-align:right;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("</head>    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    <body background=\"image/reg.png\" width='1520'>\n");
      out.write("    <center>\n");
      out.write("    ");
      if (_jspx_meth_q_form_0(_jspx_page_context))
        return;
      out.write("   </center>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
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

  private boolean _jspx_meth_q_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  q:form
    org.apache.struts.taglib.html.FormTag _jspx_th_q_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_q_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_q_form_0.setPageContext(_jspx_page_context);
    _jspx_th_q_form_0.setParent(null);
    _jspx_th_q_form_0.setAction("/register");
    int _jspx_eval_q_form_0 = _jspx_th_q_form_0.doStartTag();
    if (_jspx_eval_q_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <table width='100%' height='100'>\n");
        out.write("  &nbsp;&nbsp;&nbsp;&nbsp;\n");
        out.write("  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h1>REGISTER</h1> <br>\n");
        out.write("  <h3>   <label for=\"name\">Name:</label> <input type=\"text\" name=\"name\" size=\"35\" align='left'/><br><br>\n");
        out.write("       <label for=\"email\">e-mail:</label> <input type=\"text\" name=\"mail\" size=\"35\" align='left'/><br><br>\n");
        out.write("     <label for=\"pass\">Password:</label><input type=\"password\" name=\"msg\" size=\"35\" align='left'/>\n");
        out.write("     <br><br>\n");
        out.write("    <label for=\"rpass\">Re-enter Password:</label><input type=\"password\" name=\"remsg\" size=\"35\" align='left'/>   \n");
        out.write("    <br><br>\n");
        out.write("    <input type='submit' name=\"t\" value=\"Register\"/>&nbsp;&nbsp;&nbsp;&nbsp;\n");
        out.write("        <input type=\"reset\" value=\"Reset\"/>\n");
        out.write("  </h3>  </table>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_q_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_q_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_q_form_action.reuse(_jspx_th_q_form_0);
      return true;
    }
    _jspx_tagPool_q_form_action.reuse(_jspx_th_q_form_0);
    return false;
  }
}
