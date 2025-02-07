package com.InfoMercado.controller;

import com.InfoMercado.entity.Comerciante;
import com.InfoMercado.entity.Establecimiento;
import com.InfoMercado.repository.ComercianteRepository;
import com.InfoMercado.repository.EstablecimientoRepository;
import com.InfoMercado.service.EstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/establecimientos")
@CrossOrigin(origins = "http://localhost:3000")
public class EstablecimientoController {

    @Autowired
    private EstablecimientoService establecimientoService;

    @Autowired
    private ComercianteRepository comercianteRepository;

    @Autowired
    private EstablecimientoRepository establecimientoRepository;

    @GetMapping
    public List<Establecimiento> obtenerTodos() {
        return establecimientoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Establecimiento> obtenerPorId(@PathVariable Long id) {
        return establecimientoService.obtenerPorId(id);
    }

    @PostMapping
    public Establecimiento guardarEstablecimiento(
            @RequestBody Establecimiento establecimiento,
            @RequestParam Long idComerciante) {

        Comerciante comerciante = comercianteRepository.findById(idComerciante)
                .orElseThrow(() -> new RuntimeException("Comerciante no encontrado"));

        establecimiento.setComerciante(comerciante);
        return establecimientoRepository.save(establecimiento);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstablecimiento(@PathVariable Long id) {
        establecimientoService.eliminarEstablecimiento(id);
    }

    // Nuevo endpoint para obtener establecimientos por comerciante
    @GetMapping("/comerciante/{idComerciante}")
    public List<Establecimiento> obtenerPorComerciante(@PathVariable Long idComerciante) {
        return establecimientoService.obtenerPorComerciante(idComerciante);
    }
}
