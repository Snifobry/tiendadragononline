package com.tiendadragon.controller;

import org.springframework.ui.Model;
import com.tiendadragon.entidad.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Controller

public class ProductoController {

    //injeccion de dependencias por campo es el @autowriter
    @Autowired
    private RestTemplate restTemplate;
    //fin de injeccion de dependencias por campo

    @GetMapping("/productos")
    public String listarProductos(Model model) {
        List<Producto> productos = restTemplate.getForObject("http://localhost:8081/api/productos", List.class);
        model.addAttribute("productos", productos);
        return "/Producto/productos";
    }
}
