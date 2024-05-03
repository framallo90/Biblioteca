package com.framallo90.libro.controller;

import com.framallo90.libro.model.entity.Libro;
import com.framallo90.libro.model.repository.LibroRepository;
import com.framallo90.libro.view.LibroView;

import java.util.Scanner;

public class LibroController {
    private LibroRepository libroRepository;
    private LibroView libroView;

    public LibroController(LibroRepository libroRepository, LibroView libroView) {
        this.libroRepository = libroRepository;
        this.libroView = libroView;
    }

    public void agregarLibros(){
        Scanner scanner = new Scanner(System.in);
        char c = 's';
        System.out.println("Cargando Libros");
        while(c == 's'){
            Libro nuevo = libroView.ingresoLibro();
            libroRepository.register(nuevo);
            libroView.mostrar(libroRepository.getListaLibro());
            System.out.println("Seguir agregando? (s) para seguir.");
            c = scanner.nextLine().charAt(0);
        }
    }

    public void borrarLibros(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el isbn del libro que desea borrar.");
        String id = scanner.nextLine();
        libroRepository.delete(id);
        libroView.mostrar(libroRepository.getListaLibro());
    }

    public void modificarLibros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el isbn del libro");
        String id = scanner.nextLine();
        libroRepository.update(id);
    }

    public void modificarCopias(){
        libroView.modificarCopias(libroRepository.getListaLibro());
    }

    public void buscarLibro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el isbn del libro");
        String id = scanner.nextLine();
        libroRepository.search(id);
    }


}
