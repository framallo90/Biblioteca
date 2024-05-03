package com.framallo90.prestamo.view;

import com.framallo90.libro.model.entity.Libro;
import com.framallo90.prestamo.model.entity.Prestamo;
import com.framallo90.usuario.model.entity.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrestamoView {

    public Prestamo generatePrestamo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Fecha de retiro: ");
        String fechaRetira = scanner.nextLine();
        System.out.println("Ingrese Fecha de devolcuion: ");
        String fechaDevolucion = scanner.nextLine();
        Libro libro = null;
        Usuario usuario = null;

        return new Prestamo(fechaRetira,fechaDevolucion,libro,usuario);
    }

    public Prestamo searchPresatamo(ArrayList<Prestamo> lista){
        Prestamo prestamoBuscado = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del prestamo a buscar: ");
        Integer nroPrestamo = scanner.nextInt();
        for(Prestamo prestamo : lista){
           if(prestamo.getNroPrestamo() == nroPrestamo){
                prestamoBuscado = prestamo;
           }
        }

        if(prestamoBuscado != null){
            System.out.println("Se ha encontrado el prestamo. ");
            System.out.println(prestamoBuscado.toString());
        }else{
            System.out.println("El prestamo solicitado no se ha encontrado o el numero es inexistente.");
        }

        return prestamoBuscado;
    }

    public void deletePrestamo(ArrayList<Prestamo> lista){
        Prestamo prestamoAdeletear = searchPresatamo(lista);
        if(prestamoAdeletear != null){
            lista.remove(prestamoAdeletear);
            System.out.println("El prestamo ha sido eliminado exitosamente.");
        }
    }

    public void updatePrestamo(ArrayList<Prestamo> lista){
        Scanner scanner = new Scanner(System.in);
        Prestamo prestamoAmodificar = searchPresatamo(lista);
        if(prestamoAmodificar != null){
            prestamoAmodificar.setFechaDevolucion("Ingrese nueva fecha de devolucion");
            String nuevafecha = scanner.nextLine();
            prestamoAmodificar.setFechaDevolucion(nuevafecha);
        }
    }

    public void devolver(ArrayList<Prestamo> lista){
        Prestamo prestamoAdevolver = searchPresatamo(lista);
        if(prestamoAdevolver != null){
            String devuelto = "Devuelto";
            prestamoAdevolver.setEstado(devuelto);
        }
    }

    public void mostrarPrestamos(List<Prestamo> lista){
        for(Prestamo prestamo : lista){
            System.out.println(prestamo.toString());
        }
    }


}
