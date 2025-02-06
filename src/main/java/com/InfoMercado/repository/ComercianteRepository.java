package com.InfoMercado.repository;
import com.InfoMercado.entity.Comerciante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComercianteRepository extends JpaRepository<Comerciante, Long> {
}
