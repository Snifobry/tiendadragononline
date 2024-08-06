package com.tiendadragon.controller;

import com.tiendadragon.entidad.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class UsuarioController {
    @GetMapping("/usuario")
       //El objeto Model ui. hace q accedamos a los datos de la vista que en este caso datos del formulario
        public String formularioUsuario(Model model) {
            //Este "usuario" es mi opbjeto o bien dicho el model de mi objeto con sus
            //propiedades y el new es para instanciar un nuevo Usuario con el metodo new Usuario()
            model.addAttribute("usuario", new Usuario());
            return "/Login/login";
    }

}
