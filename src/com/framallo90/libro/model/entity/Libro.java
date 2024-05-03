package com.framallo90.libro.model.entity;

public class Libro {
    private String titulo;
    private String genero;
    private String autor;
    private String isbn;
    private int cantCopias;

    public Libro(String titulo, String genero, String autor, String isbn, int cantCopias) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.isbn = isbn;
        this.cantCopias = cantCopias;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", cantCopias='" + cantCopias + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }
}
