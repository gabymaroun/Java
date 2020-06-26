/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Partie;
import java.util.List;
//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gaby's
 */
//@Stateless
public class PartieDao implements PartieDaoLocal {

    private EntityManager em;

    public PartieDao() {
        em = JeuEntityManager.getInstance().getEntityManager();
    }

    @Override
    public void addPartie(Partie partie) throws DAOException {
        em.getTransaction().begin();
        em.persist(partie);
        em.getTransaction().commit();
    }

    @Override
    public void editPartie(Partie partie) throws DAOException {

        em.getTransaction().begin();
        em.merge(partie);
        em.getTransaction().commit();
    }

    @Override
    public void deletePartie(int partieID) throws DAOException {
        em.getTransaction().begin();
        em.remove(getPartie(partieID));
        em.getTransaction().commit();
    }

    @Override
    public Partie getPartie(int partieID) throws DAOException {
        return em.find(Partie.class, partieID);
    }

    @Override
    public List<Partie> getAllPartie() throws DAOException {
        return em.createNamedQuery("Partie.findAll").getResultList();
    }


}
