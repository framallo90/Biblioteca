package com.framallo90.libro.model.repository;

import com.framallo90.interfaces.Repositorio;
import com.framallo90.libro.model.entity.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class LibroRepository implements Repositorio {
    private ArrayList<Libro> listaLibro;

    public LibroRepository() {
        this.listaLibro = new ArrayList<>();
    }

    public ArrayList<Libro> getListaLibro() {
        return listaLibro;
    }

    public void setListaLibro(ArrayList<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }


    @Override
    public void register(Object object) {
        this.listaLibro.add((Libro) object);
    }

    @Override
    public void search(String id) {
        Libro libroBuscado = null;
        for(Libro libro : listaLibro){
            if(id == libro.getIsbn()){
                libroBuscado = libro;
                System.out.println("El libro existe en la lista.");
                System.out.println(libro.toString());
            }
        }
        if(libroBuscado == null){
            System.out.println("El libro no se encuentra en la lista.");
        }
    }

    @Override
    public void update(String id) {
        Scanner scanner = new Scanner(System.in);
        Libro libroBuscado = null;
        for(Libro libro : listaLibro){
            if(id == libro.getIsbn()){
                libroBuscado = libro;
                System.out.println("Ingresar Titulo: ");
                String titulo = scanner.nextLine();
                libroBuscado.setTitulo(titulo);

                System.out.println("Ingresar Autor: ");

                String autor = scanner.nextLine();
                libroBuscado.setAutor(autor);

                System.out.println("Ingresar Genero: ");
                String genero = scanner.nextLine();
                libroBuscado.setGenero(genero);
            }
        }
        System.out.println("Libro modificado con exito: ");
        System.out.println(libroBuscado.toString());
    }

    @Override
    public void delete(String id) {
        Libro libroBorrar = null;
        for(Libro libro : listaLibro){
                    if(id == libro.getIsbn()){
                libroBorrar = libro;
                this.listaLibro.remove(libroBorrar);
                System.out.println("El libro ha sido eliminado exitosamente");
            }
        }
        if(libroBorrar == null){
            System.out.println("El libro no se encuentra en la lista.");
        }
    }
}
