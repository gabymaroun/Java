/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gaby's
 */
@Entity
@Table(name = "statistique")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statistique.findAll", query = "SELECT s FROM Statistique s")
    , @NamedQuery(name = "Statistique.findByIdStats", query = "SELECT s FROM Statistique s WHERE s.idStats = :idStats")
    , @NamedQuery(name = "Statistique.findByNbrAnnonces", query = "SELECT s FROM Statistique s WHERE s.nbrAnnonces = :nbrAnnonces")
    , @NamedQuery(name = "Statistique.findByNbrCapots", query = "SELECT s FROM Statistique s WHERE s.nbrCapots = :nbrCapots")
    , @NamedQuery(name = "Statistique.findByNbrPrisesAtout", query = "SELECT s FROM Statistique s WHERE s.nbrPrisesAtout = :nbrPrisesAtout")})
public class Statistique implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_stats")
    private Integer idStats;
    @Basic(optional = false)
    @Column(name = "nbr_annonces")
    private int nbrAnnonces;
    @Basic(optional = false)
    @Column(name = "nbr_capots")
    private int nbrCapots;
    @Basic(optional = false)
    @Column(name = "nbr_prises_atout")
    private int nbrPrisesAtout;
    @JoinColumn(name = "id_joueur", referencedColumnName = "id_joueur")
    @ManyToOne(optional = false)
    private Joueur idJoueur;
    @JoinColumn(name = "id_partie", referencedColumnName = "id_partie")
    @ManyToOne(optional = false)
    private Partie idPartie;

    public Statistique() {
    }

    public Statistique(Integer idStats) {
        this.idStats = idStats;
    }

    public Statistique(Integer idStats, int nbrAnnonces, int nbrCapots, int nbrPrisesAtout) {
        this.idStats = idStats;
        this.nbrAnnonces = nbrAnnonces;
        this.nbrCapots = nbrCapots;
        this.nbrPrisesAtout = nbrPrisesAtout;
    }

    public Statistique(Joueur idJoueur) {
        this.idJoueur = idJoueur;
    }
    
    

    public Integer getIdStats() {
        return idStats;
    }

    public void setIdStats(Integer idStats) {
        this.idStats = idStats;
    }

    public int getNbrAnnonces() {
        return nbrAnnonces;
    }

    public void setNbrAnnonces(int nbrAnnonces) {
        this.nbrAnnonces = nbrAnnonces;
    }

    public int getNbrCapots() {
        return nbrCapots;
    }

    public void setNbrCapots(int nbrCapots) {
        this.nbrCapots = nbrCapots;
    }

    public int getNbrPrisesAtout() {
        return nbrPrisesAtout;
    }

    public void setNbrPrisesAtout(int nbrPrisesAtout) {
        this.nbrPrisesAtout = nbrPrisesAtout;
    }

    public Joueur getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Joueur idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Partie getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(Partie idPartie) {
        this.idPartie = idPartie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStats != null ? idStats.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statistique)) {
            return false;
        }
        Statistique other = (Statistique) object;
        if ((this.idStats == null && other.idStats != null) || (this.idStats != null && !this.idStats.equals(other.idStats))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inassGaby.data.Statistique[ idStats=" + idStats + " ]";
    }
    
}
