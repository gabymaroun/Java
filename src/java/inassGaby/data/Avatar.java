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
@Table(name = "avatar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Avatar.findAll", query = "SELECT a FROM Avatar a")
    , @NamedQuery(name = "Avatar.findByIdAvatar", query = "SELECT a FROM Avatar a WHERE a.idAvatar = :idAvatar")
    , @NamedQuery(name = "Avatar.findByUrl", query = "SELECT a FROM Avatar a WHERE a.url = :url")})
public class Avatar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_avatar")
    private Integer idAvatar;
    @Basic(optional = false)
    @Column(name = "url")
    private String url;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAvatar")
    private Collection<Joueur> joueurCollection;

    public Avatar() {
    }

    public Avatar(Integer idAvatar) {
        this.idAvatar = idAvatar;
    }

    public Avatar(Integer idAvatar, String url) {
        this.idAvatar = idAvatar;
        this.url = url;
    }

    public Integer getIdAvatar() {
        return idAvatar;
    }

    public void setIdAvatar(Integer idAvatar) {
        this.idAvatar = idAvatar;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlTransient
    public Collection<Joueur> getJoueurCollection() {
        return joueurCollection;
    }

    public void setJoueurCollection(Collection<Joueur> joueurCollection) {
        this.joueurCollection = joueurCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAvatar != null ? idAvatar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Avatar)) {
            return false;
        }
        Avatar other = (Avatar) object;
        if ((this.idAvatar == null && other.idAvatar != null) || (this.idAvatar != null && !this.idAvatar.equals(other.idAvatar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inassGaby.data.Avatar[ idAvatar=" + idAvatar + " ]";
    }
    
}
