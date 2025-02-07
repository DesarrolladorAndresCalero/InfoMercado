package com.InfoMercado.service.impl;

import com.InfoMercado.entity.Comerciante;
import com.InfoMercado.repository.ComercianteRepository;
import com.InfoMercado.service.ComercianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComercianteServiceImpl implements ComercianteService {

    @Autowired
    private ComercianteRepository comercianteRepository;

    @Override
    public List<Comerciante> obtenerTodos() {
        return comercianteRepository.findAll();
    }

    @Override
    public Optional<Comerciante> obtenerPorId(Long id) {
        return comercianteRepository.findById(id);
    }

    @Override
    public Comerciante guardarComerciante(Comerciante comerciante) {
        return comercianteRepository.save(comerciante);
    }

    @Override
    public void eliminarComerciante(Long id) {
        comercianteRepository.deleteById(id);
    }
}