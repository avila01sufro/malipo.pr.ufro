package com.ufro.Malipo.controller;

import com.ufro.Malipo.model.Producto;
import com.ufro.Malipo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductoController {

    @Autowired
    private ProductoService servicio;

    @GetMapping("/listado")
    public String listarProductos(Model modelo) {
        modelo.addAttribute("productos", servicio.listarProducto());
        return "listado_productos";
    }

    @GetMapping("/listado/añadir")
    public String agregarProductos(Model modelo) {
        Producto producto = new Producto();
        modelo.addAttribute("producto", producto);
        return "crear_producto";
    }

}
