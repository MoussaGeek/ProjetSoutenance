package com.myPark.myPark.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_parking;
    //@NotNull(message = "Veuillez renseigner le nom du parking...")
    private String nom;
    //@NotNull(message = "Veuillez renseigner le nom du gérant...")
    private String nom_gerant;
    private String prenom_gerant;
    private String quartier;
    //@NotNull(message = "Veuillez renseigner le numéro de téléphone...")
    private int telephone;

    public Parking() {
    }

    public Parking(long id_parking, String nom, String nom_gerant, String prenom_gerant, String quartier, int telephone) {
        this.id_parking = id_parking;
        this.nom = nom;
        this.nom_gerant = nom_gerant;
        this.prenom_gerant = prenom_gerant;
        this.quartier = quartier;
        this.telephone = telephone;
    }

    public long getId_parking() {
        return id_parking;
    }

    public void setId_parking(long id_parking) {
        this.id_parking = id_parking;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom_gerant() {
        return nom_gerant;
    }

    public void setNom_gerant(String nom_gerant) {
        this.nom_gerant = nom_gerant;
    }

    public String getPrenom_gerant() {
        return prenom_gerant;
    }

    public void setPrenom_gerant(String prenom_gerant) {
        this.prenom_gerant = prenom_gerant;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}
