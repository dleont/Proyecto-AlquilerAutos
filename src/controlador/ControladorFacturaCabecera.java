/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.FacturaCabecera;

/**
 *
 * @author JMAISINCHOP
 */
public class ControladorFacturaCabecera {
    
    ControladorCliente controladorCliente = new ControladorCliente();
    
    //llenar id
    public int llenarId(){
        int llena=0;
        boolean ban=false;
        Connection con = null;
            String sql = "SELECT count(*) "
                       + "FROM alq_fac_cabeceras";
         try {

            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                llena = rs.getInt(1)+1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return llena;
    }
    
    public boolean anadirFacturaCabecera(FacturaCabecera fac){
        boolean r = false;
        Connection con = null;
       
        String sql = "Insert Into alq_fac_cabeceras Values("+fac.getFac_id()
                                                    +",'"+fac.getFac_fecha()
                                                    +"',"+fac.getFac_subTotal()
                                                    +","+fac.getFac_iva()
                                                    +","+fac.getFac_subTotal()
                                                    +","+fac.getSuc_id()
                                                    +",'"+fac.getCli_id()
                                                    +"','"+fac.getFac_estado()
                                                    +"')";
        
        
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            r=true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

        return r;
    }
    

    public void llenarTabla(String estado,DefaultTableModel dtm,Object [] o,int numSuc){
        Connection con = null;
        Cliente cli= new Cliente();
        /*Consultar los Usuarios que tiene la base de datos */
        String sql = " SELECT *"
                    + " FROM alq_fac_cabeceras,alq_clientes"
                    + " WHERE cli_id=alq_clientes_cli_id"
                    + " AND fac_estado='"+estado+"'"
                    + " AND alq_sucursales_suc_id = "+numSuc;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                /*Llenar los datos del Usuario en la tabla*/
                o[0] = rs.getString("fac_id");
                o[1] = rs.getString("fac_fecha");
                o[2]=rs.getString("alq_clientes_cli_id");
                
                cli=controladorCliente.buscarClienteObjeto(rs.getString("alq_clientes_cli_id"));
                o[3]=cli.getCli_nombre() +" "+ cli.getCli_apellido();
                o[4]=rs.getDouble("fac_subtotal");
                o[5]=rs.getDouble("fac_iva");
                o[6]=rs.getDouble("fac_total");
                dtm.addRow(o);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
    }
    
    public FacturaCabecera llenarCasillas(int numSuc,String estado){
        FacturaCabecera fac = new FacturaCabecera();
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM alq_fac_cabeceras"
                       + "WHERE fac_estado = '"+estado+"'"
                       + "AND alq_sucursales_suc_id = "+numSuc;

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                fac.setFac_id(rs.getInt("fac_id"));
                fac.setFac_fecha(rs.getString("fac_fecha"));
                fac.setFac_subTotal(rs.getDouble("fac_subtotal"));
                fac.setFac_iva(rs.getDouble("fac_iva"));
                fac.setFac_Total(rs.getDouble("fac_total"));
                fac.setCli_id(rs.getString("alq_clientes_cli_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return fac;
    }
    
    public boolean actualizarFactura(int id){
        boolean r = false;
        Connection con = null;
       
        String sql = "UPDATE alq_fac_cabeceras SET fac_estado= 'A'"
                                        + "WHERE fac_id = "+id;
        
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            r=true;
	    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

        return r;
    }
    
}
