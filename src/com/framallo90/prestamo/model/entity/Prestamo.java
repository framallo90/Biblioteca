package com.framallo90.prestamo.model.entity;

import com.framallo90.libro.model.entity.Libro;
import com.framallo90.usuario.model.entity.Usuario;


public class Prestamo {
    private Integer nroPrestamo;
    private static Integer nroPrestamoCont;
    private String fechaRetira;
    private String fechaDevolucion;
    private Libro libro;
    private Usuario usuario;
    private String Estado;

    public Prestamo(String fechaRetira, String fechaDevolucion, Libro libro, Usuario usuario) {
        this.nroPrestamo = nroPrestamoCont;
        this.fechaRetira = fechaRetira;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.usuario = usuario;
        nroPrestamoCont++;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "nroPrestamo=" + nroPrestamo +
                ", fechaRetira='" + fechaRetira + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                ", libro=" + libro +
                ", usuario=" + usuario +
                '}';
    }

    public Integer getNroPrestamo() {
        return nroPrestamo;
    }

    public void setNroPrestamo(Integer nroPrestamo) {
        this.nroPrestamo = nroPrestamo;
    }

    public static Integer getNroPrestamoCont() {
        return nroPrestamoCont;
    }

    public static void setNroPrestamoCont(Integer nroPrestamoCont) {
        Prestamo.nroPrestamoCont = nroPrestamoCont;
    }

    public String getFechaRetira() {
        return fechaRetira;
    }

    public void setFechaRetira(String fechaRetira) {
        this.fechaRetira = fechaRetira;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
