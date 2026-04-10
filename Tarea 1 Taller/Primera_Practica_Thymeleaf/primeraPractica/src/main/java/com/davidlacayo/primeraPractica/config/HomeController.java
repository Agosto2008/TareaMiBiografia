package com.davidlacayo.primeraPractica.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    //Este metodo me sirve para mostrar mi primer formulario
    @GetMapping("/login")
        public String login() {
            return "login";
        }

        //Crearemos un metodo para manipular la informacion de mi formulario
    @GetMapping("/home")
    public String home(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        return "home";
    }

    //Este me manda siempre a una misma rute
    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/home";
    }
}
