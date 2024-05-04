/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.*;
/**
 *
 * @author scben
 */
public class MetodosSQL {
    
    public static Conexion mysql = new Conexion();
    
    public static PreparedStatement sentenciaP;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadoInt = 0;
    
    public int guardarUsuario(int id_Usuario, String Usuario, String nombre_U, String apellido_PU, String apellido_MU, String password, String tipo_Usuario){

        Connection con = null;
        
        sql = ("INSERT INTO usuario (Usuario,nombre_U,apellido_PU,apellido_MU,password,tipo_Usuario) VALUES (?,?,?,?,?,?,?)");
        
        try {
           con = mysql.conectar();
           sentenciaP=con.prepareStatement(sql);
           sentenciaP.setString(2, Usuario);
           sentenciaP.setString(3, nombre_U);
           sentenciaP.setString(4, apellido_PU);
           sentenciaP.setString(5, apellido_MU);
           sentenciaP.setString(6, password);
           sentenciaP.setString(7, tipo_Usuario);
           
           resultadoInt=sentenciaP.executeUpdate();
           sentenciaP.close();
           con.close();
           
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return resultadoInt;
    }   
    
    public static String buscarUsuario(String Usuario){
        
        String busquedaN = null;
        Connection con = null;
        
        try {
           con = mysql.conectar();
           sql = ("SELECT nombre_U, apellido_PU, apelido_MU FROM usuario WHERE Usuario = '"+ Usuario + "'"); 
           sentenciaP = con.prepareStatement(sql);
           resultado=sentenciaP.executeQuery();
           if(resultado.next()){
               String nombre = resultado.getString("nombre_U");
               String apellido_P = resultado.getString("apellido_PU");
               String apellido_M = resultado.getString("apelido_MU");
               busquedaN = (nombre + " " + apellido_P + " " + apellido_M);
           }
           con.close();
           
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return busquedaN;
        
    }
    
    public static String buscarUsuarioRegistrado(String Usuario, String password){
        String busquedaUser = null;
        Connection con = null;
        
        try {
           con = mysql.conectar();
           sql = ("SELECT Usuario, password FROM usuario WHERE Usuario = '"+ Usuario + "' && password= '" + password +"'"); 
           sentenciaP= con.prepareStatement(sql);
           resultado=sentenciaP.executeQuery();
           if(resultado.next()){
               busquedaUser = "Usuario encontrado";
           }else{
               busquedaUser = "Usuario no encontrado";
           }
           
           con.close();
           
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return busquedaUser;
    }

    agregar
    borrar
    editar
    visualizar
}
