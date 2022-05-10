/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mibprojekt;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Anton
 */
@Entity
@Table(name = "fordon")
@NamedQueries({
    @NamedQuery(name = "Fordon.findAll", query = "SELECT f FROM Fordon f"),
    @NamedQuery(name = "Fordon.findByFordonsID", query = "SELECT f FROM Fordon f WHERE f.fordonsID = :fordonsID"),
    @NamedQuery(name = "Fordon.findByFordonsbeskrivning", query = "SELECT f FROM Fordon f WHERE f.fordonsbeskrivning = :fordonsbeskrivning"),
    @NamedQuery(name = "Fordon.findByRegistreringsdatum", query = "SELECT f FROM Fordon f WHERE f.registreringsdatum = :registreringsdatum"),
    @NamedQuery(name = "Fordon.findByArsmodell", query = "SELECT f FROM Fordon f WHERE f.arsmodell = :arsmodell")})
public class Fordon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Fordons_ID")
    private String fordonsID;
    @Column(name = "Fordonsbeskrivning")
    private String fordonsbeskrivning;
    @Basic(optional = false)
    @Column(name = "Registreringsdatum")
    @Temporal(TemporalType.DATE)
    private Date registreringsdatum;
    @Column(name = "Arsmodell")
    private Integer arsmodell;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fordon")
    private Collection<InneharFordon> inneharFordonCollection;

    public Fordon() {
    }

    public Fordon(String fordonsID) {
        this.fordonsID = fordonsID;
    }

    public Fordon(String fordonsID, Date registreringsdatum) {
        this.fordonsID = fordonsID;
        this.registreringsdatum = registreringsdatum;
    }

    public String getFordonsID() {
        return fordonsID;
    }

    public void setFordonsID(String fordonsID) {
        this.fordonsID = fordonsID;
    }

    public String getFordonsbeskrivning() {
        return fordonsbeskrivning;
    }

    public void setFordonsbeskrivning(String fordonsbeskrivning) {
        this.fordonsbeskrivning = fordonsbeskrivning;
    }

    public Date getRegistreringsdatum() {
        return registreringsdatum;
    }

    public void setRegistreringsdatum(Date registreringsdatum) {
        this.registreringsdatum = registreringsdatum;
    }

    public Integer getArsmodell() {
        return arsmodell;
    }

    public void setArsmodell(Integer arsmodell) {
        this.arsmodell = arsmodell;
    }

    public Collection<InneharFordon> getInneharFordonCollection() {
        return inneharFordonCollection;
    }

    public void setInneharFordonCollection(Collection<InneharFordon> inneharFordonCollection) {
        this.inneharFordonCollection = inneharFordonCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fordonsID != null ? fordonsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fordon)) {
            return false;
        }
        Fordon other = (Fordon) object;
        if ((this.fordonsID == null && other.fordonsID != null) || (this.fordonsID != null && !this.fordonsID.equals(other.fordonsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mibprojekt.Fordon[ fordonsID=" + fordonsID + " ]";
    }
    
}
