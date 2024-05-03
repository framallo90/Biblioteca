package com.framallo90.prestamo.controller;

import com.framallo90.libro.model.entity.Libro;
import com.framallo90.libro.model.repository.LibroRepository;
import com.framallo90.libro.view.LibroView;
import com.framallo90.prestamo.model.entity.Prestamo;
import com.framallo90.prestamo.model.repository.PrestamoRepository;
import com.framallo90.prestamo.view.PrestamoView;
import com.framallo90.usuario.model.entity.Usuario;
import com.framallo90.usuario.model.repository.UsuarioRepository;
import com.framallo90.usuario.view.UsuarioView;

public class PrestamoController {
    private UsuarioRepository usuarioRepository;
    private UsuarioView usuarioView;
    private LibroRepository libroRepository;
    private LibroView libroView;
    private PrestamoView prestamoView;
    private PrestamoRepository prestamoRepository;

    public PrestamoController(UsuarioRepository usuarioRepository, UsuarioView usuarioView, LibroRepository libroRepository, LibroView libroView, PrestamoView prestamoView, PrestamoRepository prestamoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioView = usuarioView;
        this.libroRepository = libroRepository;
        this.libroView = libroView;
        this.prestamoView = prestamoView;
        this.prestamoRepository = prestamoRepository;
    }

    public void addPrestamo(){
        Usuario usuario = usuarioView.crearUsuario();
        usuarioRepository.register(usuario);

        Libro libro = libroView.ingresoLibro();
        libroRepository.register(libro);

        Prestamo prestamo = prestamoView.generatePrestamo();
        prestamo.setLibro(libro);
        prestamo.setUsuario(usuario);

        prestamoRepository.register(prestamo);
    }

    public void devolverPrestamo(){
        prestamoView.devolver(prestamoRepository.getListaPrestamo());
    }

    public UsuarioRepository getUsuarioRepository() {
        return usuarioRepository;
    }

    public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioView getUsuarioView() {
        return usuarioView;
    }

    public void setUsuarioView(UsuarioView usuarioView) {
        this.usuarioView = usuarioView;
    }

    public LibroRepository getLibroRepository() {
        return libroRepository;
    }

    public void setLibroRepository(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public LibroView getLibroView() {
        return libroView;
    }

    public void setLibroView(LibroView libroView) {
        this.libroView = libroView;
    }

    public PrestamoView getPrestamoView() {
        return prestamoView;
    }

    public void setPrestamoView(PrestamoView prestamoView) {
        this.prestamoView = prestamoView;
    }

    public PrestamoRepository getPrestamoRepository() {
        return prestamoRepository;
    }

    public void setPrestamoRepository(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }
}
