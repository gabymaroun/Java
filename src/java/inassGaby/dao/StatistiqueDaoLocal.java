/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Statistique;
import java.util.List;
//import javax.ejb.Local;

/**
 *
 * @author Gaby's
 */
//@Local
public interface StatistiqueDaoLocal {

    void addStatistique(Statistique stats) throws DAOException;

    void editStatistique(Statistique stats) throws DAOException;

    void deleteStatistique(int statsId) throws DAOException;

    Statistique getStatistique(int statsId) throws DAOException;

    List<Statistique> getAllStatistique() throws DAOException;

}
