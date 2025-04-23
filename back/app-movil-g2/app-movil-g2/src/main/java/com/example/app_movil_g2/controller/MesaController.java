package com.example.app_movil_g2.controller;

import com.example.app_movil_g2.model.Mesa;
import com.example.app_movil_g2.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mesas")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @GetMapping
    public List<Mesa> listar() {
        return mesaService.listar();
    }

    @PostMapping
    public Mesa guardar(@RequestBody Mesa mesa) {
        return mesaService.guardar(mesa);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        mesaService.eliminar(id);
    }
}
