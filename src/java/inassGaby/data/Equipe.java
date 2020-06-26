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
@Table(name = "equipe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipe.findAll", query = "SELECT e FROM Equipe e")
    , @NamedQuery(name = "Equipe.findByIdEquipe", query = "SELECT e FROM Equipe e WHERE e.idEquipe = :idEquipe")})
public class Equipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_equipe")
    private Integer idEquipe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipe")
    private Collection<Score> scoreCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipe1")
    private Collection<Partie> partieCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipe2")
    private Collection<Partie> partieCollection1;
    @JoinColumn(name = "id_joueur1", referencedColumnName = "id_joueur")
    @ManyToOne(optional = false)
    private Joueur idJoueur1;
    @JoinColumn(name = "id_joueur2", referencedColumnName = "id_joueur")
    @ManyToOne(optional = false)
    private Joueur idJoueur2;

    public Equipe() {
    }

    public Equipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Equipe(Joueur idJoueur1, Joueur idJoueur2) {
        this.idJoueur1 = idJoueur1;
        this.idJoueur2 = idJoueur2;
    }

    public Integer getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    @XmlTransient
    public Collection<Score> getScoreCollection() {
        return scoreCollection;
    }

    public void setScoreCollection(Collection<Score> scoreCollection) {
        this.scoreCollection = scoreCollection;
    }

    @XmlTransient
    public Collection<Partie> getPartieCollection() {
        return partieCollection;
    }

    public void setPartieCollection(Collection<Partie> partieCollection) {
        this.partieCollection = partieCollection;
    }

    @XmlTransient
    public Collection<Partie> getPartieCollection1() {
        return partieCollection1;
    }

    public void setPartieCollection1(Collection<Partie> partieCollection1) {
        this.partieCollection1 = partieCollection1;
    }

    public Joueur getIdJoueur1() {
        return idJoueur1;
    }

    public void setIdJoueur1(Joueur idJoueur1) {
        this.idJoueur1 = idJoueur1;
    }

    public Joueur getIdJoueur2() {
        return idJoueur2;
    }

    public void setIdJoueur2(Joueur idJoueur2) {
        this.idJoueur2 = idJoueur2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipe != null ? idEquipe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if ((this.idEquipe == null && other.idEquipe != null) || (this.idEquipe != null && !this.idEquipe.equals(other.idEquipe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Equipe" + idEquipe  ;
    }
    
}
