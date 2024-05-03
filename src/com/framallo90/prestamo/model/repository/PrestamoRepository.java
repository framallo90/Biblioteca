package com.framallo90.prestamo.model.repository;

import com.framallo90.interfaces.Repositorio;
import com.framallo90.prestamo.model.entity.Prestamo;

import java.util.ArrayList;

public class PrestamoRepository implements Repositorio {
    ArrayList<Prestamo> listaPrestamo;

    public PrestamoRepository(){
        this.listaPrestamo = new ArrayList<>();
    }

    public ArrayList<Prestamo> getListaPrestamo() {
        return listaPrestamo;
    }

    public void setListaPrestamo(ArrayList<Prestamo> listaPrestamo) {
        this.listaPrestamo = listaPrestamo;
    }

    @Override
    public void register(Object object) {
        this.listaPrestamo.add((Prestamo)object);
    }

    @Override
    public void search(String id) {

    }

    @Override
    public void update(String id) {

    }

    @Override
    public void delete(String id) {

    }
}
