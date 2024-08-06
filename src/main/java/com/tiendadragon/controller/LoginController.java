package com.tiendadragon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class LoginController {
    /*es la peticion del usuario https:8081/login */
    @GetMapping("/login")
    public String Login() {
        /* el return devolvera la pagina el html que vamos a ver */
        return "/Login/login";
    }
}
