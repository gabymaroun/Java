/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Score;
import java.util.List;
//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gaby's
 */
//@Stateless
public class ScoreDao implements ScoreDaoLocal {

    private EntityManager em;

    public ScoreDao() {
        em = JeuEntityManager.getInstance().getEntityManager();
    }

    @Override
    public void addScore(Score score) throws DAOException {
        em.getTransaction().begin();
        em.persist(score);
        em.getTransaction().commit();
    }

    @Override
    public void editScore(Score score) throws DAOException {
        em.getTransaction().begin();
        em.merge(score);
        em.getTransaction().commit();
    }

    @Override
    public void deleteScore(int scoreId) throws DAOException {
        em.getTransaction().begin();
        em.remove(getScore(scoreId));
        em.getTransaction().commit();
    }

    @Override
    public Score getScore(int scoreId) throws DAOException {
        return em.find(Score.class, scoreId);
    }

    @Override
    public List<Score> getAllScore() throws DAOException {
        return em.createNamedQuery("Score.findAll").getResultList();

    }

}
