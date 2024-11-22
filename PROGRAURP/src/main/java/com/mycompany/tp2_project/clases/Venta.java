package com.mycompany.tp2_project.clases;

import java.text.DecimalFormat;
import java.util.List;

public class Venta {

    private List<ItemVenta> items;

    private int nroItems;

    private String nombreCliente;

    private int dni;

    private String fechaVenta;

    private String direccion;

    public String precioTotalVenta() {
        double igv = 0.18;
        Double total = 0D;
        for (ItemVenta item : items) {
            total += item.getPrecioXCantidad();
        }
        Double igvMonto = total * igv;
        Double precioFinal = total + igvMonto;
        return "" + precioFinal;
    }

    public String porcentajeIGV() {
        double igv = 0.18;
        Double total = 0D;
        for (ItemVenta item : items) {
            total += item.getPrecioXCantidad();
        }
        Double igvMonto = total * igv;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedNumber = decimalFormat.format(igvMonto);
        return "" + formattedNumber;
    }

    public String precioSubtotalVenta() {
        Double suma = 0D;
        for (ItemVenta item : items) {
            suma += item.getPrecioXCantidad();
        }
        return "" + suma;
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

    public List<ItemVenta> getItems() {
        return items;
    }

    public void setItems(List<ItemVenta> items) {
        this.items = items;
    }
}
