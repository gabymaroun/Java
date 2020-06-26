/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Statistique;
import java.util.List;
//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Gaby's
 */
//@Stateless
public class StatistiqueDao implements StatistiqueDaoLocal {

    private EntityManager em;

    public StatistiqueDao() {
        em = JeuEntityManager.getInstance().getEntityManager();
    }

    @Override
    public void addStatistique(Statistique stats) throws DAOException {
        em.getTransaction().begin();
        em.persist(stats);
        em.getTransaction().commit();    }

    @Override
    public void editStatistique(Statistique stats) throws DAOException {
        em.getTransaction().begin();
        em.merge(stats);
        em.getTransaction().commit();    }

    @Override
    public void deleteStatistique(int statsId) throws DAOException {
        em.getTransaction().begin();
        em.remove(getStatistique(statsId));
        em.getTransaction().commit();
    }

    @Override
    public Statistique getStatistique(int statsId) throws DAOException {
        return em.find(Statistique.class, statsId);

    }
    public Statistique getJoueur(int idjoueur) throws DAOException {
        String sql = "SELECT e FROM Statistique e WHERE e.id_joueur = :idjoueur ";
        Query query = em.createQuery(sql);
        query.setParameter("idjoueur", idjoueur);
        List<Statistique> stats = query.getResultList();
        return stats.get(0);
    }
    @Override
    public List<Statistique> getAllStatistique() throws DAOException {
        return em.createNamedQuery("Statistique.findAll").getResultList();
    }

}
