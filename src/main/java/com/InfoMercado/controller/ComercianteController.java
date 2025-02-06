package com.InfoMercado.controller;
import com.InfoMercado.entity.Comerciante;
import com.InfoMercado.service.ComercianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comerciantes")
public class ComercianteController {

    @Autowired
    private ComercianteService comercianteService;

    @GetMapping
    public List<Comerciante> obtenerTodos() {
        return comercianteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Comerciante> obtenerPorId(@PathVariable Long id) {
        return comercianteService.obtenerPorId(id);
    }

    @PostMapping
    public Comerciante guardarComerciante(@RequestBody Comerciante comerciante) {
        return comercianteService.guardarComerciante(comerciante);
    }

    @DeleteMapping("/{id}")
    public void eliminarComerciante(@PathVariable Long id) {
        comercianteService.eliminarComerciante(id);
    }
}
