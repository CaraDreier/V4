package com.ba.v4.controller;

import com.ba.v4.models.PDaten;
import com.ba.v4.models.Turm;
import com.ba.v4.service.TurmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TurmController {
    private TurmService turmService;

    public TurmController(TurmService turmService) {
        this.turmService = turmService;
    }

    @GetMapping("/turm")
    public String turmFrom(Model model){
        model.addAttribute("turm", new Turm());
        return "turm";
    }
    @PostMapping("/turm")
    public Turm turmSubmit(@ModelAttribute Turm turm, Model model){
        model.addAttribute("turm", turm);

        return turmService.createTurm(turm);
    }

}
