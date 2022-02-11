package com.myPark.myPark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.websocket.Encoder;
import java.awt.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class ContratLocation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateContratLocation;
    private Date dateDepart;
    private Date dateRetour;
    private String destination;
    private String termesConditions;
}
