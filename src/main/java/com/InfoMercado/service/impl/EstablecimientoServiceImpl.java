package com.InfoMercado.service.impl;

import com.InfoMercado.entity.Establecimiento;
import com.InfoMercado.repository.EstablecimientoRepository;
import com.InfoMercado.service.EstablecimientoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstablecimientoServiceImpl implements EstablecimientoService {

    @Autowired
    private EstablecimientoRepository establecimientoRepository;

    @Override
    public List<Establecimiento> obtenerTodos() {
        return establecimientoRepository.findAll();
    }

    @Override
    public Optional<Establecimiento> obtenerPorId(Long id) {
        return establecimientoRepository.findById(id);
    }

    @Override
    public Establecimiento guardarEstablecimiento(Establecimiento establecimiento) {
        return establecimientoRepository.save(establecimiento);
    }

    @Override
    public void eliminarEstablecimiento(Long id) {
        establecimientoRepository.deleteById(id);
    }

    // Implementación del nuevo método
    @Override
    public List<Establecimiento> obtenerPorComerciante(Long idComerciante) {
        return establecimientoRepository.findByComercianteIdComerciante(idComerciante);
    }
}
