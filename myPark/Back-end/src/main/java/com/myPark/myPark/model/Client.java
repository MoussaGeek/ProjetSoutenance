package com.myPark.myPark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String quartier;
    private String telephone;
    private String photosPermis;
    private String photoCarte;

    public Client() {
    }

    public Client(Long id, String nom, String prenom, String quartier, String telephone, String photosPermis, String photoCarte) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.quartier = quartier;
        this.telephone = telephone;
        this.photosPermis = photosPermis;
        this.photoCarte = photoCarte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPhotosPermis() {
        return photosPermis;
    }

    public void setPhotosPermis(String photosPermis) {
        this.photosPermis = photosPermis;
    }

    public String getPhotoCarte() {
        return photoCarte;
    }

    public void setPhotoCarte(String photoCarte) {
        this.photoCarte = photoCarte;
    }
}
