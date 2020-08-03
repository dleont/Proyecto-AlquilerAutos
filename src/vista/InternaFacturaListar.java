/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCliente;
import controlador.ControladorFacturaCabecera;
import controlador.ControladorUsuario;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Darwin
 */
public class InternaFacturaListar extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternaFacturaListar
     */
    
    int opcionComboFacturaEstado;
    int numSuc;
    
    ControladorFacturaCabecera controladorFacturaCabecera;
    ControladorCliente controladorCliente;
    ControladorUsuario controladorUsuario;
    
    //Tabla
    DefaultTableModel dtm;
    Object[] o = new Object[7];
    
    public InternaFacturaListar(String nomSuc) {
        initComponents();
        
        setTitle("Listar Factura");
        
        controladorFacturaCabecera = new ControladorFacturaCabecera();
        controladorCliente = new ControladorCliente();
        controladorUsuario = new ControladorUsuario();
        
        numSuc=controladorUsuario.buscarSucursalNumero(nomSuc);
        
        //Tabla
        dtm = (DefaultTableModel)jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxFacturasCabeceras = new javax.swing.JComboBox<>();

        setClosable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Cedula", "Nombre", "SubTotal", "IVA", "Total"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel1.setText("Facturas:");

        jComboBoxFacturasCabeceras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opciones.......", "Validas", "Anuladas" }));
        jComboBoxFacturasCabeceras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFacturasCabecerasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxFacturasCabeceras, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxFacturasCabeceras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxFacturasCabecerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFacturasCabecerasActionPerformed
        opcionComboFacturaEstado=jComboBoxFacturasCabeceras.getSelectedIndex()+1;
        if(opcionComboFacturaEstado==2){
            llenarTabla("V");
        }else if(opcionComboFacturaEstado==3){
            llenarTabla("A");
        }
    }//GEN-LAST:event_jComboBoxFacturasCabecerasActionPerformed


    public void llenarTabla(String estado){
        dtm.setRowCount(0);
        dtm = (DefaultTableModel) jTable1.getModel();
        String ObjetoS[]=new String [9];
        controladorFacturaCabecera.llenarTabla(estado, dtm,o,numSuc);  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxFacturasCabeceras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
