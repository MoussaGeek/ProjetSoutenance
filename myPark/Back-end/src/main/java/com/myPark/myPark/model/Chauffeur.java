package com.myPark.myPark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Chauffeur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String telephone;
    private String numeroPermis;
    private String photoPermis;
    private String photoCarte;

    public Chauffeur() {
    }

    public Chauffeur(Long id, String nom, String prenom, String telephone, String numeroPermis, String photoPermis, String photoCarte) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.numeroPermis = numeroPermis;
        this.photoPermis = photoPermis;
        this.photoCarte = photoCarte;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }

    public String getPhotoPermis() {
        return photoPermis;
    }

    public void setPhotoPermis(String photoPermis) {
        this.photoPermis = photoPermis;
    }

    public String getPhotoCarte() {
        return photoCarte;
    }

    public void setPhotoCarte(String photoCarte) {
        this.photoCarte = photoCarte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
