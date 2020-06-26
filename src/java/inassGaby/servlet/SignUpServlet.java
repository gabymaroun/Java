/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.servlet;

import inassGaby.dao.DAOException;
import inassGaby.dao.JoueurDao;
import inassGaby.dao.PartieDao;
import inassGaby.dao.StatistiqueDao;
import inassGaby.data.Joueur;
import inassGaby.data.Partie;
import inassGaby.data.Statistique;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.omg.CORBA.UserException;

/**
 *
 * @author Gaby's
 */
@WebServlet(name = "SignUpServlet", urlPatterns = {"/SignUpServlet"})
public class SignUpServlet extends HttpServlet {

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
    StatistiqueDao statsdao = new StatistiqueDao();

    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, DAOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("action");
//        Partie partie = new Partie();
        System.out.println(action);
//       
        try {

            HttpSession session = request.getSession();
            String pseudoL = request.getParameter("pseudoL");
            String passL = request.getParameter("pwL");

//            String sign = request.getParameter("signBtn");
            if (action.equals("jouer")) {
//                try {
                if (pseudoL != null && passL != null
                        && joueurdao.getJoueur(pseudoL, passL) != null) {
                    Joueur joueur = joueurdao.getJoueur(pseudoL, passL);
                    Statistique stats = statsdao.getJoueur(joueur.getIdJoueur());
//                    Statistique stats  = new Statistique();
                    session.setAttribute("loginUsername", pseudoL);
                    session.setAttribute("loginPass", passL);
                    session.setAttribute("joueur", joueur);
                    session.setAttribute("stats", stats);
//                    session.setAttribute("partie", partie);
                    session.setAttribute("joueurs", joueurdao.getAllJoueur());
                    session.setAttribute("parties", partiedao.getAllPartie());

                    getServletConfig().getServletContext().getRequestDispatcher("/accueil.jsp")
                            .forward(request, response);
                } else {
                    getServletConfig().getServletContext().getRequestDispatcher("/index.jsp")
                            .forward(request, response);

                }
//                } catch (Exception e) {
//                    out.println("<p><b>Erreur !!" + pseudoL + " doesn't exist or incorrect password </b><br />");
//
//                }
            }

            if (action.equals("back")) {

                getServletConfig().getServletContext().getRequestDispatcher("/index.jsp")
                        .forward(request, response);

            }
            if (action.equals("signup")) {

                getServletConfig().getServletContext().getRequestDispatcher("/signup.jsp")
                        .forward(request, response);

            }
            //            String login = request.getParameter("login");
            if (action.equals("creer")) {
                String pseudo = request.getParameter("pseudo");
                String pass = request.getParameter("pw");
                String ad = request.getParameter("ville");
                String sex = request.getParameter("sexe");
                String age = request.getParameter("age");
                int ageId = 0;
                if (age != null && !age.equals("")) {
                    ageId = Integer.parseInt(age);
                }

                Joueur joueur = new Joueur(pseudo, pass, sex, ad, ageId);
                joueurdao.addJoueur(joueur);
                session.setAttribute("loginUsername", pseudoL);
                session.setAttribute("loginPass", passL);
                session.setAttribute("joueur", joueur);
//                session.setAttribute("partie", partie);
                session.setAttribute("joueurs", joueurdao.getAllJoueur());
                session.setAttribute("parties", partiedao.getAllPartie());

                getServletConfig().getServletContext().getRequestDispatcher("/index.jsp")
                        .forward(request, response);
            }

        } catch (DAOException | NumberFormatException e) {
            out.println("<p><b>Erreur !!</b><br />");
            out.println(e.toString() + "</p>");
        }

        // fin du document : lien pour retour en arrière
        out.println("<p><a href='/BeloteJeu/index.jsp'>Retour</a></p>");
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
        } catch (DAOException ex) {
            Logger.getLogger(SignUpServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (DAOException ex) {
            Logger.getLogger(SignUpServlet.class.getName()).log(Level.SEVERE, null, ex);
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
