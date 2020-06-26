/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Equipe;
import java.util.List;
//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gaby's
 */
//@Stateless
public class EquipeDao implements EquipeDaoLocal {

    private EntityManager em;

    public EquipeDao() {
        em = JeuEntityManager.getInstance().getEntityManager();
    }

    @Override
    public void addEquipe(Equipe equipe) {
        em.getTransaction().begin();
        em.persist(equipe);
        em.getTransaction().commit();
    }

    @Override
    public void editEquipe(Equipe equipe) {
        em.getTransaction().begin();
        em.merge(equipe);
        em.getTransaction().commit();
    }

    @Override
    public void deleteEquipe(int equipeID) {
        em.getTransaction().begin();
        em.remove(getEquipe(equipeID));
        em.getTransaction().commit();
    }

    @Override
    public Equipe getEquipe(int equipeID) {
        return em.find(Equipe.class, equipeID);
    }

    @Override
    public List<Equipe> getAllEquipe() {
        return em.createNamedQuery("Equipe.findAll").getResultList();
    }

}
