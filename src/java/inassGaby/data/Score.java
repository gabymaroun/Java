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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "score")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Score.findAll", query = "SELECT s FROM Score s")
    , @NamedQuery(name = "Score.findByIdScore", query = "SELECT s FROM Score s WHERE s.idScore = :idScore")
    , @NamedQuery(name = "Score.findByScore", query = "SELECT s FROM Score s WHERE s.score = :score")})
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_score")
    private Integer idScore;
    @Basic(optional = false)
    @Column(name = "score")
    private int score;
    @JoinColumn(name = "id_equipe", referencedColumnName = "id_equipe")
    @ManyToOne(optional = false)
    private Equipe idEquipe;
    @JoinColumn(name = "id_partie", referencedColumnName = "id_partie")
    @ManyToOne(optional = false)
    private Partie idPartie;

    public Score() {
    }

    public Score(Integer idScore) {
        this.idScore = idScore;
    }

    public Score(Integer idScore, int score) {
        this.idScore = idScore;
        this.score = score;
    }

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Equipe getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Equipe idEquipe) {
        this.idEquipe = idEquipe;
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
        hash += (idScore != null ? idScore.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Score)) {
            return false;
        }
        Score other = (Score) object;
        if ((this.idScore == null && other.idScore != null) || (this.idScore != null && !this.idScore.equals(other.idScore))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inassGaby.data.Score[ idScore=" + idScore + " ]";
    }
    
}
