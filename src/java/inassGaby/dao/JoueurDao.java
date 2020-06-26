/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Joueur;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Gaby's
 */
//@Stateless
public class JoueurDao implements JoueurDaoLocal {

    private EntityManager em;

    public JoueurDao() {
        em = JeuEntityManager.getInstance().getEntityManager();
    }
//    @PersistenceContext(unitName = "BeloteFPU")

    @Override
    public void addJoueur(Joueur joueur) throws DAOException {
        em.getTransaction().begin();
        em.persist(joueur);
        em.getTransaction().commit();
    }

//    @Override
//    public void create(Joueur data) throws dao.DAOException {
//        em.getTransaction().begin();
//        em.persist(data);
//        em.getTransaction().commit();
//    }
//    @Override
//    public void editJoueur(Joueur joueur) throws DAOException{
//        em.merge(joueur);
//    }
    @Override
    public void editJoueur(Joueur joueur) throws DAOException {

        em.getTransaction().begin();
        em.merge(joueur);
        em.getTransaction().commit();
    }

    @Override
    public void deleteJoueur(int joueurID) throws DAOException {
        em.getTransaction().begin();
        em.remove(getJoueur(joueurID));
        em.getTransaction().commit();
    }

//    @Override
//    public void delete(data.Joueur data) throws dao.DAOException {
//        em.getTransaction().begin();
//        em.remove(data);
//        em.getTransaction().commit();
//    }
    @Override
    public Joueur getJoueur(int joueurID) throws DAOException {
        return em.find(Joueur.class, joueurID);
    }

    public Joueur getJoueur(String pseudo, String password) {
        final Query query = em
                .createNamedQuery("Joueur.findByPseudoAndPassword");
        query.setParameter("pseudo", pseudo);
        query.setParameter("password", password);
        if (query.getResultList().isEmpty()) {
            return null;
        }

        final Joueur joueur = (Joueur) query.getSingleResult();
        return joueur;

    }

    public Joueur getJoueur(String pseudo) throws DAOException {
        String sql = "SELECT e FROM Joueur e WHERE e.pseudo = :pseudo ";
        Query query = em.createQuery(sql);
        query.setParameter("pseudo", pseudo);
        List<Joueur> joueur = query.getResultList();
        return joueur.get(0);
    }
//
//    @Override
//    public data.Joueur find(int id) throws dao.DAOException {
//        data.Joueur joueur = em.find(data.Joueur.class, id);
//        return joueur;
//    }

//    @Override
//    public List<Joueur> getAllJoueur() throws DAOException{
//        return em.createNamedQuery("Joueur.getAll").getResultList();
//    }
    @Override
    public List<Joueur> getAllJoueur() throws DAOException {

        List<Joueur> joueurs = em.createQuery("Select t from Joueur t")
                .getResultList();
        return joueurs;
    }
}
