package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import inassGaby.dao.JoueurDao;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bienvenue sur Belote !</title>\n");
      out.write("\n");
      out.write("        <link rel=\"icon\" href=\"image/icon.ico\">\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap_1.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/cover.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-grid.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.history.forward();\n");
      out.write("            function noBack() {\n");
      out.write("                window.history.forward();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"text-center\">\n");
      out.write("        <div class=\"cover-container d-flex h-100 p-3 mx-auto flex-column\">\n");
      out.write("            <main role=\"main\" class=\"inner cover\">\n");
      out.write("\n");
      out.write("                <form action=\"SignUpServlet\" method=\"post\" class=\"form-container\">\n");
      out.write("                    <h1 class=\"mb-4\"  >Pour se connecter</h1>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Pseudo</label>\n");
      out.write("                        <input name=\"pseudoL\" placeholder=\"Saisissez votre pseudo\" class=\"btn btn-lg mt-4\" id=\"loginUsername\" required>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"btn btn-lg mt-4\">Password</label>\n");
      out.write("                        <input name=\"pwL\" type=\"password\" class=\"btn btn-lg mt-4\" id=\"loginPass\"  placeholder=\"Saisissez votre mot de passe\" required>                   \n");
      out.write("                        ");
  try {
                                JoueurDao joueurdao = new JoueurDao();
                                if (request.getParameter("pseudoL") != null && request.getParameter("pwL") != null && (joueurdao.getJoueur(request.getParameter("pseudoL"), request.getParameter("pwL")) == null)) {
      out.write("\n");
      out.write("                        <div class=\"text-danger \" style=\"font-size:12px;\">\n");
      out.write("                            <i class=\"fas fa-exclamation-triangle\"></i>\n");
      out.write("                            Le nom d'utilisateur ou le mot de passe que vous avez entré est incorrect.\n");
      out.write("                        </div>\n");
      out.write("                        ");
}
                        } catch (Exception e) {
      out.write("\n");
      out.write("                        <div class=\"text-danger \" style=\"font-size:12px;\">\n");
      out.write("                            <i class=\"fas fa-exclamation-triangle\"></i>\n");
      out.write("                            Le nom d'utilisateur ou le mot de passe que vous avez entré est incorrect.\n");
      out.write("                        </div>\n");
      out.write("                        ");
     }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" name=\"action\" value=\"jouer\" class=\"btn btn-lg mt-4 btn-block\" >Jouer</button>\n");
      out.write("                    </div>\n");
      out.write("                    <h1 class=\"mb-4\">Pour s'inscrire</h1>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" name=\"action\" value=\"signup\" class=\"btn btn-lg mt-4 btn-block\" >Sign Up</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
