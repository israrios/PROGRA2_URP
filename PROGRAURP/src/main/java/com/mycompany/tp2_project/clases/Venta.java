/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_project.clases;

import java.text.DecimalFormat;

public class Venta {
    
    private ItemVenta[] items;
    
    private int nroItems;
    
    private String nombreCliente;
    
    private int dni;
    
    private String fechaVenta;
    
    private String direccion;
    
    public String precioTotalVenta(){
        double igv = 0.18;
        Double total = 0D;
        for (int i = 0; i < nroItems; i++) {
            total += getItems()[i].getPrecioXCantidad();
        }
        Double igvMonto =  total*igv;
        Double precioFinal = total+igvMonto;
        return ""+precioFinal;
    }
    
    public String porcentajeIGV(){
        double igv = 0.18;
        Double total = 0D;
        for (int i = 0; i < nroItems; i++) {
            total += getItems()[i].getPrecioXCantidad();
        }
        Double igvMonto =  total*igv;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedNumber = decimalFormat.format(igvMonto);
        return ""+formattedNumber;
    }
    
    public String precioSubtotalVenta(){
        Double suma = 0D;
        for (int i = 0; i < nroItems; i++) {
            suma += getItems()[i].getPrecioXCantidad();
        }
        return ""+suma;
    }


    public ItemVenta[] getItems() {
        return items;
    }

    public void setItems(ItemVenta[] items) {
        this.items = items;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    } 

    public int getNroItems() {
        return nroItems;
    }

    public void setNroItems(int nroItems) {
        this.nroItems = nroItems;
    }
}
