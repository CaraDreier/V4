package com.ba.v4.service;

import com.ba.v4.models.Turm;
import com.ba.v4.repository.TurmRepository;
import org.springframework.stereotype.Service;

@Service
public class TurmService {
    private TurmRepository turmRepository;

    public TurmService(TurmRepository turmRepository) {
        this.turmRepository = turmRepository;
    }

    public Turm createTurm (Turm turm){
        Turm turm1= new Turm();
        turm1.setAnzahlBalkone(turm.getAnzahlBalkone());
        turm1.setBalkongeländerhöheÜberFF(turm.getBalkongeländerhöheÜberFF());
        turm1.setFüllhöheGlasgeländer(turm.getFüllhöheGlasgeländer());
        turm1.setBreite(turm.getBreite());
        turm1.setTiefe1(turm.getTiefe1());
        turm1.setTiefe2(turm.getTiefe2());
        Turm newTurm = turmRepository.save(turm1);


        return null;
    }
}
