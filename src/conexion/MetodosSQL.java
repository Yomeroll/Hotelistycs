/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import logica.*;
import java.sql.*;
/**
 *
 * @author scben
 */
public class MetodosSQL {
    
    Conexion mysql = new Conexion();
    cuenta cuenta=new cuenta();
    cuarto room=new cuarto();
    cama bed=new cama();
    huesped hd=new huesped();
    paquete paq=new paquete();
    reservacion reserv=new reservacion();
    servicio serv=new servicio();
    
    PreparedStatement ps;
    ResultSet rs;
    int resultadoInt = 0;
    
    public cuenta ValidarCuenta(String contra, String user_name){
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("SELECT * FROM cuenta WHERE contra=? && user_name=?");
            ps.setString(1,contra);
            ps.setString(2, user_name);
            rs=ps.executeQuery();
            
            while(rs.next()){
                cuenta.setId_cuenta(rs.getInt(1));
                cuenta.setTipo_cuenta(rs.getString(2));
                cuenta.setContra(rs.getString(3));
                cuenta.setUser_name(rs.getString(4));
                cuenta.setNombre(rs.getString(5));
                cuenta.setApellido_pat(rs.getString(6));
                cuenta.setApellido_mat(rs.getString(7));
            }
        } catch(Exception e){
            System.err.println(e);
        }
        return cuenta;
    }
    
    public void guardarCuenta(String tipo_cuenta, String contra, String user_name, String nombre, String apellido_pat, String apellido_mat){
        Connection con = null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("INSERT INTO cuenta (tipo_cuenta, contra, user_name, nombre, apellido_pat, apellido_mat) VALUES (?,?,?,?,?,?)");
            ps.setString(1,tipo_cuenta);
            ps.setString(2,contra);
            ps.setString(3,user_name);
            ps.setString(4,nombre);
            ps.setString(5,apellido_pat);
            ps.setString(6,apellido_mat);
            
            int res= ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se guardó correctamente");
            } else {
                System.out.println("Error al guardar");
            }
            
            con.close();
        } catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editarCuenta(String tipo_cuenta, String contra, String user_name, String nombre, String apellido_pat, String apellido_mat){
        Connection con = null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("UPDATE cuenta SET tipo_cuenta=?, contra=?, user_name=?, nombre=?, apellido_pat=?, apellido_mat=? WHERE user_name=?)");
            ps.setString(1,tipo_cuenta);
            ps.setString(2,contra);
            ps.setString(3,user_name);
            ps.setString(4,nombre);
            ps.setString(5,apellido_pat);
            ps.setString(6,apellido_mat);
            ps.setString(7,user_name);
            
            int res= ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
        } catch(Exception e){
            System.err.println(e);
        }
    }
        
    public void eliminarCuenta(String tipo_cuenta, String contra, String user_name, String nombre, String apellido_pat, String apellido_mat){
        Connection con = null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("UPDATE cuenta SET tipo_cuenta=?, contra=?, user_name=?, nombre=?, apellido_pat=?, apellido_mat=? WHERE user_name=?)");
            ps.setString(1,tipo_cuenta);
            ps.setString(2,contra);
            ps.setString(3,user_name);
            ps.setString(4,nombre);
            ps.setString(5,apellido_pat);
            ps.setString(6,apellido_mat);
            ps.setString(7,user_name);
            
            int res= ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se eliminó correctamente");
            } else {
                System.out.println("Error al eliminar");
            }
            
            con.close();
        } catch(Exception e){
            System.err.println(e);
        }
    }
    
    public cuenta buscarCuenta(String tipo_cuenta, String contra, String user_name, String nombre, String apellido_pat, String apellido_mat){
        Connection con = null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("SELECT * FROM cuenta WHERE tipo_cuenta=? and contra=? and user_name=? and nombre=? and apellido_pat=? and apellido_mat=?");
            ps.setString(1,tipo_cuenta);
            ps.setString(2,contra);
            ps.setString(3,user_name);
            ps.setString(4,nombre);
            ps.setString(5,apellido_pat);
            ps.setString(6,apellido_mat);
            rs=ps.executeQuery();
    
            while(rs.next()){
                cuenta.setId_cuenta(rs.getInt(1));
                cuenta.setTipo_cuenta(rs.getString(2));
                cuenta.setContra(rs.getString(3));
                cuenta.setUser_name(rs.getString(4));
                cuenta.setNombre(rs.getString(5));
                cuenta.setApellido_pat(rs.getString(6));
                cuenta.setApellido_mat(rs.getString(7));
            }   
            
            System.out.println("Se buscó");
        } catch(Exception e){
            System.err.println(e);
        }
        return cuenta;
    }
    
}
