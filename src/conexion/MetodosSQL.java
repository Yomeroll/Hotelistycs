/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import logica.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author scben
 */
public class MetodosSQL {
    
    Conexion mysql = new Conexion();
    cama cama = new cama();
    cama_cuarto cama_cuarto = new cama_cuarto();
    cuarto cuarto = new cuarto();
    cuarto_paquete cuarto_paquete = new cuarto_paquete();
    cuenta cuenta= new cuenta();
    huesped huesped = new huesped();
    paquete paquete = new paquete();
    reservacion reservacion = new reservacion();
    reservacion_paquete reservacion_paquete = new reservacion_paquete();
    servicio servicio = new servicio();
    servicio_paquete servicio_paquete = new servicio_paquete();
    tipo_cuarto tipo_cuarto = new tipo_cuarto();
    
    PreparedStatement ps;
    ResultSet rs;
    int resultadoInt = 0;
    
    // ++++++++++++++ METODOS CUENTA +++++++++++++
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
    
    public void editarCuenta(String tipo_cuenta, String contra, String user_name, String nombre, String apellido_pat, String apellido_mat, String actual ){
        Connection con = null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("UPDATE cuenta SET tipo_cuenta=?, contra=?, user_name=?, nombre=?, apellido_pat=?, apellido_mat=? WHERE user_name=?");
            ps.setString(1,tipo_cuenta);
            ps.setString(2,contra);
            ps.setString(3,user_name);
            ps.setString(4,nombre);
            ps.setString(5,apellido_pat);
            ps.setString(6,apellido_mat);
            ps.setString(7,actual);
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
        
    public void eliminarCuenta(String user_name){
        Connection con = null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM cuenta WHERE user_name=?");
            ps.setString(1,user_name);
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
    
    public String[] buscarCuentas(String tipo_cuenta, String contra, String user_name, String nombre, String apellido_pat, String apellido_mat, DefaultTableModel m){
            Connection con = null;
            
            String [] tabla = new String[4];
            
            try{
            con=mysql.conectar();
            ps = con.prepareStatement("SELECT * FROM cuenta WHERE tipo_cuenta=? or user_name=? or nombre=? or apellido_pat=? or apellido_mat=?");
            ps.setString(1,tipo_cuenta);
            ps.setString(2,user_name);
            ps.setString(3,nombre);
            ps.setString(4,apellido_pat);
            ps.setString(5,apellido_mat);
            rs=ps.executeQuery();
            
                while(rs.next()){
                
                tabla[0]=rs.getString(4);
                tabla[1]=rs.getString(5);
                tabla[2]=rs.getString(6);
                tabla[3]=rs.getString(7);
                m.addRow(tabla);
                }      
                
                //System.out.println("Se buscó");
            } catch(Exception e){
            System.err.println(e);
            }
            return tabla;
        }
    /*
    // ++++++++++++++++ METODOS CAMA ++++++++++++++
    
    public cama buscarCama(int id_cama, String tipo_cama){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM cama WHERE id_cama=? and tipo_cama=?");
            ps.setInt(1, id_cama);
            ps.setString(2, tipo_cama);
            rs=ps.executeQuery();
            
            while(rs.next()){
                cama.setId_cama(rs.getInt(1));
                cama.setTipo_cama(rs.getString(2));
                
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return cama;
    }
    
    public void guardarCama(String tipo_cama){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO cama (tipo_cama) VALUES (?)");
           ps.setString(1, tipo_cama);
           
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editarCama(String tipo_cama, String actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE cama SET tipo_cama=? WHERE tipo_cama=?");
            ps.setString(1, tipo_cama);
            ps.setString(2, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void eliminarCama(String tipo_cama){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM cama WHERE tipo_cama=?");
            ps.setString(1,tipo_cama);
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
    
    // ++++++++++++++++ METODOS CAMA_CUARTO  ++++++++++++++
    
    public cama_cuarto buscarCamaCuarto(int id_cama_cuarto){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM cama_cuarto WHERE id_cama_cuarto=?");
            ps.setInt(1,id_cama_cuarto );
            rs=ps.executeQuery();
            
            while(rs.next()){
                cama_cuarto.setId_cama_cuarto(rs.getInt(1));
                cama_cuarto.setId_cama(rs.getInt(2));
                cama_cuarto.setId_cuarto(rs.getInt(3));
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return cama_cuarto;
    }
    
    public void guardar(int id_cama, int id_cuarto){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO cama_cuarto (id_cama, id_cuarto) VALUES (?,?)");
           ps.setInt(1,id_cama);
           ps.setInt(2,id_cuarto);
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editar(int id_cama, int id_cuarto, int actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE cama_cuarto SET id_cama=?, id_cuarto WHERE id_cama_cuarto=?");
            ps.setInt(1, id_cama);
            ps.setInt(2, id_cuarto);
            ps.setInt(3, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void eliminar(int id_cama_cuarto){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM cama_cuarto WHERE =?");
            ps.setInt(1,id_cama_cuarto);
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
    
    // ++++++++++++++++ METODOS CUARTO  ++++++++++++++
    
    public cuarto buscar(int num_piso, int max_huespedes, int num_cuarto, int id_tipo_cuarto, String estado){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM cuarto WHERE num_piso=? or max_huespedes=? or num_cuarto=? or id_tipo_cuarto=? or estado=?");
            ps.setInt(1,
                    );
            ps.setInt(2, );
            ps.setInt(3, );
            ps.setInt(4, );
            ps.setString(5, );
            rs=ps.executeQuery();
            
            while(rs.next()){

                
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return ;
    }
    
    public void guardar(){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO () VALUES (?)");
           ps.setString(1, );
           
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editar(String actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE  SET  WHERE ");
            ps.(1, );
            ps.(n, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
     public void eliminar(){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM  WHERE =?");
            ps.(1,);
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
    
    // ++++++++++++++++ METODOS CUARTO_PAQUETE  ++++++++++++++
    public  buscar(){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM  WHERE ");
            ps.(1, );
            rs=ps.executeQuery();
            
            while(rs.next()){

                
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return ;
    }
    
    public void guardar(){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO () VALUES (?)");
           ps.setString(1, );
           
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editar(String actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE  SET  WHERE ");
            ps.(1, );
            ps.(n, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void eliminar(){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM  WHERE =?");
            ps.(1,);
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
    
    // ++++++++++++++++ METODOS HUESPED  ++++++++++++++
    
    public  buscar(){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM  WHERE ");
            ps.(1, );
            rs=ps.executeQuery();
            
            while(rs.next()){

                
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return ;
    }
    
    public void guardar(){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO () VALUES (?)");
           ps.setString(1, );
           
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editar(String actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE  SET  WHERE ");
            ps.(1, );
            ps.(n, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void eliminar(){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM  WHERE =?");
            ps.(1,);
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
    
    // ++++++++++++++++ METODOS PAQUETE  ++++++++++++++
    
    public  buscar(){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM  WHERE ");
            ps.(1, );
            rs=ps.executeQuery();
            
            while(rs.next()){

                
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return ;
    }
    
    public void guardar(){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO () VALUES (?)");
           ps.setString(1, );
           
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editar(String actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE  SET  WHERE ");
            ps.(1, );
            ps.(n, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
     public void eliminar(){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM  WHERE =?");
            ps.(1,);
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
    
    // ++++++++++++++++ METODOS RESERVACION  ++++++++++++++
    
    public  buscar(){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM  WHERE ");
            ps.(1, );
            rs=ps.executeQuery();
            
            while(rs.next()){

                
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return ;
    }
    
    public void guardar(){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO () VALUES (?)");
           ps.setString(1, );
           
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editar(String actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE  SET  WHERE ");
            ps.(1, );
            ps.(n, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void eliminar(){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM  WHERE =?");
            ps.(1,);
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
     
    // ++++++++++++++++ METODOS RESERVACION_PAQUETE  ++++++++++++++
    public  buscar(){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM  WHERE ");
            ps.(1, );
            rs=ps.executeQuery();
            
            while(rs.next()){

                
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return ;
    }
    
    public void guardar(){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO () VALUES (?)");
           ps.setString(1, );
           
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editar(String actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE  SET  WHERE ");
            ps.(1, );
            ps.(n, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void eliminar(){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM  WHERE =?");
            ps.(1,);
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
     
    // ++++++++++++++++ METODOS SERVICIO  ++++++++++++++
     
    public  buscar(){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM  WHERE ");
            ps.(1, );
            rs=ps.executeQuery();
            
            while(rs.next()){

                
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return ;
    }
    
    public void guardar(){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO () VALUES (?)");
           ps.setString(1, );
           
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editar(String actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE  SET  WHERE ");
            ps.(1, );
            ps.(n, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void eliminar(){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM  WHERE =?");
            ps.(1,);
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
     
     
    // ++++++++++++++++ METODOS SERVICIO_PAQUETE  ++++++++++++++
     
    public  buscar(){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM  WHERE ");
            ps.(1, );
            rs=ps.executeQuery();
            
            while(rs.next()){

                
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return ;
    }
    
    public void guardar(){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO () VALUES (?)");
           ps.setString(1, );
           
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editar(String actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE  SET  WHERE ");
            ps.(1, );
            ps.(n, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void eliminar(){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM  WHERE =?");
            ps.(1,);
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
     
    // ++++++++++++++++ METODOS TIPO_CUARTO  ++++++++++++++
     
    public  buscar(){
        
        Connection con= null;
        
        try{
            con=mysql.conectar();
            ps=con.prepareStatement("SELECT * FROM  WHERE ");
            ps.(1, );
            rs=ps.executeQuery();
            
            while(rs.next()){

                
            }
        
        }catch(Exception e){
            System.err.println(e);
        }
        
        return ;
    }
    
    public void guardar(){
        Connection con =null;
        
        try{
           con=mysql.conectar();
           ps=con.prepareStatement("INSERT INTO () VALUES (?)");
           ps.setString(1, );
           
           int res = ps.executeUpdate();
           
           if(res > 0){
               System.out.println("Se guardó");
            }else{
                System.out.println("No se guardó");
            }
           
           con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void editar(String actual){
        Connection con=null;
        try {
            con=mysql.conectar();
            ps=con.prepareStatement("UPDATE  SET  WHERE ");
            ps.(1, );
            ps.(n, actual);
            int res=ps.executeUpdate();
            
            if(res > 0 ){
                System.out.println("Se editó correctamente");
            } else {
                System.out.println("Error al editar");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void eliminar(){
        Connection con=null;
        
        try{
            con=mysql.conectar();
            ps = con.prepareStatement("DELETE FROM  WHERE =?");
            ps.(1,);
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
*/
}
