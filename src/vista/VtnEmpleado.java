/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Darwin
 */
public class VtnEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEmpleado
     */
    
    Inicio vntLogin;
    
    InternaFacturaCrear internaFacturaCrear;
    InternaFacturaAnular internaFacturaAnular;
    InternaFacturaListar internaFacturaListar;
    
    InternaClienteCrear internaClienteCrear;
    InternaClienteB_A_E internaClienteB_A_E;
    InternaClienteListar internaClienteListar;
    
    InternaFormularioCrear internaFormularioCrear;
    InternaFormularioListar internaFormularioListar;
    
    InternaAutosListar internaAutosListar;
    
    
    public VtnEmpleado(String usuario,String nomSuc) {
        initComponents();
        setLocationRelativeTo(null);
        txtnombre.setText(usuario);
        txtsucursal.setText(nomSuc);
    }

    private VtnEmpleado() {
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtsucursal = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCrear = new javax.swing.JMenuItem();
        jMenuAnular = new javax.swing.JMenuItem();
        jMenuListar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuCrearFormulario = new javax.swing.JMenuItem();
        jMenuListarFormulario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuCrearCliente = new javax.swing.JMenuItem();
        jMenuActualizarEliminarCliente = new javax.swing.JMenuItem();
        jMenuListarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemListarAutos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido Empleado");

        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setEnabled(false);
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sucursal");

        txtsucursal.setForeground(new java.awt.Color(255, 255, 255));
        txtsucursal.setEnabled(false);
        txtsucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsucursalActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtsucursal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(768, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsucursal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(544, Short.MAX_VALUE))
        );

        jMenu1.setText("Facturacion");

        jMenuCrear.setText("Crear");
        jMenuCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCrearActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCrear);

        jMenuAnular.setText("Anular");
        jMenuAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAnularActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAnular);

        jMenuListar.setText("Listar");
        jMenuListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuListar);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Formularios");

        jMenuCrearFormulario.setText("Crear");
        jMenuCrearFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCrearFormularioActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuCrearFormulario);

        jMenuListarFormulario.setText("Listar");
        jMenuListarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarFormularioActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuListarFormulario);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Cliente");

        jMenuCrearCliente.setText("Crear");
        jMenuCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCrearClienteActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuCrearCliente);

        jMenuActualizarEliminarCliente.setText("Actualizar o Eliminar");
        jMenuActualizarEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActualizarEliminarClienteActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuActualizarEliminarCliente);

        jMenuListarCliente.setText("Listar");
        jMenuListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarClienteActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuListarCliente);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Opciones");

        jMenuItemListarAutos.setText("Listar Autos");
        jMenuItemListarAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarAutosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemListarAutos);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        setVisible(false);
        vntLogin = new Inicio();
        vntLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtsucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsucursalActionPerformed

    private void jMenuCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCrearActionPerformed
        if(internaFacturaCrear == null || !internaFacturaCrear.isVisible()){
        internaFacturaCrear = new InternaFacturaCrear(txtsucursal.getText());
        jDesktopPane1.add(internaFacturaCrear);
        internaFacturaCrear.show();
        }
    }//GEN-LAST:event_jMenuCrearActionPerformed

    private void jMenuListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarClienteActionPerformed
        if(internaClienteListar == null || !internaClienteListar.isVisible()){
        internaClienteListar = new InternaClienteListar();
        jDesktopPane1.add(internaClienteListar);
        internaClienteListar.show();
        }
    }//GEN-LAST:event_jMenuListarClienteActionPerformed

    private void jMenuCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCrearClienteActionPerformed
        if(internaClienteCrear == null || !internaClienteCrear.isVisible()){
         internaClienteCrear = new InternaClienteCrear();
         jDesktopPane1.add(internaClienteCrear);
         internaClienteCrear.show();
        }
    }//GEN-LAST:event_jMenuCrearClienteActionPerformed

    private void jMenuActualizarEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActualizarEliminarClienteActionPerformed
        if(internaClienteB_A_E == null || !internaClienteB_A_E.isVisible()){
         internaClienteB_A_E = new InternaClienteB_A_E();
         jDesktopPane1.add(internaClienteB_A_E);
         internaClienteB_A_E.show();
        }
    }//GEN-LAST:event_jMenuActualizarEliminarClienteActionPerformed

    private void jMenuListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarActionPerformed
        if(internaFacturaListar == null || !internaFacturaListar.isVisible()){
         internaFacturaListar = new InternaFacturaListar(txtsucursal.getText());
         jDesktopPane1.add(internaFacturaListar);
         internaFacturaListar.show();
        }
    }//GEN-LAST:event_jMenuListarActionPerformed

    private void jMenuAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAnularActionPerformed
        if(internaFacturaAnular == null || !internaFacturaAnular.isVisible()){
         internaFacturaAnular = new InternaFacturaAnular(txtsucursal.getText());
         jDesktopPane1.add(internaFacturaAnular);
         internaFacturaAnular.show();
        }
    }//GEN-LAST:event_jMenuAnularActionPerformed

    private void jMenuCrearFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCrearFormularioActionPerformed
        if(internaFormularioCrear == null || !internaFormularioCrear.isVisible()){
         internaFormularioCrear = new InternaFormularioCrear(txtsucursal.getText());
         jDesktopPane1.add(internaFormularioCrear);
         internaFormularioCrear.show();
        }
    }//GEN-LAST:event_jMenuCrearFormularioActionPerformed

    private void jMenuListarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarFormularioActionPerformed
        if(internaFormularioListar == null || !internaFormularioListar.isVisible()){
         internaFormularioListar = new InternaFormularioListar();
         jDesktopPane1.add(internaFormularioListar);
         internaFormularioListar.show();
        }
    }//GEN-LAST:event_jMenuListarFormularioActionPerformed

    private void jMenuItemListarAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarAutosActionPerformed
        if(internaAutosListar == null || !internaAutosListar.isVisible()){
         internaAutosListar = new InternaAutosListar();
         jDesktopPane1.add(internaAutosListar);
         internaAutosListar.show();
        }
    }//GEN-LAST:event_jMenuItemListarAutosActionPerformed

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
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuActualizarEliminarCliente;
    private javax.swing.JMenuItem jMenuAnular;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCrear;
    private javax.swing.JMenuItem jMenuCrearCliente;
    private javax.swing.JMenuItem jMenuCrearFormulario;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemListarAutos;
    private javax.swing.JMenuItem jMenuListar;
    private javax.swing.JMenuItem jMenuListarCliente;
    private javax.swing.JMenuItem jMenuListarFormulario;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsucursal;
    // End of variables declaration//GEN-END:variables
}
