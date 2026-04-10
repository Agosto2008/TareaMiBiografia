package com.davidlacayo.primeraPractica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class DatosController {

    @GetMapping("/datos")
    public String mostrarDatos(Model model) {
        model.addAttribute("Nombre", "David Estuardo");
        model.addAttribute("Apellido", "Lacayo Morataya");
        model.addAttribute("Edad", 17);

        return "datos";
    }

}
