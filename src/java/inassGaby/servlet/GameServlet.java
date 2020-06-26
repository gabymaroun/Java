/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.servlet;

import inassGaby.beans.Carte;
import inassGaby.beans.Jeu;
import inassGaby.dao.EquipeDao;
import inassGaby.dao.JoueurDao;
import inassGaby.dao.PartieDao;
import inassGaby.dao.StatistiqueDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "GameServlet", urlPatterns = {"/GameServlet"})
public class GameServlet extends HttpServlet {

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
    Jeu jeu = new Jeu();

    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("action");
//        Partie partie = new Partie();
        System.out.println(action);
//       
        try {

            HttpSession session = request.getSession();
            List<Carte> cartes = new ArrayList();
            for (Carte c : jeu.getAllCartes()) {
                cartes.add(c);
            }

            List<Carte> main = new ArrayList();
            for (int i = 0; i < 7; i++) {
                int r = (int) Math.random() * cartes.size();
                main.add(cartes.get(r));
            }

            session.setAttribute("main", main);

            if (action.equals("back")) {

                getServletConfig().getServletContext().getRequestDispatcher("/accueil.jsp")
                        .forward(request, response);

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
        processRequest(request, response);
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
        processRequest(request, response);
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
