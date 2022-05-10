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
@Table(name = "teknik")
@NamedQueries({
    @NamedQuery(name = "Teknik.findAll", query = "SELECT t FROM Teknik t"),
    @NamedQuery(name = "Teknik.findByUtrustningsID", query = "SELECT t FROM Teknik t WHERE t.utrustningsID = :utrustningsID"),
    @NamedQuery(name = "Teknik.findByKraftkalla", query = "SELECT t FROM Teknik t WHERE t.kraftkalla = :kraftkalla")})
public class Teknik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Utrustnings_ID")
    private Integer utrustningsID;
    @Column(name = "Kraftkalla")
    private String kraftkalla;

    public Teknik() {
    }

    public Teknik(Integer utrustningsID) {
        this.utrustningsID = utrustningsID;
    }

    public Integer getUtrustningsID() {
        return utrustningsID;
    }

    public void setUtrustningsID(Integer utrustningsID) {
        this.utrustningsID = utrustningsID;
    }

    public String getKraftkalla() {
        return kraftkalla;
    }

    public void setKraftkalla(String kraftkalla) {
        this.kraftkalla = kraftkalla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (utrustningsID != null ? utrustningsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teknik)) {
            return false;
        }
        Teknik other = (Teknik) object;
        if ((this.utrustningsID == null && other.utrustningsID != null) || (this.utrustningsID != null && !this.utrustningsID.equals(other.utrustningsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mibprojekt.Teknik[ utrustningsID=" + utrustningsID + " ]";
    }
    
}
