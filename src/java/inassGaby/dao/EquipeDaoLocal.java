/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.dao;

import inassGaby.data.Equipe;
import java.util.List;
//import javax.ejb.Local;

/**
 *
 * @author Gaby's
 */
//@Local
public interface EquipeDaoLocal {

    void addEquipe(Equipe equipe);
    
    void editEquipe(Equipe equipe);

    void deleteEquipe(int equipeID);

    Equipe getEquipe(int equipeID);

    List<Equipe> getAllEquipe();
}
