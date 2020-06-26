/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import inassGaby.dao.DAOException;
import inassGaby.dao.JoueurDao;
import inassGaby.dao.PartieDao;
import inassGaby.data.Joueur;
import inassGaby.data.Partie;
import java.util.List;

/**
 *
 * @author Gaby's
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException {
        JoueurDao joueurdao = new JoueurDao();
//        Joueur joueur = new Joueur("gm2","gm1",18,"m");
//        joueur = joueurdao.getJoueur("gm1");
//        joueur.setSexe('f');
//        joueur.setPseudo("gm2");
//        joueur.setPassword("gm1");
//        joueur.setAge(18);
//        joueur.setSexe("m");
//        joueurdao.addJoueur(joueur);
//        joueurdao.editJoueur(joueur);
//        PartieDao partiedao = new PartieDao();
////        Partie partie = new Partie(Integer.MIN_VALUE);
////        partiedao.addPartie(partie);
//        List<Partie> listepartie = partiedao.getAllPartie();
        Joueur j = joueurdao.getJoueur("","");
        System.out.println("Persons loaded: " + j);
    }

}
