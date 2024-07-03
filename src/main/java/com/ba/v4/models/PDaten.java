package com.ba.v4.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PDaten {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nameKunde;
    private String adresse;
    private String nameProjektersteller;
    private String pv; // pv=publikumsverkehr
    private int turmanzahl;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNameKunde() {
        return nameKunde;
    }

    public void setNameKunde(String nameKunde) {
        this.nameKunde = nameKunde;
    }

    public String getNameProjektersteller() {
        return nameProjektersteller;
    }

    public void setNameProjektersteller(String nameProjektersteller) {
        this.nameProjektersteller = nameProjektersteller;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTurmanzahl() {
        return turmanzahl;
    }

    public void setTurmanzahl(int turmanzahl) {
        this.turmanzahl = turmanzahl;
    }
}
