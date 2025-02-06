package com.InfoMercado.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO", nullable = false)
    private Long idUsuario;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    @Column(name = "CONTRASENA")
    private String contrasena;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROL")
    private Rol rol;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombre, String correoElectronico, String contrasena, Rol rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public enum Rol {
        ADMINISTRADOR,
        AUXILIAR_REGISTRO
    }
}
