package com.ba.v4.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Data
@Entity
public class Turm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTurm;
    private int idPDatenTabelle;
    private int anzahlBalkone;
    private int balkongeländerhöheÜberFF;
    private int füllhöheGlasgeländer;
    private int breite;
    private int tiefe1;
    private int tiefe2;
}
