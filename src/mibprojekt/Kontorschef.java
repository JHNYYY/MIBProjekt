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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Anton
 */
@Entity
@Table(name = "kontorschef")
@NamedQueries({
    @NamedQuery(name = "Kontorschef.findAll", query = "SELECT k FROM Kontorschef k"),
    @NamedQuery(name = "Kontorschef.findByAgentID", query = "SELECT k FROM Kontorschef k WHERE k.agentID = :agentID"),
    @NamedQuery(name = "Kontorschef.findByKontorsbeteckning", query = "SELECT k FROM Kontorschef k WHERE k.kontorsbeteckning = :kontorsbeteckning")})
public class Kontorschef implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Agent_ID")
    private Integer agentID;
    @Column(name = "Kontorsbeteckning")
    private String kontorsbeteckning;
    @JoinColumn(name = "Agent_ID", referencedColumnName = "Agent_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Agent agent;

    public Kontorschef() {
    }

    public Kontorschef(Integer agentID) {
        this.agentID = agentID;
    }

    public Integer getAgentID() {
        return agentID;
    }

    public void setAgentID(Integer agentID) {
        this.agentID = agentID;
    }

    public String getKontorsbeteckning() {
        return kontorsbeteckning;
    }

    public void setKontorsbeteckning(String kontorsbeteckning) {
        this.kontorsbeteckning = kontorsbeteckning;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
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
        if (!(object instanceof Kontorschef)) {
            return false;
        }
        Kontorschef other = (Kontorschef) object;
        if ((this.agentID == null && other.agentID != null) || (this.agentID != null && !this.agentID.equals(other.agentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mibprojekt.Kontorschef[ agentID=" + agentID + " ]";
    }
    
}
