package com.tiendadragon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class InicioController {
    /* Este /inicio es un end point no una ruta en mi carpeta*/
    @GetMapping("/inicio")
    public String Inicio() {
        return "/index";
    }

}
