/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2018-07-10 13:59:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.net.anotheria.moskito.webui.more.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdditionalItems_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/moskito-webui-2.8.7.jar", Long.valueOf(1527002124000L));
    _jspx_dependants.put("/WEB-INF/lib/ano-tags-2.1.1.jar", Long.valueOf(1475585378000L));
    _jspx_dependants.put("jar:file:/home/matheus/JCL-APP/app/src/lib/moskito/moskito-inspect/tomcat/webapps/moskito/WEB-INF/lib/ano-tags-2.1.1.jar!/META-INF/ano-tags.tld", Long.valueOf(1475585374000L));
    _jspx_dependants.put("jar:file:/home/matheus/JCL-APP/app/src/lib/moskito/moskito-inspect/tomcat/webapps/moskito/WEB-INF/lib/moskito-webui-2.8.7.jar!/META-INF/moskito-tags.tld", Long.valueOf(1527002120000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../shared/jsp/Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"main\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-title\">\n");
      out.write("                <a class=\"accordion-toggle tooltip-bottom\" title=\"Close/Open\" data-toggle=\"collapse\" href=\"#collapse1\"><i class=\"fa fa-caret-down\"></i></a>\n");
      out.write("                <h3 class=\"pull-left\">\n");
      out.write("                    Everything else.\n");
      out.write("                </h3>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"collapse1\" class=\"box-content accordion-body collapse in\">\n");
      out.write("                <div class=\"paddner\">\n");
      out.write("                    This section contains everything that wasn't <i>important enough</i> to get it's own top navigation point.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-title\">\n");
      out.write("                <a class=\"accordion-toggle tooltip-bottom\" title=\"Close/Open\" data-toggle=\"collapse\" href=\"#collapse-config\"><i class=\"fa fa-caret-down\"></i></a>\n");
      out.write("                <h3 class=\"pull-left\">\n");
      out.write("                    Config.\n");
      out.write("                </h3>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"collapse-config\" class=\"box-content accordion-body collapse in\">\n");
      out.write("                <div class=\"paddner\">\n");
      out.write("                    ");
      if (_jspx_meth_mos_005fdeepLink_005f0(_jspx_page_context))
        return;
      out.write(" displays current configuration.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-title\">\n");
      out.write("                <a class=\"accordion-toggle tooltip-bottom\" title=\"Close/Open\" data-toggle=\"collapse\" href=\"#collapse-beans\"><i class=\"fa fa-caret-down\"></i></a>\n");
      out.write("                <h3 class=\"pull-left\">\n");
      out.write("                    MBeans.\n");
      out.write("                </h3>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"collapse-beans\" class=\"box-content accordion-body collapse in\">\n");
      out.write("                <div class=\"paddner\">\n");
      out.write("                    ");
      if (_jspx_meth_mos_005fdeepLink_005f1(_jspx_page_context))
        return;
      out.write(" displays all management beans that are present in the current JVM along with their attributes and values.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-title\">\n");
      out.write("                <a class=\"accordion-toggle tooltip-bottom\" title=\"Close/Open\" data-toggle=\"collapse\" href=\"#collapse-libs\"><i class=\"fa fa-caret-down\"></i></a>\n");
      out.write("                <h3 class=\"pull-left\">\n");
      out.write("                    Libs.\n");
      out.write("                </h3>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"collapse-libs\" class=\"box-content accordion-body collapse in\">\n");
      out.write("                <div class=\"paddner\">\n");
      out.write("                    ");
      if (_jspx_meth_mos_005fdeepLink_005f2(_jspx_page_context))
        return;
      out.write(" scans all jars in the classpath and displays information about name and version. It's useful for informational purposes only.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-title\">\n");
      out.write("                <a class=\"accordion-toggle tooltip-bottom\" title=\"Close/Open\" data-toggle=\"collapse\" href=\"#collapse-plugins\"><i class=\"fa fa-caret-down\"></i></a>\n");
      out.write("                <h3 class=\"pull-left\">\n");
      out.write("                    Plugins.\n");
      out.write("                </h3>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"collapse-plugins\" class=\"box-content accordion-body collapse in\">\n");
      out.write("                <div class=\"paddner\">\n");
      out.write("                    ");
      if (_jspx_meth_mos_005fdeepLink_005f3(_jspx_page_context))
        return;
      out.write(" section displays information about configured and loaded plugins.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-title\">\n");
      out.write("                <a class=\"accordion-toggle tooltip-bottom\" title=\"Close/Open\" data-toggle=\"collapse\" href=\"#collapse-update\"><i class=\"fa fa-caret-down\"></i></a>\n");
      out.write("                <h3 class=\"pull-left\">\n");
      out.write("                    Update.\n");
      out.write("                </h3>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"collapse-update\" class=\"box-content accordion-body collapse in\">\n");
      out.write("                <div class=\"paddner\">\n");
      out.write("                    <a href=\"mskUpdate\">The update check</a> connects to maven central and displays the last available version of MoSKito, in case you should update. It calls this <a target=\"_blank\" href=\"http://search.maven.org/solrsearch/select?q=a:%22moskito-webui%22&rows=20&wt=json\">central url</a>.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../shared/jsp/Footer.jsp", out, false);
      out.write("\n");
      out.write("</section>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_mos_005fdeepLink_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  mos:deepLink
    net.anotheria.moskito.webui.shared.tags.DeepLinkTag _jspx_th_mos_005fdeepLink_005f0 = new net.anotheria.moskito.webui.shared.tags.DeepLinkTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_mos_005fdeepLink_005f0);
    try {
      _jspx_th_mos_005fdeepLink_005f0.setJspContext(_jspx_page_context);
      // /net/anotheria/moskito/webui/more/jsp/AdditionalItems.jsp(35,20) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_mos_005fdeepLink_005f0.setHref("mskConfig");
      _jspx_th_mos_005fdeepLink_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_mos_005fdeepLink_005f0, null));
      _jspx_th_mos_005fdeepLink_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_mos_005fdeepLink_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_mos_005fdeepLink_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  mos:deepLink
    net.anotheria.moskito.webui.shared.tags.DeepLinkTag _jspx_th_mos_005fdeepLink_005f1 = new net.anotheria.moskito.webui.shared.tags.DeepLinkTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_mos_005fdeepLink_005f1);
    try {
      _jspx_th_mos_005fdeepLink_005f1.setJspContext(_jspx_page_context);
      // /net/anotheria/moskito/webui/more/jsp/AdditionalItems.jsp(49,20) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_mos_005fdeepLink_005f1.setHref("mskMBeans");
      _jspx_th_mos_005fdeepLink_005f1.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_mos_005fdeepLink_005f1, null));
      _jspx_th_mos_005fdeepLink_005f1.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_mos_005fdeepLink_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_mos_005fdeepLink_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  mos:deepLink
    net.anotheria.moskito.webui.shared.tags.DeepLinkTag _jspx_th_mos_005fdeepLink_005f2 = new net.anotheria.moskito.webui.shared.tags.DeepLinkTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_mos_005fdeepLink_005f2);
    try {
      _jspx_th_mos_005fdeepLink_005f2.setJspContext(_jspx_page_context);
      // /net/anotheria/moskito/webui/more/jsp/AdditionalItems.jsp(63,20) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_mos_005fdeepLink_005f2.setHref("mskLibs");
      _jspx_th_mos_005fdeepLink_005f2.setJspBody(new Helper( 2, _jspx_page_context, _jspx_th_mos_005fdeepLink_005f2, null));
      _jspx_th_mos_005fdeepLink_005f2.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_mos_005fdeepLink_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_mos_005fdeepLink_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  mos:deepLink
    net.anotheria.moskito.webui.shared.tags.DeepLinkTag _jspx_th_mos_005fdeepLink_005f3 = new net.anotheria.moskito.webui.shared.tags.DeepLinkTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_mos_005fdeepLink_005f3);
    try {
      _jspx_th_mos_005fdeepLink_005f3.setJspContext(_jspx_page_context);
      // /net/anotheria/moskito/webui/more/jsp/AdditionalItems.jsp(77,20) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_mos_005fdeepLink_005f3.setHref("mskPlugins");
      _jspx_th_mos_005fdeepLink_005f3.setJspBody(new Helper( 3, _jspx_page_context, _jspx_th_mos_005fdeepLink_005f3, null));
      _jspx_th_mos_005fdeepLink_005f3.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_mos_005fdeepLink_005f3);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("The config section");
      return false;
    }
    public boolean invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("The MBeans section");
      return false;
    }
    public boolean invoke2( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("The library display");
      return false;
    }
    public boolean invoke3( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("The plugin");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
