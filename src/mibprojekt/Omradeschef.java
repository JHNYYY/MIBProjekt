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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Anton
 */
@Entity
@Table(name = "omradeschef")
@NamedQueries({
    @NamedQuery(name = "Omradeschef.findAll", query = "SELECT o FROM Omradeschef o"),
    @NamedQuery(name = "Omradeschef.findByAgentID", query = "SELECT o FROM Omradeschef o WHERE o.agentID = :agentID")})
public class Omradeschef implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Agent_ID")
    private Integer agentID;
    @JoinColumn(name = "Agent_ID", referencedColumnName = "Agent_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Agent agent;
    @JoinColumn(name = "Omrade", referencedColumnName = "Omrades_ID")
    @ManyToOne(optional = false)
    private Omrade omrade;

    public Omradeschef() {
    }

    public Omradeschef(Integer agentID) {
        this.agentID = agentID;
    }

    public Integer getAgentID() {
        return agentID;
    }

    public void setAgentID(Integer agentID) {
        this.agentID = agentID;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Omrade getOmrade() {
        return omrade;
    }

    public void setOmrade(Omrade omrade) {
        this.omrade = omrade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agentID != null ? agentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Omradeschef)) {
            return false;
        }
        Omradeschef other = (Omradeschef) object;
        if ((this.agentID == null && other.agentID != null) || (this.agentID != null && !this.agentID.equals(other.agentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mibprojekt.Omradeschef[ agentID=" + agentID + " ]";
    }
    
}
