package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_password_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_text_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_submit_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_password_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_password_property_nobody.release();
    _jspx_tagPool_t_text_property_nobody.release();
    _jspx_tagPool_t_errors_nobody.release();
    _jspx_tagPool_t_form_method_action.release();
    _jspx_tagPool_t_submit_value_nobody.release();
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
      out.write("        <style>\n");
      out.write("            input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    background-color:#4CAF50 ;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px ;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <body bgcolor=\"antiquewhite\">\n");
      out.write("    \n");
      out.write("            \n");
      out.write("  <!-- Set Right Div As your requirement -->\n");
      out.write("\n");
      out.write(" \n");
      out.write("        <div style=\"float:left; width:80%; height:50px;\">\n");
      out.write("  <!-- Set Left Div As your requirement -->\n");
      out.write("  <img src =\"image/qwerty.png\" width=\"1060\" height=\"470\"/>\n");
      out.write("        </div>\n");
      out.write("<div style=\"float:left; width:20%;margin-left:1200px; height:20px; \">\n");
      if (_jspx_meth_t_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("      \n");
      out.write(" \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
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

  private boolean _jspx_meth_t_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:form
    org.apache.struts.taglib.html.FormTag _jspx_th_t_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_t_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_t_form_0.setPageContext(_jspx_page_context);
    _jspx_th_t_form_0.setParent(null);
    _jspx_th_t_form_0.setAction("/log");
    _jspx_th_t_form_0.setMethod("post");
    int _jspx_eval_t_form_0 = _jspx_th_t_form_0.doStartTag();
    if (_jspx_eval_t_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    <div style=\"border-radius: 5px;\n");
        out.write("         background-color: white;\n");
        out.write("    padding: 20px;\">\n");
        out.write("        <table>\n");
        out.write("          <h3>\n");
        out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Login to Million Pages<br><br>\n");
        out.write("                Username :  ");
        if (_jspx_meth_t_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_form_0, _jspx_page_context))
          return true;
        out.write("<br><br>\n");
        out.write("                Password :&nbsp; ");
        if (_jspx_meth_t_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_form_0, _jspx_page_context))
          return true;
        out.write("<br></h3>\n");
        out.write("                <input type=\"checkbox\" name=\"rem\"  value=\"rem\">Remember me on this device<br><br>\n");
        out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
        out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
        out.write("                <div class=\"submit\">");
        if (_jspx_meth_t_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_form_0, _jspx_page_context))
          return true;
        out.write("</div><br><br>\n");
        out.write("                <a href=\"Forgot.jsp\">Forgot Password?</a><br>\n");
        out.write("                New to Million Pages?<a href=\"Register.jsp\">Register</a>\n");
        out.write("    </div>\n");
        out.write("                 <h3>   <font color=\"red\">\n");
        out.write("                     ");
        if (_jspx_meth_t_errors_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_form_0, _jspx_page_context))
          return true;
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</font></h3>\n");
        out.write("        </table>\n");
        int evalDoAfterBody = _jspx_th_t_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_form_method_action.reuse(_jspx_th_t_form_0);
      return true;
    }
    _jspx_tagPool_t_form_method_action.reuse(_jspx_th_t_form_0);
    return false;
  }

  private boolean _jspx_meth_t_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:text
    org.apache.struts.taglib.html.TextTag _jspx_th_t_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_t_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_t_text_0.setPageContext(_jspx_page_context);
    _jspx_th_t_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_form_0);
    _jspx_th_t_text_0.setProperty("t1");
    int _jspx_eval_t_text_0 = _jspx_th_t_text_0.doStartTag();
    if (_jspx_th_t_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_text_property_nobody.reuse(_jspx_th_t_text_0);
      return true;
    }
    _jspx_tagPool_t_text_property_nobody.reuse(_jspx_th_t_text_0);
    return false;
  }

  private boolean _jspx_meth_t_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_t_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_t_password_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_t_password_0.setPageContext(_jspx_page_context);
    _jspx_th_t_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_form_0);
    _jspx_th_t_password_0.setProperty("t2");
    int _jspx_eval_t_password_0 = _jspx_th_t_password_0.doStartTag();
    if (_jspx_th_t_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_password_property_nobody.reuse(_jspx_th_t_password_0);
      return true;
    }
    _jspx_tagPool_t_password_property_nobody.reuse(_jspx_th_t_password_0);
    return false;
  }

  private boolean _jspx_meth_t_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_t_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_t_submit_value_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_t_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_t_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_form_0);
    _jspx_th_t_submit_0.setValue("Login");
    int _jspx_eval_t_submit_0 = _jspx_th_t_submit_0.doStartTag();
    if (_jspx_th_t_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_submit_value_nobody.reuse(_jspx_th_t_submit_0);
      return true;
    }
    _jspx_tagPool_t_submit_value_nobody.reuse(_jspx_th_t_submit_0);
    return false;
  }

  private boolean _jspx_meth_t_errors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_t_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_t_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_t_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_t_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_form_0);
    int _jspx_eval_t_errors_0 = _jspx_th_t_errors_0.doStartTag();
    if (_jspx_th_t_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_errors_nobody.reuse(_jspx_th_t_errors_0);
      return true;
    }
    _jspx_tagPool_t_errors_nobody.reuse(_jspx_th_t_errors_0);
    return false;
  }
}
