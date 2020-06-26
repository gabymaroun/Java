/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ADMIN
 */
public class JeuEntityManager {

    private static JeuEntityManager instance;

    private static final String PERSISTENCE_UNIT_NAME = "BeloteJeuPU";
    private EntityManagerFactory emf;
    private EntityManager em;

    private JeuEntityManager() {
        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = emf.createEntityManager();
    }

    public static synchronized JeuEntityManager getInstance() {
        if (instance == null) {
            instance = new JeuEntityManager();
        }

        return instance;
    }

    public EntityManager getEntityManager() {
        return em;
    }

}