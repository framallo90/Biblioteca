package com.framallo90.libro.view;

import com.framallo90.libro.model.entity.Libro;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class LibroView {
    public Libro ingresoLibro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el titulo");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el genero");
        String genero = scanner.nextLine();
        System.out.println("Ingrese el isbn");
        String isbn = scanner.nextLine();
        System.out.println("Ingrese la cantidad de copias");
        int cantCopias = scanner.nextInt();

        return new Libro(titulo,genero,autor,isbn,cantCopias);
    }

    public void mostrar(ArrayList<Libro> lista){
        System.out.println("Libros: ");
        for(Libro libro : lista){
            System.out.println(libro.toString());
        }
    }

    public Libro buscoLibro(ArrayList<Libro> lista){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el isbn del libro: ");
        String id = scanner.nextLine();
        Libro libroBuscado = null;
        for(Libro libro : lista){
            if(id == libro.getIsbn()){
                libroBuscado = libro;
            }
        }
        if(libroBuscado == null){
            System.out.println("El libro no existe en la lista.");
        }else {
            System.out.println("El libro se encuentra en la lista.");
            System.out.println(libroBuscado.toString());
        }
        return libroBuscado;
    }
    public void modificarCopias(ArrayList<Libro> lista){
        Scanner scanner = new Scanner(System.in);
        Libro libroModificar = buscoLibro(lista);
        int opt = 0;
        do{
            System.out.println("Modificando copias.");
            System.out.println("1. Agregar copias.");
            System.out.println("2. Quitar copias. ");
            System.out.println("3. Salir.");
            opt = scanner.nextInt();
            switch (opt){
                case 1:

                    System.out.println("Ingrese la cantidad de copias que desea agregar: ");
                    int copiasAgregar = scanner.nextInt();
                    int copiasA = libroModificar.getCantCopias() + copiasAgregar;
                    libroModificar.setCantCopias(copiasA);
                    System.out.println("Copias agregadas con exito.");
                    System.out.println(libroModificar.toString());
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad de copias que desea quitar:");
                    int copiasQuitar = scanner.nextInt();
                    int copiasQ = libroModificar.getCantCopias() - copiasQuitar;
                    libroModificar.setCantCopias(copiasQ);
                    System.out.println("Copias restadas con exito.");
                    System.out.println(libroModificar.toString());
                    break;

                case 3:
                    System.out.println("Saliendo..");
                    break;

                default:
                    System.out.println("La opcion elegida no existe, ingrese una valida.");
                    break;
            }
        }while(opt != 3);
    }

}
