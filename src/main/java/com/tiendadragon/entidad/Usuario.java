package com.tiendadragon.entidad;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class Usuario {
    @Size(min = 6, max = 10)
    private String usuario;

    @Size(min = 6, max = 20)
    private String password;
}
