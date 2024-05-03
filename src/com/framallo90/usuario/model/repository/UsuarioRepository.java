package com.framallo90.usuario.model.repository;

import com.framallo90.interfaces.Repositorio;
import com.framallo90.usuario.model.entity.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioRepository implements Repositorio {
    private ArrayList<Usuario> listaUsuarios;

    public UsuarioRepository() {
        this.listaUsuarios = new ArrayList<>();
    }

    @Override
    public void register(Object object) {
        this.listaUsuarios.add((Usuario) object);
    }

    @Override
    public void search(String id) {
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : this.listaUsuarios) {
            if (usuario.getId().equals(id)) {
                usuarioEncontrado = usuario;
            }
        }
        if (usuarioEncontrado != null) {
            System.out.println("El usuario se encuentra en la lista: ");
            System.out.println(usuarioEncontrado.toString());
        } else {
            System.out.println("El usuario no se encuentra en la lista");
        }
    }

    @Override
    public void update(String id) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuaroModif = null;
        for (Usuario usuario : this.listaUsuarios) {
            if (usuario.getId().equals(id)) {
                usuaroModif = usuario;
            }
        }
        if (usuaroModif != null) {
            System.out.println("Ingrese nuevo nombre");
            String nombre = scanner.nextLine();
            usuaroModif.setNombre(nombre);

            System.out.println("Ingrese nuevo apellido");
            String apellido = scanner.nextLine();
            usuaroModif.setApellido(apellido);

            System.out.println("Ingrese nuevo tipo de usuario: ");
            String tipo = scanner.nextLine();
            usuaroModif.setTipo(tipo);
        }
    }

    @Override
    public void delete(String id) {
        Usuario usuarioBorrar = null;
        for (Usuario usuario : this.listaUsuarios) {
            if(usuario.getId().equals(id)){
                usuarioBorrar = usuario;
            }
        }
        if(usuarioBorrar != null){
            System.out.println("Usuario encontrado, eliminando...");
            this.listaUsuarios.remove(usuarioBorrar);
            System.out.println("Usuario eliminado con exito.");
        }else{
            System.out.println("El usuario no se encuentra en la lista.");
        }
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}