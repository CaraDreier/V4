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
    private int turmanzahl;

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
