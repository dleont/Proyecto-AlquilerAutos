/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorAuto;
import controlador.ControladorCliente;
import controlador.ControladorFacturaCabecera;
import controlador.ControladorFacturaDetalle;
import controlador.ControladorUsuario;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Auto;
import modelo.Cliente;
import modelo.FacturaCabecera;
import modelo.FacturaDetalle;



/**
 *
 * @author Dennis Rivadeneira
 */
public class InternaFacturaCrear extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternaFacturaCrear
     */
    
    ControladorCliente controladorCliente;
    ControladorAuto controladorAuto;
    ControladorUsuario controladorUsuario;
    ControladorFacturaCabecera controladorFacturaCabecera;
    ControladorFacturaDetalle controladorFacturaDetalle;
    
    
    ArrayList<Auto> listaAutos;
    ArrayList<FacturaDetalle> listaDetalles;
    
    String opcionComboBuscarPlacaDisponible;
    
   DecimalFormat formato1 = new DecimalFormat("#.00");
    
    //Tabla
    DefaultTableModel dtm;
    Object[] o = new Object[6];
    
    
    double subTotal;
    double IVA;
    double total;
    
    double precio;
    double totalDetalle;
    
    int cont=-1;
    
    int numSuc;
    public InternaFacturaCrear(String nomSuc) {
        initComponents();
        
        controladorCliente = new ControladorCliente();
        controladorAuto = new ControladorAuto();
        controladorFacturaCabecera= new ControladorFacturaCabecera();
        controladorFacturaDetalle = new ControladorFacturaDetalle();
        controladorUsuario = new ControladorUsuario();
        listaAutos = new ArrayList<>();
        listaDetalles = new ArrayList<>();
        
        numSuc=controladorUsuario.buscarSucursalNumero(nomSuc);
        
        //Llamar metodo combo Box autos Disponibles
        llenarComboBoxDisponible();
        
        //llenar Codigo
        txtNumeroFactura.setText(""+controladorFacturaCabecera.llenarId());
        
        //Llama al metodo de mostrar la fecha         
        date();
        
        //Tabla
        dtm = (DefaultTableModel)tableDetalleFactura.getModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFecha = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtSubTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDetalleFactura = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        labelNombreF = new javax.swing.JLabel();
        labelDireccionF = new javax.swing.JLabel();
        labelTelefonoF = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        labelCodigoF = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        labelSubtotalF = new javax.swing.JLabel();
        labelFechaF = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        txtNumeroFactura = new javax.swing.JTextField();
        labelIVAF = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        labelTotalF = new javax.swing.JLabel();
        labelTituloF = new javax.swing.JLabel();
        jComboBoxPlaca = new javax.swing.JComboBox<>();
        txt_cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        txtFecha.setEnabled(false);

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtSubTotal.setEnabled(false);

        tableDetalleFactura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tableDetalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cantidad", "Precio", "SubTotal", "I.V.A.", "Total"
            }
        ));
        tableDetalleFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableDetalleFacturaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableDetalleFactura);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        labelNombreF.setText("Nombre");

        labelDireccionF.setText("Dirección");

        labelTelefonoF.setText("Teléfono");

        labelCodigoF.setText("Cedula");

        txt_cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyPressed(evt);
            }
        });

        jLabel1.setText("Apellido");

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel2.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelCodigoF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelNombreF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombre)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDireccionF)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_direccion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelTelefonoF))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoF)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombreF)
                    .addComponent(jLabel1)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDireccionF)
                    .addComponent(labelTelefonoF)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelSubtotalF.setText("Subtotal");

        labelFechaF.setText("Fecha");

        txtIVA.setEnabled(false);

        txtNumeroFactura.setEnabled(false);

        labelIVAF.setText("IVA %");

        txtTotal.setEnabled(false);

        labelTotalF.setText("Total");

        labelTituloF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelTituloF.setForeground(new java.awt.Color(204, 0, 51));
        labelTituloF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloF.setText("FACTURA N°");

        jComboBoxPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPlacaActionPerformed(evt);
            }
        });

        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyPressed(evt);
            }
        });

        jLabel4.setText("Placa:");

        jLabel3.setText("Cantidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(27, 27, 27)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelSubtotalF)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelIVAF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelTotalF)
                                        .addGap(45, 45, 45)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 20, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelTituloF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(326, 326, 326)
                            .addComponent(labelFechaF)
                            .addGap(5, 5, 5)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(447, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSubtotalF)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTotalF)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnGuardar)))
                    .addComponent(labelIVAF))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(labelTituloF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(labelFechaF))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(10, 10, 10)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 206, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void llenarComboBoxDisponible(){
    //Llenar combo Box
        if(controladorAuto.llenarComboBoxDisponible(jComboBoxPlaca)==false){
            JOptionPane.showMessageDialog(null,"Cargado valores", "Informacion", JOptionPane.INFORMATION_MESSAGE); 
        }
        
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(controladorCliente.buscarCliente(txt_cedula.getText())==true){
            
            llenarFactura();
            
        }else{
            //Crear Cliente 
            Cliente cli = new Cliente();
            guardaCliente(cli);
            controladorCliente.anadirCliente(cli);
            
            llenarFactura();
            
            
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    
    private void llenarFactura(){
        FacturaCabecera factura = new FacturaCabecera();
        
        factura.setFac_id(Integer.parseInt(txtNumeroFactura.getText()));


        String fecha1 = txtFecha.getText(); // Entrada recogida (scanner)
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // Creamos Fecha (Fecha del sistema)

        Date fecha=null;

        try {
            fecha = (Date) format.parse(fecha1);
        } catch (ParseException ex) {
            Logger.getLogger(InternaFacturaCrear.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.sql.Date sDate = convertUtilToSql(fecha);
        factura.setFac_fecha(fecha1);

        factura.setFac_subTotal(subTotal);
        factura.setFac_iva(IVA);
        factura.setFac_Total(total);
        

        factura.setCli_id(txt_cedula.getText());
        factura.setSuc_id(numSuc);
        factura.setFac_estado('V');

        if(controladorFacturaCabecera.anadirFacturaCabecera(factura)==true){
            controladorFacturaDetalle.anadirFacturaDetalle(listaDetalles, Integer.parseInt(txtNumeroFactura.getText()));
            JOptionPane.showMessageDialog(null,"Factura Creada", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Mal Ingresado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
    private void tableDetalleFacturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDetalleFacturaKeyReleased
       
    }//GEN-LAST:event_tableDetalleFacturaKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        controladorFacturaDetalle.actualizarAutoCancelar(listaAutos);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void jComboBoxPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPlacaActionPerformed

    }//GEN-LAST:event_jComboBoxPlacaActionPerformed

    private void txt_cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyPressed
        int codigo=evt.getKeyCode();
        if(codigo==10){
            
            if(Integer.parseInt(txt_cantidad.getText())>0){
                cont++;
                Auto aut=new Auto();
                opcionComboBuscarPlacaDisponible=jComboBoxPlaca.getSelectedItem().toString();
                aut=controladorFacturaDetalle.listar(listaAutos, opcionComboBuscarPlacaDisponible, Integer.parseInt(txt_cantidad.getText()));
                controladorFacturaDetalle.actualizarAuto(opcionComboBuscarPlacaDisponible,"I");
                
                controladorFacturaDetalle.vaciarComboBox(jComboBoxPlaca);
                
                llenarComboBoxDisponible();
                
                //controladorFacturaDetalle.listarDetalles(listaDetalles,listaAutos);
                
                ponerTabla(controladorFacturaDetalle.listarDetallesUnoporUno(aut,listaDetalles,cont));
                
                calcularSubtotal();
                calcularIva();
                calcularTotal();
                
                txt_cantidad.setText("");
                
                   
            }else{
                JOptionPane.showMessageDialog(null,"Cantidad mayor a 0 ", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        
    }//GEN-LAST:event_txt_cantidadKeyPressed

    private void txt_cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyPressed
        int codigo=evt.getKeyCode();
        if(codigo==10){

            Cliente cli = new Cliente();

            if(controladorCliente.buscarCliente(txt_cedula.getText())==true){
                cli=controladorCliente.buscarClienteObjeto(txt_cedula.getText());
                llenaCasillas(cli);
                
            }else{
                JOptionPane.showMessageDialog(null,"Datos no Existe ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                vaciarCasillas();
                
            }
        }
    }//GEN-LAST:event_txt_cedulaKeyPressed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    
    //Metodo para calcular el SubTotal
   public void calcularSubtotal() {
        subTotal = 0.00;
        TableModel tableModel = tableDetalleFactura.getModel();
        int filas = tableModel.getRowCount();
        for (int i = 0; i < filas; i++) {
            subTotal += (double) tableModel.getValueAt(i, 5);
        }
        txtSubTotal.setText(formato1.format(subTotal));
    }

   //Metodo para calcular el IVA
    public void calcularIva() {
        IVA = 0.12 * subTotal;
        IVA = Math.round(IVA * 100) / 100d;
        txtIVA.setText(formato1.format(IVA));
    }

    //Metodo para calcular el Total de la Factua
    public void calcularTotal() {
        calcularSubtotal();
        calcularIva();
        total=subTotal+IVA;
        total = Math.round(total * 100) / 100d;
        txtTotal.setText(formato1.format(total));
    }
    
    private void llenaCasillas(Cliente cli){
        txt_nombre.setText(cli.getCli_nombre());
        txt_apellido.setText(cli.getCli_apellido());
        txt_direccion.setText(cli.getCli_direccion());
        txt_telefono.setText(cli.getCli_telf());
        txt_email.setText(cli.getCli_email());
        
        txt_nombre.enable(false);
        txt_apellido.enable(false);
        txt_direccion.enable(false);
        txt_telefono.enable(false);
        txt_email.enable(false);
    }
    
    private void vaciarCasillas(){
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_email.setText(""); 
        
        txt_nombre.enable(true);
        txt_apellido.enable(true);
        txt_direccion.enable(true);
        txt_telefono.enable(true);
        txt_email.enable(true);
        
    }
    
    private void guardaCliente(Cliente cli){
        cli.setCli_cedula(txt_cedula.getText());
        cli.setCli_nombre(txt_nombre.getText());
        cli.setCli_apellido(txt_apellido.getText());
        cli.setCli_direccion(txt_direccion.getText());
        cli.setCli_telf(txt_telefono.getText());
        cli.setCli_email(txt_email.getText());
        cli.setCli_estado('N');
    }
    
    //Metodo para mostrar la fecha en un Text Area en la creacion de una factura
    public void date(){
       String fecha = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).format(new Date());
       txtFecha.setText(fecha);
   }
    
    private void ponerTabla(FacturaDetalle fac_det){
        //Se obtiene el modelo
        dtm = (DefaultTableModel) tableDetalleFactura.getModel();
        String ObjetoS[]=new String [6];

            o[0] = controladorAuto.buscarAutoPlaca(fac_det.getAut_id());
            o[1] = fac_det.getFac_det_cantidad();
            o[2] = fac_det.getFac_det_precio();
            o[3] = fac_det.getFac_det_sutTotal();
            o[4] = fac_det.getFac_det_iva();
            o[5] = fac_det.getFac_det_total();
            dtm.addRow(o);

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jComboBoxPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodigoF;
    private javax.swing.JLabel labelDireccionF;
    public static javax.swing.JLabel labelFechaF;
    private javax.swing.JLabel labelIVAF;
    private javax.swing.JLabel labelNombreF;
    private javax.swing.JLabel labelSubtotalF;
    private javax.swing.JLabel labelTelefonoF;
    public static javax.swing.JLabel labelTituloF;
    private javax.swing.JLabel labelTotalF;
    private javax.swing.JTable tableDetalleFactura;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNumeroFactura;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
