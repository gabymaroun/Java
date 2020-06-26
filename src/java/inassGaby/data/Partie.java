/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inassGaby.data;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gaby's
 */
@Entity
@Table(name = "partie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partie.findAll", query = "SELECT p FROM Partie p")
    , @NamedQuery(name = "Partie.findByIdPartie", query = "SELECT p FROM Partie p WHERE p.idPartie = :idPartie")
    , @NamedQuery(name = "Partie.findByIdWinner", query = "SELECT p FROM Partie p WHERE p.idWinner = :idWinner")})
public class Partie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_partie")
    private Integer idPartie;
    @Basic(optional = false)
    @Column(name = "id_winner")
    private int idWinner;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPartie")
    private Collection<Score> scoreCollection;
    @JoinColumn(name = "id_equipe1", referencedColumnName = "id_equipe")
    @ManyToOne(optional = false)
    private Equipe idEquipe1;
    @JoinColumn(name = "id_equipe2", referencedColumnName = "id_equipe")
    @ManyToOne(optional = false)
    private Equipe idEquipe2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPartie")
    private Collection<Statistique> statistiqueCollection;

    public Partie() {
    }

    public Partie(Integer idPartie) {
        this.idPartie = idPartie;
    }

    public Partie(Integer idPartie, int idWinner) {
        this.idPartie = idPartie;
        this.idWinner = idWinner;
    }

    public Partie(Equipe idEquipe1, Equipe idEquipe2) {
        this.idEquipe1 = idEquipe1;
        this.idEquipe2 = idEquipe2;
    }


    public Integer getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(Integer idPartie) {
        this.idPartie = idPartie;
    }

    public int getIdWinner() {
        return idWinner;
    }

    public void setIdWinner(int idWinner) {
        this.idWinner = idWinner;
    }

    @XmlTransient
    public Collection<Score> getScoreCollection() {
        return scoreCollection;
    }

    public void setScoreCollection(Collection<Score> scoreCollection) {
        this.scoreCollection = scoreCollection;
    }

    public Equipe getIdEquipe1() {
        return idEquipe1;
    }

    public void setIdEquipe1(Equipe idEquipe1) {
        this.idEquipe1 = idEquipe1;
    }

    public Equipe getIdEquipe2() {
        return idEquipe2;
    }

    public void setIdEquipe2(Equipe idEquipe2) {
        this.idEquipe2 = idEquipe2;
    }

    @XmlTransient
    public Collection<Statistique> getStatistiqueCollection() {
        return statistiqueCollection;
    }

    public void setStatistiqueCollection(Collection<Statistique> statistiqueCollection) {
        this.statistiqueCollection = statistiqueCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPartie != null ? idPartie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partie)) {
            return false;
        }
        Partie other = (Partie) object;
        if ((this.idPartie == null && other.idPartie != null) || (this.idPartie != null && !this.idPartie.equals(other.idPartie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inassGaby.data.Partie[ idPartie=" + idPartie + " ]";
    }

}
