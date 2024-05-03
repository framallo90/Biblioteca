package com.framallo90.usuario.controller;

import com.framallo90.usuario.model.entity.Usuario;
import com.framallo90.usuario.model.repository.UsuarioRepository;
import com.framallo90.usuario.view.UsuarioView;

import java.util.Scanner;

public class UsuarioController {
    private UsuarioRepository usuarioRepository;
    private UsuarioView usuarioView;

    public UsuarioController(UsuarioRepository usuarioRepository, UsuarioView usuarioView) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioView = usuarioView;
    }

    public void addUsuario(){
        Usuario nuevo = usuarioView.crearUsuario();
        usuarioRepository.register(nuevo);
        usuarioView.mostrarUsuarios(usuarioRepository.getListaUsuarios());
    }

    public void removeUsuario(){
        Usuario uRemove = usuarioView.searchUsuario(usuarioRepository.getListaUsuarios());
        usuarioRepository.getListaUsuarios().remove(uRemove);
        usuarioView.mostrarUsuarios(usuarioRepository.getListaUsuarios());
    }

    public void updateUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el id del usuario a modificar: ");
        String id = scanner.nextLine();
        usuarioRepository.update(id);
    }
}
