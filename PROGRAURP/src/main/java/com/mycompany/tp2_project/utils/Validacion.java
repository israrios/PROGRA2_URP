package com.mycompany.tp2_project.utils;

import com.mycompany.tp2_project.clases.Gestion_Producto;
import com.mycompany.tp2_project.clases.ItemVenta;
import com.mycompany.tp2_project.clases.Producto;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Validacion {

    public boolean validarCodigo(String codigo) {
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(
                    null, "El campo codigo no puede estar vacio.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (codigo.length() > 5 || codigo.length() < 5) {
            JOptionPane.showMessageDialog(
                    null, "El codigo debe tener 5 digitos obligatoriamente.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        String regex = "^[A-Z]{2}\\d{3}$";
        if (!codigo.matches(regex)) {
            JOptionPane.showMessageDialog(
                    null, "El codigo debe comenzar con dos letras mayúsculas seguidas de tres dígitos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    public boolean validarStock(Gestion_Producto gestion, String codigo, int cantidad) {

        Producto producto = gestion.obtenerProducto(codigo);

        if (producto.getStock() < cantidad) {
            JOptionPane.showMessageDialog(
                    null, "Solo hay en stock " + producto.getStock() + " de este producto.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    public boolean validarDNI(String dni) {
        if (validarEntero(dni, "DNI")) {
            return true;
        }
        if (dni.length() > 8 || dni.length() < 8) {
            JOptionPane.showMessageDialog(
                    null, "El codigo DNI tener 8 digitos obligatoriamente.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (dni.equals("")) {
            JOptionPane.showMessageDialog(
                    null, "El campo DNI no puede estar vacio.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        return false;
    }

    public boolean validarCadena(String cadena, String campo) {
        if (cadena.equals("")) {
            JOptionPane.showMessageDialog(
                    null, "El campo " + campo + " no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        String regex = "^[a-zA-Z0-9 ]*$";
        if (!cadena.matches(regex)) {
            JOptionPane.showMessageDialog(
                    null, "El campo " + campo + " debe tener solo datos alfanuméricos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        return false;
    }

    public boolean validarEntero(String cadena, String campo) {
        if (cadena.equals("")) {
            JOptionPane.showMessageDialog(
                    null, "El campo " + campo + " no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        try {
            int entero = (int) Long.parseLong(cadena);
            if (entero <= 0) {
                JOptionPane.showMessageDialog(
                        null, "El campo " + campo + " debe ser un entero positivo.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null, "El campo " + campo + " debe ser un entero positivo válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    public boolean validarReal(String cadena, String campo) {
        if (cadena.equals("")) {
            JOptionPane.showMessageDialog(
                    null, "El campo " + campo + " no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        try {
            double real = Double.parseDouble(cadena);
            if (real <= 0) {
                JOptionPane.showMessageDialog(
                        null, "El campo " + campo + " debe ser un numero real positivo.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null, "El campo " + campo + " debe ser un numero real positivo válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    public boolean validarCodExistencia(Gestion_Producto gProductos, String codigo) {
        for (int i = 0; i < gProductos.getContador(); i++) {
            Producto producto = gProductos.obtenerProducto(codigo);
            if (producto != null) {
                JOptionPane.showMessageDialog(
                        null, "El codigo ingresado ya existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        return false;
    }

    public boolean validarProducto(Gestion_Producto gProductos, String categoria, String codigo, String nombre, String precio, String stock, String marca,
            String talla, String color, String tamanio, String material, String fragancia, String dia,
            String mes, String anio) {

        //VALIDACION GENERAL
        if (validarCodigo(codigo)) {
            return true;
        }
        if (validarCodExistencia(gProductos, codigo)) {
            return true;
        }
        if (validarCadena(nombre, "Nombre")) {
            return true;
        }
        if (validarReal(precio, "Precio")) {
            return true;
        }
        if (validarEntero(stock, "Stock")) {
            return true;
        }
        //VALIDACION POR CATEGORIA
        if ("Alimento".equals(categoria)) {
            if (validarCadena(marca, "Marca")) {
                return true;
            }
            if (validarEntero(dia, "Día")) {
                return true;
            }
        }
        if ("Ropa".equals(categoria)) {
            if (validarEntero(talla, "Talla")) {
                return true;
            }
            if (validarCadena(color, "Color")) {
                return true;
            }
            if (validarCadena(material, "Material")) {
                return true;
            }
        }
        if ("Accesorio".equals(categoria)) {
            if (validarEntero(talla, "Talla")) {
                return true;
            }
            if (validarCadena(color, "Color")) {
                return true;
            }
        }
        if ("Aseo".equals(categoria)) {
            if (validarCadena(fragancia, "Fragancia")) {
                return true;
            }
            if (validarEntero(dia, "Día")) {
                return true;
            }
        }
        if ("Juguete".equals(categoria)) {
            if (validarCadena(tamanio, "Tamaño")) {
                return true;
            }
            if (validarCadena(material, "Material")) {
                return true;
            }
        }

        return false;
    }

    public boolean validarVenta(String nombreCliente, String dni, String direccion, String dia, ItemVenta[] items) {
        //VALIDACION GENERAL

        if (validarDNI(dni)) {
            return true;
        }
        if (validarCadena(nombreCliente, "Nombre Cliente")) {
            return true;
        }
        if (validarCadena(nombreCliente, "Dirección")) {
            return true;
        }
        if (validarEntero(dia, "Dia")) {
            return true;
        }
        if (items.length < 1) {
            return true;
        }
        return false;
    }

}
