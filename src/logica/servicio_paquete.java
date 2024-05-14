/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author scben
 */
public class servicio_paquete {
    
    int id_servicio_paquete, id_servicio, id_paquete;

    public servicio_paquete() {
    }

    public servicio_paquete(int id_servicio_paquete, int id_servicio, int id_paquete) {
        this.id_servicio_paquete = id_servicio_paquete;
        this.id_servicio = id_servicio;
        this.id_paquete = id_paquete;
    }

    public int getId_servicio_paquete() {
        return id_servicio_paquete;
    }

    public void setId_servicio_paquete(int id_servicio_paquete) {
        this.id_servicio_paquete = id_servicio_paquete;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }
        
}
