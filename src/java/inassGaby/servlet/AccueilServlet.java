/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.servlet;

import inassGaby.dao.DAOException;
import inassGaby.dao.EquipeDao;
import inassGaby.dao.JoueurDao;
import inassGaby.dao.PartieDao;
import inassGaby.dao.StatistiqueDao;
import inassGaby.data.Equipe;
import inassGaby.data.Joueur;
import inassGaby.data.Partie;
import inassGaby.data.Statistique;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "AccueilServlet", urlPatterns = {"/AccueilServlet"})
public class AccueilServlet extends HttpServlet {

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
    EquipeDao equipedao = new EquipeDao();
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
//            String pseudoL = request.getParameter("pseudoL");
//            String passL = request.getParameter("pwL");
            String pseudo = request.getParameter("hid");
//            Joueur joueur = joueurdao.getJoueur(pseudo);
//            String sign = request.getParameter("signBtn");

            if (action.equals("Creer une nouvelle partie")) {

                session.setAttribute("pseudo", pseudo);
                session.setAttribute("joueurs", joueurdao.getAllJoueur());
                session.setAttribute("equipes", equipedao.getAllEquipe());
                getServletConfig().getServletContext().getRequestDispatcher("/createPartie.jsp")
                        .forward(request, response);

            }

            if (action.equals("Mon Profil")) {
                Joueur profile = joueurdao.getJoueur(pseudo);
                Statistique stats = statsdao.getJoueur(profile.getIdJoueur());

                session.setAttribute("profile", profile);
                session.setAttribute("stats", stats);
                getServletConfig().getServletContext().getRequestDispatcher("/profile.jsp")
                        .forward(request, response);

            }
            //            String login = request.getParameter("login");
            if (action.equals("rejoindre")) {
//                Equipe equipe = new Equipe();
//                
//                equipe.setIdJoueur1(joueur);
//                equipedao.addEquipe(equipe);
//                session.setAttribute("equipe", equipe);
                session.setAttribute("pseudo", pseudo);
////                session.setAttribute("partie", partie);
//                session.setAttribute("joueurs", joueurdao.getAllJoueur());
//                session.setAttribute("parties", partiedao.getAllPartie());
//                session.setAttribute("equipes", equipedao.getAllEquipe());

                getServletConfig().getServletContext().getRequestDispatcher("/jeu.jsp")
                        .forward(request, response);
            }
            
            if (action.equals("back")) {

                getServletConfig().getServletContext().getRequestDispatcher("/accueil.jsp")
                        .forward(request, response);

            }
            
            if (action.equals("creerP")) {

                if (request.getParameter("equipe") != null) {
                    String[] ideq = request.getParameterValues("equipe");
                    if (ideq.length == 2) {
                        List<Equipe> leq = new ArrayList();
                        for (String id : ideq) {
                            Equipe eq = equipedao.getEquipe(Integer.parseInt(id));
                            leq.add(eq);
                        }

                        Partie partie = new Partie(leq.get(0), leq.get(1));
                        partiedao.addPartie(partie);
                        getServletContext().getRequestDispatcher("/jeu.jsp")
                                .forward(request, response);

                    } else {
                        out.println("<p><b>Erreur !! chaque partie est composé de 2 equipes </b><br />");
                        getServletConfig().getServletContext().getRequestDispatcher("/createPartie.jsp")
                                .forward(request, response);
                    }
                }
                if (request.getParameter("joueur") != null) {
                    String[] idjr = request.getParameterValues("joueur");
                    if (idjr.length == 2) {
                        List<Joueur> ljr = new ArrayList();
                        for (String pseudo1 : idjr) {
                            Joueur jr = joueurdao.getJoueur(pseudo1);
                            ljr.add(jr);
                        }

                        Equipe eq = new Equipe(ljr.get(0), ljr.get(1));
                        equipedao.addEquipe(eq);

                        session.setAttribute("pseudo", pseudo);
                        session.setAttribute("joueurs", joueurdao.getAllJoueur());
                        session.setAttribute("equipes", equipedao.getAllEquipe());
                        getServletContext().getRequestDispatcher("/createPartie.jsp")
                                .forward(request, response);

                    } else {
                        out.println("<p><b>Erreur !! chaque equipe est composé de 2 joueurs seulement </b><br />");
                        getServletConfig().getServletContext().getRequestDispatcher("/createPartie.jsp")
                                .forward(request, response);
                    }
                }
            }

        } catch (NumberFormatException e) {
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
        } catch (DAOException ex) {
            Logger.getLogger(AccueilServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AccueilServlet.class.getName()).log(Level.SEVERE, null, ex);
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
