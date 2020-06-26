/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Partie;
import java.util.List;
//import javax.ejb.Local;

/**
 *
 * @author Gaby's
 */
//@Local
public interface PartieDaoLocal {

    void addPartie(Partie partie) throws DAOException;

    void editPartie(Partie partie) throws DAOException;

    void deletePartie(int partieID) throws DAOException;

    Partie getPartie(int partieID) throws DAOException;

    List<Partie> getAllPartie() throws DAOException;
}
