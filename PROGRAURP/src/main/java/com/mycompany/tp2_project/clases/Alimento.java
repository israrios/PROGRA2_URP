package com.mycompany.tp2_project.clases;

public class Alimento extends Producto {

    private String fechaCaducidad;
    private String marca;

    public Alimento() {

    }

    public Alimento(int id, String codigo, double precio, String nombre, int stock, String categoria, String marca, String fechaCaducidad) {
        super.setId(id);
        super.setCodigo(codigo);
        super.setPrecio(precio);
        super.setNombre(nombre);
        super.setStock(stock);
        super.setCategoria(categoria);
        this.marca = marca;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
