package com.myPark.myPark.model;

import javax.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "louer_id")
    private Louer louer;
    @ManyToOne
    @JoinColumn(name = "automobile_id")
    private Automobile automobile;

    public Location() {
    }

    public Location(Long id, Louer louer, Automobile automobile) {
        this.id = id;
        this.louer = louer;
        this.automobile = automobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Louer getLouer() {
        return louer;
    }

    public void setLouer(Louer louer) {
        this.louer = louer;
    }

    public Automobile getAutomobile() {
        return automobile;
    }

    public void setAutomobile(Automobile automobile) {
        this.automobile = automobile;
    }
}
