package com.example.recipesapp.models;

public class Receta {
    private String titulo;
    private String descripcion;
    private String categoria;
    private String imagen;
    private String ingredientes;
    private String pasos;

    public Receta(String titulo, String descripcion, String categoria, String imagen, String ingredientes, String pasos) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.imagen = imagen;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPasos() {
        return pasos;
    }

    public void setPasos(String pasos) {
        this.pasos = pasos;
    }
}
