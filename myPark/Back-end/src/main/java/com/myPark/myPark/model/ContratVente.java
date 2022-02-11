package com.myPark.myPark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

@Entity
public class ContratVente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateContratVente;

    public ContratVente() {
    }

    public Date getDateContratVente() {
        return dateContratVente;
    }

    public void setDateContratVente(Date dateContratVente) {
        this.dateContratVente = dateContratVente;
    }
}
