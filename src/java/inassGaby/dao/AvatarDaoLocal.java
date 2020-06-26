/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Avatar;
import java.util.List;
//import javax.ejb.Local;


//@Local
public interface AvatarDaoLocal {

    void addAvatar(Avatar avatar) throws DAOException;

    void editAvatar(Avatar avatar) throws DAOException;

    void deleteAvatar(int avatarId) throws DAOException;

    Avatar getAvatar(int avatarId) throws DAOException;

    List<Avatar> getAllAvatar() throws DAOException;
    
}
