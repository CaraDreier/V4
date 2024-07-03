package com.ba.v4.service;

import com.ba.v4.models.PDaten;
import com.ba.v4.repository.PDatenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PDatenService {

   private PDatenRepository pDatenRepository;

    public PDatenService(PDatenRepository pDatenRepository) {
        this.pDatenRepository = pDatenRepository;
    }

    public PDaten createPDaten (PDaten pDaten){
        PDaten pDaten1 = new PDaten();
        pDaten1.setNameKunde(pDaten.getNameKunde());
        pDaten1.setAdresse(pDaten.getAdresse());
        pDaten1.setNameProjektersteller(pDaten.getNameProjektersteller());
        pDaten1.setPv(pDaten.getPv());
        pDaten1.setTurmanzahl(pDaten.getTurmanzahl());



        PDaten newPDaten= pDatenRepository.save(pDaten1);
        return null;
    }
}
