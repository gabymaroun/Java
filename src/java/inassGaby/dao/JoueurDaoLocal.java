/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Joueur;
import java.util.List;
//import javax.ejb.Local;

/**
 *
 * @author Gaby's
 */
//@Local
public interface JoueurDaoLocal {

    void addJoueur(Joueur joueur) throws DAOException;

    void editJoueur(Joueur joueur) throws DAOException;

    void deleteJoueur(int joueurID) throws DAOException;

    Joueur getJoueur(int joueurID) throws DAOException;

    List<Joueur> getAllJoueur() throws DAOException;
}
