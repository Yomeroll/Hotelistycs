/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author scben
 */
public class cuarto {
    
    int id_cuarto, num_piso, max_huespedes, num_cuarto, id_tipo_cuarto;
    String estado;  

    public cuarto() {
    }

    public cuarto(int id_cuarto, int num_piso, int max_huespedes, int num_cuarto, int id_tipo_cuarto, String estado) {
        this.id_cuarto = id_cuarto;
        this.num_piso = num_piso;
        this.max_huespedes = max_huespedes;
        this.num_cuarto = num_cuarto;
        this.id_tipo_cuarto = id_tipo_cuarto;
        this.estado = estado;
    }

    public int getId_cuarto() {
        return id_cuarto;
    }

    public void setId_cuarto(int id_cuarto) {
        this.id_cuarto = id_cuarto;
    }

    public int getNum_piso() {
        return num_piso;
    }

    public void setNum_piso(int num_piso) {
        this.num_piso = num_piso;
    }

    public int getMax_huespedes() {
        return max_huespedes;
    }

    public void setMax_huespedes(int max_huespedes) {
        this.max_huespedes = max_huespedes;
    }

    public int getNum_cuarto() {
        return num_cuarto;
    }

    public void setNum_cuarto(int num_cuarto) {
        this.num_cuarto = num_cuarto;
    }

    public int getId_tipo_cuarto() {
        return id_tipo_cuarto;
    }

    public void setId_tipo_cuarto(int id_tipo_cuarto) {
        this.id_tipo_cuarto = id_tipo_cuarto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
