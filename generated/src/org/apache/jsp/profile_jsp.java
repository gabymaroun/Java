package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap_1.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap-grid.min.css\" rel=\"stylesheet\">    \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style-sb_1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/input.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"cover-container d-flex h-100 p-3 mx-auto flex-column\">\n");
      out.write("            <main role=\"main\" class=\"inner cover\">\n");
      out.write("                <h1 class=\"mb-4\">Profile</h1>\n");
      out.write("\n");
      out.write("                <form action=\"JoueurServlet\" method=\"post\" class=\"form-container\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <img src=\"images/avatars/avatarinass.jpg\" alt=\"Photo de Profil\" />\n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Nombre d'annonces</label>\n");
      out.write("                        <label name=\"pseudo\" class=\"btn btn-lg mt-4\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.stats.nbrAnnonces}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.stats.nbrAnnonces}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Nombre de capots</label>\n");
      out.write("                        <label name=\"pseudo\" class=\"btn btn-lg mt-4\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.stats.nbrCapots}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.stats.nbrCapots}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Nombre de prises d'atouts</label>\n");
      out.write("                        <label name=\"pseudo\" class=\"btn btn-lg mt-4\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.stats.nbrPrisesAtout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.stats.nbrPrisesAtout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("\n");
      out.write("                    </div>                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Pseudo</label>\n");
      out.write("                        <input name=\"pseudo\" class=\"btn btn-lg mt-4\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.profile.pseudo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"disabled\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">    \n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Password</label>\n");
      out.write("                        <input name=\"pw\" type=\"password\" class=\"btn btn-lg mt-4\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.profile.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Changer password\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Adresse</label>\n");
      out.write("                        <input name=\"ville\" class=\"btn btn-lg mt-4\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.profile.ville}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Saisissez votre adresse\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Age</label>\n");
      out.write("                        <input name=\"age\" class=\"btn btn-lg mt-4\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.profile.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Saisissez votre age\"\n");
      out.write("                               pattern=\"[0-9]+\"\n");
      out.write("                               oninvalid='setCustomValidity(\"L\\'age doit contenir des nombres seulement\")'\n");
      out.write("                               oninput='setCustomValidity(\"\")'>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <input type=\"radio\" class=\"btn btn-lg mt-4\" name=\"sexe\" value=\"h\"> \n");
      out.write("                        <label class=\"btn btn-lg mt-8\">Homme</label>\n");
      out.write("                        <input type=\"radio\" class=\"btn btn-lg mt-4\" name=\"sexe\" value=\"f\" >\n");
      out.write("                        <label class=\"btn btn-lg mt-8\">Femme</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <button type=\"submit\" name=\"action\" value=\"modifier\" class=\"btn btn-lg mt-4 btn-block\" id=\"exBtn\">Modifier</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <button type=\"submit\" name=\"action\" value=\"supprimer\" class=\"btn btn-lg mt-4 btn-block\" id=\"exBtn\">Supprimer</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <button type=\"submit\" name=\"action\" value=\"back2\" class=\"btn btn-lg mt-4 btn-block\" id=\"bk2Btn\">Back</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
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
