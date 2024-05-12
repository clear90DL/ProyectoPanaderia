package Ventanas;

import javax.swing.JFrame;

/**
 *
 * @author Claudio
 */
public class Proveedores extends javax.swing.JFrame {
 public Empleados empleado;
    public Clientes cliente;
    public Formas_de_pago pago;
    public Informes infor;
    public Pedidos pedido;
    public Productos producto;
    public Promociones promo;
    public Seguridad seguridad;
    public Ventas venta;
    /**
     * Creates new form Clientes
     */
    public Proveedores() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }
     private void cambiarVentana(JFrame ventanaNueva) {
        dispose(); // Cierra la ventana actual
        ventanaNueva.setVisible(true); // Abre la nueva ventana
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnPago = new javax.swing.JButton();
        btnSeguridad = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnPromociones = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPago.setBackground(new java.awt.Color(204, 204, 255));
        btnPago.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/010-tarjeta-de-credito.png"))); // NOI18N
        btnPago.setText("Formas de pago");
        btnPago.setMaximumSize(new java.awt.Dimension(168, 47));
        btnPago.setMinimumSize(new java.awt.Dimension(168, 47));
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });
        jPanel3.add(btnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 170, 40));

        btnSeguridad.setBackground(new java.awt.Color(204, 204, 255));
        btnSeguridad.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/001-proteger.png"))); // NOI18N
        btnSeguridad.setText("Seguridad");
        btnSeguridad.setMaximumSize(new java.awt.Dimension(127, 47));
        btnSeguridad.setMinimumSize(new java.awt.Dimension(127, 47));
        btnSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguridadActionPerformed(evt);
            }
        });
        jPanel3.add(btnSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, -1));

        btnVentas.setBackground(new java.awt.Color(204, 204, 255));
        btnVentas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nventa.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel3.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        btnProductos.setBackground(new java.awt.Color(204, 204, 255));
        btnProductos.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/005-un-pan.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setMaximumSize(new java.awt.Dimension(127, 47));
        btnProductos.setMinimumSize(new java.awt.Dimension(127, 47));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel3.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 40));

        btnEmpleados.setBackground(new java.awt.Color(204, 204, 255));
        btnEmpleados.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/004-empleado.png"))); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.setMaximumSize(new java.awt.Dimension(127, 47));
        btnEmpleados.setMinimumSize(new java.awt.Dimension(127, 47));
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        jPanel3.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, -1));

        btnInformes.setBackground(new java.awt.Color(204, 204, 255));
        btnInformes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/006-reporte.png"))); // NOI18N
        btnInformes.setText("Informes");
        btnInformes.setMaximumSize(new java.awt.Dimension(127, 47));
        btnInformes.setMinimumSize(new java.awt.Dimension(127, 47));
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });
        jPanel3.add(btnInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        btnClientes.setBackground(new java.awt.Color(204, 204, 255));
        btnClientes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/003-clasificacin.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setMaximumSize(new java.awt.Dimension(127, 47));
        btnClientes.setMinimumSize(new java.awt.Dimension(127, 47));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel3.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, -1));

        btnProveedores.setBackground(new java.awt.Color(204, 204, 255));
        btnProveedores.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedor.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jPanel3.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 40));

        btnPromociones.setBackground(new java.awt.Color(204, 204, 255));
        btnPromociones.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/002-etiqueta-de-descuento.png"))); // NOI18N
        btnPromociones.setText("Promociones");
        btnPromociones.setMaximumSize(new java.awt.Dimension(127, 47));
        btnPromociones.setMinimumSize(new java.awt.Dimension(127, 47));
        btnPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromocionesActionPerformed(evt);
            }
        });
        jPanel3.add(btnPromociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        btnPedidos.setBackground(new java.awt.Color(204, 204, 255));
        btnPedidos.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/008-portapapeles.png"))); // NOI18N
        btnPedidos.setText("Pedidos");
        btnPedidos.setMaximumSize(new java.awt.Dimension(127, 47));
        btnPedidos.setMinimumSize(new java.awt.Dimension(127, 47));
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        jPanel3.add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 560));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Codigo de proveedor:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 170, 30));
        jPanel4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 180, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 80, 30));
        jPanel4.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 180, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Telefono:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, 30));
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 150, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de proveedor:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 160, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Dirección:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 110, 30));
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 410, 30));

        jButton15.setBackground(new java.awt.Color(204, 204, 255));
        jButton15.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/002-lista-de-verificacion.png"))); // NOI18N
        jButton15.setText("Listar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 130, 50));

        jButton13.setBackground(new java.awt.Color(204, 204, 255));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/006-borrar.png"))); // NOI18N
        jButton13.setText("Eliminar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 130, 50));

        jButton16.setBackground(new java.awt.Color(204, 204, 255));
        jButton16.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        jButton16.setText("Guardar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 130, 50));

        jButton18.setBackground(new java.awt.Color(204, 204, 255));
        jButton18.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/002-lpiz.png"))); // NOI18N
        jButton18.setText("Modificar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 130, 50));

        jButton14.setBackground(new java.awt.Color(204, 204, 255));
        jButton14.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/001-buscar.png"))); // NOI18N
        jButton14.setText("Buscar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 130, 50));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 220, 190));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Corrreo electronico: ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 160, 30));
        jPanel4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 420, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Producto:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 110, 30));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 150, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Cantidad:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 110, 30));
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 150, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Precio:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 110, 30));
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 150, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 190, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 990, 560));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proveedores");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguridadActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Seguridad());
    }//GEN-LAST:event_btnSeguridadActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Ventas());
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Productos());
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Empleados());
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Informes());
    }//GEN-LAST:event_btnInformesActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Clientes());
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromocionesActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Promociones());
    }//GEN-LAST:event_btnPromocionesActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Pedidos());
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Formas_de_pago());
    }//GEN-LAST:event_btnPagoActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        Proveedor_lista ls=new Proveedor_lista();
        ls.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnPromociones;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSeguridad;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}