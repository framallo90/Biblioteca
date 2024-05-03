package com.framallo90.usuario.view;


import com.framallo90.usuario.model.entity.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioView {
    public Usuario crearUsuario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese id: ");
        String id = scanner.nextLine();
        System.out.println("Ingrese tipo de usuario: ");
        String tipo = scanner.nextLine();
        return new Usuario(nombre,apellido,id,tipo);
    }

    public void  mostrarUsuarios(ArrayList<Usuario> lista){
        System.out.println("Lista de usuarios: ");
        for(Usuario usuario : lista){
            System.out.println(usuario.toString());
        }
    }

    public Usuario searchUsuario(ArrayList<Usuario> lista){
        Scanner scanner = new Scanner(System.in);
        Usuario usuarioBuscado = null;
        System.out.println("Ingrese el id del usuario");
        String id = scanner.nextLine();
        for(Usuario usuario : lista){
            if(usuario.getId().equals(id)){
                usuarioBuscado = usuario;
            }
        }
        if (usuarioBuscado != null){
            System.out.println("El usuario fue encontrado con exito");
            System.out.println(usuarioBuscado.toString());
        }else {
            System.out.println("El usuario no se encuentra en la lista");
        }
        return usuarioBuscado;

    }
}
