package com.InfoMercado.controller;
import com.InfoMercado.entity.Comerciante;
import com.InfoMercado.service.ComercianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comerciantes")
@CrossOrigin(origins = "http://localhost:3000")
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

    @PutMapping("/{id}")
    public ResponseEntity<Comerciante> actualizarComerciante(
            @PathVariable Long id, @RequestBody Comerciante comercianteActualizado) {

        Optional<Comerciante> comercianteExistente = comercianteService.obtenerPorId(id);

        if (comercianteExistente.isPresent()) {
            Comerciante comerciante = comercianteExistente.get();
            comerciante.setNombre(comercianteActualizado.getNombre());
            comerciante.setMunicipio(comercianteActualizado.getMunicipio());
            comerciante.setTelefono(comercianteActualizado.getTelefono());
            comerciante.setCorreoElectronico(comercianteActualizado.getCorreoElectronico());
            comerciante.setFechaRegistro(comercianteActualizado.getFechaRegistro());
            comerciante.setEstado(comercianteActualizado.getEstado());

            Comerciante actualizado = comercianteService.guardarComerciante(comerciante);
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
