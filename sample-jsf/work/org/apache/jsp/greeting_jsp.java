package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class greeting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_validator_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_id_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_message_style_id_for_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputText_value_validator_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_id_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_message_style_id_for_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_form_id.release();
    _jspx_tagPool_h_outputText_value_nobody.release();
    _jspx_tagPool_h_inputText_value_validator_id_nobody.release();
    _jspx_tagPool_h_commandButton_value_id_action_nobody.release();
    _jspx_tagPool_h_message_style_id_for_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<HTML>\n");
      out.write("    <HEAD> <title>Hello</title> </HEAD>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body bgcolor=\"white\">\n");
      out.write("    ");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</HTML>  \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (com.sun.faces.taglib.jsf_core.ViewTag) _jspx_tagPool_f_view.get(com.sun.faces.taglib.jsf_core.ViewTag.class);
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_h_form_0(_jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_h_form_1(_jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (com.sun.faces.taglib.html_basic.FormTag) _jspx_tagPool_h_form_id.get(com.sun.faces.taglib.html_basic.FormTag.class);
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_0.setId("helloForm");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("      ");
      if (_jspx_meth_h_outputText_0(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write(" to\n");
      out.write("      ");
      if (_jspx_meth_h_outputText_1(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write(".  \n");
      out.write("  \t");
      if (_jspx_meth_h_inputText_0(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write("          \n");
      out.write("\t ");
      if (_jspx_meth_h_commandButton_0(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write('\n');
      out.write('	');
      out.write(' ');
      if (_jspx_meth_h_message_0(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("    ");
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_form_id.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (com.sun.faces.taglib.html_basic.OutputTextTag) _jspx_tagPool_h_outputText_value_nobody.get(com.sun.faces.taglib.html_basic.OutputTextTag.class);
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_0.setValue("#{UserNumberBean.minimum}");
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_1 = (com.sun.faces.taglib.html_basic.OutputTextTag) _jspx_tagPool_h_outputText_value_nobody.get(com.sun.faces.taglib.html_basic.OutputTextTag.class);
    _jspx_th_h_outputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_1.setValue("#{UserNumberBean.maximum}");
    int _jspx_eval_h_outputText_1 = _jspx_th_h_outputText_1.doStartTag();
    if (_jspx_th_h_outputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
    return false;
  }

  private boolean _jspx_meth_h_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_0 = (com.sun.faces.taglib.html_basic.InputTextTag) _jspx_tagPool_h_inputText_value_validator_id_nobody.get(com.sun.faces.taglib.html_basic.InputTextTag.class);
    _jspx_th_h_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_0.setId("userNo");
    _jspx_th_h_inputText_0.setValue("#{UserNumberBean.userNumber}");
    _jspx_th_h_inputText_0.setValidator("#{UserNumberBean.validate}");
    int _jspx_eval_h_inputText_0 = _jspx_th_h_inputText_0.doStartTag();
    if (_jspx_th_h_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_inputText_value_validator_id_nobody.reuse(_jspx_th_h_inputText_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (com.sun.faces.taglib.html_basic.CommandButtonTag) _jspx_tagPool_h_commandButton_value_id_action_nobody.get(com.sun.faces.taglib.html_basic.CommandButtonTag.class);
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setId("submit");
    _jspx_th_h_commandButton_0.setAction("success");
    _jspx_th_h_commandButton_0.setValue("Submit");
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_commandButton_value_id_action_nobody.reuse(_jspx_th_h_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_h_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_message_0 = (com.sun.faces.taglib.html_basic.MessageTag) _jspx_tagPool_h_message_style_id_for_nobody.get(com.sun.faces.taglib.html_basic.MessageTag.class);
    _jspx_th_h_message_0.setPageContext(_jspx_page_context);
    _jspx_th_h_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_message_0.setStyle("color: red; font-family: 'New Century Schoolbook', serif; font-style: oblique; text-decoration: overline");
    _jspx_th_h_message_0.setId("errors1");
    _jspx_th_h_message_0.setFor("userNo");
    int _jspx_eval_h_message_0 = _jspx_th_h_message_0.doStartTag();
    if (_jspx_th_h_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_message_style_id_for_nobody.reuse(_jspx_th_h_message_0);
    return false;
  }

  private boolean _jspx_meth_h_form_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_1 = (com.sun.faces.taglib.html_basic.FormTag) _jspx_tagPool_h_form_id.get(com.sun.faces.taglib.html_basic.FormTag.class);
    _jspx_th_h_form_1.setPageContext(_jspx_page_context);
    _jspx_th_h_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_1.setId("helloForm2");
    int _jspx_eval_h_form_1 = _jspx_th_h_form_1.doStartTag();
    if (_jspx_eval_h_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write('\n');
      out.write('	');
      out.write(' ');
      if (_jspx_meth_h_commandButton_1(_jspx_th_h_form_1, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("    ");
    }
    if (_jspx_th_h_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_form_id.reuse(_jspx_th_h_form_1);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_1 = (com.sun.faces.taglib.html_basic.CommandButtonTag) _jspx_tagPool_h_commandButton_value_id_action_nobody.get(com.sun.faces.taglib.html_basic.CommandButtonTag.class);
    _jspx_th_h_commandButton_1.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_1);
    _jspx_th_h_commandButton_1.setId("submit2");
    _jspx_th_h_commandButton_1.setAction("#{UserNumberBean.changeNumber}");
    _jspx_th_h_commandButton_1.setValue("Change");
    int _jspx_eval_h_commandButton_1 = _jspx_th_h_commandButton_1.doStartTag();
    if (_jspx_th_h_commandButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_commandButton_value_id_action_nobody.reuse(_jspx_th_h_commandButton_1);
    return false;
  }
}
