/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author scben
 */
public class servicio {
    
    int id_servicio;
    String tipo_servicio;
    float precio_servicio;

    public servicio() {
    }

    public servicio(int id_servicio, String tipo_servicio, float precio_servicio) {
        this.id_servicio = id_servicio;
        this.tipo_servicio = tipo_servicio;
        this.precio_servicio = precio_servicio;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public float getPrecio_servicio() {
        return precio_servicio;
    }

    public void setPrecio_servicio(float precio_servicio) {
        this.precio_servicio = precio_servicio;
    }
    
    
}