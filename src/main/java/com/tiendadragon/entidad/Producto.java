package com.tiendadragon.entidad;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor

public class Producto {
    private int idProducto;
    private String descripcion;
    private int cantidad;
    private double precio;

}
