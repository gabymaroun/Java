/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Score;
import java.util.List;
//import javax.ejb.Local;

/**
 *
 * @author Gaby's
 */
//@Local
public interface ScoreDaoLocal {

    void addScore(Score score) throws DAOException;

    void editScore(Score score) throws DAOException;

    void deleteScore(int scoreId) throws DAOException;

    Score getScore(int scoreId) throws DAOException;

    List<Score> getAllScore() throws DAOException;

}
