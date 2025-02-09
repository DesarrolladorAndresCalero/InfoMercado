    package com.InfoMercado.service;
    import com.InfoMercado.entity.Comerciante;
    import org.springframework.data.domain.Page;
    import org.springframework.data.domain.Pageable;

    import java.util.List;
    import java.util.Optional;

    public interface ComercianteService {
        List<Comerciante> obtenerTodos();
        Optional<Comerciante> obtenerPorId(Long id);
        Comerciante guardarComerciante(Comerciante comerciante);
        void eliminarComerciante(Long id);
    }
