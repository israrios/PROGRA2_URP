/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tp2_project.formularios;

import com.mycompany.tp2_project.clases.Accesorio;
import com.mycompany.tp2_project.clases.Alimento;
import com.mycompany.tp2_project.clases.Aseo;
import com.mycompany.tp2_project.clases.Juguete;
import com.mycompany.tp2_project.clases.Producto;
import com.mycompany.tp2_project.clases.Ropa;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.WindowConstants;

public class Ver_Form extends javax.swing.JFrame {

    public Ver_Form(Producto producto) {
        initComponents();
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        if (producto != null) {
            setTitle("VER PRODUCTO - " + producto.getCodigo());

            if ("Alimento".equals(producto.getCategoria())) {
                Alimento obj = (Alimento) producto;
                if (obj != null) {
                    lblCategoria.setText("" + obj.getCategoria());
                    lblIdentificador.setText("" + obj.getId());
                    lblNombre.setText(obj.getNombre());
                    lblPrecio.setText("" + obj.getPrecio());
                    lblStock.setText("" + obj.getStock());
                    lblmarca.setText(obj.getMarca());
                    lblCaducidad.setText("" + obj.getFechaCaducidad());
                    lblTalla.setVisible(false);
                    lblTalla1.setVisible(false);
                    lblMaterial.setVisible(false);
                    lblMaterial1.setVisible(false);
                    lblColor.setVisible(false);
                    lblColor1.setVisible(false);
                    lblFragancia.setVisible(false);
                    lblFragancia1.setVisible(false);
                    lblTamaño.setVisible(false);
                    lblTamaño1.setVisible(false);
                    lblEstacion.setVisible(false);
                    lblEstacion1.setVisible(false);
                }
            } else if ("Ropa".equals(producto.getCategoria())) { //ISRAEL AYUDAME//
                Ropa obj = (Ropa) producto;
                if (obj != null) {
                    lblCategoria.setText("" + obj.getCategoria());
                    lblIdentificador.setText("" + obj.getId());
                    lblNombre.setText(obj.getNombre());
                    lblPrecio.setText("" + obj.getPrecio());
                    lblStock.setText("" + obj.getStock());
                    lblTalla.setText("" + obj.getTalla());
                    lblMaterial.setText(obj.getMaterial());
                    lblEstacion.setText(obj.getEstacion());
                    lblFragancia.setVisible(false);
                    lblFragancia1.setVisible(false);
                    lblTamaño.setVisible(false);
                    lblTamaño1.setVisible(false);
                    lblCaducidad.setVisible(false);
                    lblCaducidad1.setVisible(false);
                    lblColor.setVisible(false);
                    lblColor1.setVisible(false);
                    lblmarca.setVisible(false);
                    lblMarca1.setVisible(false);
                }
            } else if ("Accesorio".equals(producto.getCategoria())) {
                Accesorio obj = (Accesorio) producto;
                if (obj != null) {
                    lblCategoria.setText("" + obj.getCategoria());
                    lblIdentificador.setText("" + obj.getId());
                    lblNombre.setText(obj.getNombre());
                    lblPrecio.setText("" + obj.getPrecio());
                    lblStock.setText("" + obj.getStock());
                    lblTalla.setText("" + obj.getTalla());
                    lblMaterial.setText("" + obj.getMaterial());
                    lblColor.setText(obj.getColor());
                    lblFragancia.setVisible(false);
                    lblFragancia1.setVisible(false);
                    lblTamaño.setVisible(false);
                    lblTamaño1.setVisible(false);
                    lblCaducidad.setVisible(false);
                    lblCaducidad1.setVisible(false);
                    lblEstacion.setVisible(false);
                    lblEstacion1.setVisible(false);
                    lblmarca.setVisible(false);
                    lblMarca1.setVisible(false);
                }
            } else if ("Aseo".equals(producto.getCategoria())) {
                Aseo obj = (Aseo) producto;
                if (obj != null) {
                    lblCategoria.setText("" + obj.getCategoria());
                    lblIdentificador.setText("" + obj.getId());
                    lblNombre.setText(obj.getNombre());
                    lblPrecio.setText("" + obj.getPrecio());
                    lblStock.setText("" + obj.getStock());
                    lblCaducidad.setText(obj.getFechaCaducidad());
                    lblFragancia.setText(obj.getFragancia());
                    lblTalla.setVisible(false);
                    lblTalla1.setVisible(false);
                    lblMaterial.setVisible(false);
                    lblMaterial1.setVisible(false);
                    lblColor.setVisible(false);
                    lblColor1.setVisible(false);
                    lblTamaño.setVisible(false);
                    lblTamaño1.setVisible(false);
                    lblEstacion.setVisible(false);
                    lblEstacion1.setVisible(false);
                    lblmarca.setVisible(false);
                    lblMarca1.setVisible(false);
                }
            } else if ("Juguete".equals(producto.getCategoria())) {
                Juguete obj = (Juguete) producto;
                if (obj != null) {
                    lblCategoria.setText("" + obj.getCategoria());
                    lblIdentificador.setText("" + obj.getId());
                    lblNombre.setText(obj.getNombre());
                    lblPrecio.setText("" + obj.getPrecio());
                    lblStock.setText("" + obj.getStock());
                    lblTamaño.setText("" + obj.getTamanio());
                    lblMaterial.setText(obj.getMaterial());
                    lblCaducidad.setVisible(false);
                    lblCaducidad1.setVisible(false);
                    lblFragancia.setVisible(false);
                    lblFragancia1.setVisible(false);
                    lblTalla.setVisible(false);
                    lblTalla1.setVisible(false);
                    lblColor.setVisible(false);
                    lblColor1.setVisible(false);
                    lblEstacion.setVisible(false);
                    lblEstacion1.setVisible(false);
                    lblmarca.setVisible(false);
                    lblMarca1.setVisible(false);
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblIdentificador = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblMarca1 = new javax.swing.JLabel();
        lblmarca = new javax.swing.JLabel();
        lblCaducidad1 = new javax.swing.JLabel();
        lblCaducidad = new javax.swing.JLabel();
        lblTalla1 = new javax.swing.JLabel();
        lblMaterial1 = new javax.swing.JLabel();
        lblTalla = new javax.swing.JLabel();
        lblMaterial = new javax.swing.JLabel();
        lblColor1 = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblFragancia1 = new javax.swing.JLabel();
        lblFragancia = new javax.swing.JLabel();
        lblTamaño1 = new javax.swing.JLabel();
        lblTamaño = new javax.swing.JLabel();
        lblEstacion1 = new javax.swing.JLabel();
        lblEstacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 239, 224));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 3, true));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel1.setText("VER PRODUCTO");

