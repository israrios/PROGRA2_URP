package com.mycompany.tp2_project.formularios;

import com.mycompany.tp2_project.clases.Accesorio;
import com.mycompany.tp2_project.clases.Alimento;
import com.mycompany.tp2_project.clases.Aseo;
import com.mycompany.tp2_project.clases.GestionArchivo;
import com.mycompany.tp2_project.clases.Gestion_Historial;
import com.mycompany.tp2_project.clases.Gestion_Producto;
import com.mycompany.tp2_project.clases.Juguete;
import com.mycompany.tp2_project.clases.Producto;
import com.mycompany.tp2_project.clases.Ropa;
import com.mycompany.tp2_project.utils.Validacion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class Producto_Form extends javax.swing.JFrame {

    GestionArchivo gArchivo =new GestionArchivo();
    DefaultTableModel dtm = new DefaultTableModel();
    Gestion_Producto gestion = new Gestion_Producto();
    Validacion validacion = new Validacion();
    Gestion_Historial historial = new Gestion_Historial();

    public Producto_Form(Gestion_Producto gestionProducto) {
        initComponents();
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GESTIÓN DE PRODUCTOS");
        //INICIALIZO LOS ITEMS DEL COMBO CATEGORIA FILTRO
        filtroCat.addItem("Alimento");
        filtroCat.addItem("Ropa");
        filtroCat.addItem("Accesorio");
        filtroCat.addItem("Aseo");
        filtroCat.addItem("Juguete");
        //INICIALIZO LA CABECERA DE LA TABLA
        String[] titulo = new String[]{"Codigo", "Categoria", "Nombre", "Precio"};
        dtm.setColumnIdentifiers(titulo);
        tbDatos.setModel(dtm);
        gArchivo.leerArchivo(gestion.productos);
        if (gestionProducto != null) {
            gestion = gestionProducto;
         
        }
        if(!gestion.productos.isEmpty()){
            for (Producto producto : gestion.productos) {
            Object[] fila = {producto.getCodigo(), producto.getCategoria(), producto.getNombre(), producto.getPrecio()};
            dtm.addRow(fila);
        }
        }
        
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registrar_Form registrarForm = new Registrar_Form(Producto_Form.this);
                registrarForm.setVisible(true);
            }
        });

        mnVenta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Venta_Form form = new Venta_Form(gestion, Producto_Form.this);
                form.setVisible(true);
            }
        });

    }

    public void refrescar() {
        //LIMPIA LA TABLA
        limpiar();
        //AGREGAR TODOS LOS PRODUCTOS A LA TABLA
        for (Producto producto : gestion.productos) {
            Object[] fila = {producto.getCodigo(), producto.getCategoria(), producto.getNombre(), producto.getPrecio()};
            dtm.addRow(fila);
        }
    }

    private void limpiar() {
        //LIMPIAR
        dtm.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        filtroCat = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnVenta = new javax.swing.JMenu();
        mnHistorial = new javax.swing.JMenu();
        mnCerrar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(251, 217, 200));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(141, 66, 49)));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setText("Opciones");

        jPanel5.setBackground(new java.awt.Color(247, 161, 117));

        btnAgregar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnAgregar.setText("Registrar Producto");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(246, 213, 167));

        btnEliminar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel9.setText("Código :");

        txtCodigo.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        btnVer.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnVer.setText("Ver");
        btnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerMouseExited(evt);
            }
        });
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar Stock");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarMouseExited(evt);
            }
        });
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Listado");

        jPanel2.setBackground(new java.awt.Color(248, 172, 133));

        tbDatos.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbDatos);

        btnFiltrar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFiltrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFiltrarMouseExited(evt);
            }
        });
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        filtroCat.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        filtroCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(filtroCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(141, 66, 49)));

        mnVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mnVenta.setText("   Generar Venta   ");
        mnVenta.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jMenuBar1.add(mnVenta);

        mnHistorial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnHistorial.setText("  Historial Ventas  ");
        mnHistorial.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        mnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnHistorialMouseClicked(evt);
            }
        });
        mnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHistorialActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnHistorial);

        mnCerrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mnCerrar.setText("    Cerrar Sesión    ");
        mnCerrar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        mnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnCerrarMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnCerrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String codigo = txtCodigo.getText();
            if (validacion.validarCodigo(codigo)) {
                return;
            }

            txtCodigo.setText("");
            String mensaje = gestion.eliminar(codigo);
            refrescar();
            throw new Exception(mensaje);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        try {
            if (validacion.validarCodigo(txtCodigo.getText())) {
                return;
            }
            Producto producto = gestion.obtenerProducto(txtCodigo.getText());
            if (producto == null) {
                throw new Exception("ERROR: No existe este producto.");
            }
            if ("Alimento".equals(producto.getCategoria())) {
                Alimento obj = (Alimento) producto;
                Ver_Form ver = new Ver_Form(obj);
                ver.setVisible(true);
            } else if ("Ropa".equals(producto.getCategoria())) {
                Ropa obj = (Ropa) producto;
                Ver_Form ver = new Ver_Form(obj);
                ver.setVisible(true);
            } else if ("Accesorio".equals(producto.getCategoria())) {
                Accesorio obj = (Accesorio) producto;
                Ver_Form ver = new Ver_Form(obj);
                ver.setVisible(true);
            } else if ("Aseo".equals(producto.getCategoria())) {
                Aseo obj = (Aseo) producto;
                Ver_Form ver = new Ver_Form(obj);
                ver.setVisible(true);
            } else if ("Juguete".equals(producto.getCategoria())) {
                Juguete obj = (Juguete) producto;
                Ver_Form ver = new Ver_Form(obj);
                ver.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnVerActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        limpiar();
        List<Producto> filtrado = gestion.filtrarProducto(filtroCat.getSelectedItem().toString());
        for (Producto producto : filtrado) {
            Object[] fila = {producto.getCodigo(), producto.getCategoria(), producto.getNombre(), producto.getPrecio()};
            dtm.addRow(fila);
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void mnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnCerrarMouseClicked
        Login_Form form = new Login_Form();
        form.setVisible(true);
        gArchivo.registrarArchivo(gestion.productos);
        dispose();
    }//GEN-LAST:event_mnCerrarMouseClicked

    private void mnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHistorialActionPerformed

    }//GEN-LAST:event_mnHistorialActionPerformed

    private void mnHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnHistorialMouseClicked
        Ventas_Historial_Form form = new Ventas_Historial_Form(historial);
        form.setVisible(true);
    }//GEN-LAST:event_mnHistorialMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            if (validacion.validarCodigo(txtCodigo.getText())) {
                return;
            }
            String mensaje = gestion.obtenerStock(txtCodigo.getText());
            throw new Exception(mensaje);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(Color.orange);
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(Color.white);
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnVerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseEntered
        btnVer.setBackground(Color.orange);
    }//GEN-LAST:event_btnVerMouseEntered

    private void btnVerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseExited
        btnVer.setBackground(Color.white);
    }//GEN-LAST:event_btnVerMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(Color.orange);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(Color.white);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseEntered
        btnConsultar.setBackground(Color.orange);
    }//GEN-LAST:event_btnConsultarMouseEntered

    private void btnConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseExited
        btnConsultar.setBackground(Color.white);
    }//GEN-LAST:event_btnConsultarMouseExited

    private void btnFiltrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMouseEntered
        btnFiltrar.setBackground(Color.orange);
    }//GEN-LAST:event_btnFiltrarMouseEntered

    private void btnFiltrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMouseExited
        btnFiltrar.setBackground(Color.white);
    }//GEN-LAST:event_btnFiltrarMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto_Form(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> filtroCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnCerrar;
    private javax.swing.JMenu mnHistorial;
    private javax.swing.JMenu mnVenta;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
