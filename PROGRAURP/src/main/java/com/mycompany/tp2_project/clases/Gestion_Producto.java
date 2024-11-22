package com.mycompany.tp2_project.clases;

import java.util.ArrayList;
import java.util.List;

public class Gestion_Producto {

    public List<Producto> productos = new ArrayList<>();
    public List<Producto> filtrados = new ArrayList<>();


    public Gestion_Producto() {
    }

    public void descontarStock(String codigo, int cantidad) {
        for (Producto producto : productos) {
            if (codigo.equals(producto.getCodigo())) {
                producto.restarStock(cantidad);
            }
        }
    }
    
    public String obtenerStock(String codigo) {
        for (Producto producto : productos) {
            if (codigo.equals(producto.getCodigo())) {
               return producto.getStockDisponible();
            }
        }
        return "ERROR : No existe este producto.";
    }

    public void ingresar(String categoria, String codigo, String nombre, double precio, int stock, String marca,
            int talla, String color, String tamanio, String material, String fragancia, String dia,
            String mes, String anio, String estacion) {

        int id = productos.size() + 1;
        if (null != categoria) switch (categoria) {
            case "Alimento" -> {
                Alimento p = new Alimento();
                p.setId(id);
                p.setCodigo(codigo);
                p.setCategoria(categoria);
                p.setNombre(nombre);
                p.setPrecio(precio);
                p.setStock(stock);
                p.setMarca(marca);
                p.setFechaCaducidad(dia + "/" + mes + "/" + anio);
                productos.add(p);
                }
            case "Ropa" -> {
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
                productos.add(p);
                }
            case "Accesorio" -> {
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
                productos.add(p);
                }
            case "Aseo" -> {
                Aseo p = new Aseo();
                p.setId(id);
                p.setCodigo(codigo);
                p.setCategoria(categoria);
                p.setNombre(nombre);
                p.setPrecio(precio);
                p.setStock(stock);
                p.setFechaCaducidad(dia + "/" + mes + "/" + anio);
                p.setFragancia(fragancia);
                productos.add(p);
                }
            case "Juguete" -> {
                Juguete p = new Juguete();
                p.setId(id);
                p.setCodigo(codigo);
                p.setCategoria(categoria);
                p.setNombre(nombre);
                p.setPrecio(precio);
                p.setStock(stock);
                p.setTamanio(tamanio);
                p.setMaterial(material);
                productos.add(p);
                }
            default -> {
            }
        }
    }

    
    
    
    public Producto obtenerProducto(String codigo) {
        for (Producto producto : productos) {
             if (codigo.equals(producto.getCodigo())) {
                return producto;
            }
        }
        return null;
    }

    public List<Producto> filtrarProducto(String categoria) {
        if ("Todos".equals(categoria)) return productos; 
        for (Producto producto : productos) {
                if (categoria.equals(producto.getCategoria())) {
                    filtrados.add(producto);
                }
            }
            return filtrados;
    }

    public String eliminar(String codigo) {
        Producto p = obtenerProducto(codigo);
        if(p == null){
            return "ERROR: No existe este producto.";
        }else{
            productos.remove(p);
          return null ;
        }
    }
}
