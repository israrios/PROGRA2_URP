package com.mycompany.tp2_project.clases;

import java.io.*;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionArchivo {

    public GestionArchivo() {

    }

    public void registrarArchivo(List<Producto> productos) {

        try {
            ClassLoader classLoader = GestionArchivo.class.getClassLoader();
             String filePath = classLoader.getResource("data/Productos.txt").getPath();

            // Usa FileReader para leer el archivo
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (Producto producto : productos) {
                if ("Alimento".equals(producto.getCategoria())) {
                    pw.println(datoAlimento((Alimento) producto));
                }
            }
            pw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private String datoAlimento(Alimento alimento) {
        return alimento.getCategoria() + " " + alimento.getId() + " " + alimento.getCodigo() + " " + alimento.getPrecio() + " " + alimento.getNombre() + " " + alimento.getStock() + " " + alimento.getMarca() + " " + alimento.getFechaCaducidad();
    }

    public void leerArchivo(List<Producto> productos) {
        try {
          //  FileReader fr = new FileReader("C:\\Users\\jader\\OneDrive\\Documents\\01_UNIVERSIDAD\\06_URP_2024_II\\02_Progra\\00_Proyecto\\PROGRAURP\\PROGRAURP\\src\\main\\resources\\data\\Productos.txt");
             ClassLoader classLoader = GestionArchivo.class.getClassLoader();
             String filePath = classLoader.getResource("data/Productos.txt").getPath();

            // Usa FileReader para leer el archivo
            FileReader fr = new FileReader(filePath);
            
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(" ");
                if ("Alimento".equals(datos[0])) {
                    Alimento alimento = new Alimento(
                            Integer.parseInt(datos[1]), // ID
                            datos[2], // Código
                            Double.parseDouble(datos[3]), // Precio
                            datos[4], // Nombre
                            Integer.parseInt(datos[5]), // Stock
                            "Alimento", // Categoría
                            datos[6], // Marca
                            datos[7] // Fecha de caducidad
                    );
                    productos.add(alimento);
                }
                if ("Aseo".equals(datos[0])) {
                    Aseo aseo = new Aseo(
                            Integer.parseInt(datos[1]), // ID
                            datos[2], // Código
                            Double.parseDouble(datos[3]), // Precio
                            datos[4], // Nombre
                            Integer.parseInt(datos[5]), // Stock
                            "Aseo", // Categoría
                            datos[6], // Fecha de caducidad
                            datos[7] //fragancia
                    );
                    productos.add(aseo);
                }

            }

        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
