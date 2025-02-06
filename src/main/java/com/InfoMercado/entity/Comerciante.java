package com.InfoMercado.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "COMERCIANTE")
public class Comerciante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMERCIANTE", nullable = false)
    private Long idComerciante;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "MUNICIPIO", nullable = false)
    private String municipio;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    @Column(name = "FECHA_REGISTRO", nullable = false)
    private LocalDate fechaRegistro;

    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO", nullable = false)
    private Estado estado;

    public enum Estado {
        ACTIVO,
        INACTIVO
    }

    public Long getIdComerciante() {
        return idComerciante;
    }

    public void setIdComerciante(Long idComerciante) {
        this.idComerciante = idComerciante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
