/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_project.clases;

public class Gestion_Historial {

    public Venta[] ventas = new Venta[100];
    private int contador = 0;

    public void ingresar(Venta venta) {
        ventas[contador] = venta;
        contador++;
    }
    
    public int getContador(){
        return contador;
    }
    
    
    public String reportar(){
        
        Double suma = 0D;
        
        for (int i = 0; i < contador; i++) {
            suma += Double.parseDouble(ventas[i].precioTotalVenta());
        }
        
        Double promedio = suma/contador;
        
        String salida = "PROMEDIO DE VENTAS GENERAL";
        salida +="\n-El nro de Ventas es: "+contador;
        salida +="\n-El promedio es "+promedio;
        return salida;
    }
    
    public String reportar(int dni){
        
        String salida = "REPORTE DE CLIENTE:";
        int contadorCompras=0;
        Double suma = 0D;
        Venta datos = null;
        for (int i = 0; i < contador; i++) {
            if(ventas[i].getDni() == dni){
                 datos=ventas[i];
                 suma += Double.parseDouble(ventas[i].precioTotalVenta());
            }
        }
        if(datos != null){
            salida+="\n-DNI CLIENTE :"+datos.getDni();
            salida+="\n-NOMBRE CLIENTE :"+datos.getNombreCliente();
            salida+="\n-NRO COMPRAS :"+contadorCompras;
            salida+="\n-MONTO TOTAL ACUMULADO :"+suma;
        }else{
            salida+="\n-No hay ventas con este NRO de DNI";
        }

        return salida;
    }

}
