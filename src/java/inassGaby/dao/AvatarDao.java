/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Avatar;
import java.util.List;
//import javax.ejb.Stateless;
import javax.persistence.EntityManager;


//@Stateless
public class AvatarDao implements AvatarDaoLocal {

    private EntityManager em;

    public AvatarDao() {
        em = JeuEntityManager.getInstance().getEntityManager();

    }

    @Override
    public void addAvatar(Avatar avatar) throws DAOException {
        em.getTransaction().begin();
        em.persist(avatar);
        em.getTransaction().commit();
    }

    @Override
    public void editAvatar(Avatar avatar) throws DAOException {
        em.getTransaction().begin();
        em.merge(avatar);
        em.getTransaction().commit();
    }

    @Override
    public void deleteAvatar(int avatarId) throws DAOException {
        em.getTransaction().begin();
        em.remove(getAvatar(avatarId));
        em.getTransaction().commit();
    }

    @Override
    public Avatar getAvatar(int avatarId) throws DAOException {
        return em.find(Avatar.class, avatarId);
    }

    @Override
    public List<Avatar> getAllAvatar() throws DAOException {
        return em.createNamedQuery("Avatar.getAll").getResultList();
    }


}
