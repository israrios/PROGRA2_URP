/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_project.clases;

public class Gestion_Producto {

    public Producto productos[] = new Producto[100];
    public Producto filtrados[] = new Producto[100];

    private int contador;
    private int contadorFiltrado;

    public Gestion_Producto() {
        contador = 0;
    }

    public void descontarStock(String codigo, int cantidad) {
        for (int i = 0; i < contador; i++) {
            if (codigo.equals(productos[i].getCodigo())) {
                productos[i].restarStock(cantidad);
            }
        }
    }
    
    public String obtenerStock(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (codigo.equals(productos[i].getCodigo())) {
               return productos[i].getStockDisponible();
            }
        }
        return "El producto no existe";
    }

    public void ingresar(String categoria, String codigo, String nombre, double precio, int stock, String marca,
            int talla, String color, String tamanio, String material, String fragancia, String dia,
            String mes, String anio, String estacion) {

        int id = contador + 1;
        if ("Alimento".equals(categoria)) {
            Alimento p = new Alimento();
            p.setId(id);
            p.setCodigo(codigo);
            p.setCategoria(categoria);
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setStock(stock);
            p.setMarca(marca);
            p.setFechaCaducidad(dia + "/" + mes + "/" + anio);
            productos[contador] = p;

        } else if ("Ropa".equals(categoria)) {
            Ropa p = new Ropa();
            p.setId(id);
            p.setCodigo(codigo);
            p.setCategoria(categoria);
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setStock(stock);
            p.setTalla(talla);
            p.setMaterial(material);
            p.setEstacion(estacion);
            productos[contador] = p;

        } else if ("Accesorio".equals(categoria)) {
            Accesorio p = new Accesorio();
            p.setId(id);
            p.setCodigo(codigo);
            p.setCategoria(categoria);
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setStock(stock);
            p.setTalla(talla);
            p.setMaterial(talla);
            p.setColor(color);
            productos[contador] = p;
        } else if ("Aseo".equals(categoria)) {
            Aseo p = new Aseo();
            p.setId(id);
            p.setCodigo(codigo);
            p.setCategoria(categoria);
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setStock(stock);
            p.setFechaCaducidad(dia + "/" + mes + "/" + anio);
            p.setFragancia(fragancia);
            productos[contador] = p;

        } else if ("Juguete".equals(categoria)) {
            Juguete p = new Juguete();
            p.setId(id);
            p.setCodigo(codigo);
            p.setCategoria(categoria);
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setStock(stock);
            p.setTamanio(tamanio);
            p.setMaterial(material);
            productos[contador] = p;
        }

        contador++;
    }

    public int getContador() {
        return contador;
    }

    public int getContadorFiltrado() {
        return contadorFiltrado;
    }

    public Producto obtenerProducto(String codigo) {
        for (int i = 0; i < getContador(); i++) {
            if (codigo.equals(productos[i].getCodigo())) {
                return productos[i];
            }
        }
        return null;
    }

    public Producto[] filtrarProducto(String categoria) {
        if ("Todos".equals(categoria)) {
            return productos;
        } else {
            int contadorFiltrar = 0;
            for (int i = 0; i < contador; i++) {
                if (categoria.equals(productos[i].getCategoria())) {
                    filtrados[contadorFiltrar] = productos[i];
                    contadorFiltrar++;
                }
            }
            contadorFiltrado = contadorFiltrar;
            return filtrados;
        }
    }

    public boolean eliminar(String codigo) {
        boolean eliminado = false;
        int indexToRemove = -1;
        for (int i = 0; i < getContador(); i++) {
            if (codigo.equals(productos[i].getCodigo())) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < getContador() - 1; i++) {
                productos[i] = productos[i + 1];
            }
            productos[--contador] = null;
            eliminado = true;
        }
        return eliminado;
    }
}
