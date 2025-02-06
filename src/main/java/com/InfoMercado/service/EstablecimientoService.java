package com.InfoMercado.service;
import com.InfoMercado.entity.Establecimiento;
import java.util.List;
import java.util.Optional;

public interface EstablecimientoService {
    List<Establecimiento> obtenerTodos();
    Optional<Establecimiento> obtenerPorId(Long id);
    Establecimiento guardarEstablecimiento(Establecimiento establecimiento);
    void eliminarEstablecimiento(Long id);
}