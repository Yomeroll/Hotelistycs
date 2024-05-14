/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author scben
 */
public class tipo_cuarto {
    
    int id_tipo_cuarto;
    float precio_noche;
    String tipo_cuarto;

    public tipo_cuarto() {
    }

    public tipo_cuarto(int id_tipo_cuarto, float precio_noche, String tipo_cuarto) {
        this.id_tipo_cuarto = id_tipo_cuarto;
        this.precio_noche = precio_noche;
        this.tipo_cuarto = tipo_cuarto;
    }

    public int getId_tipo_cuarto() {
        return id_tipo_cuarto;
    }

    public void setId_tipo_cuarto(int id_tipo_cuarto) {
        this.id_tipo_cuarto = id_tipo_cuarto;
    }

    public float getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(float precio_noche) {
        this.precio_noche = precio_noche;
    }

    public String getTipo_cuarto() {
        return tipo_cuarto;
    }

    public void setTipo_cuarto(String tipo_cuarto) {
        this.tipo_cuarto = tipo_cuarto;
    }
   
}
