package com.myPark.myPark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateFacture;
    private String montantTotal;
    private String montantPaye;
    private String restePayer;

    public Facture() {
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public String getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(String montantTotal) {
        this.montantTotal = montantTotal;
    }

    public String getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(String montantPaye) {
        this.montantPaye = montantPaye;
    }

    public String getRestePayer() {
        return restePayer;
    }

    public void setRestePayer(String restePayer) {
        this.restePayer = restePayer;
    }
}
