package com.cloudbees.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author harpreet
 */
@Entity
@Table(name = "COUNTRIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Countries.findAll", query = "SELECT c FROM Countries c"),
    @NamedQuery(name = "Countries.findById", query = "SELECT c FROM Countries c WHERE c.id = :id"),
    @NamedQuery(name = "Countries.findByCountry", query = "SELECT c FROM Countries c WHERE c.country = :country"),
    @NamedQuery(name = "Countries.findByCaptial", query = "SELECT c FROM Countries c WHERE c.captial = :captial")})
public class Countries implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "CAPTIAL")
    private String captial;

    public Countries() {
    }

    public Countries(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCaptial() {
        return captial;
    }

    public void setCaptial(String captial) {
        this.captial = captial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Countries)) {
            return false;
        }
        Countries other = (Countries) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cloudbees.entity.Countries[ id=" + id + " ]";
    }
    
}
