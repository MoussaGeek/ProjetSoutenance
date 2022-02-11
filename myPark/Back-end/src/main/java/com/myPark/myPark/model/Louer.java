package com.myPark.myPark.model;

import com.myPark.myPark.enumiration.Statut;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Louer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double prix;
    @Enumerated(EnumType.STRING)
    private Statut statut;

    public Louer() {
    }

    public Louer(Long id, Date date, double prix, Statut statut) {
        this.id = id;
        this.date = date;
        this.prix = prix;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }
}
