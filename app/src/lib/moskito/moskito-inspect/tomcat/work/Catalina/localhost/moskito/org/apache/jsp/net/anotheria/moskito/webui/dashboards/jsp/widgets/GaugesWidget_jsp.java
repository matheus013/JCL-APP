/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2018-07-10 13:36:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.net.anotheria.moskito.webui.dashboards.jsp.widgets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GaugesWidget_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fano_005fequal_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fano_005fgreaterThan_0026_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fano_005fiF_0026_005ftest;

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
    _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fano_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fano_005fgreaterThan_0026_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fano_005fiF_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fname_005fid.release();
    _005fjspx_005ftagPool_005fano_005fequal_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fano_005fgreaterThan_0026_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fano_005fiF_0026_005ftest.release();
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

    net.anotheria.moskito.webui.gauges.api.GaugeZoneAO _jspx_zone_1 = null;
    java.lang.Integer _jspx_zoneIndex_1 = null;

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
      out.write("<!-- gauges js -->\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("    var gauges = [];\n");
      out.write("    ");
      //  ano:iterate
      net.anotheria.tags.IterateTag _jspx_th_ano_005fiterate_005f0 = (net.anotheria.tags.IterateTag) _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fname_005fid.get(net.anotheria.tags.IterateTag.class);
      boolean _jspx_th_ano_005fiterate_005f0_reused = false;
      try {
        _jspx_th_ano_005fiterate_005f0.setPageContext(_jspx_page_context);
        _jspx_th_ano_005fiterate_005f0.setParent(null);
        // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(7,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_ano_005fiterate_005f0.setName("gauges");
        // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(7,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_ano_005fiterate_005f0.setType("net.anotheria.moskito.webui.gauges.bean.GaugeBean");
        // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(7,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_ano_005fiterate_005f0.setId("gauge");
        int _jspx_eval_ano_005fiterate_005f0 = _jspx_th_ano_005fiterate_005f0.doStartTag();
        if (_jspx_eval_ano_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          net.anotheria.moskito.webui.gauges.bean.GaugeBean gauge = null;
          if (_jspx_eval_ano_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_ano_005fiterate_005f0);
          }
          gauge = (net.anotheria.moskito.webui.gauges.bean.GaugeBean) _jspx_page_context.findAttribute("gauge");
          do {
            out.write("\n");
            out.write("    gauges.push({\n");
            out.write("        \"name\": '");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("',\n");
            out.write("        \"caption\": '");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.caption}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("',\n");
            out.write("        \"complete\": ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.complete}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(",\n");
            out.write("        \"min\": ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.min.rawValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(",\n");
            out.write("        \"current\": ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.current.rawValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(",\n");
            out.write("        \"max\": ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.max.rawValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(",\n");
            out.write("        \"zones\": ");
            if (_jspx_meth_ano_005fequal_005f0(_jspx_th_ano_005fiterate_005f0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("            ");
            //  ano:equal
            net.anotheria.tags.EqualTag _jspx_th_ano_005fequal_005f1 = (net.anotheria.tags.EqualTag) _005fjspx_005ftagPool_005fano_005fequal_0026_005fvalue_005fproperty_005fname.get(net.anotheria.tags.EqualTag.class);
            boolean _jspx_th_ano_005fequal_005f1_reused = false;
            try {
              _jspx_th_ano_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_ano_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ano_005fiterate_005f0);
              // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(16,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_ano_005fequal_005f1.setName("gauge");
              // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(16,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_ano_005fequal_005f1.setProperty("customZonesAvailable");
              // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(16,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_ano_005fequal_005f1.setValue("true");
              int _jspx_eval_ano_005fequal_005f1 = _jspx_th_ano_005fequal_005f1.doStartTag();
              if (_jspx_eval_ano_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            [\n");
                  out.write("        ");
                  //  ano:iterate
                  net.anotheria.tags.IterateTag _jspx_th_ano_005fiterate_005f1 = (net.anotheria.tags.IterateTag) _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid.get(net.anotheria.tags.IterateTag.class);
                  boolean _jspx_th_ano_005fiterate_005f1_reused = false;
                  try {
                    _jspx_th_ano_005fiterate_005f1.setPageContext(_jspx_page_context);
                    _jspx_th_ano_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ano_005fequal_005f1);
                    // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(18,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_ano_005fiterate_005f1.setId("zone");
                    // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(18,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_ano_005fiterate_005f1.setName("gauge");
                    // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(18,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_ano_005fiterate_005f1.setProperty("zones");
                    // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(18,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_ano_005fiterate_005f1.setType("net.anotheria.moskito.webui.gauges.api.GaugeZoneAO");
                    // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(18,8) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_ano_005fiterate_005f1.setIndexId("zoneIndex");
                    int _jspx_eval_ano_005fiterate_005f1 = _jspx_th_ano_005fiterate_005f1.doStartTag();
                    if (_jspx_eval_ano_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      net.anotheria.moskito.webui.gauges.api.GaugeZoneAO zone = null;
                      java.lang.Integer zoneIndex = null;
                      if (_jspx_eval_ano_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_ano_005fiterate_005f1);
                      }
                      zone = (net.anotheria.moskito.webui.gauges.api.GaugeZoneAO) _jspx_page_context.findAttribute("zone");
                      zoneIndex = (java.lang.Integer) _jspx_page_context.findAttribute("zoneIndex");
                      do {
                        if (_jspx_meth_ano_005fgreaterThan_005f0(_jspx_th_ano_005fiterate_005f1, _jspx_page_context))
                          return;
                        out.write("\n");
                        out.write("    {\n");
                        out.write("        \"color\": '");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zone.color}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                        out.write("',\n");
                        out.write("        \"colorCode\": '',\n");
                        out.write("        \"enabled\": true,\n");
                        out.write("        \"from\": ");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zone.left}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                        out.write(",\n");
                        out.write("        \"to\": ");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zone.right}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                        out.write("\n");
                        out.write("    }\n");
                        out.write("    ");
                        int evalDoAfterBody = _jspx_th_ano_005fiterate_005f1.doAfterBody();
                        zone = (net.anotheria.moskito.webui.gauges.api.GaugeZoneAO) _jspx_page_context.findAttribute("zone");
                        zoneIndex = (java.lang.Integer) _jspx_page_context.findAttribute("zoneIndex");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_ano_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                      }
                    }
                    if (_jspx_th_ano_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                    _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_ano_005fiterate_005f1);
                    _jspx_th_ano_005fiterate_005f1_reused = true;
                  } finally {
                    org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_ano_005fiterate_005f1, _jsp_getInstanceManager(), _jspx_th_ano_005fiterate_005f1_reused);
                  }
                  out.write("\n");
                  out.write("    ]\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_ano_005fequal_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_ano_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005fano_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_ano_005fequal_005f1);
              _jspx_th_ano_005fequal_005f1_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_ano_005fequal_005f1, _jsp_getInstanceManager(), _jspx_th_ano_005fequal_005f1_reused);
            }
            out.write("\n");
            out.write("    });\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_ano_005fiterate_005f0.doAfterBody();
            gauge = (net.anotheria.moskito.webui.gauges.bean.GaugeBean) _jspx_page_context.findAttribute("gauge");
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
        _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fname_005fid.reuse(_jspx_th_ano_005fiterate_005f0);
        _jspx_th_ano_005fiterate_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_ano_005fiterate_005f0, _jsp_getInstanceManager(), _jspx_th_ano_005fiterate_005f0_reused);
      }
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- gauges -->\n");
      out.write("<div class=\"dashboard-line\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        ");
      //  ano:iterate
      net.anotheria.tags.IterateTag _jspx_th_ano_005fiterate_005f2 = (net.anotheria.tags.IterateTag) _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fname_005findexId_005fid.get(net.anotheria.tags.IterateTag.class);
      boolean _jspx_th_ano_005fiterate_005f2_reused = false;
      try {
        _jspx_th_ano_005fiterate_005f2.setPageContext(_jspx_page_context);
        _jspx_th_ano_005fiterate_005f2.setParent(null);
        // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(36,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_ano_005fiterate_005f2.setName("gauges");
        // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(36,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_ano_005fiterate_005f2.setType("net.anotheria.moskito.webui.gauges.bean.GaugeBean");
        // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(36,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_ano_005fiterate_005f2.setId("gauge");
        // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(36,8) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_ano_005fiterate_005f2.setIndexId("index");
        int _jspx_eval_ano_005fiterate_005f2 = _jspx_th_ano_005fiterate_005f2.doStartTag();
        if (_jspx_eval_ano_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          net.anotheria.moskito.webui.gauges.bean.GaugeBean gauge = null;
          java.lang.Integer index = null;
          if (_jspx_eval_ano_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_ano_005fiterate_005f2);
          }
          gauge = (net.anotheria.moskito.webui.gauges.bean.GaugeBean) _jspx_page_context.findAttribute("gauge");
          index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
          do {
            out.write("\n");
            out.write("            <div class=\"col-lg-3 col-md-4 col-sm-6\">\n");
            out.write("                <div class=\"box gauge-item\">\n");
            out.write("                    <div class=\"box-title\">\n");
            out.write("                        <a class=\"accordion-toggle tooltip-bottom\" title=\"Close/Open\" data-toggle=\"collapse\" href=\"#gauge_collapse_chart");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"><i class=\"fa fa-caret-down\"></i></a>\n");
            out.write("\n");
            out.write("                        <h3 class=\"pull-left chart-header\">\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.caption}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\n");
            out.write("                        </h3>\n");
            out.write("                        <div class=\"box-right-nav dropdown\">\n");
            out.write("                            <a href=\"#\" data-target=\"#\" data-toggle=\"dropdown\"><i class=\"fa fa-cog\"></i></a>\n");
            out.write("                            <ul class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"dLabel\">\n");
            out.write("                                <li><a href=\"\" onclick=\"saveGaugesSvgAsPng(event, ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(',');
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\">Screenshot</a></li>\n");
            out.write("                                ");
            if (_jspx_meth_ano_005fiF_005f0(_jspx_th_ano_005fiterate_005f2, _jspx_page_context))
              return;
            out.write("\n");
            out.write("                                <li><a onclick=\"removeGauge('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.caption}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("', '");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("', '");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.selectedDashboard}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("')\">Remove</a></li>\n");
            out.write("                            </ul>\n");
            out.write("                        </div>\n");
            out.write("                    </div>\n");
            out.write("                    <div id=\"gauge_collapse_chart");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"box-content accordion-body collapse in\">\n");
            out.write("                        <div class=\"paddner text-center\">\n");
            out.write("                            <div id=\"gaugeChart");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"gauge-content gauge-chart\">Not enough data</div>\n");
            out.write("                        </div>\n");
            out.write("                    </div>\n");
            out.write("                </div>\n");
            out.write("            </div>\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_ano_005fiterate_005f2.doAfterBody();
            gauge = (net.anotheria.moskito.webui.gauges.bean.GaugeBean) _jspx_page_context.findAttribute("gauge");
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_ano_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_ano_005fiterate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fano_005fiterate_0026_005ftype_005fname_005findexId_005fid.reuse(_jspx_th_ano_005fiterate_005f2);
        _jspx_th_ano_005fiterate_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_ano_005fiterate_005f2, _jsp_getInstanceManager(), _jspx_th_ano_005fiterate_005f2_reused);
      }
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"dashboard-line-footer text-right\">\n");
      out.write("        <ul class=\"dashboard-line-nav-box list-unstyled\">\n");
      out.write("            <li>\n");
      out.write("                <a onclick=\"saveGaugesSvgAsPng(event, 0, 10000)\" class=\"save_as\"><i class=\"fa fa-download\"></i> Screenshot all Gauges</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- // end gauges -->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var gaugeContainerSelectors = $('.gauge-chart').map(function () {\n");
      out.write("        return $(this).attr(\"id\");\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    gauges.forEach(function (gaugeData, index) {\n");
      out.write("        var chartParams = {\n");
      out.write("            container: gaugeContainerSelectors[index],\n");
      out.write("            data: gaugeData,\n");
      out.write("            type: 'GaugeChart'\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        chartEngineIniter.init(chartParams);\n");
      out.write("    });\n");
      out.write("</script>");
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

  private boolean _jspx_meth_ano_005fequal_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ano_005fiterate_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ano:equal
    net.anotheria.tags.EqualTag _jspx_th_ano_005fequal_005f0 = (net.anotheria.tags.EqualTag) _005fjspx_005ftagPool_005fano_005fequal_0026_005fvalue_005fproperty_005fname.get(net.anotheria.tags.EqualTag.class);
    boolean _jspx_th_ano_005fequal_005f0_reused = false;
    try {
      _jspx_th_ano_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ano_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ano_005fiterate_005f0);
      // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(15,17) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ano_005fequal_005f0.setName("gauge");
      // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(15,17) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ano_005fequal_005f0.setProperty("customZonesAvailable");
      // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(15,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ano_005fequal_005f0.setValue("false");
      int _jspx_eval_ano_005fequal_005f0 = _jspx_th_ano_005fequal_005f0.doStartTag();
      if (_jspx_eval_ano_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('[');
          out.write(']');
          int evalDoAfterBody = _jspx_th_ano_005fequal_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_ano_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fano_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_ano_005fequal_005f0);
      _jspx_th_ano_005fequal_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_ano_005fequal_005f0, _jsp_getInstanceManager(), _jspx_th_ano_005fequal_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_ano_005fgreaterThan_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ano_005fiterate_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ano:greaterThan
    net.anotheria.tags.GreaterThanTag _jspx_th_ano_005fgreaterThan_005f0 = (net.anotheria.tags.GreaterThanTag) _005fjspx_005ftagPool_005fano_005fgreaterThan_0026_005fvalue_005fname.get(net.anotheria.tags.GreaterThanTag.class);
    boolean _jspx_th_ano_005fgreaterThan_005f0_reused = false;
    try {
      _jspx_th_ano_005fgreaterThan_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ano_005fgreaterThan_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ano_005fiterate_005f1);
      // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(18,139) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ano_005fgreaterThan_005f0.setName("zoneIndex");
      // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(18,139) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ano_005fgreaterThan_005f0.setValue("0");
      int _jspx_eval_ano_005fgreaterThan_005f0 = _jspx_th_ano_005fgreaterThan_005f0.doStartTag();
      if (_jspx_eval_ano_005fgreaterThan_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(',');
          int evalDoAfterBody = _jspx_th_ano_005fgreaterThan_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_ano_005fgreaterThan_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fano_005fgreaterThan_0026_005fvalue_005fname.reuse(_jspx_th_ano_005fgreaterThan_005f0);
      _jspx_th_ano_005fgreaterThan_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_ano_005fgreaterThan_005f0, _jsp_getInstanceManager(), _jspx_th_ano_005fgreaterThan_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_ano_005fiF_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ano_005fiterate_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ano:iF
    net.anotheria.tags.IfTag _jspx_th_ano_005fiF_005f0 = (net.anotheria.tags.IfTag) _005fjspx_005ftagPool_005fano_005fiF_0026_005ftest.get(net.anotheria.tags.IfTag.class);
    boolean _jspx_th_ano_005fiF_005f0_reused = false;
    try {
      _jspx_th_ano_005fiF_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ano_005fiF_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ano_005fiterate_005f2);
      // /net/anotheria/moskito/webui/dashboards/jsp/widgets/GaugesWidget.jsp(49,32) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ano_005fiF_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.dashboardsToAdd != ''}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_ano_005fiF_005f0 = _jspx_th_ano_005fiF_005f0.doStartTag();
      if (_jspx_eval_ano_005fiF_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li><a onclick=\"addGauge('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.caption}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gauge.dashboardsToAdd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("')\" >Add to Dashboard</a></li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_ano_005fiF_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_ano_005fiF_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fano_005fiF_0026_005ftest.reuse(_jspx_th_ano_005fiF_005f0);
      _jspx_th_ano_005fiF_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_ano_005fiF_005f0, _jsp_getInstanceManager(), _jspx_th_ano_005fiF_005f0_reused);
    }
    return false;
  }
}
