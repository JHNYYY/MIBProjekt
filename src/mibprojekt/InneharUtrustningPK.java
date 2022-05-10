/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mibprojekt;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Anton
 */
@Embeddable
public class InneharUtrustningPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Agent_ID")
    private int agentID;
    @Basic(optional = false)
    @Column(name = "Utrustnings_ID")
    private int utrustningsID;

    public InneharUtrustningPK() {
    }

    public InneharUtrustningPK(int agentID, int utrustningsID) {
        this.agentID = agentID;
        this.utrustningsID = utrustningsID;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public int getUtrustningsID() {
        return utrustningsID;
    }

    public void setUtrustningsID(int utrustningsID) {
        this.utrustningsID = utrustningsID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) agentID;
        hash += (int) utrustningsID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InneharUtrustningPK)) {
            return false;
        }
        InneharUtrustningPK other = (InneharUtrustningPK) object;
        if (this.agentID != other.agentID) {
            return false;
        }
        if (this.utrustningsID != other.utrustningsID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mibprojekt.InneharUtrustningPK[ agentID=" + agentID + ", utrustningsID=" + utrustningsID + " ]";
    }
    
}
