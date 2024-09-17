/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_project.clases;

public class Gestion_Venta {

    public ItemVenta items[] = new ItemVenta[100];
    private int contador;

    public Gestion_Venta() {
        contador = 0;
    }

    public void ingresar(Producto producto, int cantidad) {
        ItemVenta vItem = new ItemVenta();
        vItem.setId(contador + 1);
        vItem.setProducto(producto);
        vItem.setCantidad(cantidad);
        items[contador] = vItem;
        contador++;
    }

    public int getContador() {
        return contador;
    }

    public boolean eliminar(String codigo) {
        boolean eliminado = false;
        int indexToRemove = -1;
        for (int i = 0; i < getContador(); i++) {
            if (codigo.equals(items[i].getProducto().getCodigo())) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < getContador() - 1; i++) {
                items[i] = items[i + 1];
            }
            items[--contador] = null;
            eliminado = true;
        }

        return eliminado;
    }
}
