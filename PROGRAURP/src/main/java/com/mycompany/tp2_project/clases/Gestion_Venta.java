package com.mycompany.tp2_project.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gestion_Venta {

    public List<ItemVenta> items = new ArrayList<>();
    Iterator iterVentas = items.iterator();
    public Gestion_Venta() {
    }

    public void ingresar(Producto producto, int cantidad) {
        ItemVenta vItem = new ItemVenta();
        vItem.setId(items.size() + 1);
        vItem.setProducto(producto);
        vItem.setCantidad(cantidad);
        items.add(vItem);
    }
    
     public ItemVenta obtenerItem(String codigo) {
         while (iterVentas.hasNext()) {
            ItemVenta iVenta = (ItemVenta) iterVentas.next();
            if (codigo.equals(iVenta.getCodigo())) {
                return iVenta;
            }
        }
        return null;
    }

    public String eliminar(String codigo) {
        ItemVenta iVenta = obtenerItem(codigo);
        if(iVenta == null){
            return "ERROR: No existe este item.";
        }else{
            items.remove(iVenta);
          return null ;
        }
    }
}
