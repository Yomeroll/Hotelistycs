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
    
    int idservicio;
    String tiposervicio;
    float precioservicio;

    public servicio() {
    }

    public servicio(int idservicio, String tiposervicio, float precioservicio) {
        this.idservicio = idservicio;
        this.tiposervicio = tiposervicio;
        this.precioservicio = precioservicio;
    }

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public float getPrecioservicio() {
        return precioservicio;
    }

    public void setPrecioservicio(float precioservicio) {
        this.precioservicio = precioservicio;
    }
    
    
    
}
