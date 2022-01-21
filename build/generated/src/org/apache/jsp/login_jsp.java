package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/include/css.jsp");
    _jspx_dependants.add("/include/js.jsp");
  }

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\"/>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n");
      out.write("        <meta name=\"description\" content=\"\"/>\n");
      out.write("        <meta name=\"author\" content=\"\"/>\n");
      out.write("        <title>Login</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"template/css/pace.min.css\" rel=\"stylesheet\"/>\n");
      out.write("  <script src=\"template/js/pace.min.js\"></script>\n");
      out.write("  <!--favicon-->\n");
      out.write("  <link rel=\"icon\" href=\"template/images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("  <!-- Vector CSS -->\n");
      out.write("  <link href=\"template/plugins/vectormap/jquery-jvectormap-2.0.2.css\" rel=\"stylesheet\"/>\n");
      out.write("  <!-- simplebar CSS-->\n");
      out.write("  <link href=\"template/plugins/simplebar/css/simplebar.css\" rel=\"stylesheet\"/>\n");
      out.write("  <!-- Bootstrap core CSS-->\n");
      out.write("  <link href=\"template/css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("  <!-- animate CSS-->\n");
      out.write("  <link href=\"template/css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <!-- Icons CSS-->\n");
      out.write("  <link href=\"template/css/icons.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <!-- Sidebar CSS-->\n");
      out.write("  <link href=\"template/css/sidebar-menu.css\" rel=\"stylesheet\"/>\n");
      out.write("  <!-- Custom Style-->\n");
      out.write("  <link href=\"template/css/app-style.css\" rel=\"stylesheet\"/>");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-theme bg-theme1\">\n");
      out.write("\n");
      out.write("<!-- start loader -->\n");
      out.write("   <div id=\"pageloader-overlay\" class=\"visible incoming\"><div class=\"loader-wrapper-outer\"><div class=\"loader-wrapper-inner\" ><div class=\"loader\"></div></div></div></div>\n");
      out.write("   <!-- end loader -->\n");
      out.write("\n");
      out.write("<!-- Start wrapper-->\n");
      out.write(" <div id=\"wrapper\">\n");
      out.write("\n");
      out.write(" <div class=\"loader-wrapper\"><div class=\"lds-ring\"><div></div><div></div><div></div><div></div></div></div>\n");
      out.write("\t<div class=\"card card-authentication1 mx-auto my-5\">\n");
      out.write("\t\t<div class=\"card-body\">\n");
      out.write("\t\t <div class=\"card-content p-2\">\n");
      out.write("\t\t \t<div class=\"text-center\">\n");
      out.write("\t\t \t\t\n");
      out.write("\t\t \t</div>\n");
      out.write("\t\t  <div class=\"card-title text-uppercase text-center py-3\">Sign In</div>\n");
      out.write("\t\t    <form>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t  <label for=\"exampleInputUsername\" class=\"sr-only\">Username</label>\n");
      out.write("\t\t\t   <div class=\"position-relative has-icon-right\">\n");
      out.write("\t\t\t\t  <input id=\"user\" type=\"text\"  class=\"form-control input-shadow\" placeholder=\"Enter Username\">\n");
      out.write("\t\t\t\t  <div class=\"form-control-position\">\n");
      out.write("\t\t\t\t\t  <i class=\"icon-user\"></i>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t  <label for=\"exampleInputPassword\" class=\"sr-only\">Password</label>\n");
      out.write("\t\t\t   <div class=\"position-relative has-icon-right\">\n");
      out.write("\t\t\t\t  <input id=\"pass\" type=\"password\"  class=\"form-control input-shadow\" placeholder=\"Enter Password\">\n");
      out.write("\t\t\t\t  <div class=\"form-control-position\">\n");
      out.write("\t\t\t\t\t  <i class=\"icon-lock\"></i>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t <div class=\"form-group col-6\">\n");
      out.write("\t\t\t   <div class=\"icheck-material-white\">\n");
      out.write("                <input type=\"checkbox\" id=\"user-checkbox\" checked=\"\" />\n");
      out.write("                <label for=\"user-checkbox\">Remember me</label>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t\t <div class=\"form-group col-6 text-right\">\n");
      out.write("\t\t\t  <a href=\"reset-password.html\">Reset Password</a>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t <button id=\"login\" type=\"button\" class=\"btn btn-light btn-block\">Sign In</button>\n");
      out.write("\t\t\t  <div class=\"text-center mt-3\">Sign In With</div>\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t <div class=\"form-row mt-4\">\n");
      out.write("\t\t\t  <div class=\"form-group mb-0 col-6\">\n");
      out.write("\t\t\t   <button type=\"button\" class=\"btn btn-light btn-block\"><i class=\"fa fa-facebook-square\"></i> Facebook</button>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t\t <div class=\"form-group mb-0 col-6 text-right\">\n");
      out.write("\t\t\t  <button type=\"button\" class=\"btn btn-light btn-block\"><i class=\"fa fa-twitter-square\"></i> Twitter</button>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t </form>\n");
      out.write("\t\t   </div>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <div class=\"card-footer text-center py-3\">\n");
      out.write("\t\t    <p class=\"text-warning mb-0\">Do not have an account? <a href=\"register.html\"> Sign Up here</a></p>\n");
      out.write("\t\t  </div>\n");
      out.write("\t     </div>\n");
      out.write("    \n");
      out.write("     <!--Start Back To Top Button-->\n");
      out.write("    <a href=\"javaScript:void();\" class=\"back-to-top\"><i class=\"fa fa-angle-double-up\"></i> </a>\n");
      out.write("    <!--End Back To Top Button-->\n");
      out.write("\t\n");
      out.write("\t<!--start color switcher-->\n");
      out.write("   <div class=\"right-sidebar\">\n");
      out.write("    <div class=\"switcher-icon\">\n");
      out.write("      <i class=\"zmdi zmdi-settings zmdi-hc-spin\"></i>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"right-sidebar-content\">\n");
      out.write("\n");
      out.write("      <p class=\"mb-0\">Gaussion Texture</p>\n");
      out.write("      <hr>\n");
      out.write("      \n");
      out.write("      <ul class=\"switcher\">\n");
      out.write("        <li id=\"theme1\"></li>\n");
      out.write("        <li id=\"theme2\"></li>\n");
      out.write("        <li id=\"theme3\"></li>\n");
      out.write("        <li id=\"theme4\"></li>\n");
      out.write("        <li id=\"theme5\"></li>\n");
      out.write("        <li id=\"theme6\"></li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("      <p class=\"mb-0\">Gradient Background</p>\n");
      out.write("      <hr>\n");
      out.write("      \n");
      out.write("      <ul class=\"switcher\">\n");
      out.write("        <li id=\"theme7\"></li>\n");
      out.write("        <li id=\"theme8\"></li>\n");
      out.write("        <li id=\"theme9\"></li>\n");
      out.write("        <li id=\"theme10\"></li>\n");
      out.write("        <li id=\"theme11\"></li>\n");
      out.write("        <li id=\"theme12\"></li>\n");
      out.write("\t\t<li id=\"theme13\"></li>\n");
      out.write("        <li id=\"theme14\"></li>\n");
      out.write("        <li id=\"theme15\"></li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("     </div>\n");
      out.write("   </div>\n");
      out.write("  <!--end color switcher-->\n");
      out.write("\t\n");
      out.write("\t</div><!--wrapper-->\n");
      out.write("\t\n");
      out.write("  <!-- Bootstrap core JavaScript-->\n");
      out.write("  ");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"template/js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"template/js/popper.min.js\"></script>\n");
      out.write("  <script src=\"template/js/bootstrap.min.js\"></script>\n");
      out.write("\t\n");
      out.write(" <!-- simplebar js -->\n");
      out.write("  <script src=\"template/plugins/simplebar/js/simplebar.js\"></script>\n");
      out.write("  <!-- sidebar-menu js -->\n");
      out.write("  <script src=\"template/js/sidebar-menu.js\"></script>\n");
      out.write("  <!-- loader scripts -->\n");
      out.write("  <script src=\"template/js/jquery.loading-indicator.js\"></script>\n");
      out.write("  <!-- Custom scripts -->\n");
      out.write("  <script src=\"template/js/app-script.js\"></script>\n");
      out.write("  <!-- Chart js -->\n");
      out.write("  \n");
      out.write("  <script src=\"template/plugins/Chart.js/Chart.min.js\"></script>\n");
      out.write(" \n");
      out.write("  <!-- Index js -->\n");
      out.write("  <script src=\"template/js/index.js\"></script>");
      out.write(" \n");
      out.write("   <script src=\"scripts/login.js\" type=\"text/javascript\"></script>\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("\n");
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
