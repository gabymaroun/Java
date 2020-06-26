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
@Table(name = "joueur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joueur.findAll", query = "SELECT j FROM Joueur j")
    , @NamedQuery(name = "Joueur.findByIdJoueur", query = "SELECT j FROM Joueur j WHERE j.idJoueur = :idJoueur")
    , @NamedQuery(name = "Joueur.findByPseudo", query = "SELECT j FROM Joueur j WHERE j.pseudo = :pseudo")
    , @NamedQuery(name = "Joueur.findByPassword", query = "SELECT j FROM Joueur j WHERE j.password = :password")
    , @NamedQuery(name = "Joueur.findBySexe", query = "SELECT j FROM Joueur j WHERE j.sexe = :sexe")
    , @NamedQuery(name = "Joueur.findByPseudoAndPassword", query = "SELECT j FROM Joueur j WHERE j.pseudo = :pseudo AND j.password = :password")
    , @NamedQuery(name = "Joueur.findByVille", query = "SELECT j FROM Joueur j WHERE j.ville = :ville")
    , @NamedQuery(name = "Joueur.findByAge", query = "SELECT j FROM Joueur j WHERE j.age = :age")

})
public class Joueur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_joueur")
    private Integer idJoueur;
    @Basic(optional = false)
    @Column(name = "pseudo")
    private String pseudo;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "ville")
    private String ville;
    @Column(name = "age")
    private Integer age;
    @JoinColumn(name = "id_avatar", referencedColumnName = "id_avatar")
    @ManyToOne(optional = false)
    private Avatar idAvatar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJoueur")
    private Collection<Statistique> statistiqueCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJoueur1")
    private Collection<Equipe> equipeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJoueur2")
    private Collection<Equipe> equipeCollection1;

    public Joueur() {
    }

    public Joueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Joueur(Integer idJoueur, String pseudo, String password) {
        this.idJoueur = idJoueur;
        this.pseudo = pseudo;
        this.password = password;
    }

    public Joueur(String pseudo, String password, Integer age, String sexe) {
        this.pseudo = pseudo;
        this.password = password;
        this.age = age;
        this.sexe = sexe;
    }

    public Joueur(Integer idJoueur, String pseudo, String password, String sexe, String ville, Integer age) {
        this.idJoueur = idJoueur;
        this.pseudo = pseudo;
        this.password = password;
        this.sexe = sexe;
        this.ville = ville;
        this.age = age;
    }

    public Joueur(String pseudo, String password, String sexe, String ville, Integer age) {
        this.pseudo = pseudo;
        this.password = password;
        this.sexe = sexe;
        this.ville = ville;
        this.age = age;
    }

    public Integer getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Avatar getIdAvatar() {
        return idAvatar;
    }

    public void setIdAvatar(Avatar idAvatar) {
        this.idAvatar = idAvatar;
    }

    @XmlTransient
    public Collection<Statistique> getStatistiqueCollection() {
        return statistiqueCollection;
    }

    public void setStatistiqueCollection(Collection<Statistique> statistiqueCollection) {
        this.statistiqueCollection = statistiqueCollection;
    }

    @XmlTransient
    public Collection<Equipe> getEquipeCollection() {
        return equipeCollection;
    }

    public void setEquipeCollection(Collection<Equipe> equipeCollection) {
        this.equipeCollection = equipeCollection;
    }

    @XmlTransient
    public Collection<Equipe> getEquipeCollection1() {
        return equipeCollection1;
    }

    public void setEquipeCollection1(Collection<Equipe> equipeCollection1) {
        this.equipeCollection1 = equipeCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJoueur != null ? idJoueur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joueur)) {
            return false;
        }
        Joueur other = (Joueur) object;
        if ((this.idJoueur == null && other.idJoueur != null) || (this.idJoueur != null && !this.idJoueur.equals(other.idJoueur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return pseudo;
    }

}
