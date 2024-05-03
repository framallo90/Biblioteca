package com.framallo90.usuario.model.entity;

import com.framallo90.persona.abstracta.Persona;

public class Usuario extends Persona {
    private String tipo;

    public Usuario(String nombre, String apellido, String id, String tipo) {
        super(nombre, apellido, id);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + super.toString() +
                "tipo='" + tipo + '\'' +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
