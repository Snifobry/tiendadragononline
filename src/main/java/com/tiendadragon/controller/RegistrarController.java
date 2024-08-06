package com.tiendadragon.controller;

import com.tiendadragon.entidad.Usuario;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class RegistrarController {
    @GetMapping("/usuarios")
       //El objeto Model ui. hace q accedamos a los datos de la vista que en este caso datos del formulario
        public String formularioUsuario(Model model) {
            //Este "usuario" es mi opbjeto o bien dicho el model de mi objeto con sus
            //propiedades y el new es para instanciar un nuevo Usuario con el metodo new Usuario()
            //este "usuario" esta en minuscula y se lo menciona en el form de registroUsuario
            //en el th:object
            model.addAttribute("usuario", new Usuario());
            return "/RegistroUsuario/registroUsuario";
    }

    @PostMapping("/registrarUsuario")
    public String registrarUsuario(@Valid @ModelAttribute Usuario usuario, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            //sirve para poner errores en el formulario
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "/RegistroUsuario/registroUsuarioError";
        } else {
            return "/RegistroUsuario/registroUsuarioSuccessfull";
        }
    }

}
