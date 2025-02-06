package com.InfoMercado.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ESTABLECIMIENTO")
public class Establecimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTABLECIMIENTO", nullable = false)
    private Long idEstablecimiento;

    @Column(name = "NOMBRE_ESTABLECIMIENTO")
    private String nombreEstablecimiento;

    @Column(name = "INGRESOS")
    private BigDecimal ingresos;

    @Column(name = "NUMERO_EMPLEADOS")
    private Integer numeroEmpleados;

    @ManyToOne
    @JoinColumn(name = "ID_COMERCIANTE", nullable = false)
    private Comerciante comerciante;

    // Getters y setters

    public Long getIdEstablecimiento() {
        return idEstablecimiento;
    }

    public void setIdEstablecimiento(Long idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public BigDecimal getIngresos() {
        return ingresos;
    }

    public void setIngresos(BigDecimal ingresos) {
        this.ingresos = ingresos;
    }

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Comerciante getComerciante() {
        return comerciante;
    }

    public void setComerciante(Comerciante comerciante) {
        this.comerciante = comerciante;
    }
}
