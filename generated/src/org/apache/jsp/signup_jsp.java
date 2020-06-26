package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bienvenue sur Belote !</title>\n");
      out.write("        <link href=\"css/bootstrap_1.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/cover.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-grid.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"cover-container d-flex h-100 p-3 mx-auto flex-column\">\n");
      out.write("            <main role=\"main\" class=\"inner cover\">\n");
      out.write("\n");
      out.write("                <form action=\"SignUpServlet\" method=\"post\" class=\"form-container\">\n");
      out.write("\n");
      out.write("                    <h1 class=\"mb-4\">Pour s'inscrire</h1>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Pseudo</label>\n");
      out.write("                        <input name=\"pseudo\" class=\"btn btn-lg mt-4\" placeholder=\"Saisissez votre pseudo\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">    \n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Password</label>\n");
      out.write("                        <input name=\"pw\" class=\"btn btn-lg mt-4\"  placeholder=\"Saisissez votre mot de passe\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Adresse</label>\n");
      out.write("                        <input name=\"ville\" class=\"btn btn-lg mt-4\" placeholder=\"Saisissez votre adresse\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Age</label>\n");
      out.write("                        <input name=\"age\" class=\"btn btn-lg mt-4\" placeholder=\"Saisissez votre age\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Sexe</label> <input type=\"radio\" class=\"btn btn-lg mt-4\" name=\"sexe\" value=\"h\" placeholder=\"homme\"> H\n");
      out.write("                        <input type=\"radio\" class=\"btn btn-lg mt-4\" name=\"sexe\" value=\"f\" placeholder=\"femme\"> F\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" value=\"creer\" class=\"btn btn-lg mt-4 btn-block\"  name=\"action\" id=\"exBtn\">Exécuter</button>\n");
      out.write("                    <button type=\"reset\" value=\"Remise à zéro\"class=\"btn btn-lg mt-4 btn-block\" style=\"background-color:rgba(209,124,40,1);\n");
      out.write("                            color:rgba(0,42,52,1);\" name=\"resBtn\" id=\"resBtn\"/>Remise à zéro</button>\n");
      out.write("                </form>\n");
      out.write("            </main>\n");
      out.write("        </div>    \n");
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
