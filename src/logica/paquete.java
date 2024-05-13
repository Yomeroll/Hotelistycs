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
    
    int idpaquete, numcuartos;
    float preciopaquete;

    public paquete() {
    }
        
    public paquete(int idpaquete, int numcuartos, float preciopaquete) {
        this.idpaquete = idpaquete;
        this.numcuartos = numcuartos;
        this.preciopaquete = preciopaquete;
    }

    public int getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(int idpaquete) {
        this.idpaquete = idpaquete;
    }

    public int getNumcuartos() {
        return numcuartos;
    }

    public void setNumcuartos(int numcuartos) {
        this.numcuartos = numcuartos;
    }

    public float getPreciopaquete() {
        return preciopaquete;
    }

    public void setPreciopaquete(float preciopaquete) {
        this.preciopaquete = preciopaquete;
    }
    
    
    
    
}
