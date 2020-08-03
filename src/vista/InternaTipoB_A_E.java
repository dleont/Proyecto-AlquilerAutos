/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorTipoAuto;
import javax.swing.JOptionPane;
import modelo.Marca_TipoAuto;

/**
 *
 * @author Darwin
 */
public class InternaTipoB_A_E extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternaTipoB_A_E
     */
    
    ControladorTipoAuto controladorTipoAuto;
    
    
    String opcionComboBuscarTipo;
    int num;
    
    public InternaTipoB_A_E() {
        initComponents();
        setTitle("Actualiza y Eliminar Tipo de Auto");
        controladorTipoAuto = new ControladorTipoAuto();
        
        //Cargamos el ComboBox
        if(controladorTipoAuto.llenarComboBoxNumero(jComboBoxBuscarTipo)==false){
            JOptionPane.showMessageDialog(null,"Cargado valores", "Informacion", JOptionPane.INFORMATION_MESSAGE); 
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

        txt_nombre = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxBuscarTipo = new javax.swing.JComboBox<>();

        setClosable(true);

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        jComboBoxBuscarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBuscarTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxBuscarTipo, 0, 165, Short.MAX_VALUE)
                            .addComponent(txt_nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButtonActualizar)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonEliminar)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxBuscarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonEliminar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        Marca_TipoAuto mar=new Marca_TipoAuto();
        if(txt_nombre.equals("")){
            JOptionPane.showMessageDialog(null,"Escriba en todas las casillas", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }else{
            mar.setId(num);
            mar.setNombre(txt_nombre.getText());

            if(controladorTipoAuto.actualizarTipoAutos(mar)==true){
                JOptionPane.showMessageDialog(null,"Actualizado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Dato ocupando otra tabla", "Error!!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if(controladorTipoAuto.eliminarTipoAutos(num)==true){
            JOptionPane.showMessageDialog(null,"Datos eliminados", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Dato ocupando otra tabla", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jComboBoxBuscarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBuscarTipoActionPerformed
        opcionComboBuscarTipo=jComboBoxBuscarTipo.getSelectedItem().toString();
        Marca_TipoAuto mar=new Marca_TipoAuto();
        num= Integer.parseInt(opcionComboBuscarTipo);
        mar= controladorTipoAuto.buscarTipo(num);
        txt_nombre.setText(mar.getNombre());
    }//GEN-LAST:event_jComboBoxBuscarTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JComboBox<String> jComboBoxBuscarTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
