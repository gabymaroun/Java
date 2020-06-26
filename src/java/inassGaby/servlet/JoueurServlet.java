/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.servlet;

import inassGaby.dao.DAOException;
import inassGaby.dao.JoueurDao;
import inassGaby.dao.PartieDao;
import inassGaby.data.Joueur;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gaby's
 */
@WebServlet(name = "JoueurServlet", urlPatterns = {"/JoueurServlet"})
public class JoueurServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    JoueurDao joueurdao = new JoueurDao();
    PartieDao partiedao = new PartieDao();

    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, DAOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("action");
        System.out.println(action);
//       
        try {

            HttpSession session = request.getSession();
//            if (action.equals("afficher")) {
////                request.setAttribute("joueurs", joueurdao.getAllJoueur());
//                session.setAttribute("joueurs", joueurdao.getAllJoueur());
////                session.setAttribute("compteur", new Integer(compteur.intValue() + 1));
//                // forwarde la requête à la page JSP      
////            System.out.println("4");
//                getServletConfig().getServletContext().getRequestDispatcher("/affichejoueur.jsp")
//                        .forward(request, response);
//            }
            // entête du document
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Joueur</h1>");

            String pseudo = request.getParameter("pseudo");
            String pass = request.getParameter("pw");
            String ad = request.getParameter("ville");
            String sex = request.getParameter("sexe");
            String age = request.getParameter("age");
            int ageId = 0;
            if (age != null && !age.equals("")) {
                ageId = Integer.parseInt(age);
            }

            // modification du profile
            if (action.equals("modifier")) {
                Joueur joueur = joueurdao.getJoueur(pseudo);
                if (pass != "") {
                    joueur.setPassword(pass);
                }
                if (request.getParameter("age") != "") {
                    ageId = Integer.parseInt(request.getParameter("age"));
                    joueur.setAge(ageId);
                }
                if (ad != "") {
                    joueur.setVille(ad);
                }
                if (sex != "") {
                    joueur.setSexe(sex);
                }
                joueurdao.editJoueur(joueur);
                out.println("<p>Joueur modifier : " + joueur + "</p>");
                session.setAttribute("loginUsername", pseudo);
                session.setAttribute("joueur", joueur);
                session.setAttribute("joueurs", joueurdao.getAllJoueur());
                session.setAttribute("parties", partiedao.getAllPartie());

                getServletConfig().getServletContext().getRequestDispatcher("/accueil.jsp")
                        .forward(request, response);
            }

            // supprimer joueur
            if (action.equals("supprimer")) {

                Joueur joueur = joueurdao.getJoueur(pseudo);
                joueurdao.deleteJoueur(joueur.getIdJoueur());
                out.println("<p>Joueur supprimer : " + joueur + "</p>");

                getServletConfig().getServletContext().getRequestDispatcher("/index.jsp")
                        .forward(request, response);

            }

            if (action.equals("back2")) {

                getServletConfig().getServletContext().getRequestDispatcher("/accueil.jsp")
                        .forward(request, response);

            }
        } catch (DAOException | NumberFormatException e) {
            out.println("<p><b>Erreur !!</b><br />");
            out.println(e.toString() + "</p>");
        }

        // fin du document : lien pour retour en arrière
        out.println("<p><a href=\"" + request.getContextPath() + "\">Retour</a></p>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
//        doPost(request, response);

        } catch (DAOException ex) {
            Logger.getLogger(JoueurServlet.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);

//            String action = request.getParameter("action");
        } catch (DAOException ex) {
            Logger.getLogger(JoueurServlet.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
