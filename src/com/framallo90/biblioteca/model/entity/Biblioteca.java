package com.framallo90.biblioteca.model.entity;

import com.framallo90.interfaces.Prestable;
import com.framallo90.prestamo.controller.PrestamoController;


import java.util.Scanner;

public class Biblioteca implements Prestable {

    private PrestamoController prestamoController;

    public Biblioteca(PrestamoController prestamoController) {
        this.prestamoController = prestamoController;
    }

    @Override
    public void realizarPrestamo() {
        prestamoController.addPrestamo();
    }

    @Override
    public void registrarDevolucion() {
        prestamoController.devolverPrestamo();
    }

    public PrestamoController getPrestamoController() {
        return prestamoController;
    }

    public void setPrestamoController(PrestamoController prestamoController) {
        this.prestamoController = prestamoController;
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int opt;
        System.out.println("BIENVENIDO A LA BIBLIOTECA: ");
        do{
            System.out.println("1. Ingresar Prestamo");
            System.out.println("2. Tomar Devolucion.");
            System.out.println("3. Salir.");
            opt = scanner.nextInt();
            switch (opt){

                case 1:
                    realizarPrestamo();
                    break;

                case 2:
                    registrarDevolucion();
                    break;

                case 3:
                    System.out.println("Saliendo..");
                    break;

                default:
                    System.out.println("La opcion ingresada no es valida, vuelva a intentarlo.");
                    break;

            }
        }while(opt !=3);
    }

}
