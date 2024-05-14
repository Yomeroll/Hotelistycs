/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author scben
 */
public class paquete {
    
    int id_paquete, num_cuartos;
    float precio_paquete;

    public paquete() {
    }
        
    public paquete(int idpaquete, int numcuartos, float preciopaquete) {
        this.id_paquete = idpaquete;
        this.num_cuartos = numcuartos;
        this.precio_paquete = preciopaquete;
    }

    public int getIdpaquete() {
        return id_paquete;
    }

    public void setIdpaquete(int idpaquete) {
        this.id_paquete = idpaquete;
    }

    public int getNumcuartos() {
        return num_cuartos;
    }

    public void setNumcuartos(int numcuartos) {
        this.num_cuartos = numcuartos;
    }

    public float getPreciopaquete() {
        return precio_paquete;
    }

    public void setPreciopaquete(float preciopaquete) {
        this.precio_paquete = preciopaquete;
    }
    
    
    
    
}