        btnCancelar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnCancelar.setText("REGRESAR");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 2, true));
        jPanel2.setForeground(new java.awt.Color(255, 224, 224));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jLabel6.setText("Categoria :");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jLabel2.setText("Identificador:");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jLabel3.setText("Nombre :");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jLabel4.setText("Precio :");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jLabel5.setText("Stock :");

        lblStock.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblStock.setText("lblStock");

        lblPrecio.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblPrecio.setText("lblPrecio");

        lblNombre.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblNombre.setText("lblNombre");

        lblIdentificador.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblIdentificador.setText("lblID");

        lblCategoria.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblCategoria.setText("lblCategoria");

        lblMarca1.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        lblMarca1.setText("Marca:");

        lblmarca.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblmarca.setText("lblmarca");

        lblCaducidad1.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        lblCaducidad1.setText("Fecha de Caducidad:");

        lblCaducidad.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblCaducidad.setText("lblCaducidad");

        lblTalla1.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        lblTalla1.setText("Talla:");

        lblMaterial1.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        lblMaterial1.setText("Material:");

        lblTalla.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblTalla.setText("lblTalla");

        lblMaterial.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblMaterial.setText("lblMaterial");

        lblColor1.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        lblColor1.setText("Color:");

        lblColor.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblColor.setText("lblColor");

        lblFragancia1.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        lblFragancia1.setText("Fragancia:");

        lblFragancia.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblFragancia.setText("lblFragancia");

        lblTamaño1.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        lblTamaño1.setText("Tamaño:");

        lblTamaño.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblTamaño.setText("lblTamaño");

        lblEstacion1.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        lblEstacion1.setText("Estacion :");

        lblEstacion.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lblEstacion.setText("lblEstacion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMarca1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoria)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblStock)
                    .addComponent(lblmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTalla1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCaducidad1)
                    .addComponent(lblMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblTamaño1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFragancia1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEstacion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCaducidad)
                    .addComponent(lblMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFragancia)
                    .addComponent(lblTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColor)
                    .addComponent(lblEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoria)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCaducidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCaducidad))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblPrecio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblStock))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarca1)
                            .addComponent(lblmarca))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTalla1)
                            .addComponent(lblTalla))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaterial1)
                            .addComponent(lblMaterial))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor1)
                            .addComponent(lblColor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFragancia1)
                            .addComponent(lblFragancia))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTamaño1)
                            .addComponent(lblTamaño))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstacion)
                            .addComponent(lblEstacion1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnCancelar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
      btnCancelar.setBackground(Color.orange);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
       btnCancelar.setBackground(Color.white);
    }//GEN-LAST:event_btnCancelarMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ver_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_Form(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCaducidad;
    private javax.swing.JLabel lblCaducidad1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblColor1;
    private javax.swing.JLabel lblEstacion;
    private javax.swing.JLabel lblEstacion1;
    private javax.swing.JLabel lblFragancia;
    private javax.swing.JLabel lblFragancia1;
    private javax.swing.JLabel lblIdentificador;
    private javax.swing.JLabel lblMarca1;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblMaterial1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTalla;
    private javax.swing.JLabel lblTalla1;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JLabel lblTamaño1;
    private javax.swing.JLabel lblmarca;
    // End of variables declaration//GEN-END:variables
}
