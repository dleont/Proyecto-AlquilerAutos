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
import javax.swing.table.DefaultTableModel;
import modelo.Auto;
import modelo.Formulario;

/**
 *
 * @author JMAISINCHOP
 */
public class ControladorFormulario {
    ControladorAuto controladorAuto=new ControladorAuto();
    ControladorUsuario controladorUsuario = new ControladorUsuario();
    //llenar id
    public int llenarId(){
        int llena=0;
        boolean ban=false;
        Connection con = null;
            String sql = "SELECT count(*) "
                       + "FROM alq_formularios";
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
    
    public boolean anadirFormulario(Formulario form,String nomSuc){
        boolean r = false;
        Connection con = null;
       
        String sql = "Insert Into alq_formularios Values("+form.getForm_id()
                                                    +",'"+form.getIncio_fecha()
                                                    +"','"+form.getDescripcion()
                                                    +"',1"
                                                    +","+form.getAut_id()
                                                    +",0)";
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            actualizarAuto(form.getAut_id(),nomSuc);
            r=true;
	    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

        return r;
    }
    
    private void actualizarAuto(int id,String nomSuc){
        Connection con = null;
        int numSuc=controladorUsuario.buscarSucursalNumero(nomSuc);
       
        String sql = "UPDATE alq_autos SET aut_estado='A', suc_idF="+numSuc
                                        + "WHERE aut_id = "+id;
        
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
	    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
    }
    
    public void llenarTabla(DefaultTableModel dtm,Object [] o){
        Connection con = null;

        String sql = " SELECT *"
                    + " FROM alq_formularios";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                //String ObjetoS[]=new String [8];
                o[0] = rs.getInt("form_id");
                o[1] = rs.getString("form_incio_fecha");
                o[2]=rs.getString("form_descripcion");
                o[3]=controladorAuto.buscarAutoPlaca(rs.getInt("alq_autos_aut_id"));

                dtm.addRow(o);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
    }
    
}
