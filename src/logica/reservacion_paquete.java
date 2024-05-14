/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author scben
 */
public class reservacion_paquete {
    
    int id_reservacion_paquete, id_reservacion, id_paquete; 

    public reservacion_paquete() {
    }

    public reservacion_paquete(int id_reservacion_paquete, int id_reservacion, int id_paquete) {
        this.id_reservacion_paquete = id_reservacion_paquete;
        this.id_reservacion = id_reservacion;
        this.id_paquete = id_paquete;
    }

    public int getId_reservacion_paquete() {
        return id_reservacion_paquete;
    }

    public void setId_reservacion_paquete(int id_reservacion_paquete) {
        this.id_reservacion_paquete = id_reservacion_paquete;
    }

    public int getId_reservacion() {
        return id_reservacion;
    }

    public void setId_reservacion(int id_reservacion) {
        this.id_reservacion = id_reservacion;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }
    
}
