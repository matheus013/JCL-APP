/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2018-07-10 13:38:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.net.anotheria.moskito.webui.shared.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.anotheria.maf.bean.ErrorBean;

public final class Error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/ano-tags-2.1.1.jar", Long.valueOf(1475585378000L));
    _jspx_dependants.put("jar:file:/home/matheus/JCL-APP/app/src/lib/moskito/moskito-inspect/tomcat/webapps/moskito/WEB-INF/lib/ano-tags-2.1.1.jar!/META-INF/ano-tags.tld", Long.valueOf(1475585374000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("net.anotheria.maf.bean.ErrorBean");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fano_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fano_005fiterate_0026_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fano_005fwrite_0026_005fname_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fano_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fano_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fano_005fwrite_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fano_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fano_005fiterate_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005fano_005fwrite_0026_005fname_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("<section id=\"main\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("\n");
      out.write("        <div class=\"container text-left error_page_details_content display_none_property\" style=\"padding-bottom: 30px; display: block;\">\n");
      out.write("            <div class=\"text-center\" style=\"margin-bottom: 30px\">\n");
      out.write("                <img src=\"../moskito/int/img/moskito.png\" height=\"100\">\n");
      out.write("                <h4>MoSKito encountered an error:</h4>\n");
      out.write("\n");
      out.write("                <h1>\n");
      out.write("                    ");
      if (_jspx_meth_ano_005fwrite_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <span class=\"liner\"></span>\n");
      out.write("\n");
      out.write("            ");

                // Preparing stack trace array
                String stackTraceString = ((ErrorBean) request.getAttribute("maf.error")).getStackTrace();
                String[] stackTrace = stackTraceString.replace("[", "").replace("]", "").split(", ");
                request.setAttribute("stackTrace", stackTrace);
            
      out.write("\n");
      out.write("            <div class=\"stack-trace-container\">\n");
      out.write("                ");
      //  ano:iterate
      net.anotheria.tags.IterateTag _jspx_th_ano_005fiterate_005f0 = (net.anotheria.tags.IterateTag) _005fjspx_005ftagPool_005fano_005fiterate_0026_005fname_005fid.get(net.anotheria.tags.IterateTag.class);
      boolean _jspx_th_ano_005fiterate_005f0_reused = false;
      try {
        _jspx_th_ano_005fiterate_005f0.setPageContext(_jspx_page_context);
        _jspx_th_ano_005fiterate_005f0.setParent(null);
        // /net/anotheria/moskito/webui/shared/jsp/Error.jsp(29,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_ano_005fiterate_005f0.setName("stackTrace");
        // /net/anotheria/moskito/webui/shared/jsp/Error.jsp(29,16) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_ano_005fiterate_005f0.setId("traceStep");
        int _jspx_eval_ano_005fiterate_005f0 = _jspx_th_ano_005fiterate_005f0.doStartTag();
        if (_jspx_eval_ano_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.Object traceStep = null;
          if (_jspx_eval_ano_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_ano_005fiterate_005f0);
          }
          traceStep = (java.lang.Object) _jspx_page_context.findAttribute("traceStep");
          do {
            out.write("\n");
            out.write("                    ");
            if (_jspx_meth_ano_005fwrite_005f1(_jspx_th_ano_005fiterate_005f0, _jspx_page_context))
              return;
            out.write("<br/>\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_ano_005fiterate_005f0.doAfterBody();
            traceStep = (java.lang.Object) _jspx_page_context.findAttribute("traceStep");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_ano_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_ano_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fano_005fiterate_0026_005fname_005fid.reuse(_jspx_th_ano_005fiterate_005f0);
        _jspx_th_ano_005fiterate_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_ano_005fiterate_005f0, _jsp_getInstanceManager(), _jspx_th_ano_005fiterate_005f0_reused);
      }
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- FOOTER -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("</section>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_ano_005fwrite_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ano:write
    net.anotheria.tags.WriteTag _jspx_th_ano_005fwrite_005f0 = (net.anotheria.tags.WriteTag) _005fjspx_005ftagPool_005fano_005fwrite_0026_005fproperty_005fname_005fnobody.get(net.anotheria.tags.WriteTag.class);
    boolean _jspx_th_ano_005fwrite_005f0_reused = false;
    try {
      _jspx_th_ano_005fwrite_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ano_005fwrite_005f0.setParent(null);
      // /net/anotheria/moskito/webui/shared/jsp/Error.jsp(16,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ano_005fwrite_005f0.setName("maf.error");
      // /net/anotheria/moskito/webui/shared/jsp/Error.jsp(16,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ano_005fwrite_005f0.setProperty("message");
      int _jspx_eval_ano_005fwrite_005f0 = _jspx_th_ano_005fwrite_005f0.doStartTag();
      if (_jspx_th_ano_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fano_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_ano_005fwrite_005f0);
      _jspx_th_ano_005fwrite_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_ano_005fwrite_005f0, _jsp_getInstanceManager(), _jspx_th_ano_005fwrite_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_ano_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ano_005fiterate_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ano:write
    net.anotheria.tags.WriteTag _jspx_th_ano_005fwrite_005f1 = (net.anotheria.tags.WriteTag) _005fjspx_005ftagPool_005fano_005fwrite_0026_005fname_005fnobody.get(net.anotheria.tags.WriteTag.class);
    boolean _jspx_th_ano_005fwrite_005f1_reused = false;
    try {
      _jspx_th_ano_005fwrite_005f1.setPageContext(_jspx_page_context);
      _jspx_th_ano_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ano_005fiterate_005f0);
      // /net/anotheria/moskito/webui/shared/jsp/Error.jsp(30,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ano_005fwrite_005f1.setName("traceStep");
      int _jspx_eval_ano_005fwrite_005f1 = _jspx_th_ano_005fwrite_005f1.doStartTag();
      if (_jspx_th_ano_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fano_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_ano_005fwrite_005f1);
      _jspx_th_ano_005fwrite_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_ano_005fwrite_005f1, _jsp_getInstanceManager(), _jspx_th_ano_005fwrite_005f1_reused);
    }
    return false;
  }
}
