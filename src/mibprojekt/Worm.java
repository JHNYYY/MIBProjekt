/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mibprojekt;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Anton
 */
@Entity
@Table(name = "worm")
@NamedQueries({
    @NamedQuery(name = "Worm.findAll", query = "SELECT w FROM Worm w"),
    @NamedQuery(name = "Worm.findByAlienID", query = "SELECT w FROM Worm w WHERE w.alienID = :alienID")})
public class Worm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Alien_ID")
    private Integer alienID;

    public Worm() {
    }

    public Worm(Integer alienID) {
        this.alienID = alienID;
    }

    public Integer getAlienID() {
        return alienID;
    }

    public void setAlienID(Integer alienID) {
        this.alienID = alienID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alienID != null ? alienID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Worm)) {
            return false;
        }
        Worm other = (Worm) object;
        if ((this.alienID == null && other.alienID != null) || (this.alienID != null && !this.alienID.equals(other.alienID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mibprojekt.Worm[ alienID=" + alienID + " ]";
    }
    
}
