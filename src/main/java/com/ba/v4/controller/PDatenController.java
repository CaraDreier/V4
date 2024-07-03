package com.ba.v4.controller;

import com.ba.v4.models.PDaten;
import com.ba.v4.service.PDatenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PDatenController {

    private PDatenService pDatenService;
    public PDatenController(PDatenService pDatenService) {
        this.pDatenService = pDatenService;
    }



    @GetMapping("/daten")
    public String pDatenFrom(Model model){
        model.addAttribute("daten", new PDaten());
        return "daten";
    }
    @PostMapping("/daten")
    public PDaten pDatenSubmit(@ModelAttribute PDaten pDaten, Model model){
        model.addAttribute("daten", pDaten);

        return pDatenService.createPDaten(pDaten);
    }

}
