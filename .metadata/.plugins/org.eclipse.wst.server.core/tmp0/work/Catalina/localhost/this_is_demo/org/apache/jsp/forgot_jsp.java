/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.29
 * Generated at: 2020-01-31 05:28:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/css/form.css", Long.valueOf(1580372928238L));
    _jspx_dependants.put("/js/simpleCaptcha.js", Long.valueOf(1580355045560L));
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\t<title>忘記密碼</title>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("  \t\t");
      out.write("@import url(https://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,600);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\tbox-sizing:border-box;\r\n");
      out.write("\t-webkit-box-sizing:border-box;\r\n");
      out.write("\t-moz-box-sizing:border-box;\r\n");
      out.write("\t-webkit-font-smoothing:antialiased;\r\n");
      out.write("\t-moz-font-smoothing:antialiased;\r\n");
      out.write("\t-o-font-smoothing:antialiased;\r\n");
      out.write("\tfont-smoothing:antialiased;\r\n");
      out.write("\ttext-rendering:optimizeLegibility;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family:\"Open Sans\", Helvetica, Arial, sans-serif;\r\n");
      out.write("\tfont-weight:300;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tline-height:30px;\r\n");
      out.write("\tcolor:#777;\r\n");
      out.write("\tbackground-image: url('");
      out.print(request.getContextPath());
      out.write("/ico/banner-02.jpg');\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ico {\r\n");
      out.write("\t height: 35px;\r\n");
      out.write("\t width: 35px;\r\n");
      out.write("\t float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("\tmax-width:700px;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact input, #contact button { \r\n");
      out.write("\tfont:400 12px/16px \"Open Sans\", Helvetica, Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact {\r\n");
      out.write("\tbackground-image:#F5FFFA;\r\n");
      out.write("\tborder-radius: 10px;\r\n");
      out.write("\tpadding:25px;\r\n");
      out.write("\tmargin:50px 0;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact h1 {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tfont-size: 35px;\r\n");
      out.write("\tfont-weight: 900;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact h3 {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("\tfont-weight: 900;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("fieldset {\r\n");
      out.write("\tborder: medium none !important;\r\n");
      out.write("\tmargin: 0 0 10px;\r\n");
      out.write("\tmin-width: 100%;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact input[type=text], #contact input[type=email], #contact input[type=password] {\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tborder:1px solid #CCC;\r\n");
      out.write("\tbackground:#FFF;\r\n");
      out.write("\tmargin:0 0 5px;\r\n");
      out.write("\tpadding:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact input[type=text], #contact input[type=email], #contact input[type=password] {\r\n");
      out.write("\t-webkit-transition:border-color 0.3s ease-in-out;\r\n");
      out.write("\t-moz-transition:border-color 0.3s ease-in-out;\r\n");
      out.write("\ttransition:border-color 0.3s ease-in-out;\r\n");
      out.write("\tborder:1px solid #AAA;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact p{\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  line-height: 80px;\r\n");
      out.write("  border: 4px dashed #09C;\r\n");
      out.write("  color: #FFF;\r\n");
      out.write("  font-size:15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact input[type=file]{\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  width: 650px;\r\n");
      out.write("  height: 90px;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  opacity: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact button {\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tborder:none;\r\n");
      out.write("\tbackground:#09C;\r\n");
      out.write("\tcolor:#FFF;\r\n");
      out.write("\tmargin:0 0 5px;\r\n");
      out.write("\tpadding:10px;\r\n");
      out.write("\tfont-size:15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact button:hover {\r\n");
      out.write("\tbackground:#09C;\r\n");
      out.write("\t-webkit-transition:background 0.3s ease-in-out;\r\n");
      out.write("\t-moz-transition:background 0.3s ease-in-out;\r\n");
      out.write("\ttransition:background-color 0.3s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact button:active { \r\n");
      out.write("\tbox-shadow:inset 0 1px 3px rgba(0, 0, 0, 0.5); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact input:focus {\r\n");
      out.write("\toutline:0;\r\n");
      out.write("\tborder:1px solid #999;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("::-webkit-input-placeholder {\r\n");
      out.write(" color:#888;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(":-moz-placeholder {\r\n");
      out.write(" color:#888;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("::-moz-placeholder {\r\n");
      out.write(" color:#888;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(":-ms-input-placeholder {\r\n");
      out.write(" color:#888;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t");
      out.write("var code;\r\n");
      out.write("\r\n");
      out.write("function createCaptcha() {\r\n");
      out.write("\t\r\n");
      out.write("\t//clear the contents of captcha div first \r\n");
      out.write("\tdocument.getElementById('captcha').innerHTML = \"\";\r\n");
      out.write("\t\r\n");
      out.write("\tvar charsArray = \"0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\";\r\n");
      out.write("\tvar lengthOtp = 4;\r\n");
      out.write("\tvar captcha = [];\r\n");
      out.write("\t\r\n");
      out.write("\tfor(var i = 0; i < lengthOtp; i++) {\r\n");
      out.write("\t\t  //below code will not allow Repetition of Characters\r\n");
      out.write("\t\t  var index = Math.floor(Math.random() * charsArray.length);\r\n");
      out.write("\t\t  if (captcha.indexOf(charsArray[index]) == -1)\r\n");
      out.write("\t\t      captcha.push(charsArray[index]);\r\n");
      out.write("\t\t  else i--;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\tvar canv = document.createElement(\"canvas\");\r\n");
      out.write("\tcanv.id = \"captcha\";\r\n");
      out.write("\tcanv.width = 100;\r\n");
      out.write("\tcanv.height = 50;\r\n");
      out.write("\t\r\n");
      out.write("\tvar ctx = canv.getContext(\"2d\");\r\n");
      out.write("\tctx.font = \"25px Georgia\";\r\n");
      out.write("\tctx.strokeText(captcha.join(\"\"), 0, 30);\r\n");
      out.write("\t\r\n");
      out.write("\t//storing captcha so that can validate you can save it somewhere else according to your specific requirements\r\n");
      out.write("\tcode = captcha.join(\"\");\r\n");
      out.write("\tdocument.getElementById(\"captcha\").appendChild(canv); // adds the canvas to the body element\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validateCaptcha() {\r\n");
      out.write("\t\r\n");
      out.write("\tevent.preventDefault();\r\n");
      out.write("\t\r\n");
      out.write("\tif(document.getElementById(\"captchaTextBox\").value == code) {\r\n");
      out.write("\t\tdocument.getElementsByName('contact')[0].action = \"LoginServlet\";\r\n");
      out.write("\t\tdocument.getElementsByName('contact')[0].submit();\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\talert(\"Captcha incorrect!\");\r\n");
      out.write("\t\tcreateCaptcha();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\"> \r\n");
      out.write("\t\t<form id=\"contact\" name=\"contact\" method=\"post\" action=\"ForgotServlet\">\r\n");
      out.write("\t\t\t<h1>使用者管理系統</h1>\r\n");
      out.write("\t\t\t<fieldset></fieldset>\r\n");
      out.write("\t\t\t<fieldset></fieldset>\r\n");
      out.write("\t        <fieldset></fieldset>\r\n");
      out.write("\t        <h3>忘記密碼</h3>\r\n");
      out.write("\t        <fieldset></fieldset>\r\n");
      out.write("\t        <fieldset>\r\n");
      out.write("\t\t      \t<input placeholder=\"帳號\" type=\"text\" name=\"name\" required />\r\n");
      out.write("\t\t    </fieldset>\r\n");
      out.write("\t\t    <fieldset>\r\n");
      out.write("\t\t      \t<button name=\"send\" type=\"submit\">送出</button>\r\n");
      out.write("\t\t    </fieldset>\r\n");
      out.write("\t\t    <fieldset>\r\n");
      out.write("\t\t    \t<a href=\"register.jsp\">註冊帳號</a>\r\n");
      out.write("\t\t    \t<a href=\"index.jsp\">登入</a>\r\n");
      out.write("\t\t    </fieldset>\r\n");
      out.write("\t    </form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
